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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ShowCurrentLoggedInUser {
    
    private JLabel topLoggedFullName;
    private JLabel PPIName;
    private JLabel homeWelcomeUserLabel;
    private JLabel PPIGender;
    private JLabel PPIBirthdate;
    private JLabel PPIAddress;
    private JLabel PPIMobileNumber;
    private JLabel PPIMaritalStatus;
    private JLabel PCIEmployeeUID;
    private JLabel PCIEmail;
    private JLabel PCIPosition;
    private JLabel PCIStatus;
    private JLabel PCIAccountType;
    private JLabel PCIDateStarted;
    private JLabel PCDBasicPay;
    private JLabel PGIDHDMF;
    private JLabel PGIDPHIC;
    private JLabel PGIDSSS;
    private JLabel PGIDTIN;
    private JLabel PEmerContactPerson;
    private JLabel PEmerRelationship;
    private JLabel PEmerAddress;
    private JLabel PEmerContactNumber;
    private int employeeUID;
    
    private final String Database = new DatabaseLocation().getDatabaseLocation();
    
    public void setInfo(
            JLabel topLoggedFullName,
            JLabel PPIName,
            JLabel homeWelcomeUserLabel,
            JLabel PPIGender,
            JLabel PPIBirthdate,
            JLabel PPIAddress,
            JLabel PPIMobileNumber,
            JLabel PPIMaritalStatus,
            JLabel PCIEmployeeUID,
            JLabel PCIEmail,
            JLabel PCIPosition,
            JLabel PCIStatus,
            JLabel PCIAccountType,
            JLabel PCIDateStarted,
            JLabel PCDBasicPay,
            JLabel PGIDHDMF,
            JLabel PGIDPHIC,
            JLabel PGIDSSS,
            JLabel PGIDTIN,
            JLabel PEmerContactPerson,
            JLabel PEmerRelationship,
            JLabel PEmerAddress,
            JLabel PEmerContactNumber,
            int employeeUID) {
        this.topLoggedFullName = topLoggedFullName;
        this.PPIName = PPIName;
        this.homeWelcomeUserLabel = homeWelcomeUserLabel;
        this.PPIGender = PPIGender;
        this.PPIBirthdate = PPIBirthdate;
        this.PPIAddress = PPIAddress;
        this.PPIMobileNumber = PPIMobileNumber;
        this.PPIMaritalStatus = PPIMaritalStatus;
        this.PCIEmployeeUID = PCIEmployeeUID;
        this.PCIEmail = PCIEmail;
        this.PCIPosition = PCIPosition;
        this.PCIStatus = PCIStatus;
        this.PCIAccountType = PCIAccountType;
        this.PCIDateStarted = PCIDateStarted;
        this.PCDBasicPay = PCDBasicPay;
        this.PGIDHDMF = PGIDHDMF;
        this.PGIDPHIC = PGIDPHIC;
        this.PGIDSSS = PGIDSSS;
        this.PGIDTIN = PGIDTIN;
        this.PEmerContactPerson = PEmerContactPerson;
        this.PEmerRelationship = PEmerRelationship;
        this.PEmerAddress = PEmerAddress;
        this.PEmerContactNumber = PEmerContactNumber;
        this.employeeUID = employeeUID;
        
    }
    
    public void showCurrentLoggedIn() {
        try {
            
            String personalInforQuery = "SELECT * FROM `employee_personal_informations` WHERE `employee_uid` = '" + employeeUID + "'";
            String companyInfoQuery = "SELECT * FROM `employee_company_informations` WHERE `employee_uid` = '" + employeeUID + "'";
            String governmentIDInfoQuery = "SELECT * FROM `employee_government_id_info` WHERE `employee_uid` = '" + employeeUID + "'";
            String emegencyInfoQuery = "SELECT * FROM `employee_emergency_contact` WHERE `employee_uid` = '" + employeeUID + "'";
            
            Connection connection = DriverManager.getConnection(Database);
            
            PreparedStatement personalInfoStmt = connection.prepareStatement(personalInforQuery);
            ResultSet personalInfoResult = personalInfoStmt.executeQuery();
            
            while (personalInfoResult.next()) {
                String fullName = personalInfoResult.getString("first_name") + " " + personalInfoResult.getString("middle_name") + " " + personalInfoResult.getString("last_name");
                topLoggedFullName.setText(fullName);
                PPIName.setText(fullName);
                homeWelcomeUserLabel.setText("Welcome " + personalInfoResult.getString("first_name") + "!");
                PPIGender.setText(personalInfoResult.getString("gender"));
                PPIBirthdate.setText(personalInfoResult.getString("birthday"));
                PPIAddress.setText("<HTML>" + personalInfoResult.getString("address") + "</HTML>");
                PPIMobileNumber.setText(personalInfoResult.getString("mobile_number"));
                PPIMaritalStatus.setText(personalInfoResult.getString("marital_status"));
            }
            personalInfoResult.close();
            
            PreparedStatement companyInfoStmt = connection.prepareStatement(companyInfoQuery);
            ResultSet companyInfoResult = companyInfoStmt.executeQuery();
            
            while (companyInfoResult.next()) {
                PCIEmployeeUID.setText(companyInfoResult.getString("employee_uid"));
                PCIEmail.setText(companyInfoResult.getString("email"));
                PCIPosition.setText(companyInfoResult.getString("position"));
                PCIStatus.setText(companyInfoResult.getString("status"));
                PCIAccountType.setText(companyInfoResult.getString("account_type"));
                PCIDateStarted.setText(companyInfoResult.getString("date_started"));
                int basicPay = companyInfoResult.getInt("basic_pay");
                PCDBasicPay.setText("" + basicPay);
            }
            companyInfoResult.close();
            
            PreparedStatement governmentIDInfoStmt = connection.prepareStatement(governmentIDInfoQuery);
            ResultSet governmentIDInfoResult = governmentIDInfoStmt.executeQuery();
            
            while (governmentIDInfoResult.next()) {
                PGIDHDMF.setText(governmentIDInfoResult.getString("pagibig_id_number"));
                PGIDPHIC.setText(governmentIDInfoResult.getString("philhealth_id_number"));
                PGIDSSS.setText(governmentIDInfoResult.getString("sss_id_number"));
                PGIDTIN.setText(governmentIDInfoResult.getString("tin_id_number"));
            }
            governmentIDInfoStmt.close();
            
            PreparedStatement emergencyInfoStmt = connection.prepareStatement(emegencyInfoQuery);
            ResultSet emergencyInfoResult = emergencyInfoStmt.executeQuery();
            
            while (emergencyInfoResult.next()) {
                PEmerContactPerson.setText(emergencyInfoResult.getString("contact_person"));
                PEmerRelationship.setText(emergencyInfoResult.getString("relationship"));
                PEmerAddress.setText("<HTML>" + emergencyInfoResult.getString("address") + "</HTML>");
                PEmerContactNumber.setText(emergencyInfoResult.getString("contact_number"));
            }
            emergencyInfoStmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeeGetInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void generatePayPeriod(JComboBox payslipPayPeriodList, int employeeUID) {
        String query = "SELECT * FROM `employee_payslip` WHERE `employee_uid` = ?";
        ArrayList<String> payPeriodArr = new ArrayList<String>();
        payPeriodArr.add(0, " ");
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, employeeUID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String rederedHoursString = rs.getString("pay_period");
                payPeriodArr.add(rederedHoursString);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        payslipPayPeriodList.setModel(new javax.swing.DefaultComboBoxModel<>(payPeriodArr.toArray()));
    }
    
    public void getGeneratePayInfo(
            JComboBox payslipPayPeriodList,
            int employeeUID,
            JLabel PPSName,
            JLabel PPSEmployeeUID,
            JLabel PPSPeriod,
            JLabel PPSDaysWorked,
            JLabel PPSHoursWorked,
            JLabel PPSHourlyGrossRate,
            JLabel PPSDailyGrossRate,
            JLabel PPSDailyGrossIncome,
            JLabel PPSNetIncome,
            JLabel PDPagibig,
            JLabel PDPhilhealth,
            JLabel PDSSS,
            JLabel PDTax,
            JLabel PDPagibigLoan,
            JLabel PDSSSLoan,
            JLabel PDOtherLoan,
            JLabel PDTotalDeduction) {
        String payPeriod = payslipPayPeriodList.getSelectedItem().toString();
        String query = "SELECT * FROM `employee_payslip` WHERE `employee_uid` = ? AND `pay_period`=? ";
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, employeeUID);
            stmt.setString(2, payPeriod);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String fullName = rs.getString("first_name") + " " + rs.getString("middle_name") + " " + rs.getString("last_name");
                PPSName.setText(fullName);
                PPSEmployeeUID.setText(rs.getString("employee_uid"));
                PPSPeriod.setText(rs.getString("pay_period"));
                PPSDaysWorked.setText(rs.getString("days_worked"));
                PPSHoursWorked.setText(rs.getString("hours_worked"));
                PPSHourlyGrossRate.setText(rs.getString("hourly_gross_rate"));
                PPSDailyGrossRate.setText(rs.getString("daily_gross_rate"));
                PPSDailyGrossIncome.setText(rs.getString("gross_income"));
                PPSNetIncome.setText(rs.getString("net_income"));
                PDPagibig.setText(rs.getString("PAGIBIG"));
                PDPhilhealth.setText(rs.getString("PHIC"));
                PDSSS.setText(rs.getString("SSS"));
                PDTax.setText(rs.getString("tax"));
                PDPagibigLoan.setText(rs.getString("pagibig_loan"));
                PDSSSLoan.setText(rs.getString("sss_loan"));
                PDOtherLoan.setText(rs.getString("other_loan"));
                PDTotalDeduction.setText(rs.getString("total_deduction"));
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
