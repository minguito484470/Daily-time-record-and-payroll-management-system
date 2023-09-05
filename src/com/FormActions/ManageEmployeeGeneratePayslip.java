/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FormActions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ManageEmployeeGeneratePayslip extends ManageEmployeeTable {

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    public void displayEmployeeTable2(JTable GPTable) {

        String query = ""
                + "SELECT e.employee_uid, p.first_name, p.middle_name, p.last_name, "
                + "e.email, e.position, e.status "
                + "FROM employee_company_informations e "
                + "JOIN employee_personal_informations p "
                + "ON e.employee_uid = p.employee_uid";
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel) GPTable.getModel();
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
                tableModel.addRow(row);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
    
    public void viewEmployeeRenderedHours(){
        
    }
}
