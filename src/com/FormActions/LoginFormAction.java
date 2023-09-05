package com.FormActions;

import com.Forms.AdminDashboard;
import com.Forms.EmployeeDashboard;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormAction extends javax.swing.JFrame {

    private final String Database = new DatabaseLocation().getDatabaseLocation();
    private final AdminDashboard AdminDashboard = new AdminDashboard();
    private final EmployeeDashboard EmployeeDashboard = new EmployeeDashboard();

    private void changeCard(Component Card, JPanel cardPanel) {
        cardPanel.removeAll();
        cardPanel.add(Card);
        cardPanel.repaint();
        cardPanel.revalidate();
    }

    public void loginAction(JTextField usernameField, JPasswordField passwordField, Component setupAccountPanel, JPanel cardPanel, JFrame loginFrame) {
        String getUsername = usernameField.getText();
        String getPassword = passwordField.getText();
        int employeeUID = 0;
        String username = null;
        String password = null;
        String accountType = null;
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `employee_logins` WHERE `username` = ? AND `password` = ?");
            stmt.setString(1, getUsername);
            stmt.setString(2, getPassword);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                employeeUID = rs.getInt(1);
                username = rs.getString(2);
                password = rs.getString(3);
                accountType = rs.getString(6);
            }

            if (getUsername.equals("") && getPassword.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter Username or Password!", "Login", JOptionPane.ERROR_MESSAGE);
            } else {
                if (getUsername.equals(username) && getPassword.equals(password)) {
                    if (password.equals("welcome123")) {
                        JOptionPane.showMessageDialog(null, "Welcome please setup your account!", "Login", JOptionPane.INFORMATION_MESSAGE);
                        changeCard(setupAccountPanel, cardPanel);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Successfully!", "Login", JOptionPane.INFORMATION_MESSAGE);
                        if (accountType.equals("ADMIN") || accountType.equals("HR") || accountType.equals("ACCOUNTING")) {
                            AdminDashboard.setVisible(true);
                            loginFrame.setVisible(true);
                            loginFrame.setVisible(false);
                            AdminDashboard.setData(getUsername, getPassword, employeeUID);
                        } else if (accountType.equals("REGULAR")) {
                            EmployeeDashboard.setVisible(true);
                            loginFrame.setVisible(true);
                            loginFrame.setVisible(false);
                            EmployeeDashboard.setData(getUsername, getPassword, employeeUID);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password!", "Login", JOptionPane.ERROR_MESSAGE);
                    usernameField.requestFocus();
                }
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoginFormAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void accountSetupAction(JTextField usernameField, JPasswordField passwordField, JComboBox setQuestion, JPasswordField setAnswer, JPasswordField setPassword, JPasswordField setConfirmPassword, Component loginPanel, JPanel cardPanel) {
        String getLoginUsername = usernameField.getText();
        String getLoginPassword = passwordField.getText();
        String getQuestion = setQuestion.getSelectedItem().toString();
        String getAnswer = setAnswer.getText();
        String getPassword = setPassword.getText();
        String getConfirmPassword = setConfirmPassword.getText();

        if (getPassword.length() < 8 && getConfirmPassword.length() < 8) {
            JOptionPane.showMessageDialog(null, "Your password should be atleast 8 characters!", "Account Setup", JOptionPane.ERROR_MESSAGE);
        } else if (getAnswer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your answer for security question!", "Account Setup", JOptionPane.ERROR_MESSAGE);
        } else if (getPassword.equals("welcome123")) {
            JOptionPane.showMessageDialog(null, "Please enter a new password!", "Account Setup", JOptionPane.ERROR_MESSAGE);
        } else if (getPassword.equals(getConfirmPassword)) {
            try {
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement stmt = connection.prepareStatement("UPDATE  `employee_logins` SET `security_question`= ?, `answer`= ?,`password`= ? WHERE `username` = ? AND `password` = ?");
                stmt.setString(1, getQuestion);
                stmt.setString(2, getAnswer);
                stmt.setString(3, getPassword);
                stmt.setString(4, getLoginUsername);
                stmt.setString(5, getLoginPassword);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Account Setup Successfully!", "Account Setup", JOptionPane.INFORMATION_MESSAGE);
                usernameField.setText("");
                passwordField.setText("");
                changeCard(loginPanel, cardPanel);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(LoginFormAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password didn't match!", "Account Setup", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void forgotPasswordAction(JTextField forgotPassUsernameField, JComboBox forgotPassQuestionBox, JPasswordField forgotPassAnswerField, Component forgotPasswordPanel, JPanel cardPanel) {
        String getUsername = forgotPassUsernameField.getText();
        String getSecurityQuestion = forgotPassQuestionBox.getSelectedItem().toString();
        String getAnswer = forgotPassAnswerField.getText();
        String username = null;
        String securityQuestion = null;
        String answer = null;
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `employee_logins` WHERE `username` = ? AND `security_question` = ? AND `answer` = ? ");
            stmt.setString(1, getUsername);
            stmt.setString(2, getSecurityQuestion);
            stmt.setString(3, getAnswer);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                username = rs.getString(2);
                securityQuestion = rs.getString(4);
                answer = rs.getString(5);
            }
            if (getUsername.equals(username) && getSecurityQuestion.equals(securityQuestion) && getAnswer.equals(answer)) {
                JOptionPane.showMessageDialog(null, "Successfully Verified", "Forgot Password", JOptionPane.INFORMATION_MESSAGE);
                changeCard(forgotPasswordPanel, cardPanel);
            } else if (getUsername.equals("") || getSecurityQuestion.equals("") || getAnswer.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill up all fields!", "Forgot Password", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Can't find your account!", "Forgot Password", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoginFormAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void setupNewPasswordAction(JTextField forgotPassUsernameField, JComboBox forgotPassQuestionBox, JPasswordField forgotPassAnswerField, JPasswordField setPassword, JPasswordField setConfirmPassword, Component loginPanel, JPanel cardPanel) {
        String getUsername = forgotPassUsernameField.getText();
        String getSecurityQuestion = forgotPassQuestionBox.getSelectedItem().toString();
        String getAnswer = forgotPassAnswerField.getText();
        String getPassword = setPassword.getText();
        String getConfirmPassword = setConfirmPassword.getText();

        if (getPassword.length() < 8 && getConfirmPassword.length() < 8 || getAnswer.length() < 3) {
            JOptionPane.showMessageDialog(null, "Your password should be atleast 8 characters!", "Setup New Password", JOptionPane.ERROR_MESSAGE);
        } else if (getPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a new password!", "Setup New Password", JOptionPane.ERROR_MESSAGE);
        } else if (getPassword.equals(getConfirmPassword)) {
            try {
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement stmt = connection.prepareStatement("UPDATE  `employee_logins` SET `password`= ? WHERE `username` = ? AND `security_question` = ? AND `answer` = ? ");
                stmt.setString(1, getPassword);
                stmt.setString(2, getUsername);
                stmt.setString(3, getSecurityQuestion);
                stmt.setString(4, getAnswer);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Password successfully changed", "Setup New Password", JOptionPane.INFORMATION_MESSAGE);
                changeCard(loginPanel, cardPanel);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(LoginFormAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password didn't match", "Setup New Password", JOptionPane.ERROR_MESSAGE);
        }
    }
}
