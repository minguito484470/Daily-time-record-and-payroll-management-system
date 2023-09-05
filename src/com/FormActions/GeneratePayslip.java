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
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GeneratePayslip {

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    public void generatePaySlipInfo(
            JTable GPTable,
            JTable GPTimeLogTable,
            JLabel GPGenerateName,
            JLabel GPGenerateEmployeeUID,
            JLabel GPGeneratePeriod,
            JComboBox GPGeneratePeriodMonth,
            JComboBox GPGeneratePeriodFromDate,
            JComboBox GPGeneratePeriodToDate,
            JComboBox GPGeneratePeriodYear,
            JLabel GPGenerateDaysWorked,
            JLabel GPGenerateHoursWorked,
            JLabel GPGenerateHourlyGrossRate,
            JLabel GPGenerateDailyGrossRate,
            JLabel GPGenerateGrossIncome,
            JLabel GPGenerateNetIncome,
            JLabel GPGeneratePagibig,
            JLabel GPGeneratePhilhealth,
            JLabel GPGenerateSSS,
            JLabel GPGenerateTax,
            JLabel GPGenerateTotalDeduction,
            JTextField GPGeneratePagibigLoanField,
            JTextField GPGenerateSSSLoanField,
            JTextField GPGenerateOtherLoanField) {
        //----------------------------------------------------------------------------------------
        DefaultTableModel employeeInformationTableModel = (DefaultTableModel) GPTable.getModel();
        int selectedIndex = GPTable.getSelectedRow();
        int employeeUID = Integer.parseInt(employeeInformationTableModel.getValueAt(selectedIndex, 0).toString());
        String fullName = employeeInformationTableModel.getValueAt(selectedIndex, 1).toString() + " " + employeeInformationTableModel.getValueAt(selectedIndex, 2).toString() + " " + employeeInformationTableModel.getValueAt(selectedIndex, 3).toString();
        String getBasicPayQuery = "SELECT * FROM `employee_company_informations` WHERE `employee_uid` ='" + employeeUID + "'";
        int basicPay = 0;
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement pgetBasicPayStmt = connection.prepareStatement(getBasicPayQuery);
            ResultSet getBasicPayResult = pgetBasicPayStmt.executeQuery();

            while (getBasicPayResult.next()) {
                basicPay = getBasicPayResult.getInt("basic_pay");
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(GeneratePayslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //----------------------------------------------------------------------------------------
        String fromDate = GPGeneratePeriodMonth.getSelectedItem().toString() + " " + GPGeneratePeriodFromDate.getSelectedItem().toString() + ", " + GPGeneratePeriodYear.getSelectedItem().toString();
        String toDate = GPGeneratePeriodMonth.getSelectedItem().toString() + " " + ((Integer.parseInt(GPGeneratePeriodToDate.getSelectedItem().toString())) + 1) + ", " + GPGeneratePeriodYear.getSelectedItem().toString();
        String query = "SELECT * FROM `employee_time_log` WHERE `employee_uid` = ? AND date BETWEEN ? AND ?";
        ArrayList<Integer> totalRenderedHoursArr = new ArrayList<Integer>();
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, employeeUID);
            stmt.setString(2, fromDate);
            stmt.setString(3, toDate);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String rederedHoursString = rs.getString("total_rendered_hours");
                int renderedHours = Integer.parseInt(rederedHoursString);
                totalRenderedHoursArr.add(renderedHours);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        int totalRenderedHours = 0;
        for (int i = 0; i < totalRenderedHoursArr.size(); i++) {
            totalRenderedHours += totalRenderedHoursArr.get(i);
        }
        String pagibigLoan = GPGeneratePagibigLoanField.getText();
        String sssLoan = GPGenerateSSSLoanField.getText();
        String otherLoan = GPGenerateOtherLoanField.getText();

        if (pagibigLoan.equals("") || sssLoan.equals("") || otherLoan.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter loan deduction ammounts or enter zero if no loans", "Payslip Generator", JOptionPane.ERROR_MESSAGE);
        } else {
            String payPeriod = GPGeneratePeriodMonth.getSelectedItem().toString() + " " + GPGeneratePeriodFromDate.getSelectedItem().toString() + "-" + GPGeneratePeriodToDate.getSelectedItem().toString() + ", " + GPGeneratePeriodYear.getSelectedItem().toString();
            int daysWorked = totalRenderedHoursArr.size();
            double dailyRate = basicPay / 22;
            double hourlyRate = dailyRate / 8;
            double grossIncome = hourlyRate * totalRenderedHours;
            double pagibigdeduction = 100;
            double philhealthdeduction;
            if (grossIncome >= 25000) {
                philhealthdeduction = 1000;
            } else {
                philhealthdeduction = 200;
            }
            double sssdeduction = grossIncome * 0.07;

            double tempYearlyNetIncome = (grossIncome * 2) * 12;
            double taxDeduction = 0;
            if (tempYearlyNetIncome > 250000) {
                double getExcess = tempYearlyNetIncome - 250000;
                taxDeduction = getExcess * 0.20;
                taxDeduction = (taxDeduction / 12) / 2;

            } else if (tempYearlyNetIncome > 400000) {
                double getExcess = tempYearlyNetIncome - 400000;
                taxDeduction = (getExcess * 0.25) + 30000;
                taxDeduction = (taxDeduction / 12) / 2;

            } else if (tempYearlyNetIncome > 800000) {
                double getExcess = tempYearlyNetIncome - 800000;
                taxDeduction = (getExcess * 0.30) + 130000;
                taxDeduction = (taxDeduction / 12) / 2;

            } else if (tempYearlyNetIncome > 2000000) {
                double getExcess = tempYearlyNetIncome - 2000000;
                taxDeduction = (getExcess * 0.32) + 490000;
                taxDeduction = (taxDeduction / 12) / 2;

            } else if (tempYearlyNetIncome > 8000000) {
                double getExcess = tempYearlyNetIncome - 2410000;
                taxDeduction = (getExcess * 0.35) + 490000;
                taxDeduction = (taxDeduction / 12) / 2;
            }
            System.out.println(""+taxDeduction);

            double pagibigLoanDeduction = Double.parseDouble(pagibigLoan);
            double sssLoanDeduction = Double.parseDouble(sssLoan);
            double otherLoanDeduction = Double.parseDouble(otherLoan);
            double totalDeduction = pagibigdeduction + philhealthdeduction + sssdeduction + taxDeduction + pagibigLoanDeduction + sssLoanDeduction + otherLoanDeduction;
            double netIncome = grossIncome - totalDeduction;

            GPGenerateName.setText(fullName);
            GPGenerateEmployeeUID.setText(employeeInformationTableModel.getValueAt(selectedIndex, 0).toString());
            GPGeneratePeriod.setText(payPeriod);
            GPGenerateDaysWorked.setText("" + daysWorked);
            GPGenerateHoursWorked.setText("" + totalRenderedHours);
            GPGenerateHourlyGrossRate.setText(String.format("%.2f", hourlyRate));
            GPGenerateDailyGrossRate.setText(String.format("%.2f", dailyRate));
            GPGenerateGrossIncome.setText(String.format("%.2f", grossIncome));
            GPGenerateNetIncome.setText(String.format("%.2f", netIncome));
            GPGeneratePagibig.setText(String.format("%.2f", pagibigdeduction));
            GPGeneratePhilhealth.setText(String.format("%.2f", philhealthdeduction));
            GPGenerateSSS.setText(String.format("%.2f", sssdeduction));
            GPGenerateTax.setText(String.format("%.2f", taxDeduction));
            GPGenerateTotalDeduction.setText(String.format("%.2f", totalDeduction));
        }
    }

    public void generatePaySlipSave(
            JTable GPTable,
            JTable GPTimeLogTable,
            JLabel GPGenerateName,
            JLabel GPGenerateEmployeeUID,
            JLabel GPGeneratePeriod,
            JComboBox GPGeneratePeriodMonth,
            JComboBox GPGeneratePeriodFromDate,
            JComboBox GPGeneratePeriodToDate,
            JComboBox GPGeneratePeriodYear,
            JLabel GPGenerateDaysWorked,
            JLabel GPGenerateHoursWorked,
            JLabel GPGenerateHourlyGrossRate,
            JLabel GPGenerateDailyGrossRate,
            JLabel GPGenerateGrossIncome,
            JLabel GPGenerateNetIncome,
            JLabel GPGeneratePagibig,
            JLabel GPGeneratePhilhealth,
            JLabel GPGenerateSSS,
            JLabel GPGenerateTax,
            JLabel GPGenerateTotalDeduction,
            JTextField GPGeneratePagibigLoanField,
            JTextField GPGenerateSSSLoanField,
            JTextField GPGenerateOtherLoanField) {
        if (GPGenerateName.getText().equals("")
                || GPGenerateEmployeeUID.getText().equals("")
                || GPGeneratePeriod.getText().equals("")
                || GPGeneratePeriodMonth.getSelectedIndex() == 0
                || GPGeneratePeriodFromDate.getSelectedIndex() == 0
                || GPGeneratePeriodToDate.getSelectedIndex() == 0
                || GPGeneratePeriodYear.getSelectedIndex() == 0
                || GPGenerateDaysWorked.getText().equals("")
                || GPGenerateHoursWorked.getText().equals("")
                || GPGenerateHourlyGrossRate.getText().equals("")
                || GPGenerateDailyGrossRate.getText().equals("")
                || GPGenerateGrossIncome.getText().equals("")
                || GPGenerateNetIncome.getText().equals("")
                || GPGeneratePagibig.getText().equals("")
                || GPGeneratePhilhealth.getText().equals("")
                || GPGenerateSSS.getText().equals("")
                || GPGenerateTax.getText().equals("")
                || GPGenerateTotalDeduction.getText().equals("")
                || GPGeneratePagibigLoanField.getText().equals("")
                || GPGenerateSSSLoanField.getText().equals("")
                || GPGenerateOtherLoanField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Generate payslip failed, all or some fields are empty", "Payslip Generator", JOptionPane.ERROR_MESSAGE);
        } else {
            //----------------------------------------------------------------------------------------
            DefaultTableModel employeeInformationTableModel = (DefaultTableModel) GPTable.getModel();
            int selectedIndex = GPTable.getSelectedRow();
            int employeeUID = Integer.parseInt(employeeInformationTableModel.getValueAt(selectedIndex, 0).toString());
            String firstName = employeeInformationTableModel.getValueAt(selectedIndex, 1).toString();
            String middleName = employeeInformationTableModel.getValueAt(selectedIndex, 2).toString();
            String lastName = employeeInformationTableModel.getValueAt(selectedIndex, 3).toString();

            String fullName = firstName + " " + middleName + " " + lastName;
            String getBasicPayQuery = "SELECT * FROM `employee_company_informations` WHERE `employee_uid` ='" + employeeUID + "'";
            int basicPay = 0;
            try {
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement pgetBasicPayStmt = connection.prepareStatement(getBasicPayQuery);
                ResultSet getBasicPayResult = pgetBasicPayStmt.executeQuery();

                while (getBasicPayResult.next()) {
                    basicPay = getBasicPayResult.getInt("basic_pay");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(GeneratePayslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            //----------------------------------------------------------------------------------------
            String fromDate = GPGeneratePeriodMonth.getSelectedItem().toString() + " " + GPGeneratePeriodFromDate.getSelectedItem().toString() + ", " + GPGeneratePeriodYear.getSelectedItem().toString();
            String toDate = GPGeneratePeriodMonth.getSelectedItem().toString() + " " + ((Integer.parseInt(GPGeneratePeriodToDate.getSelectedItem().toString())) + 1) + ", " + GPGeneratePeriodYear.getSelectedItem().toString();
            String query = "SELECT * FROM `employee_time_log` WHERE `employee_uid` = ? AND date BETWEEN ? AND ?";
            ArrayList<Integer> totalRenderedHoursArr = new ArrayList<Integer>();
            try {
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setInt(1, employeeUID);
                stmt.setString(2, fromDate);
                stmt.setString(3, toDate);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    String rederedHoursString = rs.getString("total_rendered_hours");
                    int renderedHours = Integer.parseInt(rederedHoursString);
                    totalRenderedHoursArr.add(renderedHours);
                }
                rs.close();
                stmt.close();
                connection.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            int totalRenderedHours = 0;
            for (int i = 0; i < totalRenderedHoursArr.size(); i++) {
                totalRenderedHours += totalRenderedHoursArr.get(i);
            }
            String pagibigLoan = GPGeneratePagibigLoanField.getText();
            String sssLoan = GPGenerateSSSLoanField.getText();
            String otherLoan = GPGenerateOtherLoanField.getText();

            if (pagibigLoan.equals("") || sssLoan.equals("") || otherLoan.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter loan deduction ammounts or enter zero if no loans", "Payslip Generator", JOptionPane.ERROR_MESSAGE);
            } else {
                String payPeriod = GPGeneratePeriodMonth.getSelectedItem().toString() + " " + GPGeneratePeriodFromDate.getSelectedItem().toString() + "-" + GPGeneratePeriodToDate.getSelectedItem().toString() + ", " + GPGeneratePeriodYear.getSelectedItem().toString();
                int daysWorked = totalRenderedHoursArr.size();
                double dailyRate = basicPay / 22;
                double hourlyRate = dailyRate / 8;
                double grossIncome = hourlyRate * totalRenderedHours;
                double pagibigdeduction = 100;
                double philhealthdeduction;
                if (grossIncome >= 25000) {
                    philhealthdeduction = 1000;
                } else {
                    philhealthdeduction = 200;
                }
                double sssdeduction = grossIncome * 0.07;

                double tempYearlyNetIncome = (grossIncome * 2) * 12;
                double taxDeduction = 0;
                if (tempYearlyNetIncome > 250000) {
                    double getExcess = tempYearlyNetIncome - 250000;
                    taxDeduction = getExcess * 0.20;
                    taxDeduction = (taxDeduction / 12) / 2;

                } else if (tempYearlyNetIncome > 400000) {
                    double getExcess = tempYearlyNetIncome - 400000;
                    taxDeduction = (getExcess * 0.25) + 30000;
                    taxDeduction = (taxDeduction / 12) / 2;

                } else if (tempYearlyNetIncome > 800000) {
                    double getExcess = tempYearlyNetIncome - 800000;
                    taxDeduction = (getExcess * 0.30) + 130000;
                    taxDeduction = (taxDeduction / 12) / 2;

                } else if (tempYearlyNetIncome > 2000000) {
                    double getExcess = tempYearlyNetIncome - 2000000;
                    taxDeduction = (getExcess * 0.32) + 490000;
                    taxDeduction = (taxDeduction / 12) / 2;

                } else if (tempYearlyNetIncome > 8000000) {
                    double getExcess = tempYearlyNetIncome - 2410000;
                    taxDeduction = (getExcess * 0.35) + 490000;
                    taxDeduction = (taxDeduction / 12) / 2;
                }

                double pagibigLoanDeduction = Double.parseDouble(pagibigLoan);
                double sssLoanDeduction = Double.parseDouble(sssLoan);
                double otherLoanDeduction = Double.parseDouble(otherLoan);
                double totalDeduction = pagibigdeduction + philhealthdeduction + sssdeduction + taxDeduction + pagibigLoanDeduction + sssLoanDeduction + otherLoanDeduction;
                double netIncome = grossIncome - totalDeduction;

                String queryPayslip = "INSERT INTO `employee_payslip`("
                        + "`employee_uid`,"
                        + "`first_name`,"
                        + "`middle_name`, "
                        + "`last_name`, "
                        + "`pay_period`, "
                        + "`days_worked`,"
                        + "`hours_worked`, "
                        + "`hourly_gross_rate`, "
                        + "`daily_gross_rate`, "
                        + "`gross_income`, "
                        + "`net_income`, "
                        + "`PAGIBIG`, "
                        + "`PHIC`, "
                        + "`SSS`, "
                        + "`tax`, "
                        + "`pagibig_loan`, "
                        + "`sss_loan`, "
                        + "`other_loan`, "
                        + "`total_deduction`) "
                        + "VALUES "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                try {
                    Connection connection = DriverManager.getConnection(Database);
                    PreparedStatement smts = connection.prepareStatement(queryPayslip);

                    smts.setInt(1, employeeUID);
                    smts.setString(2, firstName);
                    smts.setString(3, middleName);
                    smts.setString(4, lastName);
                    smts.setString(5, payPeriod);
                    smts.setString(6, ("" + daysWorked));
                    smts.setString(7, ("" + totalRenderedHours));
                    smts.setString(8, String.format("%.2f", hourlyRate));
                    smts.setString(9, String.format("%.2f", dailyRate));
                    smts.setString(10, String.format("%.2f", grossIncome));
                    smts.setString(11, String.format("%.2f", netIncome));
                    smts.setString(12, String.format("%.2f", pagibigdeduction));
                    smts.setString(13, String.format("%.2f", philhealthdeduction));
                    smts.setString(14, String.format("%.2f", sssdeduction));
                    smts.setString(15, String.format("%.2f", taxDeduction));
                    smts.setString(16, String.format("%.2f", pagibigLoanDeduction));
                    smts.setString(17, String.format("%.2f", sssLoanDeduction));
                    smts.setString(18, String.format("%.2f", otherLoanDeduction));
                    smts.setString(19, String.format("%.2f", totalDeduction));
                    smts.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Payslip successfully generated", "Generate Payslip", JOptionPane.INFORMATION_MESSAGE);
                    GPGenerateName.setText("");
                    GPGenerateEmployeeUID.setText("");
                    GPGeneratePeriod.setText("");
                    GPGeneratePeriodMonth.setSelectedIndex(0);
                    GPGeneratePeriodFromDate.setSelectedIndex(0);
                    GPGeneratePeriodToDate.setSelectedIndex(0);
                    GPGeneratePeriodYear.setSelectedIndex(0);
                    GPGenerateHoursWorked.setText("");
                    GPGenerateHourlyGrossRate.setText("");
                    GPGenerateDailyGrossRate.setText("");
                    GPGenerateGrossIncome.setText("");
                    GPGenerateNetIncome.setText("");
                    GPGeneratePagibig.setText("");
                    GPGeneratePhilhealth.setText("");
                    GPGenerateSSS.setText("");
                    GPGenerateTax.setText("");
                    GPGenerateTotalDeduction.setText("");
                    GPGeneratePagibigLoanField.setText("0");
                    GPGenerateSSSLoanField.setText("0");
                    GPGenerateOtherLoanField.setText("0");
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(ContactSupportAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

            }
        }

    }

    public void deletePayslip() {

    }
}
