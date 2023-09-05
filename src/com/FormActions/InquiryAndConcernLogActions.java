package com.FormActions;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class InquiryAndConcernLogActions {

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    public void displayInquiryAndConcern(JTable ICLTable) {
        String query = "SELECT * FROM `inquiry_and_concern_log`";
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) ICLTable.getModel();
            tableModel.setRowCount(0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getInt("support_id"));
                vector.add(rs.getInt("employee_uid"));
                vector.add(rs.getString("first_name"));
                vector.add(rs.getString("last_name"));
                vector.add(rs.getString("email"));
                vector.add(rs.getString("subject"));
                vector.add(rs.getString("message"));
                vector.add(rs.getString("date"));
                vector.add(rs.getString("time"));
                vector.add(rs.getString("status"));
                tableModel.addRow(vector);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void onclickTable(JLabel ICLSupportID, JLabel ICLEMployeeUID, JLabel ICLName, JLabel ICLEmail, JLabel ICLSubject, JLabel ICLMessage, JLabel ICLDateAndTime, JTable ICLTable, JButton ICLStatusButton) {
        DefaultTableModel tableModel = (DefaultTableModel) ICLTable.getModel();
        int selectedIndex = ICLTable.getSelectedRow();
        ICLSupportID.setText(tableModel.getValueAt(selectedIndex, 0).toString());
        ICLEMployeeUID.setText(tableModel.getValueAt(selectedIndex, 1).toString());
        ICLName.setText(tableModel.getValueAt(selectedIndex, 2).toString() + " " + tableModel.getValueAt(selectedIndex, 3).toString());
        ICLEmail.setText(tableModel.getValueAt(selectedIndex, 4).toString());
        ICLSubject.setText(tableModel.getValueAt(selectedIndex, 5).toString());
        ICLMessage.setText("<html><body><p align='justify'>" + tableModel.getValueAt(selectedIndex, 6).toString() + "</p></body></html>");
        ICLDateAndTime.setText(tableModel.getValueAt(selectedIndex, 7).toString() + " " + tableModel.getValueAt(selectedIndex, 8).toString());
        String status = tableModel.getValueAt(selectedIndex, 9).toString();
        if (status.equals("Not yet done")) {
            ICLStatusButton.setEnabled(true);
            ICLStatusButton.setText(status);
            ICLStatusButton.setHorizontalAlignment(SwingConstants.CENTER);
            ICLStatusButton.setForeground(new Color(255, 255, 255));
            ICLStatusButton.setBackground(new Color(235, 87, 87));
        } else if (status.equals("Done")) {
            ICLStatusButton.setEnabled(false);
            ICLStatusButton.setText(status);
            ICLStatusButton.setHorizontalAlignment(SwingConstants.LEFT);
            ICLStatusButton.setForeground(new Color(255, 255, 255));
            ICLStatusButton.setBackground(new Color(10, 189, 158));
        }
    }

    public void searchTable(JTable ICLTable, JTextField ICLSearchField) {
        String searchTerm = ICLSearchField.getText();
        DefaultTableModel model = (DefaultTableModel) ICLTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        ICLTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchTerm));
    }

    public void updateStatus(JTable ICLTable, JButton ICLStatusButton) {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) ICLTable.getModel();
            int selectedIndex = ICLTable.getSelectedRow();
            int supportID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
            String status = tableModel.getValueAt(selectedIndex, 9).toString();
            String statusDone = "Done";
            if (status.equals("Not yet done")) {
                try {
                    Connection connection = DriverManager.getConnection(Database);
                    PreparedStatement stmt = connection.prepareStatement("UPDATE `inquiry_and_concern_log` SET `status`= ? WHERE `support_id` = ?");
                    stmt.setString(1, statusDone);
                    stmt.setInt(2, supportID);
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Status Updated!", "Inquiry and Support Log", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
