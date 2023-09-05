package com.Forms;

import com.FormActions.DatabaseLocation;
import com.FormActions.ShowCurrentLoggedInUser;
import com.FormActions.LoginFormAction;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LoginForm extends javax.swing.JFrame {

    private String JDBC = new DatabaseLocation().getDatabaseLocation();;
    JFrame loginFrame;
    private int employeeUID;
    private String username;
    private String password;
    private String accType;

 

    void changeCard(Component Card) {
        leftPanel.removeAll();
        leftPanel.add(Card);
        leftPanel.repaint();
        leftPanel.revalidate();
        
    }

    public void getLoginData(JTextField usernameField, JPasswordField passwordField) {
        String getUsername = usernameField.getText();
        String getPassword = passwordField.getText();
        try {
            Connection connection = DriverManager.getConnection(JDBC);
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM `employee_logins` WHERE `username` = ? AND `password` = ?");
            stmt.setString(1, getUsername);
            stmt.setString(2, getPassword);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                this.employeeUID = rs.getInt(1);
                this.username = rs.getString(2);
                this.password = rs.getString(3);
                this.accType = rs.getString(6);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoginFormAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        loginUsernameLabel = new javax.swing.JLabel();
        loginPasswordLabel = new javax.swing.JLabel();
        loginUsernameField = new javax.swing.JTextField();
        loginPasswordField = new javax.swing.JPasswordField();
        loginShowPassword = new javax.swing.JCheckBox();
        loginSignInButton = new javax.swing.JButton();
        forgotPassword = new javax.swing.JLabel();
        forgotPasswordPanel = new javax.swing.JPanel();
        forgotPassLogo = new javax.swing.JLabel();
        resetpasswordlabel = new javax.swing.JLabel();
        forgotPassUsernameLabel = new javax.swing.JLabel();
        forgotPassQuestionLabel = new javax.swing.JLabel();
        forgotPassAnswerLabel = new javax.swing.JLabel();
        forgotPassUsernameField = new javax.swing.JTextField();
        forgotPassQuestionBox = new javax.swing.JComboBox<>();
        forgotPassAnswerField = new javax.swing.JPasswordField();
        forgotPassShowAnswer = new javax.swing.JCheckBox();
        forgotPassResetPasswordButton = new javax.swing.JButton();
        forgotPassReturnLogin = new javax.swing.JLabel();
        changePasswordPanel = new javax.swing.JPanel();
        changePassLogo = new javax.swing.JLabel();
        changePassNewPasswordLabel = new javax.swing.JLabel();
        forgotPassQuestionLabel1 = new javax.swing.JLabel();
        forgotPassAnswerLabel1 = new javax.swing.JLabel();
        changePassPasswordField = new javax.swing.JPasswordField();
        changePassShowPassword = new javax.swing.JCheckBox();
        changePassConfrmPasswordField = new javax.swing.JPasswordField();
        changePassShowConfirmPassword = new javax.swing.JCheckBox();
        changePassPasswordChangeButton = new javax.swing.JButton();
        changePassMaxCharLabel2 = new javax.swing.JLabel();
        changePassMaxCharLabel = new javax.swing.JLabel();
        changePassReturnLogin = new javax.swing.JLabel();
        setupAccoutntPanel = new javax.swing.JPanel();
        changePassLogo1 = new javax.swing.JLabel();
        setupAccSetupAccountLabel = new javax.swing.JLabel();
        setupAccSelectSecurityQuestionLabel = new javax.swing.JLabel();
        setupAccAnswerLabel = new javax.swing.JLabel();
        setupAccNewPasswordLabel = new javax.swing.JLabel();
        setupAccConfirmNewPasswordLabel = new javax.swing.JLabel();
        setupAccQuestionComboBox = new javax.swing.JComboBox<>();
        setupAccAnswerField = new javax.swing.JPasswordField();
        setupAccShowAnswer = new javax.swing.JCheckBox();
        setupAccNewPasswordField = new javax.swing.JPasswordField();
        setupAccShowNewPassword = new javax.swing.JCheckBox();
        setupAccConfirmPasswordField = new javax.swing.JPasswordField();
        setupAccShowConfirmPassword = new javax.swing.JCheckBox();
        setupAccSetupAccountButton = new javax.swing.JButton();
        setupAccMaxCharLabel2 = new javax.swing.JLabel();
        setupAccMaxCharLabel = new javax.swing.JLabel();
        setupAccReturnLogin = new javax.swing.JLabel();
        setupAccMaxCharLabel1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        People = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vidmac Login");
        setName("LoginForm"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(204, 204, 204));
        leftPanel.setPreferredSize(new java.awt.Dimension(530, 800));
        leftPanel.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLogo.setForeground(new java.awt.Color(49, 65, 95));
        loginLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/login-logo.png"))); // NOI18N
        loginPanel.add(loginLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 210, 300, -1));

        loginUsernameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loginUsernameLabel.setForeground(new java.awt.Color(49, 65, 95));
        loginUsernameLabel.setText("Username");
        loginPanel.add(loginUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 300, -1, -1));

        loginPasswordLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loginPasswordLabel.setForeground(new java.awt.Color(49, 65, 95));
        loginPasswordLabel.setText("Password");
        loginPanel.add(loginPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 380, -1, -1));

        loginUsernameField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loginUsernameField.setForeground(new java.awt.Color(49, 65, 95));
        loginUsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginUsernameFieldKeyPressed(evt);
            }
        });
        loginPanel.add(loginUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 320, 300, 40));

        loginPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loginPasswordField.setForeground(new java.awt.Color(49, 65, 95));
        loginPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPasswordFieldKeyPressed(evt);
            }
        });
        loginPanel.add(loginPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 400, 300, 40));

        loginShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        loginShowPassword.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        loginShowPassword.setForeground(new java.awt.Color(49, 65, 95));
        loginShowPassword.setText("Show Password");
        loginShowPassword.setFocusable(false);
        loginShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginShowPasswordActionPerformed(evt);
            }
        });
        loginPanel.add(loginShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 440, -1, -1));

        loginSignInButton.setBackground(new java.awt.Color(55, 126, 249));
        loginSignInButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        loginSignInButton.setForeground(new java.awt.Color(255, 255, 255));
        loginSignInButton.setText("Sign In");
        loginSignInButton.setFocusable(false);
        loginSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSignInButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginSignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 480, 300, 40));

        forgotPassword.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(55, 126, 249));
        forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        forgotPassword.setText("Forgot Password?");
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });
        loginPanel.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, -1));

        leftPanel.add(loginPanel, "card2");

        forgotPasswordPanel.setBackground(new java.awt.Color(255, 255, 255));
        forgotPasswordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotPassLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/login-logo.png"))); // NOI18N
        forgotPasswordPanel.add(forgotPassLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 150, 300, -1));

        resetpasswordlabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        resetpasswordlabel.setForeground(new java.awt.Color(49, 65, 95));
        resetpasswordlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetpasswordlabel.setText("Password Reset");
        resetpasswordlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        forgotPasswordPanel.add(resetpasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 250, 300, -1));

        forgotPassUsernameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        forgotPassUsernameLabel.setForeground(new java.awt.Color(49, 65, 95));
        forgotPassUsernameLabel.setText("Username");
        forgotPasswordPanel.add(forgotPassUsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 300, -1, -1));

        forgotPassQuestionLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        forgotPassQuestionLabel.setForeground(new java.awt.Color(49, 65, 95));
        forgotPassQuestionLabel.setText("Security Question");
        forgotPasswordPanel.add(forgotPassQuestionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 380, -1, -1));

        forgotPassAnswerLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        forgotPassAnswerLabel.setForeground(new java.awt.Color(49, 65, 95));
        forgotPassAnswerLabel.setText("Answer");
        forgotPasswordPanel.add(forgotPassAnswerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 460, -1, -1));

        forgotPassUsernameField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        forgotPassUsernameField.setForeground(new java.awt.Color(49, 65, 95));
        forgotPasswordPanel.add(forgotPassUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 320, 300, 40));

        forgotPassQuestionBox.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        forgotPassQuestionBox.setForeground(new java.awt.Color(49, 65, 95));
        forgotPassQuestionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "What is your mother's maiden name?", "What is the name of your first pet?", "What was your first car?", "What elementary school did you attend?", "What is the name of the town where you were born?" }));
        forgotPasswordPanel.add(forgotPassQuestionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 400, 300, 40));

        forgotPassAnswerField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        forgotPassAnswerField.setForeground(new java.awt.Color(49, 65, 95));
        forgotPasswordPanel.add(forgotPassAnswerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 480, 300, 40));

        forgotPassShowAnswer.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        forgotPassShowAnswer.setForeground(new java.awt.Color(49, 65, 95));
        forgotPassShowAnswer.setText("Show Answer");
        forgotPassShowAnswer.setFocusable(false);
        forgotPassShowAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassShowAnswerActionPerformed(evt);
            }
        });
        forgotPasswordPanel.add(forgotPassShowAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 520, -1, -1));

        forgotPassResetPasswordButton.setBackground(new java.awt.Color(55, 126, 249));
        forgotPassResetPasswordButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        forgotPassResetPasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassResetPasswordButton.setText("Reset Password");
        forgotPassResetPasswordButton.setFocusable(false);
        forgotPassResetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassResetPasswordButtonActionPerformed(evt);
            }
        });
        forgotPasswordPanel.add(forgotPassResetPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 550, 300, 40));

        forgotPassReturnLogin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        forgotPassReturnLogin.setForeground(new java.awt.Color(55, 126, 249));
        forgotPassReturnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPassReturnLogin.setText("Return to Login");
        forgotPassReturnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassReturnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        forgotPassReturnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassReturnLoginMouseClicked(evt);
            }
        });
        forgotPasswordPanel.add(forgotPassReturnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 600, 300, 40));

        leftPanel.add(forgotPasswordPanel, "card3");

        changePasswordPanel.setBackground(new java.awt.Color(255, 255, 255));
        changePasswordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePassLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/login-logo.png"))); // NOI18N
        changePasswordPanel.add(changePassLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 150, 300, -1));

        changePassNewPasswordLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        changePassNewPasswordLabel.setForeground(new java.awt.Color(49, 65, 95));
        changePassNewPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassNewPasswordLabel.setText("Setup New Password");
        changePassNewPasswordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        changePasswordPanel.add(changePassNewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 250, 300, -1));

        forgotPassQuestionLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        forgotPassQuestionLabel1.setForeground(new java.awt.Color(49, 65, 95));
        forgotPassQuestionLabel1.setText("New Password");
        changePasswordPanel.add(forgotPassQuestionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 300, -1, -1));

        forgotPassAnswerLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        forgotPassAnswerLabel1.setForeground(new java.awt.Color(49, 65, 95));
        forgotPassAnswerLabel1.setText("Confirm New Password");
        changePasswordPanel.add(forgotPassAnswerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 380, -1, -1));

        changePassPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        changePassPasswordField.setForeground(new java.awt.Color(49, 65, 95));
        changePasswordPanel.add(changePassPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 320, 300, 40));

        changePassShowPassword.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        changePassShowPassword.setForeground(new java.awt.Color(49, 65, 95));
        changePassShowPassword.setText("Show Password");
        changePassShowPassword.setFocusable(false);
        changePassShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassShowPasswordActionPerformed(evt);
            }
        });
        changePasswordPanel.add(changePassShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        changePassConfrmPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        changePassConfrmPasswordField.setForeground(new java.awt.Color(49, 65, 95));
        changePasswordPanel.add(changePassConfrmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 400, 300, 40));

        changePassShowConfirmPassword.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        changePassShowConfirmPassword.setForeground(new java.awt.Color(49, 65, 95));
        changePassShowConfirmPassword.setText("Show Password");
        changePassShowConfirmPassword.setFocusable(false);
        changePassShowConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassShowConfirmPasswordActionPerformed(evt);
            }
        });
        changePasswordPanel.add(changePassShowConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        changePassPasswordChangeButton.setBackground(new java.awt.Color(55, 126, 249));
        changePassPasswordChangeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        changePassPasswordChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        changePassPasswordChangeButton.setText("Change Password");
        changePassPasswordChangeButton.setFocusable(false);
        changePassPasswordChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassPasswordChangeButtonActionPerformed(evt);
            }
        });
        changePasswordPanel.add(changePassPasswordChangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 470, 300, 40));

        changePassMaxCharLabel2.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        changePassMaxCharLabel2.setForeground(new java.awt.Color(153, 153, 153));
        changePassMaxCharLabel2.setText("Password must be atleast 8 characters");
        changePasswordPanel.add(changePassMaxCharLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 440, -1, -1));

        changePassMaxCharLabel.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        changePassMaxCharLabel.setForeground(new java.awt.Color(153, 153, 153));
        changePassMaxCharLabel.setText("Password must be atleast 8 characters");
        changePasswordPanel.add(changePassMaxCharLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 360, -1, -1));

        changePassReturnLogin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        changePassReturnLogin.setForeground(new java.awt.Color(55, 126, 249));
        changePassReturnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassReturnLogin.setText("Return to Login");
        changePassReturnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePassReturnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        changePassReturnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassReturnLoginMouseClicked(evt);
            }
        });
        changePasswordPanel.add(changePassReturnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 520, 300, 40));

        leftPanel.add(changePasswordPanel, "card4");

        setupAccoutntPanel.setBackground(new java.awt.Color(255, 255, 255));
        setupAccoutntPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePassLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changePassLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/login-logo.png"))); // NOI18N
        setupAccoutntPanel.add(changePassLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 150, 300, -1));

        setupAccSetupAccountLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        setupAccSetupAccountLabel.setForeground(new java.awt.Color(49, 65, 95));
        setupAccSetupAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setupAccSetupAccountLabel.setText("Account Setup");
        setupAccSetupAccountLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setupAccoutntPanel.add(setupAccSetupAccountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 250, 300, -1));

        setupAccSelectSecurityQuestionLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setupAccSelectSecurityQuestionLabel.setForeground(new java.awt.Color(49, 65, 95));
        setupAccSelectSecurityQuestionLabel.setText("Select Security Question");
        setupAccoutntPanel.add(setupAccSelectSecurityQuestionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 300, -1, -1));

        setupAccAnswerLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setupAccAnswerLabel.setForeground(new java.awt.Color(49, 65, 95));
        setupAccAnswerLabel.setText("Answer");
        setupAccoutntPanel.add(setupAccAnswerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 380, -1, -1));

        setupAccNewPasswordLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setupAccNewPasswordLabel.setForeground(new java.awt.Color(49, 65, 95));
        setupAccNewPasswordLabel.setText("New Password");
        setupAccoutntPanel.add(setupAccNewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 460, -1, -1));

        setupAccConfirmNewPasswordLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setupAccConfirmNewPasswordLabel.setForeground(new java.awt.Color(49, 65, 95));
        setupAccConfirmNewPasswordLabel.setText("Confirm New Password");
        setupAccoutntPanel.add(setupAccConfirmNewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 540, -1, -1));

        setupAccQuestionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "What is your mother's maiden name?", "What is the name of your first pet?", "What was your first car?", "What elementary school did you attend?", "What is the name of the town where you were born?" }));
        setupAccoutntPanel.add(setupAccQuestionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 320, 300, 40));

        setupAccAnswerField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setupAccAnswerField.setForeground(new java.awt.Color(49, 65, 95));
        setupAccoutntPanel.add(setupAccAnswerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 400, 300, 40));

        setupAccShowAnswer.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setupAccShowAnswer.setForeground(new java.awt.Color(49, 65, 95));
        setupAccShowAnswer.setText("Show Answer");
        setupAccShowAnswer.setFocusable(false);
        setupAccShowAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupAccShowAnswerActionPerformed(evt);
            }
        });
        setupAccoutntPanel.add(setupAccShowAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        setupAccNewPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setupAccNewPasswordField.setForeground(new java.awt.Color(49, 65, 95));
        setupAccoutntPanel.add(setupAccNewPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 480, 300, 40));

        setupAccShowNewPassword.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setupAccShowNewPassword.setForeground(new java.awt.Color(49, 65, 95));
        setupAccShowNewPassword.setText("Show Password");
        setupAccShowNewPassword.setFocusable(false);
        setupAccShowNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupAccShowNewPasswordActionPerformed(evt);
            }
        });
        setupAccoutntPanel.add(setupAccShowNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        setupAccConfirmPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setupAccConfirmPasswordField.setForeground(new java.awt.Color(49, 65, 95));
        setupAccoutntPanel.add(setupAccConfirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 560, 300, 40));

        setupAccShowConfirmPassword.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setupAccShowConfirmPassword.setForeground(new java.awt.Color(49, 65, 95));
        setupAccShowConfirmPassword.setText("Show Password");
        setupAccShowConfirmPassword.setFocusable(false);
        setupAccShowConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupAccShowConfirmPasswordActionPerformed(evt);
            }
        });
        setupAccoutntPanel.add(setupAccShowConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));

        setupAccSetupAccountButton.setBackground(new java.awt.Color(55, 126, 249));
        setupAccSetupAccountButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        setupAccSetupAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        setupAccSetupAccountButton.setText("Setup Account");
        setupAccSetupAccountButton.setFocusable(false);
        setupAccSetupAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupAccSetupAccountButtonActionPerformed(evt);
            }
        });
        setupAccoutntPanel.add(setupAccSetupAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 630, 300, 40));

        setupAccMaxCharLabel2.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setupAccMaxCharLabel2.setForeground(new java.awt.Color(153, 153, 153));
        setupAccMaxCharLabel2.setText("Password must be atleast 8 characters");
        setupAccoutntPanel.add(setupAccMaxCharLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 600, -1, -1));

        setupAccMaxCharLabel.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setupAccMaxCharLabel.setForeground(new java.awt.Color(153, 153, 153));
        setupAccMaxCharLabel.setText("Answer must be atleast 3 characters");
        setupAccoutntPanel.add(setupAccMaxCharLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 440, -1, -1));

        setupAccReturnLogin.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        setupAccReturnLogin.setForeground(new java.awt.Color(55, 126, 249));
        setupAccReturnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setupAccReturnLogin.setText("Return to Login");
        setupAccReturnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setupAccReturnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        setupAccReturnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setupAccReturnLoginMouseClicked(evt);
            }
        });
        setupAccoutntPanel.add(setupAccReturnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 680, 300, 40));

        setupAccMaxCharLabel1.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setupAccMaxCharLabel1.setForeground(new java.awt.Color(153, 153, 153));
        setupAccMaxCharLabel1.setText("Password must be atleast 8 characters");
        setupAccoutntPanel.add(setupAccMaxCharLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 520, -1, -1));

        leftPanel.add(setupAccoutntPanel, "card5");

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rightPanel.setBackground(new java.awt.Color(55, 126, 249));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        People.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        People.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mario Inguito\\Downloads\\avt-netsuite-stairway-for-financials-first-2.png")); // NOI18N
        rightPanel.add(People, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 750, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/rightPanelBackground.jpg"))); // NOI18N
        rightPanel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 800));

        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 750, 800));

        getAccessibleContext().setAccessibleName("LoginFrame");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        changeCard(forgotPasswordPanel);
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void forgotPassResetPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassResetPasswordButtonActionPerformed
        LoginFormAction login = new LoginFormAction();
        login.forgotPasswordAction(forgotPassUsernameField, forgotPassQuestionBox, forgotPassAnswerField, changePasswordPanel, leftPanel);
    }//GEN-LAST:event_forgotPassResetPasswordButtonActionPerformed

    private void loginSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSignInButtonActionPerformed
        LoginFormAction login = new LoginFormAction();
        login.loginAction(loginUsernameField, loginPasswordField, setupAccoutntPanel, leftPanel, this);
    }//GEN-LAST:event_loginSignInButtonActionPerformed

    private void setupAccSetupAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupAccSetupAccountButtonActionPerformed
        LoginFormAction login = new LoginFormAction();
        login.accountSetupAction(loginUsernameField, loginPasswordField, setupAccQuestionComboBox, setupAccAnswerField, setupAccNewPasswordField, setupAccConfirmPasswordField, loginPanel, leftPanel);
        loginUsernameField.setText("");
        loginPasswordField.setText("");
        setupAccQuestionComboBox.setSelectedIndex(0);
        setupAccAnswerField.setText("");
        setupAccNewPasswordField.setText("");
        setupAccConfirmPasswordField.setText("");
    }//GEN-LAST:event_setupAccSetupAccountButtonActionPerformed

    private void changePassPasswordChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassPasswordChangeButtonActionPerformed
        LoginFormAction login = new LoginFormAction();
        login.setupNewPasswordAction(forgotPassUsernameField, forgotPassQuestionBox, forgotPassAnswerField, changePassPasswordField, changePassConfrmPasswordField, loginPanel, leftPanel);
        changePassPasswordField.setText("");
        changePassConfrmPasswordField.setText("");
        forgotPassUsernameField.setText("");
        forgotPassQuestionBox.setSelectedIndex(0);
        forgotPassAnswerField.setText("");

    }//GEN-LAST:event_changePassPasswordChangeButtonActionPerformed

    private void loginUsernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUsernameFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoginFormAction login = new LoginFormAction();
            login.loginAction(loginUsernameField, loginPasswordField, setupAccoutntPanel, leftPanel, this);
        }
    }//GEN-LAST:event_loginUsernameFieldKeyPressed

    private void loginPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoginFormAction login = new LoginFormAction();
            login.loginAction(loginUsernameField, loginPasswordField, setupAccoutntPanel, leftPanel, this);
        }
    }//GEN-LAST:event_loginPasswordFieldKeyPressed

    private void loginShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginShowPasswordActionPerformed
        if (loginShowPassword.isSelected()) {
            loginPasswordField.setEchoChar((char) 0);
        } else {
            loginPasswordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_loginShowPasswordActionPerformed

    private void setupAccShowAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupAccShowAnswerActionPerformed
        if (setupAccShowAnswer.isSelected()) {
            setupAccAnswerField.setEchoChar((char) 0);
        } else {
            setupAccAnswerField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_setupAccShowAnswerActionPerformed

    private void setupAccShowNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupAccShowNewPasswordActionPerformed
        if (setupAccShowNewPassword.isSelected()) {
            setupAccNewPasswordField.setEchoChar((char) 0);
        } else {
            setupAccNewPasswordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_setupAccShowNewPasswordActionPerformed

    private void setupAccShowConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupAccShowConfirmPasswordActionPerformed
        if (setupAccShowConfirmPassword.isSelected()) {
            setupAccConfirmPasswordField.setEchoChar((char) 0);
        } else {
            setupAccConfirmPasswordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_setupAccShowConfirmPasswordActionPerformed

    private void forgotPassShowAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassShowAnswerActionPerformed
        if (forgotPassShowAnswer.isSelected()) {
            forgotPassAnswerField.setEchoChar((char) 0);
        } else {
            forgotPassAnswerField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_forgotPassShowAnswerActionPerformed

    private void changePassShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassShowPasswordActionPerformed
        if (changePassShowPassword.isSelected()) {
            changePassPasswordField.setEchoChar((char) 0);
        } else {
            changePassPasswordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_changePassShowPasswordActionPerformed

    private void changePassShowConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassShowConfirmPasswordActionPerformed
        if (changePassShowConfirmPassword.isSelected()) {
            changePassConfrmPasswordField.setEchoChar((char) 0);
        } else {
            changePassConfrmPasswordField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_changePassShowConfirmPasswordActionPerformed

    private void forgotPassReturnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassReturnLoginMouseClicked
        changeCard(loginPanel);
        loginUsernameField.setText("");
        loginPasswordField.setText("");
        setupAccQuestionComboBox.setSelectedIndex(0);
        setupAccAnswerField.setText("");
        setupAccNewPasswordField.setText("");
        setupAccConfirmPasswordField.setText("");
        forgotPassUsernameField.setText("");
        forgotPassQuestionBox.setSelectedIndex(0);
        forgotPassAnswerField.setText("");
        changePassPasswordField.setText("");
        changePassConfrmPasswordField.setText("");
        loginUsernameField.requestFocus();
    }//GEN-LAST:event_forgotPassReturnLoginMouseClicked

    private void changePassReturnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassReturnLoginMouseClicked
        changeCard(loginPanel);
        loginUsernameField.setText("");
        loginPasswordField.setText("");
        setupAccQuestionComboBox.setSelectedIndex(0);
        setupAccAnswerField.setText("");
        setupAccNewPasswordField.setText("");
        setupAccConfirmPasswordField.setText("");
        forgotPassUsernameField.setText("");
        forgotPassQuestionBox.setSelectedIndex(0);
        forgotPassAnswerField.setText("");
        changePassPasswordField.setText("");
        changePassConfrmPasswordField.setText("");
        loginUsernameField.requestFocus();
    }//GEN-LAST:event_changePassReturnLoginMouseClicked

    private void setupAccReturnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setupAccReturnLoginMouseClicked
        changeCard(loginPanel);
        loginUsernameField.setText("");
        loginPasswordField.setText("");
        setupAccQuestionComboBox.setSelectedIndex(0);
        setupAccAnswerField.setText("");
        setupAccNewPasswordField.setText("");
        setupAccConfirmPasswordField.setText("");
        forgotPassUsernameField.setText("");
        forgotPassQuestionBox.setSelectedIndex(0);
        forgotPassAnswerField.setText("");
        changePassPasswordField.setText("");
        changePassConfrmPasswordField.setText("");
        loginUsernameField.requestFocus();
    }//GEN-LAST:event_setupAccReturnLoginMouseClicked

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel People;
    private javax.swing.JPasswordField changePassConfrmPasswordField;
    private javax.swing.JLabel changePassLogo;
    private javax.swing.JLabel changePassLogo1;
    private javax.swing.JLabel changePassMaxCharLabel;
    private javax.swing.JLabel changePassMaxCharLabel2;
    private javax.swing.JLabel changePassNewPasswordLabel;
    private javax.swing.JButton changePassPasswordChangeButton;
    private javax.swing.JPasswordField changePassPasswordField;
    private javax.swing.JLabel changePassReturnLogin;
    private javax.swing.JCheckBox changePassShowConfirmPassword;
    private javax.swing.JCheckBox changePassShowPassword;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JPasswordField forgotPassAnswerField;
    private javax.swing.JLabel forgotPassAnswerLabel;
    private javax.swing.JLabel forgotPassAnswerLabel1;
    private javax.swing.JLabel forgotPassLogo;
    private javax.swing.JComboBox<String> forgotPassQuestionBox;
    private javax.swing.JLabel forgotPassQuestionLabel;
    private javax.swing.JLabel forgotPassQuestionLabel1;
    private javax.swing.JButton forgotPassResetPasswordButton;
    private javax.swing.JLabel forgotPassReturnLogin;
    private javax.swing.JCheckBox forgotPassShowAnswer;
    private javax.swing.JTextField forgotPassUsernameField;
    private javax.swing.JLabel forgotPassUsernameLabel;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JPanel forgotPasswordPanel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JCheckBox loginShowPassword;
    private javax.swing.JButton loginSignInButton;
    private javax.swing.JTextField loginUsernameField;
    private javax.swing.JLabel loginUsernameLabel;
    private javax.swing.JLabel resetpasswordlabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPasswordField setupAccAnswerField;
    private javax.swing.JLabel setupAccAnswerLabel;
    private javax.swing.JLabel setupAccConfirmNewPasswordLabel;
    private javax.swing.JPasswordField setupAccConfirmPasswordField;
    private javax.swing.JLabel setupAccMaxCharLabel;
    private javax.swing.JLabel setupAccMaxCharLabel1;
    private javax.swing.JLabel setupAccMaxCharLabel2;
    private javax.swing.JPasswordField setupAccNewPasswordField;
    private javax.swing.JLabel setupAccNewPasswordLabel;
    private javax.swing.JComboBox<String> setupAccQuestionComboBox;
    private javax.swing.JLabel setupAccReturnLogin;
    private javax.swing.JLabel setupAccSelectSecurityQuestionLabel;
    private javax.swing.JButton setupAccSetupAccountButton;
    private javax.swing.JLabel setupAccSetupAccountLabel;
    private javax.swing.JCheckBox setupAccShowAnswer;
    private javax.swing.JCheckBox setupAccShowConfirmPassword;
    private javax.swing.JCheckBox setupAccShowNewPassword;
    private javax.swing.JPanel setupAccoutntPanel;
    // End of variables declaration//GEN-END:variables
}
