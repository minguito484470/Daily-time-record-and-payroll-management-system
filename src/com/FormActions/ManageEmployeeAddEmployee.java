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

public class ManageEmployeeAddEmployee extends ManageEmployeeTable{

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

    public void addAction(
            JTextField MEAddPIFirstName,
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
            JPanel MECardPanel
    ) {

        String firstName = MEAddPIFirstName.getText();
        String middleName = MEAddPIMiddleName.getText();
        String lastName = MEAddPILastName.getText();
        String gender = null;
        if (MEAddPIMale.isSelected()) {
            gender = "Male";
        } else if (MEAddPIFemale.isSelected()) {
            gender = "Female";
        }
        String birthday = MEAddPIBirthMonth.getSelectedItem().toString() + " " + MEAddPIBirthDate.getSelectedItem().toString() + ", " + MEAddPIBirthYear.getSelectedItem().toString();
        String address = MEAddPIAddress.getText();
        String mobileNumber = MEAddPIMobileNumber.getText();
        String martialStatus = MEAddPIMaritalStatus.getSelectedItem().toString();

        String employeeUID = MEAddCIEmployeeUID.getText();
        String email = MEAddCIEmail.getText();
        String position = MEAddCIPosition.getText();
        String status = MEAddCIStatus.getSelectedItem().toString();
        String accountType = MEAddCIAccountType.getSelectedItem().toString();
        String dateStarted = MEAddCIDateStartMonth.getSelectedItem().toString() + " " + MEAddCIDateStartDate.getSelectedItem().toString() + ", " + MEAddCIDateStartYear.getSelectedItem().toString();
        String basicPay = MEAddCIBasicPay.getText();

        String pagibig = MEAddGIDHDMF1.getText() + "-" + MEAddGIDHDMF2.getText() + "-" + MEAddGIDHDMF3.getText();
        String philHealth = MEAddGIDPHIC1.getText() + "-" + MEAddGIDPHIC2.getText() + "-" + MEAddGIDPHIC3.getText();
        String SSS = MEAddGIDSSS1.getText() + "-" + MEAddGIDSSS2.getText() + "-" + MEAddGIDSSS3.getText();
        String TIN = MEAddGIDTIN1.getText() + "-" + MEAddGIDTIN2.getText() + "-" + MEAddGIDTIN3.getText();

        String emerContactInfo = MEAddEmerContactPerson.getText();
        String emerRelationship = MEAddEmerRelationship.getText();
        String emerAddress = MEAddEmerAddress.getText();
        String emerContactNumber = MEAddEmerContactNumber.getText();

        String personalInforQuery = "INSERT INTO `employee_personal_informations`(`employee_uid`, `first_name`, `middle_name`, `last_name`, `gender`, `birthday`, `address`, `mobile_number`, `marital_status`) VALUES (?,?,?,?,?,?,?,?,?);";
        String companyInfoQuery = "INSERT INTO `employee_company_informations`(`employee_uid`, `email`, `position`, `status`, `account_type`, `date_started`, `basic_pay`) VALUES (?,?,?,?,?,?,?)";
        String governmentInfoQuery = "INSERT INTO `employee_government_id_info`(`employee_uid`, `pagibig_id_number`, `philhealth_id_number`, `sss_id_number`, `tin_id_number`) VALUES (?,?,?,?,?)";
        String emegencyInfoQuery = "INSERT INTO `employee_emergency_contact`(`employee_uid`, `contact_person`, `relationship`, `address`, `contact_number`) VALUES (?,?,?,?,?)";
        String loginInfoQuery = "INSERT INTO `employee_logins`(`employee_uid`, `username`, `password`, `security_question`, `answer`, `account_type`) VALUES (?,?,?,?,?,?)";

        if (MEAddPIFirstName.getText().equals("")
                || MEAddPIMiddleName.getText().equals("")
                || MEAddPILastName.getText().equals("")
                || MEAddPIBirthMonth.getSelectedIndex() == 0
                || MEAddPIBirthDate.getSelectedIndex() == 0
                || MEAddPIBirthYear.getSelectedIndex() == 0
                || MEAddPIAddress.getText().equals("")
                || MEAddPIMobileNumber.getText().equals("")
                || MEAddPIMaritalStatus.getSelectedIndex() == 0
                || MEAddCIEmployeeUID.getText().equals("")
                || MEAddCIEmail.getText().equals("")
                || MEAddCIPosition.getText().equals("")
                || MEAddCIStatus.getSelectedIndex() == 0
                || MEAddCIAccountType.getSelectedIndex() == 0
                || MEAddCIDateStartMonth.getSelectedIndex() == 0
                || MEAddCIDateStartDate.getSelectedIndex() == 0
                || MEAddCIDateStartYear.getSelectedIndex() == 0
                || MEAddCIBasicPay.getText().equals("")
                || MEAddGIDHDMF1.getText().equals("")
                || MEAddGIDHDMF2.getText().equals("")
                || MEAddGIDHDMF3.getText().equals("")
                || MEAddGIDPHIC1.getText().equals("")
                || MEAddGIDPHIC2.getText().equals("")
                || MEAddGIDPHIC3.getText().equals("")
                || MEAddGIDSSS1.getText().equals("")
                || MEAddGIDSSS2.getText().equals("")
                || MEAddGIDSSS3.getText().equals("")
                || MEAddGIDTIN1.getText().equals("")
                || MEAddGIDTIN2.getText().equals("")
                || MEAddGIDTIN3.getText().equals("")
                || MEAddEmerContactPerson.getText().equals("")
                || MEAddEmerRelationship.getText().equals("")
                || MEAddEmerAddress.getText().equals("")
                || MEAddEmerContactNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the field! Check empty fields and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEAddCIBasicPay.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Invalid compensation details! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEAddGIDHDMF1.getText().length() < 4 && MEAddGIDHDMF2.getText().length() < 4 && MEAddGIDHDMF3.getText().length() < 4) {
            JOptionPane.showMessageDialog(null, "Invalid Pag-IBIG MID Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEAddGIDPHIC1.getText().length() < 2 && MEAddGIDPHIC2.getText().length() < 9 && MEAddGIDPHIC3.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Invalid PhilHealth Identification Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEAddGIDSSS1.getText().length() < 2 && MEAddGIDSSS2.getText().length() < 7 && MEAddGIDSSS3.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, "Invalid Social Security System Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (MEAddGIDTIN1.getText().length() < 3 || MEAddGIDTIN2.getText().length() < 3 || MEAddGIDTIN3.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "Invalid Taxpayer Identification Number! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Invalid email address! Check the field and try again.", "Manage Employee", JOptionPane.ERROR_MESSAGE);

        } else {
            String username = (String.valueOf(firstName.charAt(0)) + lastName).toLowerCase();
            String password = "welcome123";
            try {
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement personalInforStmt = connection.prepareStatement(personalInforQuery);
                PreparedStatement companyInfoStmt = connection.prepareStatement(companyInfoQuery);
                PreparedStatement governmentInfoStmt = connection.prepareStatement(governmentInfoQuery);
                PreparedStatement emegencyInfoStmt = connection.prepareStatement(emegencyInfoQuery);
                PreparedStatement loginInfoStmt = connection.prepareStatement(loginInfoQuery);

                personalInforStmt.setInt(1, Integer.parseInt(employeeUID));
                personalInforStmt.setString(2, firstName);
                personalInforStmt.setString(3, middleName);
                personalInforStmt.setString(4, lastName);
                personalInforStmt.setString(5, gender);
                personalInforStmt.setString(6, birthday);
                personalInforStmt.setString(7, address);
                personalInforStmt.setLong(8, Long.parseLong(mobileNumber));
                personalInforStmt.setString(9, martialStatus);

                companyInfoStmt.setInt(1, Integer.parseInt(employeeUID));
                companyInfoStmt.setString(2, email);
                companyInfoStmt.setString(3, position);
                companyInfoStmt.setString(4, status);
                companyInfoStmt.setString(5, accountType);
                companyInfoStmt.setString(6, dateStarted);
                companyInfoStmt.setInt(7, Integer.parseInt(basicPay));

                governmentInfoStmt.setInt(1, Integer.parseInt(employeeUID));
                governmentInfoStmt.setString(2, pagibig);
                governmentInfoStmt.setString(3, philHealth);
                governmentInfoStmt.setString(4, SSS);
                governmentInfoStmt.setString(5, TIN);

                emegencyInfoStmt.setInt(1, Integer.parseInt(employeeUID));
                emegencyInfoStmt.setString(2, emerContactInfo);
                emegencyInfoStmt.setString(3, emerRelationship);
                emegencyInfoStmt.setString(4, emerAddress);
                emegencyInfoStmt.setLong(5, Long.parseLong(emerContactNumber));

                loginInfoStmt.setInt(1, Integer.parseInt(employeeUID));
                loginInfoStmt.setString(2, username);
                loginInfoStmt.setString(3, password);
                loginInfoStmt.setString(4, "");
                loginInfoStmt.setString(5, "");
                loginInfoStmt.setString(6, accountType);
               
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

                JOptionPane.showMessageDialog(null, "New employee successfully added", "Manage Employee", JOptionPane.INFORMATION_MESSAGE);

                MEAddPIFirstName.setText("");
                MEAddPIMiddleName.setText("");
                MEAddPILastName.setText("");
                MEAddPIMale.setSelected(false);
                MEAddPIFemale.setSelected(false);
                MEAddPIBirthMonth.setSelectedIndex(0);
                MEAddPIBirthDate.setSelectedIndex(0);
                MEAddPIBirthYear.setSelectedIndex(0);
                MEAddPIAddress.setText("");
                MEAddPIMobileNumber.setText("");
                MEAddPIMaritalStatus.setSelectedIndex(0);

                MEAddCIEmployeeUID.setText("");
                MEAddCIEmail.setText("");
                MEAddCIPosition.setText("");
                MEAddCIStatus.setSelectedIndex(0);
                MEAddCIAccountType.setSelectedIndex(0);
                MEAddCIDateStartMonth.setSelectedIndex(0);
                MEAddCIDateStartDate.setSelectedIndex(0);
                MEAddCIDateStartYear.setSelectedIndex(0);
                MEAddCIBasicPay.setText("");

                MEAddGIDHDMF1.setText("");
                MEAddGIDHDMF2.setText("");
                MEAddGIDHDMF3.setText("");
                MEAddGIDPHIC1.setText("");
                MEAddGIDPHIC2.setText("");
                MEAddGIDPHIC3.setText("");
                MEAddGIDSSS1.setText("");
                MEAddGIDSSS2.setText("");
                MEAddGIDSSS3.setText("");
                MEAddGIDTIN1.setText("");
                MEAddGIDTIN2.setText("");
                MEAddGIDTIN3.setText("");

                MEAddEmerContactPerson.setText("");
                MEAddEmerRelationship.setText("");
                MEAddEmerAddress.setText("");
                MEAddEmerContactNumber.setText("");

                changeCard(METablePanel, MECardPanel);
            } catch (SQLException ex) {
                Logger.getLogger(ManageEmployeeAddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex, "Manage Employee", JOptionPane.ERROR_MESSAGE);

            }
        }

    }
}
