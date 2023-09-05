package com.FormActions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ManageEmployeeGetInformation extends ManageEmployeeTable{


    private final String Database = new DatabaseLocation().getDatabaseLocation();
    String[] monthArr = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String[] dateArr = {"Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    String[] yearArr = {"Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900"};
    String[] maritalStatusArr = {" ", "Single", "Married", "Divorced", "Separated", "Widowed"};
    String[] statusArr = {" ", "Active", "Inactive"};
    String[] accountTypeArr = {" ", "ADMIN", "HR", "ACCOUNTING", "MANAGER", "REGULAR"};
    
    

    public void displayInfo(
            JLabel MEInfoPIName,
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
            JTable METable
    ) {

        DefaultTableModel tableModel = (DefaultTableModel) METable.getModel();
        int selectedIndex = METable.getSelectedRow();
        int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
        try {

            String personalInfoQuery = "SELECT * FROM `employee_personal_informations` WHERE `employee_uid` = '" + employeeUID + "'";
            String companyInfoQuery = "SELECT * FROM `employee_company_informations` WHERE `employee_uid` = '" + employeeUID + "'";
            String governmentInfoQuery = "SELECT * FROM `employee_government_id_info` WHERE `employee_uid` = '" + employeeUID + "'";
            String emegencyInfoQuery = "SELECT * FROM `employee_emergency_contact` WHERE `employee_uid` = '" + employeeUID + "'";

            Connection connection = DriverManager.getConnection(Database);

            PreparedStatement personalInfoStmt = connection.prepareStatement(personalInfoQuery);
            ResultSet personalInfoResult = personalInfoStmt.executeQuery();

            while (personalInfoResult.next()) {
                MEInfoPIName.setText(personalInfoResult.getString("first_name") + " " + personalInfoResult.getString("middle_name") + " " + personalInfoResult.getString("last_name"));
                MEInfoPIGender.setText(personalInfoResult.getString("gender"));
                MEInfoPIBirthdate.setText(personalInfoResult.getString("birthday"));
                MEInfoPIAddress.setText("<HTML>" + personalInfoResult.getString("address") + "</HTML>");
                MEInfoPIMobileNumber.setText(personalInfoResult.getString("mobile_number"));
                MEInfoPIMaritalStatus.setText(personalInfoResult.getString("marital_status"));
            }
            personalInfoResult.close();

            PreparedStatement companyInfoStmt = connection.prepareStatement(companyInfoQuery);
            ResultSet companyInfoResult = companyInfoStmt.executeQuery();

            while (companyInfoResult.next()) {
                MEInfoCIEmployeeUID.setText(companyInfoResult.getString("employee_uid"));
                MEInfoCIEmail.setText(companyInfoResult.getString("email"));
                MEInfoCIPosition.setText(companyInfoResult.getString("position"));
                MEInfoCIStatus.setText(companyInfoResult.getString("status"));
                MEInfoCIAccountType.setText(companyInfoResult.getString("account_type"));
                MEInfoCIDateStarted.setText(companyInfoResult.getString("date_started"));
                MEInfoCDBasicPay.setText(companyInfoResult.getString("basic_pay"));
            }
            companyInfoResult.close();

            PreparedStatement governmentInfoStmt = connection.prepareStatement(governmentInfoQuery);
            ResultSet governmentInfoResult = governmentInfoStmt.executeQuery();

            while (governmentInfoResult.next()) {
                MEInfoGIDHDMF.setText(governmentInfoResult.getString("pagibig_id_number"));
                MEInfoGIDPHIC.setText(governmentInfoResult.getString("philhealth_id_number"));
                MEInfoGIDSSS.setText(governmentInfoResult.getString("sss_id_number"));
                MEInfoGIDTIN.setText(governmentInfoResult.getString("tin_id_number"));
            }
            governmentInfoStmt.close();

            PreparedStatement emegencyInfoStmt = connection.prepareStatement(emegencyInfoQuery);
            ResultSet emegencyInfoResult = emegencyInfoStmt.executeQuery();

            while (emegencyInfoResult.next()) {
                MEInfoEmerContactPerson.setText(emegencyInfoResult.getString("contact_person"));
                MEInfoEmerRelationship.setText(emegencyInfoResult.getString("relationship"));
                MEInfoEmerAddress.setText("<HTML>" + emegencyInfoResult.getString("address") + "</HTML>");
                MEInfoEmerContactNumber.setText(emegencyInfoResult.getString("contact_number"));
            }
            emegencyInfoStmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeeGetInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void displayToUpdate(
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
            JTextField MEUpdateEmerUpdateress,
            JTextField MEUpdateEmerContactNumber,
            JLabel MEUpdateProfilePhoto,
            JTable METable
    ) {

        DefaultTableModel tableModel = (DefaultTableModel) METable.getModel();
        int selectedIndex = METable.getSelectedRow();
        int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
        try {
            String personalInforQuery = "SELECT * FROM `employee_personal_informations` WHERE `employee_uid` = '" + employeeUID + "'";
            String companyInfoQuery = "SELECT * FROM `employee_company_informations` WHERE `employee_uid` = '" + employeeUID + "'";
            String governmentIDInfoQuery = "SELECT * FROM `employee_government_id_info` WHERE `employee_uid` = '" + employeeUID + "'";
            String emegencyInfoQuery = "SELECT * FROM `employee_emergency_contact` WHERE `employee_uid` = '" + employeeUID + "'";

            Connection connection = DriverManager.getConnection(Database);

            PreparedStatement personalInfoStmt = connection.prepareStatement(personalInforQuery);
            ResultSet personalInfoResult = personalInfoStmt.executeQuery();

            while (personalInfoResult.next()) {
                MEUpdatePIFirstName.setText(personalInfoResult.getString("first_name"));
                MEUpdatePIMiddleName.setText(personalInfoResult.getString("middle_name"));
                MEUpdatePILastName.setText(personalInfoResult.getString("last_name"));
                String gender = personalInfoResult.getString("gender");
                if (gender.equals("Male")) {
                    MEUpdatePIMale.setSelected(true);
                } else if (gender.equals("Female")) {
                    MEUpdatePIFemale.setSelected(true);
                }

                String dateStr = personalInfoResult.getString("birthday");
                String[] dateParts = dateStr.split("\\s+|,\\s*");

                String birthMonth = dateParts[0];
                String birthDate = dateParts[1];
                String birthYear = dateParts[2];

                for (int i = 0; i < monthArr.length; i++) {
                    if (monthArr[i].equals(birthMonth)) {
                        MEUpdatePIBirthMonth.setSelectedIndex(i);
                        break;
                    }
                }

                for (int i = 0; i < dateArr.length; i++) {
                    if (dateArr[i].equals(birthDate)) {
                        MEUpdatePIBirthDate.setSelectedIndex(i);
                        break;
                    }
                }

                for (int i = 0; i < yearArr.length; i++) {
                    if (yearArr[i].equals(birthYear)) {
                        MEUpdatePIBirthYear.setSelectedIndex(i);
                        break;
                    }
                }

                MEUpdatePIAddress.setText(personalInfoResult.getString("address"));
                MEUpdatePIMobileNumber.setText(personalInfoResult.getString("mobile_number"));
                String maritalStatus = personalInfoResult.getString("marital_status");

                for (int i = 0; i < maritalStatusArr.length; i++) {
                    if (maritalStatusArr[i].equals(maritalStatus)) {
                        MEUpdatePIMaritalStatus.setSelectedIndex(i);
                        break;
                    }
                }

            }
            personalInfoResult.close();

            PreparedStatement companyInfoStmt = connection.prepareStatement(companyInfoQuery);
            ResultSet companyInfoResult = companyInfoStmt.executeQuery();

            while (companyInfoResult.next()) {
                MEUpdateCIEmployeeUID.setText(companyInfoResult.getString("employee_uid"));
                MEUpdateCIEmail.setText(companyInfoResult.getString("email"));
                MEUpdateCIPosition.setText(companyInfoResult.getString("position"));
                String status = companyInfoResult.getString("status");

                for (int i = 0; i < statusArr.length; i++) {
                    if (statusArr[i].equals(status)) {
                        MEUpdateCIStatus.setSelectedIndex(i);
                        break;
                    }
                }

                String accountType = companyInfoResult.getString("account_type");

                for (int i = 0; i < accountTypeArr.length; i++) {
                    if (accountTypeArr[i].equals(accountType)) {
                        MEUpdateCIAccountType.setSelectedIndex(i);
                        break;
                    }
                }

                String dateStr = companyInfoResult.getString("date_started");
                String[] dateParts = dateStr.split("\\s+|,\\s*");

                String startedMonth = dateParts[0];
                String startedDate = dateParts[1];
                String startedYear = dateParts[2];

                for (int i = 0; i < monthArr.length; i++) {
                    if (monthArr[i].equals(startedMonth)) {
                        MEUpdateCIDateStartMonth.setSelectedIndex(i);
                        break;
                    }
                }

                for (int i = 0; i < dateArr.length; i++) {
                    if (dateArr[i].equals(startedDate)) {
                        MEUpdateCIDateStartDate.setSelectedIndex(i);
                        break;
                    }
                }

                for (int i = 0; i < yearArr.length; i++) {
                    if (yearArr[i].equals(startedYear)) {
                        MEUpdateCIDateStartYear.setSelectedIndex(i);
                        break;
                    }
                }

                MEUpdateCIBasicPay.setText(companyInfoResult.getString("basic_pay"));
            }
            companyInfoResult.close();

            PreparedStatement governmentIDInfoStmt = connection.prepareStatement(governmentIDInfoQuery);
            ResultSet governmentIDInfoResult = governmentIDInfoStmt.executeQuery();

            while (governmentIDInfoResult.next()) {
                String pagibigID = governmentIDInfoResult.getString("pagibig_id_number");
                String[] pagibigIDParts = pagibigID.split("-");
                MEUpdateGIDHDMF1.setText(pagibigIDParts[0]);
                MEUpdateGIDHDMF2.setText(pagibigIDParts[1]);
                MEUpdateGIDHDMF3.setText(pagibigIDParts[2]);

                String philhealthID = governmentIDInfoResult.getString("philhealth_id_number");
                String[] philhealthIDParts = philhealthID.split("-");
                MEUpdateGIDPHIC1.setText(philhealthIDParts[0]);
                MEUpdateGIDPHIC2.setText(philhealthIDParts[1]);
                MEUpdateGIDPHIC3.setText(philhealthIDParts[2]);

                String sssID = governmentIDInfoResult.getString("sss_id_number");
                String[] sssIDParts = sssID.split("-");
                MEUpdateGIDSSS1.setText(sssIDParts[0]);
                MEUpdateGIDSSS2.setText(sssIDParts[1]);
                MEUpdateGIDSSS3.setText(sssIDParts[2]);

                String tinID = governmentIDInfoResult.getString("tin_id_number");
                String[] tinIDParts = tinID.split("-");
                MEUpdateGIDTIN1.setText(tinIDParts[0]);
                MEUpdateGIDTIN2.setText(tinIDParts[1]);
                MEUpdateGIDTIN3.setText(tinIDParts[2]);

            }
            governmentIDInfoStmt.close();

            PreparedStatement emergencyInfoStmt = connection.prepareStatement(emegencyInfoQuery);
            ResultSet emergencyInfoResult = emergencyInfoStmt.executeQuery();

            while (emergencyInfoResult.next()) {
                MEUpdateEmerContactPerson.setText(emergencyInfoResult.getString("contact_person"));
                MEUpdateEmerRelationship.setText(emergencyInfoResult.getString("relationship"));
                MEUpdateEmerUpdateress.setText(emergencyInfoResult.getString("address"));
                MEUpdateEmerContactNumber.setText(emergencyInfoResult.getString("contact_number"));
            }
            emergencyInfoStmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ManageEmployeeGetInformation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
