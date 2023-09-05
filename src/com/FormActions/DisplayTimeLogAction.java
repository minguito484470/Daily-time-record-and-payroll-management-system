/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FormActions;

import com.Forms.EmployeeDashboard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DisplayTimeLogAction extends DailyTimeRecordAction {

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    public void displayEmployeeTimeLog(JTable TLTable, int EmployeeUID) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String query = "SELECT * FROM `employee_time_log` WHERE `employee_uid`= ?";
        try {
            connection = DriverManager.getConnection(Database);
            stmt = connection.prepareStatement(query);
            stmt.setInt(1, EmployeeUID);
            rs = stmt.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) TLTable.getModel();
            tableModel.setRowCount(0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("date"));
                vector.add(rs.getString("time_in"));
                vector.add(rs.getString("time_out"));
                String renderedHours = rs.getString("total_rendered_hours");
                if (renderedHours == null) {
                    vector.add("0");

                } else {
                    vector.add(renderedHours);
                }
                vector.add(rs.getString("ot_status"));

                tableModel.addRow(vector);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

    public void displayEmployeeUpdateTimeLog(JTable GPTimeLogTable, int EmployeeUID, JComboBox GPManageHoursSearchMonth, JComboBox GPManageHoursSearchFromDate, JComboBox GPManageHoursSearchToDate, JComboBox GPManageHoursSearchYear) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String fromDate = GPManageHoursSearchMonth.getSelectedItem().toString() + " " + GPManageHoursSearchFromDate.getSelectedItem().toString() + ", " + GPManageHoursSearchYear.getSelectedItem().toString();
        String toDate = GPManageHoursSearchMonth.getSelectedItem().toString() + " " + (Integer.parseInt(GPManageHoursSearchToDate.getSelectedItem().toString())+1) + ", " + GPManageHoursSearchYear.getSelectedItem().toString();
        System.out.println(fromDate);
        System.out.println(toDate);
        String query = "SELECT * FROM `employee_time_log` WHERE `employee_uid` = ? AND date BETWEEN ? AND ?";
        try {
            connection = DriverManager.getConnection(Database);
            stmt = connection.prepareStatement(query);
            stmt.setInt(1, EmployeeUID);
            stmt.setString(2, fromDate);
            stmt.setString(3, toDate);
            rs = stmt.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) GPTimeLogTable.getModel();
            tableModel.setRowCount(0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("date"));
                vector.add(rs.getString("time_in"));
                vector.add(rs.getString("time_out"));
                String renderedHours = rs.getString("total_rendered_hours");
                if (renderedHours == null) {
                    vector.add("0");
                } else {
                    vector.add(renderedHours);
                }
                vector.add(rs.getString("ot_status"));

                tableModel.addRow(vector);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }

    public void onclickTimeLogTable(JTable TLTable, JLabel TLTimeLogDate, JLabel TLTimeLogTimeIn, JLabel TLTimeLogTimeOut, JLabel TLTimeLogRenderedHours) {
        DefaultTableModel tableModel = (DefaultTableModel) TLTable.getModel();
        int selectedIndex = TLTable.getSelectedRow();
        TLTimeLogDate.setText(tableModel.getValueAt(selectedIndex, 0).toString());
        TLTimeLogTimeIn.setText(tableModel.getValueAt(selectedIndex, 1).toString());
        Object timeOut = tableModel.getValueAt(selectedIndex, 2);
        if (timeOut == null) {
            TLTimeLogTimeOut.setText("");
        } else {
            TLTimeLogTimeOut.setText(timeOut.toString());
        }

        Object renderedHours = tableModel.getValueAt(selectedIndex, 3);
        if (renderedHours == null) {
            TLTimeLogRenderedHours.setText("");
        } else {
            TLTimeLogRenderedHours.setText(renderedHours.toString());
        }
    }

    public void searchTimeLogTable(JTable TLTable, JTextField TLSearchField) {
        String searchTerm = TLSearchField.getText();
        DefaultTableModel model = (DefaultTableModel) TLTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        TLTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchTerm));
    }

    public void searchGPTimeLogTable(JTable GPTimeLogTable, JTextField GPManageHoursSearchField) {
        String searchTerm = GPManageHoursSearchField.getText();
        DefaultTableModel model = (DefaultTableModel) GPTimeLogTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        GPTimeLogTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchTerm));
    }

    public void onclickTimeLogUpdateTable(JTable GPTable, JTable GPTimeLogTable,
            JLabel GPEmployeeUID, JLabel GPFullName, JLabel GPTimeLogDate, JLabel GPTimeLogTimeIn, JLabel GPTimeLogTimeOut, JLabel GPTimeLogRenderedHours,
            JLabel GPEmployeeUIDUpdate, JLabel GPFullNameUpdate, JLabel GPTimeLogDateUpdate, JLabel GPTimeLogTimeInUpdate, JLabel GPTimeLogTimeOutUpdate, JTextField GPTimeLogRenderedHoursUpdate) {
        DefaultTableModel employeeTableModel = (DefaultTableModel) GPTable.getModel();
        int employeeSelectedIndex = GPTable.getSelectedRow();

        DefaultTableModel timeLogTableModel = (DefaultTableModel) GPTimeLogTable.getModel();
        int timeLogSelectedIndex = GPTimeLogTable.getSelectedRow();

        GPEmployeeUID.setText(employeeTableModel.getValueAt(employeeSelectedIndex, 0).toString());
        GPEmployeeUIDUpdate.setText(employeeTableModel.getValueAt(employeeSelectedIndex, 0).toString());
        String firstName = employeeTableModel.getValueAt(employeeSelectedIndex, 1).toString();
        String middleName = employeeTableModel.getValueAt(employeeSelectedIndex, 2).toString();
        String lastName = employeeTableModel.getValueAt(employeeSelectedIndex, 3).toString();
        GPFullName.setText(firstName + " " + middleName + " " + lastName);
        GPFullNameUpdate.setText(firstName + " " + middleName + " " + lastName);
        GPTimeLogDate.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 0).toString());
        GPTimeLogDateUpdate.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 0).toString());
        GPTimeLogTimeIn.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 1).toString());
        GPTimeLogTimeInUpdate.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 1).toString());
        GPTimeLogTimeOut.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 2).toString());
        GPTimeLogTimeOutUpdate.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 2).toString());
        GPTimeLogRenderedHours.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 3).toString());
        GPTimeLogRenderedHoursUpdate.setText(timeLogTableModel.getValueAt(timeLogSelectedIndex, 3).toString());
    }
}
