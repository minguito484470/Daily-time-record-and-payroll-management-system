package com.FormActions;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ManageEmployeeUpdateEmployee  extends ManageEmployeeTable {

    ManageEmployeeGetInformation info = new ManageEmployeeGetInformation();

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    private void changeCard(Component Card, JPanel cardPanel) {
        cardPanel.removeAll();
        cardPanel.add(Card);
        cardPanel.repaint();
        cardPanel.revalidate();
    }

    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void updateInformation(
            JTextField MEUpdatePIFirstName,
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
            JPanel MECardPanel
    ) {

        String firstName = MEUpdatePIFirstName.getText();
        String middleName = MEUpdatePIMiddleName.getText();
        String lastName = MEUpdatePILastName.getText();
        String gender = null;
        if (MEUpdatePIMale.isSelected()) {
            gender = "Male";
        } else if (MEUpdatePIFemale.isSelected()) {
            gender = "Female";
        }
        String birthday = MEUpdatePIBirthMonth.getSelectedItem().toString() + " " + MEUpdatePIBirthDate.getSelectedItem().toString() + ", " + MEUpdatePIBirthYear.getSelectedItem().toString();
        String address = MEUpdatePIAddress.getText();
        String mobileNumber = MEUpdatePIMobileNumber.getText();
        String martialStatus = MEUpdatePIMaritalStatus.getSelectedItem().toString();

        String employeeUID = MEUpdateCIEmployeeUID.getText();
        String email = MEUpdateCIEmail.getText();
        String position = MEUpdateCIPosition.getText();
        String status = MEUpdateCIStatus.getSelectedItem().toString();
        String accountType = MEUpdateCIAccountType.getSelectedItem().toString();
        String dateStarted = MEUpdateCIDateStartMonth.getSelectedItem().toString() + " " + MEUpdateCIDateStartDate.getSelectedItem().toString() + ", " + MEUpdateCIDateStartYear.getSelectedItem().toString();
        String basicPay = MEUpdateCIBasicPay.getText();

        String pagibig = MEUpdateGIDHDMF1.getText() + "-" + MEUpdateGIDHDMF2.getText() + "-" + MEUpdateGIDHDMF3.getText();
        String philHealth = MEUpdateGIDPHIC1.getText() + "-" + MEUpdateGIDPHIC2.getText() + "-" + MEUpdateGIDPHIC3.getText();
        String SSS = MEUpdateGIDSSS1.getText() + "-" + MEUpdateGIDSSS2.getText() + "-" + MEUpdateGIDSSS3.getText();
        String TIN = MEUpdateGIDTIN1.getText() + "-" + MEUpdateGIDTIN2.getText() + "-" + MEUpdateGIDTIN3.getText();

        String emerContactInfo = MEUpdateEmerContactPerson.getText();
        String emerRelationship = MEUpdateEmerRelationship.getText();
        String emerAddress = MEUpdateEmerAddress.getText();
        String emerContactNumber = MEUpdateEmerContactNumber.getText();

        String personalInfoUpdateQuery = "UPDATE `employee_personal_informations` SET `first_name`= ?,`middle_name`= ?,`last_name`= ?,`gender`= ?,`birthday`= ?,`address`= ?,`mobile_number`= ?,`marital_status`= ? WHERE `employee_uid` = ?";
        String companyInfoUpdateQuery = "UPDATE `employee_company_informations` SET `email`= ?,`position`= ?,`status`= ?,`account_type`= ?,`date_started`= ?,`basic_pay`= ? WHERE `employee_uid` = ?";
        String governmentIDInfoUpdateQuery = "UPDATE `employee_government_id_info` SET `pagibig_id_number`= ?,`philhealth_id_number`= ?,`sss_id_number`= ?,`tin_id_number`= ? WHERE `employee_uid`= ?";
        String emergencyContactInfoUpdateQuery = "UPDATE `employee_emergency_contact` SET `contact_person`= ?,`relationship`= ?,`address`= ?,`contact_number`= ? WHERE `employee_uid` = ?";   
        String loginInfoQuery = "UPDATE `employee_logins`SET `account_type`=? WHERE `employee_uid`= ?";

        if (MEUpdatePIFirstName.getText().equals("")
                || MEUpdatePIMiddleName.getText().equals("")
                || MEUpdatePILastName.getText().equals("")
                || gender.equals(null)
                || MEUpdatePIBirthMonth.getSelectedIndex() == 0
                || MEUpdatePIBirthDate.getSelectedIndex() == 0
                || MEUpdatePIBirthYear.getSelectedIndex() == 0
                || MEUpdatePIAddress.getText().equals("")
                || MEUpdatePIMobileNumber.getText().equals("")
                || MEUpdatePIMaritalStatus.getSelectedIndex() == 0
                || MEUpdateCIEmployeeUID.getText().equals("")
                || MEUpdateCIEmail.getText().equals("")
                || MEUpdateCIPosition.getText().equals("")
                || MEUpdateCIStatus.getSelectedIndex() == 0
                || MEUpdateCIAccountType.getSelectedIndex() == 0
                || MEUpdateCIDateStartMonth.getSelectedIndex() == 0
                || MEUpdateCIDateStartDate.getSelectedIndex() == 0
                || MEUpdateCIDateStartYear.getSelectedIndex() == 0
                || MEUpdateCIBasicPay.getText().equals("")
                || MEUpdateGIDHDMF1.getText().equals("")
                || MEUpdateGIDHDMF2.getText().equals("")
                || MEUpdateGIDHDMF3.getText().equals("")
                || MEUpdateGIDPHIC1.getText().equals("")
                || MEUpdateGIDPHIC2.getText().equals("")
                || MEUpdateGIDPHIC3.getText().equals("")
                || MEUpdateGIDSSS1.getText().equals("")
                || MEUpdateGIDSSS2.getText().equals("")
                || MEUpdateGIDSSS3.getText().equals("")
                || MEUpdateGIDTIN1.getText().equals("")
                || MEUpdateGIDTIN2.getText().equals("")
                || MEUpdateGIDTIN3.getText().equals("")
                || MEUpdateEmerContactPerson.getText().equals("")
                || MEUpdateEmerRelationship.getText().equals("")
                || MEUpdateEmerAddress.getText().equals("")
                || MEUpdateEmerContactNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the field! Check empty fields and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEUpdateCIBasicPay.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Invalid compensation details! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEUpdateGIDHDMF1.getText().length() < 4 && MEUpdateGIDHDMF2.getText().length() < 4 && MEUpdateGIDHDMF3.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Invalid Pag-IBIG MID Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEUpdateGIDPHIC1.getText().length() < 4 && MEUpdateGIDPHIC2.getText().length() < 4 && MEUpdateGIDPHIC3.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Invalid PhilHealth Identification Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEUpdateGIDSSS1.getText().length() < 3 && MEUpdateGIDSSS2.getText().length() < 3 && MEUpdateGIDSSS3.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Invalid Social Security System Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEUpdateGIDTIN1.getText().length() < 3 || MEUpdateGIDTIN2.getText().length() < 3 || MEUpdateGIDTIN3.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Invalid Taxpayer Identification Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Invalid email address! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement personalInforStmt = connection.prepareStatement(personalInfoUpdateQuery);
                PreparedStatement companyInfoStmt = connection.prepareStatement(companyInfoUpdateQuery);
                PreparedStatement governmentInfoStmt = connection.prepareStatement(governmentIDInfoUpdateQuery);
                PreparedStatement emegencyInfoStmt = connection.prepareStatement(emergencyContactInfoUpdateQuery);
                PreparedStatement loginInfoStmt = connection.prepareStatement(loginInfoQuery);

                personalInforStmt.setString(1, firstName);
                personalInforStmt.setString(2, middleName);
                personalInforStmt.setString(3, lastName);
                personalInforStmt.setString(4, gender);
                personalInforStmt.setString(5, birthday);
                personalInforStmt.setString(6, address);
                personalInforStmt.setLong(7, Long.parseLong(mobileNumber));
                personalInforStmt.setString(8, martialStatus);
                personalInforStmt.setInt(9, Integer.parseInt(employeeUID));

                companyInfoStmt.setString(1, email);
                companyInfoStmt.setString(2, position);
                companyInfoStmt.setString(3, status);
                companyInfoStmt.setString(4, accountType);
                companyInfoStmt.setString(5, dateStarted);
                companyInfoStmt.setInt(6, Integer.parseInt(basicPay));
                companyInfoStmt.setInt(7, Integer.parseInt(employeeUID));

                governmentInfoStmt.setString(1, pagibig);
                governmentInfoStmt.setString(2, philHealth);
                governmentInfoStmt.setString(3, SSS);
                governmentInfoStmt.setString(4, TIN);
                governmentInfoStmt.setInt(5, Integer.parseInt(employeeUID));

                emegencyInfoStmt.setString(1, emerContactInfo);
                emegencyInfoStmt.setString(2, emerRelationship);
                emegencyInfoStmt.setString(3, emerAddress);
                emegencyInfoStmt.setLong(4, Long.parseLong(emerContactNumber));
                emegencyInfoStmt.setInt(5, Integer.parseInt(employeeUID));

                loginInfoStmt.setString(1, accountType);
                loginInfoStmt.setInt(2, Integer.parseInt(employeeUID));

                personalInforStmt.executeUpdate();
                companyInfoStmt.executeUpdate();
                governmentInfoStmt.executeUpdate();
                emegencyInfoStmt.executeUpdate();
                loginInfoStmt.executeUpdate();

                personalInforStmt.close();
                companyInfoStmt.close();
                governmentInfoStmt.close();
                emegencyInfoStmt.close();
                loginInfoStmt.close();

                connection.close();

                JOptionPane.showMessageDialog(null, "New employee successfully Update", "Manage Employee", JOptionPane.INFORMATION_MESSAGE);

                MEUpdatePIFirstName.setText("");
                MEUpdatePIMiddleName.setText("");
                MEUpdatePILastName.setText("");
                MEUpdatePIMale.setSelected(false);
                MEUpdatePIFemale.setSelected(false);
                MEUpdatePIBirthMonth.setSelectedIndex(0);
                MEUpdatePIBirthDate.setSelectedIndex(0);
                MEUpdatePIBirthYear.setSelectedIndex(0);
                MEUpdatePIAddress.setText("");
                MEUpdatePIMobileNumber.setText("");
                MEUpdatePIMaritalStatus.setSelectedIndex(0);

                MEUpdateCIEmployeeUID.setText("");
                MEUpdateCIEmail.setText("");
                MEUpdateCIPosition.setText("");
                MEUpdateCIStatus.setSelectedIndex(0);
                MEUpdateCIAccountType.setSelectedIndex(0);
                MEUpdateCIDateStartMonth.setSelectedIndex(0);
                MEUpdateCIDateStartDate.setSelectedIndex(0);
                MEUpdateCIDateStartYear.setSelectedIndex(0);
                MEUpdateCIBasicPay.setText("");

                MEUpdateGIDHDMF1.setText("");
                MEUpdateGIDHDMF2.setText("");
                MEUpdateGIDHDMF3.setText("");
                MEUpdateGIDPHIC1.setText("");
                MEUpdateGIDPHIC2.setText("");
                MEUpdateGIDPHIC3.setText("");
                MEUpdateGIDSSS1.setText("");
                MEUpdateGIDSSS2.setText("");
                MEUpdateGIDSSS3.setText("");
                MEUpdateGIDTIN1.setText("");
                MEUpdateGIDTIN2.setText("");
                MEUpdateGIDTIN3.setText("");

                MEUpdateEmerContactPerson.setText("");
                MEUpdateEmerRelationship.setText("");
                MEUpdateEmerAddress.setText("");
                MEUpdateEmerContactNumber.setText("");

                changeCard(METablePanel, MECardPanel);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ex", "Manage Employee", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(ManageEmployeeUpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
