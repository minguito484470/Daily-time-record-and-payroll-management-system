package com.FormActions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ContactSupportAction {

    private final String Database = new DatabaseLocation().getDatabaseLocation();

    private JLabel InvalidUIDLabel;
    private JLabel InvalidNameLabel;
    private JLabel InvalidEmailLabel;
    private JLabel InvalidSubjectLabel;
    private JLabel InvalidMessageLabel;
    private JTextField CSEmployeeUID;
    private JTextField CSFirstName;
    private JTextField CSLastName;
    private JTextField CSEmail;
    private JTextField CSSubject;
    private JTextArea CSMessage;

    public void setMessage(JLabel InvalidUIDLabel, JLabel InvalidNameLabel, JLabel InvalidEmailLabel, JLabel InvalidSubjectLabel, JLabel InvalidMessageLabel, JTextField CSEmployeeUID, JTextField CSFirstName, JTextField CSLastName, JTextField CSEmail, JTextField CSSubject, JTextArea CSMessage) {
        this.InvalidUIDLabel = InvalidUIDLabel;
        this.InvalidNameLabel = InvalidNameLabel;
        this.InvalidEmailLabel = InvalidEmailLabel;
        this.InvalidSubjectLabel = InvalidSubjectLabel;
        this.InvalidMessageLabel = InvalidMessageLabel;
        this.CSEmployeeUID = CSEmployeeUID;
        this.CSFirstName = CSFirstName;
        this.CSLastName = CSLastName;
        this.CSEmail = CSEmail;
        this.CSSubject = CSSubject;
        this.CSMessage = CSMessage;
    }

    private String getDate() {
        String currentDate;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        Date date = calendar.getTime();
        return currentDate = dateFormat.format(date);
    }

    private String getTime() {
        String currentTime;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
        Date date = calendar.getTime();
        return currentTime = dateFormat.format(date);
    }

    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void getAndSendMessage() {
        String firstName = CSFirstName.getText();
        String lastname = CSLastName.getText();
        String sEmployeeUID = CSEmployeeUID.getText();
        String email = CSEmail.getText();
        String subject = CSSubject.getText();
        String message = CSMessage.getText();
        if (sEmployeeUID.equals("") && firstName.equals("") && lastname.equals("") && email.equals("") && subject.equals("") && message.equals("")) {
            InvalidUIDLabel.setText("Please fill this field");
            InvalidNameLabel.setText("Please fill this field");
            InvalidEmailLabel.setText("Please fill this field");
            InvalidSubjectLabel.setText("Please fill this field");
            InvalidMessageLabel.setText("Please fill this field");
        } else if (sEmployeeUID.equals("")) {
            InvalidUIDLabel.setText("Please fill this field");
        } else if (firstName.equals("")) {
            InvalidNameLabel.setText("Please fill this field");
        } else if (lastname.equals("")) {
            InvalidNameLabel.setText("Please fill this field");
        } else if (email.equals("")) {
            InvalidEmailLabel.setText("Please fill this field");
        } else if (subject.equals("")) {
            InvalidSubjectLabel.setText("Please fill this field");
        } else if (message.equals("")) {
            InvalidMessageLabel.setText("Please fill this field");
        } else if (!sEmployeeUID.matches("[0-9]+")) {
            InvalidUIDLabel.setText("Invalid Employee UID");
        } else if (!isValidEmail(email)) {
            InvalidEmailLabel.setText("Invalid email address");
        } else {
            try {
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement smts = connection.prepareStatement("INSERT INTO `inquiry_and_concern_log`(`employee_uid`,`first_name`, `last_name`, `email`, `subject`, `message`, `date`, `time`, `status`) VALUES (?,?,?,?,?,?,?,?,?)");

                smts.setInt(1, Integer.parseInt(sEmployeeUID));
                smts.setString(2, firstName);
                smts.setString(3, lastname);
                smts.setString(4, email);
                smts.setString(5, subject);
                smts.setString(6, message);
                smts.setString(7, getDate());
                smts.setString(8, getTime());
                smts.setString(9, "Not yet done");

                smts.executeUpdate();

                JOptionPane.showMessageDialog(null, "Message sent succesfully! We'll be in touch with you as as soon as possible.", "Contact Support", JOptionPane.INFORMATION_MESSAGE);

                CSEmployeeUID.setText("");
                CSFirstName.setText("");
                CSLastName.setText("");
                CSEmail.setText("");
                CSSubject.setText("");
                CSMessage.setText("");
                CSEmployeeUID.requestFocus();

            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ContactSupportAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }
}
