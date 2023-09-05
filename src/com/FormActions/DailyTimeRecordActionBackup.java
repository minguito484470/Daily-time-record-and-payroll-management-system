package com.FormActions;

import com.Forms.EmployeeDashboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DailyTimeRecordActionBackup {

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    private int employeeUID;
    private String LatestDateRecorded;
    private String LatestTimeInRecorded;

    public void setEmployeeUID(int employeeUID) {
        this.employeeUID = employeeUID;
    }

    public int getEmployeeUID() {
        return employeeUID;
    }

    public String getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
        Date date = calendar.getTime();
        String time = dateFormat.format(date);
        return time;
    }

    public String getCurrentTimeAndDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy HH:mm");
        Date date = calendar.getTime();
        String time = dateFormat.format(date);
        return time;
    }

    public String getCurrentTime24() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:MM");
        Date date = calendar.getTime();
        String time = dateFormat.format(date);
        return time;
    }

    public String getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        Date date = calendar.getTime();
        String time = dateFormat.format(date);
        return time;
    }

    private void getLatestTimeRecorded() {
        int employeeUID = getEmployeeUID();
        Date startDate = new Date();
        try {
            Connection conn = DriverManager.getConnection(Database);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `employee_time_log` WHERE `employee_uid` = ? AND `date` >= ? ORDER BY `date` DESC LIMIT 1");
            stmt.setInt(1, employeeUID);
            stmt.setString(2, new SimpleDateFormat("yyyy-MM-dd HH:mm").format(startDate));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                LatestDateRecorded = rs.getString("date");
                LatestTimeInRecorded = rs.getString("time_in");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void TimeIn() {
        try {
            Connection connectionMain = DriverManager.getConnection(Database);
            PreparedStatement stMain = connectionMain.prepareStatement("SELECT `date` FROM `employee_time_log` WHERE `employee_uid` = ? AND `date` = ? ");

            stMain.setInt(1, getEmployeeUID());
            stMain.setString(2, getCurrentTimeAndDate());
            ResultSet rsMain = stMain.executeQuery();

            if (!rsMain.next()) {
                try {
                    Connection connectionTimeIn = DriverManager.getConnection(Database);
                    PreparedStatement stmtTimeIn = connectionTimeIn.prepareStatement("INSERT INTO `employee_time_log`(`employee_uid`,`date`,`time_in`) VALUES (?,?,?)");
                    stmtTimeIn.setInt(1, getEmployeeUID());
                    stmtTimeIn.setString(2, getCurrentTimeAndDate());
                    stmtTimeIn.setString(3, getCurrentTime24());

                    stmtTimeIn.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Time-in successfully", "Time Log", JOptionPane.INFORMATION_MESSAGE);

                    connectionTimeIn.close();
                    stmtTimeIn.close();

                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(ContactSupportAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
            connectionMain.close();
            stMain.close();
            rsMain.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ContactSupportAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void TimeOut() {
        getLatestTimeRecorded();
        String timeInRaw = LatestTimeInRecorded;
        String[] timeInParts = timeInRaw.split(":");
        int timeInHour = Integer.parseInt(timeInParts[0]);
        int timeInMinutes = Integer.parseInt(timeInParts[1]);

        LocalTime timeIn = LocalTime.of(timeInHour, timeInMinutes);
        LocalTime timeOut = LocalTime.parse(getCurrentTime24());

        long renderedHours;

        if (timeInHour == 23 || timeInHour == 22 || timeInHour == 21 || timeInHour == 20 || timeInHour == 19 || timeInHour == 18 || timeInHour == 17 || timeInHour == 16 || timeInHour == 15) {
            Duration lateDuration = Duration.between(timeIn, timeOut);
            renderedHours = 24 - lateDuration.abs().toHours();
        } else {
            Duration lateDuration = Duration.between(timeIn, timeOut);
            renderedHours = lateDuration.abs().toHours();
        }
        try {
            Connection connectionTimeOut = DriverManager.getConnection(Database);
            PreparedStatement stmtTimeOut = connectionTimeOut.prepareStatement("UPDATE `employee_time_log` SET `time_out` = ?, `total_rendered_hours`=? WHERE `employee_uid`= ? AND `date`= ?");

            stmtTimeOut.setString(1, getCurrentTime24());
            stmtTimeOut.setLong(2, renderedHours);
            stmtTimeOut.setInt(3, getEmployeeUID());
            stmtTimeOut.setString(4, LatestDateRecorded);
            stmtTimeOut.executeUpdate();

            JOptionPane.showMessageDialog(null, "Time-Out successfully", "Time Log", JOptionPane.INFORMATION_MESSAGE);

            connectionTimeOut.close();
            stmtTimeOut.close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ContactSupportAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public void displayEmployeeTimeLog(JTable TLTable, int EmployeeUID) {
    }

    public void onclickTimeLogTable(JTable TLTable, JLabel TLTimeLogDate, JLabel TLTimeLogTimeIn, JLabel TLTimeLogTimeOut, JLabel TLTimeLogRenderedHours) {

    }

    public void searchTimeLogTable(JTable TLTable, JTextField TLSearchField) {
    }
}
