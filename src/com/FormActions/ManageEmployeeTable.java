package com.FormActions;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ManageEmployeeTable {

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    public void displayEmployeeTable(JTable METable) {
        String query = ""
                + "SELECT e.employee_uid, p.first_name, p.middle_name, p.last_name, "
                + "e.email, e.position, e.status, e.account_type, e.date_started "
                + "FROM employee_company_informations e "
                + "JOIN employee_personal_informations p "
                + "ON e.employee_uid = p.employee_uid";
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) METable.getModel();
            tableModel.setRowCount(0);
            while (rs.next()) {
                Vector<String> row = new Vector<String>();
                row.add(rs.getString("employee_uid"));
                row.add(rs.getString("first_name"));
                row.add(rs.getString("middle_name"));
                row.add(rs.getString("last_name"));
                row.add(rs.getString("email"));
                row.add(rs.getString("position"));
                row.add(rs.getString("status"));
                row.add(rs.getString("account_type"));
                row.add(rs.getString("date_started"));
                tableModel.addRow(row);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void searchTable(JTable METable, JTextField METableSearchField) {
        String searchTerm = METableSearchField.getText();
        DefaultTableModel model = (DefaultTableModel) METable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        METable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchTerm));
    }

    public void addAction(JTextField MEAddPIFirstName,
            JTextField MEAddPIMiddleName,
            JTextField MEAddPILastName,
            JRadioButton MEAddPIMale,
            JRadioButton MEAddPIFemale,
            JComboBox MEAddPIBirthMonth,
            JComboBox MEAddPIBirthDate,
            JComboBox MEAddPIBirthYear,
            JTextField MEAddPIAddress,
            JTextField MEAddPIMobileNumber,
            JComboBox MEAddPIMaritalStatus,
            JTextField MEAddCIEmployeeUID,
            JTextField MEAddCIEmail,
            JTextField MEAddCIPosition,
            JComboBox MEAddCIStatus,
            JComboBox MEAddCIAccountType,
            JComboBox MEAddCIDateStartMonth,
            JComboBox MEAddCIDateStartDate,
            JComboBox MEAddCIDateStartYear,
            JTextField MEAddCIBasicPay,
            JTextField MEAddGIDHDMF1,
            JTextField MEAddGIDHDMF2,
            JTextField MEAddGIDHDMF3,
            JTextField MEAddGIDPHIC1,
            JTextField MEAddGIDPHIC2,
            JTextField MEAddGIDPHIC3,
            JTextField MEAddGIDSSS1,
            JTextField MEAddGIDSSS2,
            JTextField MEAddGIDSSS3,
            JTextField MEAddGIDTIN1,
            JTextField MEAddGIDTIN2,
            JTextField MEAddGIDTIN3,
            JTextField MEAddEmerContactPerson,
            JTextField MEAddEmerRelationship,
            JTextField MEAddEmerAddress,
            JTextField MEAddEmerContactNumber,
            Component METablePanel,
            JPanel MECardPanel) {
    }

    public void displayInfo(JLabel MEInfoPIName,
            JLabel MEInfoPIGender,
            JLabel MEInfoPIBirthdate,
            JLabel MEInfoPIAddress,
            JLabel MEInfoPIMobileNumber,
            JLabel MEInfoPIMaritalStatus,
            JLabel MEInfoCIEmployeeUID,
            JLabel MEInfoCIEmail,
            JLabel MEInfoCIPosition,
            JLabel MEInfoCIStatus,
            JLabel MEInfoCIAccountType,
            JLabel MEInfoCIDateStarted,
            JLabel MEInfoCDBasicPay,
            JLabel MEInfoGIDHDMF,
            JLabel MEInfoGIDPHIC,
            JLabel MEInfoGIDSSS,
            JLabel MEInfoGIDTIN,
            JLabel MEInfoEmerContactPerson,
            JLabel MEInfoEmerRelationship,
            JLabel MEInfoEmerAddress,
            JLabel MEInfoEmerContactNumber,
            JTable METable) {
    }

    public void displayToUpdate(JTextField MEUpdatePIFirstName,
            JTextField MEUpdatePIMiddleName,
            JTextField MEUpdatePILastName,
            JRadioButton MEUpdatePIMale,
            JRadioButton MEUpdatePIFemale,
            JComboBox MEUpdatePIBirthMonth,
            JComboBox MEUpdatePIBirthDate,
            JComboBox MEUpdatePIBirthYear,
            JTextField MEUpdatePIAddress,
            JTextField MEUpdatePIMobileNumber,
            JComboBox MEUpdatePIMaritalStatus,
            JTextField MEUpdateCIEmployeeUID,
            JTextField MEUpdateCIEmail,
            JTextField MEUpdateCIPosition,
            JComboBox MEUpdateCIStatus,
            JComboBox MEUpdateCIAccountType,
            JComboBox MEUpdateCIDateStartMonth,
            JComboBox MEUpdateCIDateStartDate,
            JComboBox MEUpdateCIDateStartYear,
            JTextField MEUpdateCIBasicPay,
            JTextField MEUpdateGIDHDMF1,
            JTextField MEUpdateGIDHDMF2,
            JTextField MEUpdateGIDHDMF3,
            JTextField MEUpdateGIDPHIC1,
            JTextField MEUpdateGIDPHIC2,
            JTextField MEUpdateGIDPHIC3,
            JTextField MEUpdateGIDSSS1,
            JTextField MEUpdateGIDSSS2,
            JTextField MEUpdateGIDSSS3,
            JTextField MEUpdateGIDTIN1,
            JTextField MEUpdateGIDTIN2,
            JTextField MEUpdateGIDTIN3,
            JTextField MEUpdateEmerContactPerson,
            JTextField MEUpdateEmerRelationship,
            JTextField MEUpdateEmerUpdateress,
            JTextField MEUpdateEmerContactNumber,
            JLabel MEUpdateProfilePhoto,
            JTable METable) {
    }

    public void updateInformation(JTextField MEUpdatePIFirstName,
            JTextField MEUpdatePIMiddleName,
            JTextField MEUpdatePILastName,
            JRadioButton MEUpdatePIMale,
            JRadioButton MEUpdatePIFemale,
            JComboBox MEUpdatePIBirthMonth,
            JComboBox MEUpdatePIBirthDate,
            JComboBox MEUpdatePIBirthYear,
            JTextField MEUpdatePIAddress,
            JTextField MEUpdatePIMobileNumber,
            JComboBox MEUpdatePIMaritalStatus,
            JTextField MEUpdateCIEmployeeUID,
            JTextField MEUpdateCIEmail,
            JTextField MEUpdateCIPosition,
            JComboBox MEUpdateCIStatus,
            JComboBox MEUpdateCIAccountType,
            JComboBox MEUpdateCIDateStartMonth,
            JComboBox MEUpdateCIDateStartDate,
            JComboBox MEUpdateCIDateStartYear,
            JTextField MEUpdateCIBasicPay,
            JTextField MEUpdateGIDHDMF1,
            JTextField MEUpdateGIDHDMF2,
            JTextField MEUpdateGIDHDMF3,
            JTextField MEUpdateGIDPHIC1,
            JTextField MEUpdateGIDPHIC2,
            JTextField MEUpdateGIDPHIC3,
            JTextField MEUpdateGIDSSS1,
            JTextField MEUpdateGIDSSS2,
            JTextField MEUpdateGIDSSS3,
            JTextField MEUpdateGIDTIN1,
            JTextField MEUpdateGIDTIN2,
            JTextField MEUpdateGIDTIN3,
            JTextField MEUpdateEmerContactPerson,
            JTextField MEUpdateEmerRelationship,
            JTextField MEUpdateEmerAddress,
            JTextField MEUpdateEmerContactNumber,
            Component METablePanel,
            JPanel MECardPanel) {
    }

    public void displayEmployeeSchedule(JTable MESTable) {
    }

    public void onclickScheduleTable(JLabel MESDEmployeeUID, JLabel MESDFullName, JLabel MESDTimeInSched, JLabel MESDTimeOutSched, JLabel MESDEmployeeUIDUpdate, JLabel MESDFullNameUpdate, JComboBox MESDTimeInSchedUpdate, JComboBox MESDTimeOutSchedUpdate, JTable MESTable) {
    }

    public void searchSchdeuleTable(JTable MESTable, JTextField MESSearchField) {
    }

    public void updateSchdeule(JTable MESTable, JButton ICLStatusButton, JLabel MESDEmployeeUID, JLabel MESDFullName, JLabel MESDTimeInSched, JLabel MESDTimeOutSched, JLabel MESDEmployeeUIDUpdate, JLabel MESDFullNameUpdate, JComboBox MESDTimeInSchedUpdate, JComboBox MESDTimeOutSchedUpdate) {
    }

    public void displayEmployeeTable2(JTable GPTable) {
    }

}
