/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Forms;

import com.FormActions.ContactSupportAction;
import com.FormActions.ShowCurrentLoggedInUser;
import com.FormActions.DailyTimeRecordAction;
import com.FormActions.DatabaseLocation;
import com.FormActions.DisplayTimeLogAction;
import com.FormActions.InquiryAndConcernLogActions;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class EmployeeDashboard extends javax.swing.JFrame implements Runnable {

    public EmployeeDashboard() {
        initComponents();
        Thread thread = new Thread(this);
        thread.start();
        topLogo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilePopupMenu = new javax.swing.JPopupMenu();
        PMProfile = new javax.swing.JMenuItem();
        PMTimeLog = new javax.swing.JMenuItem();
        PMPayslip = new javax.swing.JMenuItem();
        PMLogout = new javax.swing.JMenuItem();
        topPanel = new javax.swing.JPanel();
        topLoggedFullName = new javax.swing.JLabel();
        TimeLogButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        topTimeUpdateLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        timeLogButton = new javax.swing.JButton();
        payslipsButton = new javax.swing.JButton();
        supportButton = new javax.swing.JButton();
        topLogo = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        homeWelcomeUserLabel = new javax.swing.JLabel();
        homeProfilePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        homeTimeLogPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        homePayslipPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        homeBckg = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        profileTopPanel = new javax.swing.JPanel();
        profileTitleLabel = new javax.swing.JLabel();
        profileTopBackground = new javax.swing.JLabel();
        profileMainPanel = new javax.swing.JPanel();
        profileFYILabel = new javax.swing.JLabel();
        profilePersonalInformationPanel = new javax.swing.JPanel();
        PPIMaritalStatusLabel = new javax.swing.JLabel();
        PPINameLabel = new javax.swing.JLabel();
        PPIGenderLabel = new javax.swing.JLabel();
        PPIBirthdateLabel = new javax.swing.JLabel();
        PPIAddressLabel = new javax.swing.JLabel();
        PPIMaritalStatus = new javax.swing.JLabel();
        PPIName = new javax.swing.JLabel();
        PPIGender = new javax.swing.JLabel();
        PPIBirthdate = new javax.swing.JLabel();
        PPIAddress = new javax.swing.JLabel();
        PPIMobileNumberLabel = new javax.swing.JLabel();
        PPIMobileNumber = new javax.swing.JLabel();
        profileCompensationDetailsPanel = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        PCDBasicPay = new javax.swing.JLabel();
        profileEmegencyContactPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        PEmerContactPerson = new javax.swing.JLabel();
        PEmerRelationship = new javax.swing.JLabel();
        PEmerContactNumber = new javax.swing.JLabel();
        PEmerAddress = new javax.swing.JLabel();
        profileContactInformationPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        PCIDateStarted = new javax.swing.JLabel();
        PCIEmployeeUID = new javax.swing.JLabel();
        PCIEmail = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        PCIPosition = new javax.swing.JLabel();
        PCIStatus = new javax.swing.JLabel();
        PCIAccountType = new javax.swing.JLabel();
        profileGovIDInformationPanel = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        PGIDHDMF = new javax.swing.JLabel();
        PGIDPHIC = new javax.swing.JLabel();
        PGIDTIN = new javax.swing.JLabel();
        PGIDSSS = new javax.swing.JLabel();
        timeLogPanel = new javax.swing.JPanel();
        timeLogSubTopPanel = new javax.swing.JPanel();
        TLTitleLabel = new javax.swing.JLabel();
        TLTopBackground = new javax.swing.JLabel();
        TLFYI = new javax.swing.JLabel();
        TLMidPanel = new javax.swing.JPanel();
        TLSearchLabel = new javax.swing.JLabel();
        TLSearchField = new javax.swing.JTextField();
        TLSearchButton = new javax.swing.JButton();
        TLTimeLogsDetailPanel = new javax.swing.JPanel();
        TLTimeLogDateLabel = new javax.swing.JLabel();
        TLTimeLogTimeInLabel = new javax.swing.JLabel();
        TLTimeLogTimeOutLabel = new javax.swing.JLabel();
        TLTimeLogDate = new javax.swing.JLabel();
        TLTimeLogTimeIn = new javax.swing.JLabel();
        TLTimeLogRenderedHoursLabel = new javax.swing.JLabel();
        TLTimeLogTimeOut = new javax.swing.JLabel();
        TLTimeLogRenderedHours = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TLTable = new javax.swing.JTable();
        payslipPanel = new javax.swing.JPanel();
        payslipTopPanel = new javax.swing.JPanel();
        payslipTitlePanel = new javax.swing.JLabel();
        TopPayslipBackground = new javax.swing.JLabel();
        payslipMidPanel = new javax.swing.JPanel();
        payslipPayPeriodLabel = new javax.swing.JLabel();
        payslipPayPeriodList = new javax.swing.JComboBox<>();
        payslipPayPeriodButton = new javax.swing.JButton();
        payslipFYILabel = new javax.swing.JLabel();
        PPrintPaySlip = new javax.swing.JButton();
        PayslipForm = new javax.swing.JPanel();
        payslipPayslipSummaryPanel = new javax.swing.JPanel();
        PPSNetIncomeLabel = new javax.swing.JLabel();
        PPSNameLabel = new javax.swing.JLabel();
        PPSEmployeeUIDLabel = new javax.swing.JLabel();
        PPSPeriodLabel = new javax.swing.JLabel();
        PPSHoursWorkedLabel = new javax.swing.JLabel();
        PPSNetIncome = new javax.swing.JLabel();
        PPSName = new javax.swing.JLabel();
        PPSEmployeeUID = new javax.swing.JLabel();
        PPSHourlyGrossRateLabel = new javax.swing.JLabel();
        PPSDailyGrossIncomeLabel = new javax.swing.JLabel();
        PPSPeriod = new javax.swing.JLabel();
        PPSHoursWorked = new javax.swing.JLabel();
        PPSHourlyGrossRate = new javax.swing.JLabel();
        PPSDailyGrossIncome = new javax.swing.JLabel();
        PPSDailyGrossRateLabel1 = new javax.swing.JLabel();
        PPSDailyGrossRate = new javax.swing.JLabel();
        PPSDaysWorkedLabel = new javax.swing.JLabel();
        PPSDaysWorked = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        payslipDeductionPanel = new javax.swing.JPanel();
        PDTaxLabel = new javax.swing.JLabel();
        PDPhilhealthLabel = new javax.swing.JLabel();
        PDPagibig = new javax.swing.JLabel();
        PDTax = new javax.swing.JLabel();
        PDPagibigLabel = new javax.swing.JLabel();
        PDPhilhealth = new javax.swing.JLabel();
        PDSSSLabel = new javax.swing.JLabel();
        PDTotalDeductionLabel = new javax.swing.JLabel();
        PDSSS = new javax.swing.JLabel();
        PDOtherLoanLabel = new javax.swing.JLabel();
        PDOtherLoan = new javax.swing.JLabel();
        PDPagibigLoanLabel = new javax.swing.JLabel();
        PDSSSLoanLabel = new javax.swing.JLabel();
        PDPagibigLoan = new javax.swing.JLabel();
        PDSSSLoan = new javax.swing.JLabel();
        PDSSSLabel2 = new javax.swing.JLabel();
        PDTotalDeduction = new javax.swing.JLabel();
        supportPanel = new javax.swing.JPanel();
        supportSubTopPanel = new javax.swing.JPanel();
        welcomeUserLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SupportTopBackground = new javax.swing.JLabel();
        CSEmployeeUIDLabel = new javax.swing.JLabel();
        CSEmployeeUID = new javax.swing.JTextField();
        CSNameLabel = new javax.swing.JLabel();
        CSFirstName = new javax.swing.JTextField();
        CSFirstNameLabel = new javax.swing.JLabel();
        CSLastName = new javax.swing.JTextField();
        CSLastNameLabel = new javax.swing.JLabel();
        CSEmailLabel = new javax.swing.JLabel();
        CSEmail = new javax.swing.JTextField();
        CSSubjectLabel = new javax.swing.JLabel();
        CSSubject = new javax.swing.JTextField();
        CSMessageLabel = new javax.swing.JLabel();
        CSMessageScroll = new javax.swing.JScrollPane();
        CSMessage = new javax.swing.JTextArea();
        contactSupportSendButton = new javax.swing.JButton();
        InvalidUIDLabel = new javax.swing.JLabel();
        InvalidNameLabel = new javax.swing.JLabel();
        InvalidEmailLabel = new javax.swing.JLabel();
        InvalidSubjectLabel = new javax.swing.JLabel();
        InvalidMessageLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        profilePopupMenu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        profilePopupMenu.setBorderPainted(false);

        PMProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PMProfile.setForeground(new java.awt.Color(49, 65, 95));
        PMProfile.setText("Profile                                      ");
        PMProfile.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PMProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PMProfile.setPreferredSize(new java.awt.Dimension(230, 40));
        PMProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMProfileActionPerformed(evt);
            }
        });
        profilePopupMenu.add(PMProfile);

        PMTimeLog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PMTimeLog.setForeground(new java.awt.Color(49, 65, 95));
        PMTimeLog.setText("Time Log");
        PMTimeLog.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PMTimeLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PMTimeLog.setPreferredSize(new java.awt.Dimension(230, 40));
        PMTimeLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMTimeLogActionPerformed(evt);
            }
        });
        profilePopupMenu.add(PMTimeLog);

        PMPayslip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PMPayslip.setForeground(new java.awt.Color(49, 65, 95));
        PMPayslip.setText("Payslip");
        PMPayslip.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PMPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PMPayslip.setPreferredSize(new java.awt.Dimension(230, 40));
        PMPayslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMPayslipActionPerformed(evt);
            }
        });
        profilePopupMenu.add(PMPayslip);

        PMLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PMLogout.setForeground(new java.awt.Color(49, 65, 95));
        PMLogout.setText("Logout");
        PMLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PMLogout.setBorderPainted(false);
        PMLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PMLogout.setPreferredSize(new java.awt.Dimension(230, 40));
        PMLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMLogoutActionPerformed(evt);
            }
        });
        profilePopupMenu.add(PMLogout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Dashboard");
        setName("EmployeeDashboard"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topLoggedFullName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        topLoggedFullName.setForeground(new java.awt.Color(49, 65, 95));
        topLoggedFullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        topLoggedFullName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/user-top-head.png"))); // NOI18N
        topLoggedFullName.setToolTipText("Click to direct to your Profile");
        topLoggedFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topLoggedFullName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        topLoggedFullName.setIconTextGap(10);
        topLoggedFullName.setVerifyInputWhenFocusTarget(false);
        topLoggedFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topLoggedFullNameMouseClicked(evt);
            }
        });
        topPanel.add(topLoggedFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 270, 30));

        TimeLogButton.setBackground(new java.awt.Color(10, 189, 158));
        TimeLogButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TimeLogButton.setForeground(new java.awt.Color(255, 255, 255));
        TimeLogButton.setText("Time In");
        TimeLogButton.setBorder(null);
        TimeLogButton.setFocusable(false);
        TimeLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeLogButtonActionPerformed(evt);
            }
        });
        topPanel.add(TimeLogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        topPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 10, 30));

        topTimeUpdateLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        topTimeUpdateLabel.setForeground(new java.awt.Color(49, 65, 95));
        topTimeUpdateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topTimeUpdateLabel.setText("EEE, d MMM yyyy | hh:mm:ss aa");
        topTimeUpdateLabel.setToolTipText(time);
        topPanel.add(topTimeUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 30));

        getContentPane().add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1020, 50));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setForeground(new java.awt.Color(49, 65, 95));
        leftPanel.setPreferredSize(new java.awt.Dimension(280, 800));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        homeButton.setForeground(new java.awt.Color(49, 65, 95));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/home-default.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorder(null);
        homeButton.setFocusable(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.setIconTextGap(15);
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        leftPanel.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 40));

        profileButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        profileButton.setForeground(new java.awt.Color(49, 65, 95));
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/profile-default.png"))); // NOI18N
        profileButton.setText("Profile");
        profileButton.setBorder(null);
        profileButton.setFocusable(false);
        profileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profileButton.setIconTextGap(15);
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileButtonMouseExited(evt);
            }
        });
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        leftPanel.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 260, 40));

        timeLogButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        timeLogButton.setForeground(new java.awt.Color(49, 65, 95));
        timeLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/time-log-default.png"))); // NOI18N
        timeLogButton.setText("Time Log");
        timeLogButton.setBorder(null);
        timeLogButton.setFocusable(false);
        timeLogButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeLogButton.setIconTextGap(15);
        timeLogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeLogButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeLogButtonMouseExited(evt);
            }
        });
        timeLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeLogButtonActionPerformed(evt);
            }
        });
        leftPanel.add(timeLogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 40));

        payslipsButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        payslipsButton.setForeground(new java.awt.Color(49, 65, 95));
        payslipsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/payslip-default.png"))); // NOI18N
        payslipsButton.setText("Payslips");
        payslipsButton.setBorder(null);
        payslipsButton.setFocusable(false);
        payslipsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        payslipsButton.setIconTextGap(15);
        payslipsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                payslipsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payslipsButtonMouseExited(evt);
            }
        });
        payslipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payslipsButtonActionPerformed(evt);
            }
        });
        leftPanel.add(payslipsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 40));

        supportButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        supportButton.setForeground(new java.awt.Color(49, 65, 95));
        supportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/support-default.png"))); // NOI18N
        supportButton.setText("Contact Support");
        supportButton.setBorder(null);
        supportButton.setFocusable(false);
        supportButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supportButton.setIconTextGap(15);
        supportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supportButtonMouseExited(evt);
            }
        });
        supportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supportButtonActionPerformed(evt);
            }
        });
        leftPanel.add(supportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 40));

        topLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/dashboard-logo.png"))); // NOI18N
        topLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topLogo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        topLogo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                topLogoFocusGained(evt);
            }
        });
        topLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topLogoMouseClicked(evt);
            }
        });
        leftPanel.add(topLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 50));

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 800));
        leftPanel.getAccessibleContext().setAccessibleName("");

        rightPanel.setLayout(new java.awt.CardLayout());

        homePanel.setForeground(new java.awt.Color(102, 102, 102));
        homePanel.setToolTipText("");
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeWelcomeUserLabel.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        homeWelcomeUserLabel.setForeground(new java.awt.Color(49, 65, 95));
        homeWelcomeUserLabel.setText("Welcome User!");
        homeWelcomeUserLabel.setToolTipText("");
        homePanel.add(homeWelcomeUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 950, 160));

        homeProfilePanel.setBackground(new java.awt.Color(56, 127, 249));
        homeProfilePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 127, 249), 2, true));
        homeProfilePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeProfilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeProfilePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeProfilePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeProfilePanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeProfilePanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeProfilePanelMouseReleased(evt);
            }
        });
        homeProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("       Profile");
        jLabel5.setIconTextGap(10);
        homeProfilePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 340, 110));

        homePanel.add(homeProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 340, 200));

        homeTimeLogPanel.setBackground(new java.awt.Color(56, 127, 249));
        homeTimeLogPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 127, 249), 2, true));
        homeTimeLogPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeTimeLogPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTimeLogPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeTimeLogPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeTimeLogPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeTimeLogPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homeTimeLogPanelMouseReleased(evt);
            }
        });
        homeTimeLogPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("       Time Log");
        jLabel6.setIconTextGap(10);
        homeTimeLogPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 340, 110));

        homePanel.add(homeTimeLogPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 340, 200));

        homePayslipPanel.setBackground(new java.awt.Color(56, 127, 249));
        homePayslipPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 127, 249), 2, true));
        homePayslipPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homePayslipPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePayslipPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePayslipPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePayslipPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homePayslipPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                homePayslipPanelMouseReleased(evt);
            }
        });
        homePayslipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("       Payslips");
        jLabel8.setIconTextGap(10);
        homePayslipPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 340, 110));

        homePanel.add(homePayslipPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 340, 200));

        homeBckg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        homePanel.add(homeBckg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 750));

        rightPanel.add(homePanel, "card2");

        profilePanel.setBackground(new java.awt.Color(235, 237, 241));
        profilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        profileTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileTitleLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        profileTitleLabel.setForeground(new java.awt.Color(49, 65, 95));
        profileTitleLabel.setText("Profile");
        profileTopPanel.add(profileTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        profileTopBackground.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        profileTopBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        profileTopBackground.setToolTipText("");
        profileTopBackground.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        profileTopPanel.add(profileTopBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        profilePanel.add(profileTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        profileMainPanel.setBackground(new java.awt.Color(245, 246, 248));
        profileMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileFYILabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        profileFYILabel.setForeground(new java.awt.Color(143, 156, 181));
        profileFYILabel.setText("<html><body><p align='justify'>For updating personal information. Please go to Contact Support section and fill out the form and we'll be in touch as as soon as possible or you can go to the Human Resources Office during office hours.</p></body></html>");
        profileMainPanel.add(profileFYILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 440, 70));

        profilePersonalInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        profilePersonalInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        profilePersonalInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PPIMaritalStatusLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPIMaritalStatusLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPIMaritalStatusLabel.setText("Martial Status:");
        profilePersonalInformationPanel.add(PPIMaritalStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        PPINameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPINameLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPINameLabel.setText("Name: ");
        profilePersonalInformationPanel.add(PPINameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        PPIGenderLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPIGenderLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPIGenderLabel.setText("Gender:");
        profilePersonalInformationPanel.add(PPIGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        PPIBirthdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPIBirthdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPIBirthdateLabel.setText("Birthdate:");
        profilePersonalInformationPanel.add(PPIBirthdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        PPIAddressLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPIAddressLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPIAddressLabel.setText("Address:");
        profilePersonalInformationPanel.add(PPIAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        PPIMaritalStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPIMaritalStatus.setForeground(new java.awt.Color(49, 65, 95));
        profilePersonalInformationPanel.add(PPIMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 280, 30));

        PPIName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPIName.setForeground(new java.awt.Color(49, 65, 95));
        profilePersonalInformationPanel.add(PPIName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        PPIGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPIGender.setForeground(new java.awt.Color(49, 65, 95));
        profilePersonalInformationPanel.add(PPIGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 280, 30));

        PPIBirthdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPIBirthdate.setForeground(new java.awt.Color(49, 65, 95));
        profilePersonalInformationPanel.add(PPIBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 280, 30));

        PPIAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPIAddress.setForeground(new java.awt.Color(49, 65, 95));
        PPIAddress.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        profilePersonalInformationPanel.add(PPIAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 118, 280, 50));

        PPIMobileNumberLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPIMobileNumberLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPIMobileNumberLabel.setText("Mobile Number:");
        profilePersonalInformationPanel.add(PPIMobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        PPIMobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPIMobileNumber.setForeground(new java.awt.Color(49, 65, 95));
        profilePersonalInformationPanel.add(PPIMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 280, 30));

        profileMainPanel.add(profilePersonalInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 250));

        profileCompensationDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        profileCompensationDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Compensation Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        profileCompensationDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(143, 156, 181));
        jLabel63.setText("Basic Pay");
        profileCompensationDetailsPanel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        PCDBasicPay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCDBasicPay.setForeground(new java.awt.Color(49, 65, 95));
        profileCompensationDetailsPanel.add(PCDBasicPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        profileMainPanel.add(profileCompensationDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 460, 60));

        profileEmegencyContactPanel.setBackground(new java.awt.Color(255, 255, 255));
        profileEmegencyContactPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " In Case Of Emergency", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        profileEmegencyContactPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(143, 156, 181));
        jLabel34.setText("Contact Person:");
        profileEmegencyContactPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        jLabel35.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(143, 156, 181));
        jLabel35.setText("Relationship");
        profileEmegencyContactPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel36.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(143, 156, 181));
        jLabel36.setText("Address:");
        profileEmegencyContactPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        jLabel37.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(143, 156, 181));
        jLabel37.setText("Contact Number:");
        profileEmegencyContactPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        PEmerContactPerson.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PEmerContactPerson.setForeground(new java.awt.Color(49, 65, 95));
        profileEmegencyContactPanel.add(PEmerContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        PEmerRelationship.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PEmerRelationship.setForeground(new java.awt.Color(49, 65, 95));
        profileEmegencyContactPanel.add(PEmerRelationship, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 280, 30));

        PEmerContactNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PEmerContactNumber.setForeground(new java.awt.Color(49, 65, 95));
        profileEmegencyContactPanel.add(PEmerContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 280, 30));

        PEmerAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PEmerAddress.setForeground(new java.awt.Color(49, 65, 95));
        PEmerAddress.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        profileEmegencyContactPanel.add(PEmerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 88, 280, 50));

        profileMainPanel.add(profileEmegencyContactPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 460, 200));

        profileContactInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        profileContactInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Company Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        profileContactInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(143, 156, 181));
        jLabel23.setText("Date Started");
        profileContactInformationPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(143, 156, 181));
        jLabel24.setText("Employee UID:");
        profileContactInformationPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(143, 156, 181));
        jLabel25.setText("Company Email:");
        profileContactInformationPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        PCIDateStarted.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCIDateStarted.setForeground(new java.awt.Color(49, 65, 95));
        profileContactInformationPanel.add(PCIDateStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 280, 30));

        PCIEmployeeUID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCIEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        profileContactInformationPanel.add(PCIEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        PCIEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCIEmail.setForeground(new java.awt.Color(49, 65, 95));
        profileContactInformationPanel.add(PCIEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 280, 30));

        jLabel44.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(143, 156, 181));
        jLabel44.setText("Position");
        profileContactInformationPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        jLabel45.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(143, 156, 181));
        jLabel45.setText("Status:");
        profileContactInformationPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        jLabel46.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(143, 156, 181));
        jLabel46.setText("Account Type:");
        profileContactInformationPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        PCIPosition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCIPosition.setForeground(new java.awt.Color(49, 65, 95));
        profileContactInformationPanel.add(PCIPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 280, 30));

        PCIStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCIStatus.setForeground(new java.awt.Color(49, 65, 95));
        profileContactInformationPanel.add(PCIStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 280, 30));

        PCIAccountType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PCIAccountType.setForeground(new java.awt.Color(49, 65, 95));
        profileContactInformationPanel.add(PCIAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 280, 30));

        profileMainPanel.add(profileContactInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 460, 210));

        profileGovIDInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        profileGovIDInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Government ID Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        profileGovIDInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel137.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(143, 156, 181));
        jLabel137.setText("HDMF:");
        profileGovIDInformationPanel.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        jLabel138.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(143, 156, 181));
        jLabel138.setText("PHIC:");
        profileGovIDInformationPanel.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        jLabel139.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(143, 156, 181));
        jLabel139.setText("SSS:");
        profileGovIDInformationPanel.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        jLabel140.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(143, 156, 181));
        jLabel140.setText("TIN:");
        profileGovIDInformationPanel.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        PGIDHDMF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PGIDHDMF.setForeground(new java.awt.Color(49, 65, 95));
        profileGovIDInformationPanel.add(PGIDHDMF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        PGIDPHIC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PGIDPHIC.setForeground(new java.awt.Color(49, 65, 95));
        profileGovIDInformationPanel.add(PGIDPHIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 280, 30));

        PGIDTIN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PGIDTIN.setForeground(new java.awt.Color(49, 65, 95));
        profileGovIDInformationPanel.add(PGIDTIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 280, 30));

        PGIDSSS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PGIDSSS.setForeground(new java.awt.Color(49, 65, 95));
        profileGovIDInformationPanel.add(PGIDSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 280, 30));

        profileMainPanel.add(profileGovIDInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 460, 160));

        profilePanel.add(profileMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 630));

        rightPanel.add(profilePanel, "card3");

        timeLogPanel.setBackground(new java.awt.Color(245, 246, 248));
        timeLogPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLogSubTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        timeLogSubTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TLTitleLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        TLTitleLabel.setForeground(new java.awt.Color(49, 65, 95));
        TLTitleLabel.setText("Time Log");
        timeLogSubTopPanel.add(TLTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        TLTopBackground.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TLTopBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TLTopBackground.setToolTipText("");
        TLTopBackground.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        timeLogSubTopPanel.add(TLTopBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        timeLogPanel.add(timeLogSubTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        TLFYI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TLFYI.setForeground(new java.awt.Color(143, 156, 181));
        TLFYI.setText("<html><body><p align='justify'>For overtime approvals and correcting time logs. Please go to Contact Support section and fill out the form and we'll be in touch as as soon as possible or you can go to the Human Resources Office during office hours.</p></body></html>");
        timeLogPanel.add(TLFYI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 550, 90));

        TLMidPanel.setBackground(new java.awt.Color(55, 126, 249));
        TLMidPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TLSearchLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TLSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        TLSearchLabel.setText("Search Date");
        TLMidPanel.add(TLSearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        TLSearchField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TLSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TLSearchFieldKeyTyped(evt);
            }
        });
        TLMidPanel.add(TLSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 370, -1));

        TLSearchButton.setBackground(new java.awt.Color(10, 189, 158));
        TLSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TLSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        TLSearchButton.setText("Search");
        TLSearchButton.setBorder(null);
        TLSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TLSearchButtonActionPerformed(evt);
            }
        });
        TLMidPanel.add(TLSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 100, 20));

        timeLogPanel.add(TLMidPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 60));

        TLTimeLogsDetailPanel.setBackground(new java.awt.Color(255, 255, 255));
        TLTimeLogsDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time Log Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        TLTimeLogsDetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TLTimeLogDateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TLTimeLogDateLabel.setForeground(new java.awt.Color(143, 156, 181));
        TLTimeLogDateLabel.setText("Date");
        TLTimeLogsDetailPanel.add(TLTimeLogDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 27, 130, 30));

        TLTimeLogTimeInLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TLTimeLogTimeInLabel.setForeground(new java.awt.Color(143, 156, 181));
        TLTimeLogTimeInLabel.setText("Time In:");
        TLTimeLogsDetailPanel.add(TLTimeLogTimeInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 30));

        TLTimeLogTimeOutLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TLTimeLogTimeOutLabel.setForeground(new java.awt.Color(143, 156, 181));
        TLTimeLogTimeOutLabel.setText("Time Out");
        TLTimeLogsDetailPanel.add(TLTimeLogTimeOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        TLTimeLogDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TLTimeLogDate.setForeground(new java.awt.Color(49, 65, 95));
        TLTimeLogsDetailPanel.add(TLTimeLogDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 27, 170, 30));

        TLTimeLogTimeIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TLTimeLogTimeIn.setForeground(new java.awt.Color(49, 65, 95));
        TLTimeLogsDetailPanel.add(TLTimeLogTimeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 57, 170, 30));

        TLTimeLogRenderedHoursLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TLTimeLogRenderedHoursLabel.setForeground(new java.awt.Color(143, 156, 181));
        TLTimeLogRenderedHoursLabel.setText("Rendered Hours:");
        TLTimeLogsDetailPanel.add(TLTimeLogRenderedHoursLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        TLTimeLogTimeOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TLTimeLogTimeOut.setForeground(new java.awt.Color(49, 65, 95));
        TLTimeLogsDetailPanel.add(TLTimeLogTimeOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 87, 170, 30));

        TLTimeLogRenderedHours.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TLTimeLogRenderedHours.setForeground(new java.awt.Color(49, 65, 95));
        TLTimeLogsDetailPanel.add(TLTimeLogRenderedHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 117, 170, 30));

        timeLogPanel.add(TLTimeLogsDetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 390, 160));

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        TLTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Time In", "Time Out", "Total Hours", "Overtime Approved"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TLTable.getTableHeader().setReorderingAllowed(false);
        TLTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TLTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TLTable);
        if (TLTable.getColumnModel().getColumnCount() > 0) {
            TLTable.getColumnModel().getColumn(0).setResizable(false);
            TLTable.getColumnModel().getColumn(1).setResizable(false);
            TLTable.getColumnModel().getColumn(2).setResizable(false);
            TLTable.getColumnModel().getColumn(3).setResizable(false);
            TLTable.getColumnModel().getColumn(4).setResizable(false);
        }

        timeLogPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 960, 320));

        rightPanel.add(timeLogPanel, "card4");

        payslipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payslipTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        payslipTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payslipTitlePanel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        payslipTitlePanel.setForeground(new java.awt.Color(49, 65, 95));
        payslipTitlePanel.setText("Payslips");
        payslipTopPanel.add(payslipTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        TopPayslipBackground.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TopPayslipBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TopPayslipBackground.setToolTipText("");
        TopPayslipBackground.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        payslipTopPanel.add(TopPayslipBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        payslipPanel.add(payslipTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        payslipMidPanel.setBackground(new java.awt.Color(55, 126, 249));
        payslipMidPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payslipPayPeriodLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        payslipPayPeriodLabel.setForeground(new java.awt.Color(255, 255, 255));
        payslipPayPeriodLabel.setText("Pay Period:");
        payslipMidPanel.add(payslipPayPeriodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        payslipPayPeriodList.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        payslipPayPeriodList.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayPeriodList.setBorder(null);
        payslipMidPanel.add(payslipPayPeriodList, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 170, -1));

        payslipPayPeriodButton.setBackground(new java.awt.Color(10, 189, 158));
        payslipPayPeriodButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        payslipPayPeriodButton.setForeground(new java.awt.Color(255, 255, 255));
        payslipPayPeriodButton.setText("Search");
        payslipPayPeriodButton.setBorder(null);
        payslipPayPeriodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payslipPayPeriodButtonActionPerformed(evt);
            }
        });
        payslipMidPanel.add(payslipPayPeriodButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 100, 20));

        payslipPanel.add(payslipMidPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 60));

        payslipFYILabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        payslipFYILabel.setForeground(new java.awt.Color(143, 156, 181));
        payslipFYILabel.setText("<html><body><p align='justify'>For salary concerns and issues. Please go to Contact Support section and fill out the form and we'll be in touch as as soon as possible or you can go to the Human Resources Office during office hours.</p></body></html>");
        payslipPanel.add(payslipFYILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 656, 530, 60));

        PPrintPaySlip.setBackground(new java.awt.Color(55, 126, 249));
        PPrintPaySlip.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        PPrintPaySlip.setForeground(new java.awt.Color(255, 255, 255));
        PPrintPaySlip.setText("Print Payslip");
        PPrintPaySlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPrintPaySlipActionPerformed(evt);
            }
        });
        payslipPanel.add(PPrintPaySlip, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 310, 40));

        PayslipForm.setBackground(new java.awt.Color(255, 255, 255));
        PayslipForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payslipPayslipSummaryPanel.setBackground(new java.awt.Color(255, 255, 255));
        payslipPayslipSummaryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Payslip Summary", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        payslipPayslipSummaryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PPSNetIncomeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSNetIncomeLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSNetIncomeLabel.setText("Net Income:");
        payslipPayslipSummaryPanel.add(PPSNetIncomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 30));

        PPSNameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSNameLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSNameLabel.setText("Name:");
        payslipPayslipSummaryPanel.add(PPSNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        PPSEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSEmployeeUIDLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSEmployeeUIDLabel.setText("Employee UID:");
        payslipPayslipSummaryPanel.add(PPSEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        PPSPeriodLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSPeriodLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSPeriodLabel.setText("Pay Period:");
        payslipPayslipSummaryPanel.add(PPSPeriodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        PPSHoursWorkedLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSHoursWorkedLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSHoursWorkedLabel.setText("Hours Worked:");
        payslipPayslipSummaryPanel.add(PPSHoursWorkedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        PPSNetIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSNetIncome.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSNetIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, 30));

        PPSName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSName.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 30));

        PPSEmployeeUID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 30));

        PPSHourlyGrossRateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSHourlyGrossRateLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSHourlyGrossRateLabel.setText("Hourly Gross Rate:");
        payslipPayslipSummaryPanel.add(PPSHourlyGrossRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        PPSDailyGrossIncomeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSDailyGrossIncomeLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSDailyGrossIncomeLabel.setText("Gross Income:");
        payslipPayslipSummaryPanel.add(PPSDailyGrossIncomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 30));

        PPSPeriod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSPeriod.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 30));

        PPSHoursWorked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSHoursWorked.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSHoursWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 30));

        PPSHourlyGrossRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSHourlyGrossRate.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSHourlyGrossRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

        PPSDailyGrossIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSDailyGrossIncome.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSDailyGrossIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, 30));

        PPSDailyGrossRateLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSDailyGrossRateLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSDailyGrossRateLabel1.setText("Daily Gross Rate:");
        payslipPayslipSummaryPanel.add(PPSDailyGrossRateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        PPSDailyGrossRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSDailyGrossRate.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSDailyGrossRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 30));

        PPSDaysWorkedLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSDaysWorkedLabel.setForeground(new java.awt.Color(143, 156, 181));
        PPSDaysWorkedLabel.setText("Days Worked:");
        payslipPayslipSummaryPanel.add(PPSDaysWorkedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        PPSDaysWorked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PPSDaysWorked.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel.add(PPSDaysWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 30));

        PayslipForm.add(payslipPayslipSummaryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 430, 310));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 65, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payslip");
        PayslipForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, -1));

        payslipDeductionPanel.setBackground(new java.awt.Color(255, 255, 255));
        payslipDeductionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deductions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        payslipDeductionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PDTaxLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDTaxLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDTaxLabel.setText("Tax:");
        payslipDeductionPanel.add(PDTaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        PDPhilhealthLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDPhilhealthLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDPhilhealthLabel.setText("PHIC:");
        payslipDeductionPanel.add(PDPhilhealthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        PDPagibig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDPagibig.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDPagibig, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, 30));

        PDTax.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDTax.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 60, 30));

        PDPagibigLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDPagibigLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDPagibigLabel.setText("PAGIBIG:");
        payslipDeductionPanel.add(PDPagibigLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        PDPhilhealth.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDPhilhealth.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDPhilhealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 30));

        PDSSSLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDSSSLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDSSSLabel.setText("SSS:");
        payslipDeductionPanel.add(PDSSSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        PDTotalDeductionLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        PDTotalDeductionLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDTotalDeductionLabel.setText("Total Deductions:");
        payslipDeductionPanel.add(PDTotalDeductionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        PDSSS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDSSS.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, 30));

        PDOtherLoanLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDOtherLoanLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDOtherLoanLabel.setText("Other Loan:");
        payslipDeductionPanel.add(PDOtherLoanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 90, 30));

        PDOtherLoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDOtherLoan.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDOtherLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 90, 30));

        PDPagibigLoanLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDPagibigLoanLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDPagibigLoanLabel.setText("PAGIBIG Loan:");
        payslipDeductionPanel.add(PDPagibigLoanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 30));

        PDSSSLoanLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDSSSLoanLabel.setForeground(new java.awt.Color(143, 156, 181));
        PDSSSLoanLabel.setText("SSS Loan:");
        payslipDeductionPanel.add(PDSSSLoanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 90, 30));

        PDPagibigLoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDPagibigLoan.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDPagibigLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, 30));

        PDSSSLoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDSSSLoan.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDSSSLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 90, 30));

        PDSSSLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDSSSLabel2.setForeground(new java.awt.Color(143, 156, 181));
        PDSSSLabel2.setText("SSS:");
        payslipDeductionPanel.add(PDSSSLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        PDTotalDeduction.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PDTotalDeduction.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel.add(PDTotalDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 60, 30));

        PayslipForm.add(payslipDeductionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 460, 190));

        payslipPanel.add(PayslipForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 970, 430));

        rightPanel.add(payslipPanel, "card5");

        supportPanel.setBackground(new java.awt.Color(255, 255, 255));
        supportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supportSubTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        supportSubTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeUserLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        welcomeUserLabel4.setForeground(new java.awt.Color(49, 65, 95));
        welcomeUserLabel4.setText("Contact Support");
        supportSubTopPanel.add(welcomeUserLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(49, 65, 95));
        jLabel12.setText("<html>Our team is happy to answer your concerns and questions. Fill out the form and we'll be in touch as as soon as possible.</html>");
        supportSubTopPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 950, 60));

        SupportTopBackground.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SupportTopBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        SupportTopBackground.setToolTipText("");
        SupportTopBackground.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        supportSubTopPanel.add(SupportTopBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        supportPanel.add(supportSubTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        CSEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CSEmployeeUIDLabel.setForeground(new java.awt.Color(49, 65, 95));
        CSEmployeeUIDLabel.setText("Employee UID");
        supportPanel.add(CSEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        CSEmployeeUID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CSEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        CSEmployeeUID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CSEmployeeUIDFocusGained(evt);
            }
        });
        CSEmployeeUID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CSEmployeeUIDKeyTyped(evt);
            }
        });
        supportPanel.add(CSEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 520, 30));

        CSNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CSNameLabel.setForeground(new java.awt.Color(49, 65, 95));
        CSNameLabel.setText("Name");
        supportPanel.add(CSNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        CSFirstName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CSFirstName.setForeground(new java.awt.Color(49, 65, 95));
        CSFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CSFirstNameFocusGained(evt);
            }
        });
        supportPanel.add(CSFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 250, 30));

        CSFirstNameLabel.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        CSFirstNameLabel.setForeground(new java.awt.Color(118, 133, 161));
        CSFirstNameLabel.setText("First Name");
        supportPanel.add(CSFirstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        CSLastName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CSLastName.setForeground(new java.awt.Color(49, 65, 95));
        CSLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CSLastNameFocusGained(evt);
            }
        });
        supportPanel.add(CSLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 250, 30));

        CSLastNameLabel.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        CSLastNameLabel.setForeground(new java.awt.Color(118, 133, 161));
        CSLastNameLabel.setText("Last Name");
        supportPanel.add(CSLastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        CSEmailLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CSEmailLabel.setForeground(new java.awt.Color(49, 65, 95));
        CSEmailLabel.setText("Email");
        supportPanel.add(CSEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        CSEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CSEmail.setForeground(new java.awt.Color(49, 65, 95));
        CSEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CSEmailFocusGained(evt);
            }
        });
        supportPanel.add(CSEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 520, 30));

        CSSubjectLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CSSubjectLabel.setForeground(new java.awt.Color(49, 65, 95));
        CSSubjectLabel.setText("Subject");
        supportPanel.add(CSSubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        CSSubject.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CSSubject.setForeground(new java.awt.Color(49, 65, 95));
        CSSubject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CSSubjectFocusGained(evt);
            }
        });
        supportPanel.add(CSSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 520, 30));

        CSMessageLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CSMessageLabel.setForeground(new java.awt.Color(49, 65, 95));
        CSMessageLabel.setText("Message");
        supportPanel.add(CSMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        CSMessage.setColumns(20);
        CSMessage.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CSMessage.setLineWrap(true);
        CSMessage.setRows(5);
        CSMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CSMessageFocusGained(evt);
            }
        });
        CSMessageScroll.setViewportView(CSMessage);

        supportPanel.add(CSMessageScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 520, 210));

        contactSupportSendButton.setBackground(new java.awt.Color(55, 126, 249));
        contactSupportSendButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        contactSupportSendButton.setForeground(new java.awt.Color(255, 255, 255));
        contactSupportSendButton.setText("Send");
        contactSupportSendButton.setFocusable(false);
        contactSupportSendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactSupportSendButtonActionPerformed(evt);
            }
        });
        supportPanel.add(contactSupportSendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 520, 40));

        InvalidUIDLabel.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        InvalidUIDLabel.setForeground(new java.awt.Color(255, 102, 102));
        supportPanel.add(InvalidUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 200, 30));

        InvalidNameLabel.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        InvalidNameLabel.setForeground(new java.awt.Color(255, 102, 102));
        supportPanel.add(InvalidNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 200, 30));

        InvalidEmailLabel.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        InvalidEmailLabel.setForeground(new java.awt.Color(255, 102, 102));
        supportPanel.add(InvalidEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 200, 30));

        InvalidSubjectLabel.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        InvalidSubjectLabel.setForeground(new java.awt.Color(255, 102, 102));
        supportPanel.add(InvalidSubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 200, 30));

        InvalidMessageLabel.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        InvalidMessageLabel.setForeground(new java.awt.Color(255, 102, 102));
        supportPanel.add(InvalidMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 200, 210));

        rightPanel.add(supportPanel, "card6");

        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 1020, 750));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        homeButton.setBackground(new java.awt.Color(230, 239, 255));
        homeButton.setForeground(new java.awt.Color(55, 126, 249));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/home-entered.png"))); // NOI18N
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setForeground(new java.awt.Color(0, 0, 0));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/home-default.png")));
    }//GEN-LAST:event_homeButtonMouseExited

    private void profileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseEntered
        profileButton.setBackground(new java.awt.Color(230, 239, 255));
        profileButton.setForeground(new java.awt.Color(55, 126, 249));
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/profile-entered.png")));
    }//GEN-LAST:event_profileButtonMouseEntered

    private void profileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseExited
        profileButton.setBackground(new java.awt.Color(255, 255, 255));
        profileButton.setForeground(new java.awt.Color(0, 0, 0));
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/profile-default.png")));
    }//GEN-LAST:event_profileButtonMouseExited

    private void timeLogButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeLogButtonMouseEntered
        timeLogButton.setBackground(new java.awt.Color(230, 239, 255));
        timeLogButton.setForeground(new java.awt.Color(55, 126, 249));
        timeLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/time-log-entered.png")));
    }//GEN-LAST:event_timeLogButtonMouseEntered

    private void timeLogButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeLogButtonMouseExited
        timeLogButton.setBackground(new java.awt.Color(255, 255, 255));
        timeLogButton.setForeground(new java.awt.Color(0, 0, 0));
        timeLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/time-log-default.png")));
    }//GEN-LAST:event_timeLogButtonMouseExited

    private void payslipsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payslipsButtonMouseEntered
        payslipsButton.setBackground(new java.awt.Color(230, 239, 255));
        payslipsButton.setForeground(new java.awt.Color(55, 126, 249));
        payslipsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/payslip-entered.png")));
    }//GEN-LAST:event_payslipsButtonMouseEntered

    private void payslipsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payslipsButtonMouseExited
        payslipsButton.setBackground(new java.awt.Color(255, 255, 255));
        payslipsButton.setForeground(new java.awt.Color(0, 0, 0));
        payslipsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/payslip-default.png")));
    }//GEN-LAST:event_payslipsButtonMouseExited

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        changeCard(homePanel);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        changeCard(profilePanel);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void timeLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeLogButtonActionPerformed
        changeCard(timeLogPanel);
        DisplayTimeLog.displayEmployeeTimeLog(TLTable, getEmployeeUID());
    }//GEN-LAST:event_timeLogButtonActionPerformed

    private void payslipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payslipsButtonActionPerformed
        changeCard(payslipPanel);
        LoggedInUser.generatePayPeriod(payslipPayPeriodList, getEmployeeUID());
        PPSName.setText("");
        PPSEmployeeUID.setText("");
        PPSPeriod.setText("");
        PPSDaysWorked.setText("");
        PPSHoursWorked.setText("");
        PPSHourlyGrossRate.setText("");
        PPSDailyGrossRate.setText("");
        PPSDailyGrossIncome.setText("");
        PPSNetIncome.setText("");
        PDPagibig.setText("");
        PDPhilhealth.setText("");
        PDSSS.setText("");
        PDTax.setText("");
        PDPagibigLoan.setText("");
        PDSSSLoan.setText("");
        PDOtherLoan.setText("");
        PDTotalDeduction.setText("");
    }//GEN-LAST:event_payslipsButtonActionPerformed

    private void topLoggedFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topLoggedFullNameMouseClicked
        profilePopupMenu.show(topPanel, 775, 50);
    }//GEN-LAST:event_topLoggedFullNameMouseClicked

    private void TimeLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeLogButtonActionPerformed

        String check = TimeLogButton.getText();
        String clock = topTimeUpdateLabel.getText();
        TimeLogAction.setEmployeeUID(getEmployeeUID());
        if (check.equals("Time In")) {
            TimeLogAction.TimeIn();
            TimeLogButton.setText("Time Out");
            TimeLogButton.setBackground(new java.awt.Color(235, 87, 87));
            isTimeIn();
        }

        if (check.equals("Time Out")) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure do you want to time out?", "Confirm to Time Out", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                TimeLogAction.TimeOut();
                TimeLogButton.setText("Time In");
                TimeLogButton.setBackground(new java.awt.Color(10, 189, 158));
            }
        }
    }//GEN-LAST:event_TimeLogButtonActionPerformed

    private void supportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supportButtonMouseEntered
        supportButton.setBackground(new java.awt.Color(230, 239, 255));
        supportButton.setForeground(new java.awt.Color(55, 126, 249));
        supportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/support-entered.png")));
    }//GEN-LAST:event_supportButtonMouseEntered

    private void supportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supportButtonMouseExited
        supportButton.setBackground(new java.awt.Color(255, 255, 255));
        supportButton.setForeground(new java.awt.Color(0, 0, 0));
        supportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/support-default.png")));
    }//GEN-LAST:event_supportButtonMouseExited

    private void supportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supportButtonActionPerformed
        CS.setMessage(InvalidUIDLabel, InvalidNameLabel, InvalidEmailLabel, InvalidSubjectLabel, InvalidMessageLabel, CSEmployeeUID, CSFirstName, CSLastName, CSEmail, CSSubject, CSMessage);
        changeCard(supportPanel);
        CSEmployeeUID.setText("");
        CSFirstName.setText("");
        CSLastName.setText("");
        CSEmail.setText("");
        CSSubject.setText("");
        CSMessage.setText("");
    }//GEN-LAST:event_supportButtonActionPerformed

    private void contactSupportSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactSupportSendButtonActionPerformed

        CS.getAndSendMessage();
    }//GEN-LAST:event_contactSupportSendButtonActionPerformed

    private void CSEmployeeUIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSEmployeeUIDFocusGained
        InvalidUIDLabel.setText("");
    }//GEN-LAST:event_CSEmployeeUIDFocusGained

    private void CSEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSEmailFocusGained
        InvalidEmailLabel.setText("");
    }//GEN-LAST:event_CSEmailFocusGained

    private void CSLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSLastNameFocusGained
        InvalidNameLabel.setText("");
    }//GEN-LAST:event_CSLastNameFocusGained

    private void CSFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSFirstNameFocusGained
        InvalidNameLabel.setText("");
    }//GEN-LAST:event_CSFirstNameFocusGained

    private void CSSubjectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSSubjectFocusGained
        InvalidSubjectLabel.setText("");
    }//GEN-LAST:event_CSSubjectFocusGained

    private void CSMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSMessageFocusGained
        InvalidMessageLabel.setText("");
    }//GEN-LAST:event_CSMessageFocusGained

    private void CSEmployeeUIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CSEmployeeUIDKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_CSEmployeeUIDKeyTyped

    private void topLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topLogoMouseClicked
        changeCard(homePanel);
    }//GEN-LAST:event_topLogoMouseClicked

    private void topLogoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_topLogoFocusGained
        LoggedInUser.setInfo(topLoggedFullName, PPIName, homeWelcomeUserLabel, PPIGender, PPIBirthdate, PPIAddress, PPIMobileNumber, PPIMaritalStatus, PCIEmployeeUID, PCIEmail, PCIPosition, PCIStatus, PCIAccountType, PCIDateStarted, PCDBasicPay, PGIDHDMF, PGIDPHIC, PGIDSSS, PGIDTIN, PEmerContactPerson, PEmerRelationship, PEmerAddress, PEmerContactNumber, getEmployeeUID());
        LoggedInUser.showCurrentLoggedIn();
        isTimeIn();
    }//GEN-LAST:event_topLogoFocusGained

    private void PMProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMProfileActionPerformed
        changeCard(profilePanel);
    }//GEN-LAST:event_PMProfileActionPerformed

    private void PMTimeLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMTimeLogActionPerformed
        changeCard(timeLogPanel);
    }//GEN-LAST:event_PMTimeLogActionPerformed

    private void PMPayslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMPayslipActionPerformed
        changeCard(payslipPanel);
    }//GEN-LAST:event_PMPayslipActionPerformed

    private void PMLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMLogoutActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to Log Out?", "Confirm to Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            new LoginForm().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_PMLogoutActionPerformed

    private void homeProfilePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseClicked
        changeCard(profilePanel);
        homeProfilePanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homeProfilePanelMouseClicked

    private void homeProfilePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseEntered
        homeProfilePanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homeProfilePanelMouseEntered

    private void homeProfilePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseExited
        homeProfilePanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homeProfilePanelMouseExited

    private void homeProfilePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMousePressed
        homeProfilePanel.setBackground(new java.awt.Color(7, 95, 247));
    }//GEN-LAST:event_homeProfilePanelMousePressed

    private void homeProfilePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseReleased
        homeProfilePanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homeProfilePanelMouseReleased

    private void homeTimeLogPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTimeLogPanelMouseClicked
        changeCard(timeLogPanel);
        homeTimeLogPanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homeTimeLogPanelMouseClicked

    private void homeTimeLogPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTimeLogPanelMouseEntered
        homeTimeLogPanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homeTimeLogPanelMouseEntered

    private void homeTimeLogPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTimeLogPanelMouseExited
        homeTimeLogPanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homeTimeLogPanelMouseExited

    private void homeTimeLogPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTimeLogPanelMousePressed
        homeTimeLogPanel.setBackground(new java.awt.Color(7, 95, 247));
    }//GEN-LAST:event_homeTimeLogPanelMousePressed

    private void homeTimeLogPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTimeLogPanelMouseReleased
        homeTimeLogPanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homeTimeLogPanelMouseReleased

    private void homePayslipPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePayslipPanelMouseClicked
        changeCard(payslipPanel);
        homePayslipPanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homePayslipPanelMouseClicked

    private void homePayslipPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePayslipPanelMouseEntered
        homePayslipPanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homePayslipPanelMouseEntered

    private void homePayslipPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePayslipPanelMouseExited
        homePayslipPanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homePayslipPanelMouseExited

    private void homePayslipPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePayslipPanelMousePressed
        homePayslipPanel.setBackground(new java.awt.Color(7, 95, 247));
    }//GEN-LAST:event_homePayslipPanelMousePressed

    private void homePayslipPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePayslipPanelMouseReleased
        homePayslipPanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homePayslipPanelMouseReleased

    private void TLTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TLTableMouseClicked
        DisplayTimeLog.onclickTimeLogTable(TLTable, TLTimeLogDate, TLTimeLogTimeIn, TLTimeLogTimeOut, TLTimeLogRenderedHours);
    }//GEN-LAST:event_TLTableMouseClicked

    private void payslipPayPeriodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payslipPayPeriodButtonActionPerformed
        changeCard(payslipPanel);
        LoggedInUser.getGeneratePayInfo(payslipPayPeriodList, getEmployeeUID(), PPSName, PPSEmployeeUID, PPSPeriod, PPSDaysWorked, PPSHoursWorked, PPSHourlyGrossRate, PPSDailyGrossRate, PPSDailyGrossIncome, PPSNetIncome, PDPagibig, PDPhilhealth, PDSSS, PDTax, PDPagibigLoan, PDSSSLoan, PDOtherLoan, PDTotalDeduction);
    }//GEN-LAST:event_payslipPayPeriodButtonActionPerformed

    private void PPrintPaySlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPrintPaySlipActionPerformed
        printPayslip(PayslipForm);
    }//GEN-LAST:event_PPrintPaySlipActionPerformed

    private void TLSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TLSearchFieldKeyTyped
        DisplayTimeLog.searchTimeLogTable(TLTable, TLSearchField);
    }//GEN-LAST:event_TLSearchFieldKeyTyped

    private void TLSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLSearchButtonActionPerformed
        DisplayTimeLog.searchTimeLogTable(TLTable, TLSearchField);
    }//GEN-LAST:event_TLSearchButtonActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDashboard().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CSEmail;
    private javax.swing.JLabel CSEmailLabel;
    private javax.swing.JTextField CSEmployeeUID;
    private javax.swing.JLabel CSEmployeeUIDLabel;
    private javax.swing.JTextField CSFirstName;
    private javax.swing.JLabel CSFirstNameLabel;
    private javax.swing.JTextField CSLastName;
    private javax.swing.JLabel CSLastNameLabel;
    private javax.swing.JTextArea CSMessage;
    private javax.swing.JLabel CSMessageLabel;
    private javax.swing.JScrollPane CSMessageScroll;
    private javax.swing.JLabel CSNameLabel;
    private javax.swing.JTextField CSSubject;
    private javax.swing.JLabel CSSubjectLabel;
    private javax.swing.JLabel InvalidEmailLabel;
    private javax.swing.JLabel InvalidMessageLabel;
    private javax.swing.JLabel InvalidNameLabel;
    private javax.swing.JLabel InvalidSubjectLabel;
    private javax.swing.JLabel InvalidUIDLabel;
    private javax.swing.JLabel PCDBasicPay;
    private javax.swing.JLabel PCIAccountType;
    private javax.swing.JLabel PCIDateStarted;
    private javax.swing.JLabel PCIEmail;
    private javax.swing.JLabel PCIEmployeeUID;
    private javax.swing.JLabel PCIPosition;
    private javax.swing.JLabel PCIStatus;
    private javax.swing.JLabel PDOtherLoan;
    private javax.swing.JLabel PDOtherLoanLabel;
    private javax.swing.JLabel PDPagibig;
    private javax.swing.JLabel PDPagibigLabel;
    private javax.swing.JLabel PDPagibigLoan;
    private javax.swing.JLabel PDPagibigLoanLabel;
    private javax.swing.JLabel PDPhilhealth;
    private javax.swing.JLabel PDPhilhealthLabel;
    private javax.swing.JLabel PDSSS;
    private javax.swing.JLabel PDSSSLabel;
    private javax.swing.JLabel PDSSSLabel2;
    private javax.swing.JLabel PDSSSLoan;
    private javax.swing.JLabel PDSSSLoanLabel;
    private javax.swing.JLabel PDTax;
    private javax.swing.JLabel PDTaxLabel;
    private javax.swing.JLabel PDTotalDeduction;
    private javax.swing.JLabel PDTotalDeductionLabel;
    private javax.swing.JLabel PEmerAddress;
    private javax.swing.JLabel PEmerContactNumber;
    private javax.swing.JLabel PEmerContactPerson;
    private javax.swing.JLabel PEmerRelationship;
    private javax.swing.JLabel PGIDHDMF;
    private javax.swing.JLabel PGIDPHIC;
    private javax.swing.JLabel PGIDSSS;
    private javax.swing.JLabel PGIDTIN;
    private javax.swing.JMenuItem PMLogout;
    private javax.swing.JMenuItem PMPayslip;
    private javax.swing.JMenuItem PMProfile;
    private javax.swing.JMenuItem PMTimeLog;
    private javax.swing.JLabel PPIAddress;
    private javax.swing.JLabel PPIAddressLabel;
    private javax.swing.JLabel PPIBirthdate;
    private javax.swing.JLabel PPIBirthdateLabel;
    private javax.swing.JLabel PPIGender;
    private javax.swing.JLabel PPIGenderLabel;
    private javax.swing.JLabel PPIMaritalStatus;
    private javax.swing.JLabel PPIMaritalStatusLabel;
    private javax.swing.JLabel PPIMobileNumber;
    private javax.swing.JLabel PPIMobileNumberLabel;
    private javax.swing.JLabel PPIName;
    private javax.swing.JLabel PPINameLabel;
    private javax.swing.JLabel PPSDailyGrossIncome;
    private javax.swing.JLabel PPSDailyGrossIncomeLabel;
    private javax.swing.JLabel PPSDailyGrossRate;
    private javax.swing.JLabel PPSDailyGrossRateLabel1;
    private javax.swing.JLabel PPSDaysWorked;
    private javax.swing.JLabel PPSDaysWorkedLabel;
    private javax.swing.JLabel PPSEmployeeUID;
    private javax.swing.JLabel PPSEmployeeUIDLabel;
    private javax.swing.JLabel PPSHourlyGrossRate;
    private javax.swing.JLabel PPSHourlyGrossRateLabel;
    private javax.swing.JLabel PPSHoursWorked;
    private javax.swing.JLabel PPSHoursWorkedLabel;
    private javax.swing.JLabel PPSName;
    private javax.swing.JLabel PPSNameLabel;
    private javax.swing.JLabel PPSNetIncome;
    private javax.swing.JLabel PPSNetIncomeLabel;
    private javax.swing.JLabel PPSPeriod;
    private javax.swing.JLabel PPSPeriodLabel;
    private javax.swing.JButton PPrintPaySlip;
    private javax.swing.JPanel PayslipForm;
    private javax.swing.JLabel SupportTopBackground;
    private javax.swing.JLabel TLFYI;
    private javax.swing.JPanel TLMidPanel;
    private javax.swing.JButton TLSearchButton;
    private javax.swing.JTextField TLSearchField;
    private javax.swing.JLabel TLSearchLabel;
    private javax.swing.JTable TLTable;
    private javax.swing.JLabel TLTimeLogDate;
    private javax.swing.JLabel TLTimeLogDateLabel;
    private javax.swing.JLabel TLTimeLogRenderedHours;
    private javax.swing.JLabel TLTimeLogRenderedHoursLabel;
    private javax.swing.JLabel TLTimeLogTimeIn;
    private javax.swing.JLabel TLTimeLogTimeInLabel;
    private javax.swing.JLabel TLTimeLogTimeOut;
    private javax.swing.JLabel TLTimeLogTimeOutLabel;
    private javax.swing.JPanel TLTimeLogsDetailPanel;
    private javax.swing.JLabel TLTitleLabel;
    private javax.swing.JLabel TLTopBackground;
    private javax.swing.JButton TimeLogButton;
    private javax.swing.JLabel TopPayslipBackground;
    private javax.swing.JButton contactSupportSendButton;
    private javax.swing.JLabel homeBckg;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homePayslipPanel;
    private javax.swing.JPanel homeProfilePanel;
    private javax.swing.JPanel homeTimeLogPanel;
    private javax.swing.JLabel homeWelcomeUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel payslipDeductionPanel;
    private javax.swing.JLabel payslipFYILabel;
    private javax.swing.JPanel payslipMidPanel;
    private javax.swing.JPanel payslipPanel;
    private javax.swing.JButton payslipPayPeriodButton;
    private javax.swing.JLabel payslipPayPeriodLabel;
    private javax.swing.JComboBox<String> payslipPayPeriodList;
    private javax.swing.JPanel payslipPayslipSummaryPanel;
    private javax.swing.JLabel payslipTitlePanel;
    private javax.swing.JPanel payslipTopPanel;
    private javax.swing.JButton payslipsButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JPanel profileCompensationDetailsPanel;
    private javax.swing.JPanel profileContactInformationPanel;
    private javax.swing.JPanel profileEmegencyContactPanel;
    private javax.swing.JLabel profileFYILabel;
    private javax.swing.JPanel profileGovIDInformationPanel;
    private javax.swing.JPanel profileMainPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel profilePersonalInformationPanel;
    private javax.swing.JPopupMenu profilePopupMenu;
    private javax.swing.JLabel profileTitleLabel;
    private javax.swing.JLabel profileTopBackground;
    private javax.swing.JPanel profileTopPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton supportButton;
    private javax.swing.JPanel supportPanel;
    private javax.swing.JPanel supportSubTopPanel;
    private javax.swing.JButton timeLogButton;
    private javax.swing.JPanel timeLogPanel;
    private javax.swing.JPanel timeLogSubTopPanel;
    private javax.swing.JLabel topLoggedFullName;
    private javax.swing.JLabel topLogo;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel topTimeUpdateLabel;
    private javax.swing.JLabel welcomeUserLabel4;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 

    ContactSupportAction CS = new ContactSupportAction();
    DailyTimeRecordAction TimeLogAction = new DailyTimeRecordAction();
    DailyTimeRecordAction DisplayTimeLog = new DisplayTimeLogAction();
    ShowCurrentLoggedInUser LoggedInUser = new ShowCurrentLoggedInUser();

    private String username;
    private String password;
    private int UID;

    private void isTimeIn() {
        String Database = new DatabaseLocation().getDatabaseLocation();
        int employeeUID = getEmployeeUID();
        Date startDate = new Date(); // use whatever start date you need
        String latestDate;
        try {
            Connection conn = DriverManager.getConnection(Database);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `employee_time_log` WHERE `employee_uid` = ? AND `date` >= ? ORDER BY `date` DESC LIMIT 1");
            stmt.setInt(1, employeeUID);
            stmt.setString(2, new SimpleDateFormat("yyyy-MM-dd HH:mm").format(startDate));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Retrieve the data value for the latest date
                latestDate = rs.getString("date");
                Object timeOutStatus = rs.getString("time_out");
                if (timeOutStatus == null || timeOutStatus.equals("")) {
                    TimeLogButton.setText("Time Out");
                    TimeLogButton.setBackground(new java.awt.Color(235, 87, 87));
                } else {
                    TimeLogButton.setText("Time In");
                    TimeLogButton.setBackground(new java.awt.Color(10, 189, 158));
                }
            } else {
                TimeLogButton.setText("Time In");
                TimeLogButton.setBackground(new java.awt.Color(10, 189, 158));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void setData(String username, String password, int UID) {
        this.username = username;
        this.password = password;
        this.UID = UID;
    }

    public int getEmployeeUID() {
        return UID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private String time;

    public void run() {
        while (true) {
            Calendar calendar = Calendar.getInstance();

            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy | hh:mm:ss aa");
            Date date = calendar.getTime();
            time = dateFormat.format(date);
            topTimeUpdateLabel.setText(time);
        }
    }

    void changeCard(Component Card) {
        rightPanel.removeAll();
        rightPanel.add(Card);
        rightPanel.repaint();
        rightPanel.revalidate();
    }

    private void showPopupMenu(MouseEvent e) {
        profilePopupMenu.show(this, topLoggedFullName.getX(), topLoggedFullName.getY());
    }

    private void printPayslip(JPanel Panel) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Payslip");
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D graphics2D = (Graphics2D) graphics;
                graphics2D.translate(pageFormat.getImageableX() * 2, pageFormat.getImageableY() * 2);
                graphics2D.scale(0.63, 0.65);

                Panel.paint(graphics2D);

                return Printable.PAGE_EXISTS;
            }

        });
        boolean returningResult = printerJob.printDialog();
        if (returningResult) {
            try {
                printerJob.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "Print Error" + ex.getMessage());
            }
        }
    }

}
