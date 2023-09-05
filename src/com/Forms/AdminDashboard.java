package com.Forms;

import com.FormActions.ContactSupportAction;
import com.FormActions.DailyTimeRecordAction;
import com.FormActions.DatabaseLocation;
import com.FormActions.DisplayTimeLogAction;
import com.FormActions.GeneratePayslip;
import com.FormActions.InquiryAndConcernLogActions;
import com.FormActions.JTextFieldLimit;
import com.FormActions.ShowCurrentLoggedInUser;
import com.FormActions.ManageEmployeeAddEmployee;
import com.FormActions.ManageEmployeeGeneratePayslip;
import com.FormActions.ManageEmployeeGetInformation;
import com.FormActions.ManageEmployeeTable;
import com.FormActions.ManageEmployeeUpdateEmployee;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
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
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class AdminDashboard extends javax.swing.JFrame implements Runnable {

    public AdminDashboard() {
        initComponents();
        Thread thread = new Thread(this);
        thread.start();
        topLogo.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MEGenderRadio = new javax.swing.ButtonGroup();
        profilePopupMenu = new javax.swing.JPopupMenu();
        PMProfile = new javax.swing.JMenuItem();
        PMTimeLog = new javax.swing.JMenuItem();
        PMPayslip = new javax.swing.JMenuItem();
        PMLogout = new javax.swing.JMenuItem();
        topPanel = new javax.swing.JPanel();
        topLoggedFullName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        topTimeUpdateLabel = new javax.swing.JLabel();
        TimeLogButton = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        timeLogButton = new javax.swing.JButton();
        payslipsButton = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        manageEmployeeButton = new javax.swing.JButton();
        generatePaySlipButton = new javax.swing.JButton();
        inquiryLogButton = new javax.swing.JButton();
        Separator2 = new javax.swing.JSeparator();
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
        TopBackground = new javax.swing.JLabel();
        profileMainPanel = new javax.swing.JPanel();
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
        profileCompensationDetailsPanel = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        PCDBasicPay = new javax.swing.JLabel();
        profileGovIDInformationPanel = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        PGIDHDMF = new javax.swing.JLabel();
        PGIDPHIC = new javax.swing.JLabel();
        PGIDTIN = new javax.swing.JLabel();
        PGIDSSS = new javax.swing.JLabel();
        profileEmegencyContactPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        PEmerContactPerson = new javax.swing.JLabel();
        PEmerRelationship = new javax.swing.JLabel();
        PEmerContactNumber = new javax.swing.JLabel();
        PEmerAddress = new javax.swing.JLabel();
        profileFYILabel = new javax.swing.JLabel();
        timeLogPanel = new javax.swing.JPanel();
        TLTopPanel = new javax.swing.JPanel();
        TLTitleLabel = new javax.swing.JLabel();
        TopBackground8 = new javax.swing.JLabel();
        TLMidPanel = new javax.swing.JPanel();
        TLSearchLabel = new javax.swing.JLabel();
        TLSearchField = new javax.swing.JTextField();
        TLSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TLTable = new javax.swing.JTable();
        TLTimeLogsDetailPanel = new javax.swing.JPanel();
        TLTimeLogDateLabel = new javax.swing.JLabel();
        TLTimeLogTimeInLabel = new javax.swing.JLabel();
        TLTimeLogTimeOutLabel = new javax.swing.JLabel();
        TLTimeLogDate = new javax.swing.JLabel();
        TLTimeLogTimeIn = new javax.swing.JLabel();
        TLTimeLogRenderedHoursLabel = new javax.swing.JLabel();
        TLTimeLogTimeOut = new javax.swing.JLabel();
        TLTimeLogRenderedHours = new javax.swing.JLabel();
        TLFYI = new javax.swing.JLabel();
        payslipPanel = new javax.swing.JPanel();
        payslipTopPanel = new javax.swing.JPanel();
        payslipTitlePanel = new javax.swing.JLabel();
        TopBackground2 = new javax.swing.JLabel();
        payslipMidPanel = new javax.swing.JPanel();
        payslipPayPeriodLabel = new javax.swing.JLabel();
        payslipPayPeriodList = new javax.swing.JComboBox<>();
        payslipPayPeriodButton = new javax.swing.JButton();
        PPrintPaySlip = new javax.swing.JButton();
        payslipFYILabel = new javax.swing.JLabel();
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
        PSTitle = new javax.swing.JLabel();
        manageEmployeePanel = new javax.swing.JPanel();
        METopPanel = new javax.swing.JPanel();
        METitleLabel2 = new javax.swing.JLabel();
        TopBackground3 = new javax.swing.JLabel();
        MECardPanel = new javax.swing.JPanel();
        METablePanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        METable = new javax.swing.JTable();
        MECheckInfoButton = new javax.swing.JButton();
        MEMidPanel1 = new javax.swing.JPanel();
        METableSearchLabel = new javax.swing.JLabel();
        METableSearchField = new javax.swing.JTextField();
        METableSearchButton = new javax.swing.JButton();
        MEUpdateEmployeeButton = new javax.swing.JButton();
        MEAddEmployeeButton = new javax.swing.JButton();
        MEDeleteEmployeeButton = new javax.swing.JButton();
        MEAddPanel = new javax.swing.JPanel();
        MEMidPanel2 = new javax.swing.JPanel();
        MEAddTitleLabel = new javax.swing.JLabel();
        MEAddBackButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        MEAddFieldsPanel = new javax.swing.JPanel();
        MEAddProfileInformation = new javax.swing.JPanel();
        MEAddPIFirstNameLabel = new javax.swing.JLabel();
        MEAddPIMiddleNameLabel = new javax.swing.JLabel();
        MEAddPILastNameLabel = new javax.swing.JLabel();
        MEAddPIGenderLabel = new javax.swing.JLabel();
        MEAddPIBirthdayLabel = new javax.swing.JLabel();
        MEAddPIAddressLabel = new javax.swing.JLabel();
        MEAddPIMobileNumberLabel = new javax.swing.JLabel();
        MEAddPIMaritalStatusLabel = new javax.swing.JLabel();
        MEAddPIFirstName = new javax.swing.JTextField();
        MEAddPIMiddleName = new javax.swing.JTextField();
        MEAddPILastName = new javax.swing.JTextField();
        MEAddPIMale = new javax.swing.JRadioButton();
        MEAddPIFemale = new javax.swing.JRadioButton();
        MEAddPIBirthYear = new javax.swing.JComboBox<>();
        MEAddPIBirthDate = new javax.swing.JComboBox<>();
        MEAddPIBirthMonth = new javax.swing.JComboBox<>();
        MEAddPIAddress = new javax.swing.JTextField();
        MEAddPIMobileNumber = new javax.swing.JTextField();
        MEAddPIMaritalStatus = new javax.swing.JComboBox<>();
        MEAddConpanyInformation = new javax.swing.JPanel();
        MEAddCIEmployeeUIDLabel = new javax.swing.JLabel();
        MEAddCIEmailLabel = new javax.swing.JLabel();
        MEAddCIPositionLabel = new javax.swing.JLabel();
        MEAddCIStatusLabel = new javax.swing.JLabel();
        MEAddCIAccountTypeLabel = new javax.swing.JLabel();
        MEAddCIDateStartedLabel = new javax.swing.JLabel();
        MEAddCIEmail = new javax.swing.JTextField();
        MEAddCIPosition = new javax.swing.JTextField();
        MEAddCIEmployeeUID = new javax.swing.JTextField();
        MEAddCIAccountType = new javax.swing.JComboBox<>();
        MEAddCIDateStartMonth = new javax.swing.JComboBox<>();
        MEAddCIDateStartDate = new javax.swing.JComboBox<>();
        MEAddCIDateStartYear = new javax.swing.JComboBox<>();
        MEAddCIStatus = new javax.swing.JComboBox<>();
        MEAddCompensationDetailsPanel = new javax.swing.JPanel();
        MEAddCIBasicPayLabel = new javax.swing.JLabel();
        MEAddCIBasicPay = new javax.swing.JTextField();
        MEAddGovIDInformationPanel = new javax.swing.JPanel();
        MEAddHDMFLabel = new javax.swing.JLabel();
        MEAddPHICLabel = new javax.swing.JLabel();
        MEAddSSSLabel = new javax.swing.JLabel();
        MEAddTINLabel = new javax.swing.JLabel();
        MEAddGIDTIN3 = new javax.swing.JTextField();
        MEAddGIDPHIC3 = new javax.swing.JTextField();
        MEAddGIDSSS3 = new javax.swing.JTextField();
        MEAddGIDHDMF3 = new javax.swing.JTextField();
        MEAddGIDHDMF1 = new javax.swing.JTextField();
        MEAddGIDHDMF2 = new javax.swing.JTextField();
        MEAddHDMFLabel1 = new javax.swing.JLabel();
        MEAddHDMFLabel2 = new javax.swing.JLabel();
        MEAddGIDPHIC2 = new javax.swing.JTextField();
        MEAddHDMFLabel3 = new javax.swing.JLabel();
        MEAddHDMFLabel4 = new javax.swing.JLabel();
        MEAddGIDPHIC1 = new javax.swing.JTextField();
        MEAddGIDSSS1 = new javax.swing.JTextField();
        MEAddGIDSSS2 = new javax.swing.JTextField();
        MEAddHDMFLabel5 = new javax.swing.JLabel();
        MEAddHDMFLabel6 = new javax.swing.JLabel();
        MEAddGIDTIN1 = new javax.swing.JTextField();
        MEAddGIDTIN2 = new javax.swing.JTextField();
        MEAddHDMFLabel7 = new javax.swing.JLabel();
        MEAddHDMFLabel8 = new javax.swing.JLabel();
        MEAddEmegencyContactPanel = new javax.swing.JPanel();
        MEAddContactPersonLabel = new javax.swing.JLabel();
        MEAddRelationshipLabel = new javax.swing.JLabel();
        MEAddAddressLabel = new javax.swing.JLabel();
        MEAddContactNumberLabel = new javax.swing.JLabel();
        MEAddEmerContactNumber = new javax.swing.JTextField();
        MEAddEmerContactPerson = new javax.swing.JTextField();
        MEAddEmerRelationship = new javax.swing.JTextField();
        MEAddEmerAddress = new javax.swing.JTextField();
        MEAddEnderPanel = new javax.swing.JPanel();
        MEADDAddEmployeeButton = new javax.swing.JButton();
        MEInformationPanel = new javax.swing.JPanel();
        MEMidPanel3 = new javax.swing.JPanel();
        MEInfoTitleLabel = new javax.swing.JLabel();
        MEInfoBackButton = new javax.swing.JButton();
        MEInfoPersonalInformationPanel = new javax.swing.JPanel();
        MEInfoPIMaritalStatusLabel = new javax.swing.JLabel();
        MEInfoPINameLabel = new javax.swing.JLabel();
        MEInfoPIGenderLabel = new javax.swing.JLabel();
        MEInfoPIBirthdateLabel = new javax.swing.JLabel();
        MEInfoPIAddressLabel = new javax.swing.JLabel();
        MEInfoPIMaritalStatus = new javax.swing.JLabel();
        MEInfoPIName = new javax.swing.JLabel();
        MEInfoPIGender = new javax.swing.JLabel();
        MEInfoPIBirthdate = new javax.swing.JLabel();
        MEInfoPIAddress = new javax.swing.JLabel();
        MEInfoPIMobileNumber = new javax.swing.JLabel();
        MEInfoPIMobileNumberLabel = new javax.swing.JLabel();
        MEInfoContactInformationPanel = new javax.swing.JPanel();
        MEInfoCIDateStartedLabel = new javax.swing.JLabel();
        MEInfoCIEmployeeUIDLabel = new javax.swing.JLabel();
        MEInfoCIEmailLabel = new javax.swing.JLabel();
        MEInfoCIDateStarted = new javax.swing.JLabel();
        MEInfoCIEmployeeUID = new javax.swing.JLabel();
        MEInfoCIEmail = new javax.swing.JLabel();
        MEInfoCIPositionLabel = new javax.swing.JLabel();
        MEInfoCIStatusLabel = new javax.swing.JLabel();
        MEInfoCIAccountTypeLabel = new javax.swing.JLabel();
        MEInfoCIPosition = new javax.swing.JLabel();
        MEInfoCIStatus = new javax.swing.JLabel();
        MEInfoCIAccountType = new javax.swing.JLabel();
        MEInfoCompensationDetailsPanel = new javax.swing.JPanel();
        MEInfoCDBasicPayLabel = new javax.swing.JLabel();
        MEInfoCDBasicPay = new javax.swing.JLabel();
        MEInfoGovIDInformationPanel = new javax.swing.JPanel();
        MEInfoGIDHDMFLabel = new javax.swing.JLabel();
        MEInfoGIDPHICLabel = new javax.swing.JLabel();
        MEInfoGIDSSSLabel = new javax.swing.JLabel();
        MEInfoGIDTINLabel = new javax.swing.JLabel();
        MEInfoGIDHDMF = new javax.swing.JLabel();
        MEInfoGIDPHIC = new javax.swing.JLabel();
        MEInfoGIDTIN = new javax.swing.JLabel();
        MEInfoGIDSSS = new javax.swing.JLabel();
        MEInfoEmegencyContactPanel = new javax.swing.JPanel();
        MEInfoEmerContactPersonLabel = new javax.swing.JLabel();
        MEInfoEmerRelationshipLabel = new javax.swing.JLabel();
        MEInfoEmerAddressLabel = new javax.swing.JLabel();
        MEInfoEmerContactNumbeLabel = new javax.swing.JLabel();
        MEInfoEmerContactPerson = new javax.swing.JLabel();
        MEInfoEmerRelationship = new javax.swing.JLabel();
        MEInfoEmerContactNumbe = new javax.swing.JLabel();
        MEInfoEmerAddress = new javax.swing.JLabel();
        MEInfoUpdateEmployeeButton = new javax.swing.JButton();
        MEUpdatePanel = new javax.swing.JPanel();
        MEMidPanel4 = new javax.swing.JPanel();
        MEUpdateTitleLabel = new javax.swing.JLabel();
        MEUpdateBackButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        MEUpdateFieldsPanel = new javax.swing.JPanel();
        MEUpdateProfileInformation = new javax.swing.JPanel();
        MEUpdatePIFirstNameLabel = new javax.swing.JLabel();
        MEUpdatePIMiddleNameLabel = new javax.swing.JLabel();
        MEUpdatePILastNameLabel = new javax.swing.JLabel();
        MEUpdatePIGenderLabel = new javax.swing.JLabel();
        MEUpdatePIBirthdayLabel = new javax.swing.JLabel();
        MEUpdatePIAddressLabel = new javax.swing.JLabel();
        MEUpdatePIMobileNumberLabel = new javax.swing.JLabel();
        MEUpdatePIMaritalStatusLabel = new javax.swing.JLabel();
        MEUpdatePIFirstName = new javax.swing.JTextField();
        MEUpdatePIMiddleName = new javax.swing.JTextField();
        MEUpdatePILastName = new javax.swing.JTextField();
        MEUpdatePIMale = new javax.swing.JRadioButton();
        MEUpdatePIFemale = new javax.swing.JRadioButton();
        MEUpdatePIBirthYear = new javax.swing.JComboBox<>();
        MEUpdatePIBirthDate = new javax.swing.JComboBox<>();
        MEUpdatePIBirthMonth = new javax.swing.JComboBox<>();
        MEUpdatePIAddress = new javax.swing.JTextField();
        MEUpdatePIMobileNumber = new javax.swing.JTextField();
        MEUpdatePIMaritalStatus = new javax.swing.JComboBox<>();
        MEUpdateConpanyInformation = new javax.swing.JPanel();
        MEUpdateCIEmployeeUIDLabel = new javax.swing.JLabel();
        MEUpdateCIEmailLabel = new javax.swing.JLabel();
        MEUpdateCIPositionLabel = new javax.swing.JLabel();
        MEUpdateCIStatusLabel = new javax.swing.JLabel();
        MEUpdateCIAccountTypeLabel = new javax.swing.JLabel();
        MEUpdateCIDateStartedLabel = new javax.swing.JLabel();
        MEUpdateCIEmail = new javax.swing.JTextField();
        MEUpdateCIPosition = new javax.swing.JTextField();
        MEUpdateCIEmployeeUID = new javax.swing.JTextField();
        MEUpdateCIAccountType = new javax.swing.JComboBox<>();
        MEUpdateCIDateStartMonth = new javax.swing.JComboBox<>();
        MEUpdateCIDateStartDate = new javax.swing.JComboBox<>();
        MEUpdateCIDateStartYear = new javax.swing.JComboBox<>();
        MEUpdateCIStatus = new javax.swing.JComboBox<>();
        MEUpdateCompensationDetailsPanel = new javax.swing.JPanel();
        MEUpdateCIBasicPayLabel = new javax.swing.JLabel();
        MEUpdateCIBasicPay = new javax.swing.JTextField();
        MEUpdateGovIDInformationPanel = new javax.swing.JPanel();
        MEAddHDMFLabel9 = new javax.swing.JLabel();
        MEUpdatePHICLabel = new javax.swing.JLabel();
        MEUpdateSSSLabel = new javax.swing.JLabel();
        MEUpdateTINLabel = new javax.swing.JLabel();
        MEUpdateGIDTIN3 = new javax.swing.JTextField();
        MEUpdateGIDPHIC3 = new javax.swing.JTextField();
        MEUpdateGIDSSS3 = new javax.swing.JTextField();
        MEUpdateGIDHDMF3 = new javax.swing.JTextField();
        MEUpdateGIDHDMF1 = new javax.swing.JTextField();
        MEUpdateGIDHDMF2 = new javax.swing.JTextField();
        MEUpdateHDMFLabel = new javax.swing.JLabel();
        MEAddHDMFLabel11 = new javax.swing.JLabel();
        MEUpdateGIDPHIC2 = new javax.swing.JTextField();
        MEAddHDMFLabel12 = new javax.swing.JLabel();
        MEAddHDMFLabel13 = new javax.swing.JLabel();
        MEUpdateGIDPHIC1 = new javax.swing.JTextField();
        MEUpdateGIDSSS1 = new javax.swing.JTextField();
        MEUpdateGIDSSS2 = new javax.swing.JTextField();
        MEAddHDMFLabel14 = new javax.swing.JLabel();
        MEAddHDMFLabel15 = new javax.swing.JLabel();
        MEUpdateGIDTIN1 = new javax.swing.JTextField();
        MEUpdateGIDTIN2 = new javax.swing.JTextField();
        MEAddHDMFLabel16 = new javax.swing.JLabel();
        MEAddHDMFLabel17 = new javax.swing.JLabel();
        MEUpdateEmegencyContactPanel = new javax.swing.JPanel();
        MEUpdateEmerContactPersonLabel = new javax.swing.JLabel();
        MEUpdateRelationshipLabel = new javax.swing.JLabel();
        MEUpdateAddressLabel = new javax.swing.JLabel();
        MEUpdateContactNumberLabel = new javax.swing.JLabel();
        MEUpdateEmerContactNumber = new javax.swing.JTextField();
        MEUpdateEmerContactPerson = new javax.swing.JTextField();
        MEUpdateEmerRelationship = new javax.swing.JTextField();
        MEUpdateEmerAddress = new javax.swing.JTextField();
        MEUpdateEnderPanel = new javax.swing.JPanel();
        MEUDPATEupdateEmployeeButton = new javax.swing.JButton();
        generatePayslipPanel = new javax.swing.JPanel();
        GPSTopPanel = new javax.swing.JPanel();
        GPTitle = new javax.swing.JLabel();
        GPTopPanel = new javax.swing.JLabel();
        GSMidPanel = new javax.swing.JPanel();
        GPBackButton = new javax.swing.JButton();
        GPSearchField = new javax.swing.JTextField();
        GPSearchButton = new javax.swing.JButton();
        GPSearchLabel = new javax.swing.JLabel();
        GPCardPanel = new javax.swing.JPanel();
        GPTableDisplay = new javax.swing.JPanel();
        GPCheckPayslipButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        GPTable = new javax.swing.JTable();
        GPCheckEmployeePayslipsButton = new javax.swing.JButton();
        GPManageHours = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        GPTimeLogTable = new javax.swing.JTable();
        GPTimeLogDetailsCardPanel = new javax.swing.JPanel();
        GPTimeLogDetailsViewPanel = new javax.swing.JPanel();
        GPTimeLogRenderedHoursLabel = new javax.swing.JLabel();
        GPTimeLogTimeOut = new javax.swing.JLabel();
        GPTimeLogRenderedHours = new javax.swing.JLabel();
        GPTimeLogTimeOutLabel = new javax.swing.JLabel();
        GPTimeLogTimeIn = new javax.swing.JLabel();
        GPTimeLogTimeInLabel = new javax.swing.JLabel();
        GPEmployeeUID = new javax.swing.JLabel();
        GPEmployeeUIDLabel = new javax.swing.JLabel();
        GPTimeLogEditRenderedHoursButton = new javax.swing.JButton();
        GPTimeLogDateLabel1 = new javax.swing.JLabel();
        GPFullNameLabel = new javax.swing.JLabel();
        GPTimeLogDate = new javax.swing.JLabel();
        GPFullName = new javax.swing.JLabel();
        GPTimeLogDetailsUpdatePanel = new javax.swing.JPanel();
        GPTimeLogDateUpdateLabel = new javax.swing.JLabel();
        GPTimeLogTimeInUpdateLabel = new javax.swing.JLabel();
        GPTimeLogTimeOutUpdateLabel = new javax.swing.JLabel();
        GPTimeLogRenderedHoursUpdateLabel = new javax.swing.JLabel();
        GPTimeLogRenderedHoursUpdate = new javax.swing.JTextField();
        GPTimeLogTimeOutUpdate = new javax.swing.JLabel();
        GPTimeLogTimeInUpdate = new javax.swing.JLabel();
        GPTimeLogDateUpdate = new javax.swing.JLabel();
        GPFullNameUpdateLabel = new javax.swing.JLabel();
        GPEmployeeUIDUpdateLabel = new javax.swing.JLabel();
        GPEmployeeUIDUpdate = new javax.swing.JLabel();
        GPFullNameUpdate = new javax.swing.JLabel();
        GPTimeLogUpdateRenderedHoursButton = new javax.swing.JButton();
        GPTimeLogPrintPayslip = new javax.swing.JButton();
        GPManageHoursSearchLabel = new javax.swing.JLabel();
        GPManageHoursResetSearchButton = new javax.swing.JButton();
        GPManageHoursSearchMonth = new javax.swing.JComboBox<>();
        GPManageHoursSearchToDate = new javax.swing.JComboBox<>();
        GPManageHoursSearchYear = new javax.swing.JComboBox<>();
        GPManageHoursSearchFromDate = new javax.swing.JComboBox<>();
        GPManageHoursSearchButton = new javax.swing.JButton();
        GPGeneratorPanel = new javax.swing.JPanel();
        PayslipGeneratorPanel = new javax.swing.JPanel();
        GPGPayslipSummaryPanel = new javax.swing.JPanel();
        GPGenerateNetIncomeLabel = new javax.swing.JLabel();
        GPGenerateNameLabel = new javax.swing.JLabel();
        GPGenerateEmployeeUIDLabel = new javax.swing.JLabel();
        GPGenerateNetIncome = new javax.swing.JLabel();
        GPGenerateName = new javax.swing.JLabel();
        GPGenerateEmployeeUID = new javax.swing.JLabel();
        GPGenerateDailyGrossRateLabel = new javax.swing.JLabel();
        GPGenerateDailyGrossIncomeLabel = new javax.swing.JLabel();
        GPGeneratePeriod = new javax.swing.JLabel();
        GPGenerateDailyGrossRate = new javax.swing.JLabel();
        GPGenerateGrossIncome = new javax.swing.JLabel();
        GPGenerateHoursWorkedLabel = new javax.swing.JLabel();
        GPGenerateHourlyGrossRateLabel = new javax.swing.JLabel();
        GPGenerateHourlyGrossRate = new javax.swing.JLabel();
        GPGeneratePeriodLabel = new javax.swing.JLabel();
        GPGenerateHoursWorked = new javax.swing.JLabel();
        GPGenerateDaysWorkedLabel = new javax.swing.JLabel();
        GPGenerateDaysWorked = new javax.swing.JLabel();
        GPGDeductionPanel = new javax.swing.JPanel();
        GPGenerateTaxLabel = new javax.swing.JLabel();
        GPGeneratePhilhealthLabel = new javax.swing.JLabel();
        GPGeneratePagibig = new javax.swing.JLabel();
        GPGenerateTax = new javax.swing.JLabel();
        GPGeneratePagibigLabel = new javax.swing.JLabel();
        GPGeneratePhilhealth = new javax.swing.JLabel();
        GPGenerateSSSLabel = new javax.swing.JLabel();
        GPGenerateTotalDeductionLabel = new javax.swing.JLabel();
        GPGenerateSSS = new javax.swing.JLabel();
        GPGenerateOtherLoanLabel = new javax.swing.JLabel();
        GPGeneratePagibigLoanLabel = new javax.swing.JLabel();
        GPGenerateSSSLoanLabel = new javax.swing.JLabel();
        GPGenerateOtherLoanField = new javax.swing.JTextField();
        GPGeneratePagibigLoanField = new javax.swing.JTextField();
        GPGenerateSSSLoanField = new javax.swing.JTextField();
        GPGenerateSSSLabel1 = new javax.swing.JLabel();
        GPGenerateTotalDeduction = new javax.swing.JLabel();
        GeneratePayslipButton = new javax.swing.JButton();
        CalculatePayslipButton = new javax.swing.JButton();
        GPGeneratePeriodMonth = new javax.swing.JComboBox<>();
        GPGeneratePeriodFromDate = new javax.swing.JComboBox<>();
        GPGDayWorkedLabel = new javax.swing.JLabel();
        GPGDayWorkedLabel2 = new javax.swing.JLabel();
        GPGeneratePeriodToDate = new javax.swing.JComboBox<>();
        GPGeneratePeriodYear = new javax.swing.JComboBox<>();
        GPGetCompensationInforButton = new javax.swing.JButton();
        GPGeneratePeriodLabel1 = new javax.swing.JLabel();
        GPEmployeePayslipsTablePanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        GPEmployeePayslipsTable = new javax.swing.JTable();
        GPInformationViewPanel = new javax.swing.JPanel();
        payslipPayslipSummaryPanel1 = new javax.swing.JPanel();
        GPPSNetIncome = new javax.swing.JLabel();
        GPPSName = new javax.swing.JLabel();
        GPPSEmployeeUID = new javax.swing.JLabel();
        GPPSPeriod = new javax.swing.JLabel();
        GPPPSHoursWorked = new javax.swing.JLabel();
        GPPPSHourlyGrossRate = new javax.swing.JLabel();
        GPPSDailyGrossIncome = new javax.swing.JLabel();
        GPPSDailyGrossRate = new javax.swing.JLabel();
        GPPSDaysWorked = new javax.swing.JLabel();
        PPSHoursWorkedLabel1 = new javax.swing.JLabel();
        PPSNetIncomeLabel1 = new javax.swing.JLabel();
        PPSNameLabel1 = new javax.swing.JLabel();
        PPSEmployeeUIDLabel1 = new javax.swing.JLabel();
        PPSPeriodLabel1 = new javax.swing.JLabel();
        PPSHourlyGrossRateLabel1 = new javax.swing.JLabel();
        PPSDailyGrossIncomeLabel1 = new javax.swing.JLabel();
        PPSDailyGrossRateLabel2 = new javax.swing.JLabel();
        PPSDaysWorkedLabel1 = new javax.swing.JLabel();
        payslipDeductionPanel1 = new javax.swing.JPanel();
        PDPhilhealthLabel1 = new javax.swing.JLabel();
        GPDPagibig = new javax.swing.JLabel();
        GPDTotalDeduction = new javax.swing.JLabel();
        PDPagibigLabel1 = new javax.swing.JLabel();
        GPDPhilhealth = new javax.swing.JLabel();
        PDSSSLabel3 = new javax.swing.JLabel();
        PDTotalDeductionLabel1 = new javax.swing.JLabel();
        GPDTax = new javax.swing.JLabel();
        PDOtherLoanLabel1 = new javax.swing.JLabel();
        GPDOtherLoan = new javax.swing.JLabel();
        PDPagibigLoanLabel1 = new javax.swing.JLabel();
        PDSSSLoanLabel1 = new javax.swing.JLabel();
        GPDPagibigLoan = new javax.swing.JLabel();
        GPDSSSLoan = new javax.swing.JLabel();
        PDTaxLabel3 = new javax.swing.JLabel();
        GPDSSS = new javax.swing.JLabel();
        GPPaySlipInfoDeletePayslip = new javax.swing.JButton();
        inquiryAndConcernLogPanel = new javax.swing.JPanel();
        ICLTopPanel = new javax.swing.JPanel();
        ICLTitleLabel = new javax.swing.JLabel();
        TopBackground6 = new javax.swing.JLabel();
        CILMidPanel = new javax.swing.JPanel();
        ICLSearchLabel = new javax.swing.JLabel();
        ICLSearchField = new javax.swing.JTextField();
        ICLSearchButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        ICLTable = new javax.swing.JTable();
        personalInformationPanel16 = new javax.swing.JPanel();
        ICLEmployeeUIDLabel = new javax.swing.JLabel();
        ICLNameLabel = new javax.swing.JLabel();
        ICLEmailLabel = new javax.swing.JLabel();
        ICLSubjectLabel = new javax.swing.JLabel();
        ICLStatusLabel = new javax.swing.JLabel();
        ICLDateAndTimeLabel = new javax.swing.JLabel();
        ICLSupportIDLabel = new javax.swing.JLabel();
        ICLMessageLabel = new javax.swing.JLabel();
        ICLMessages = new javax.swing.JLabel();
        ICLEmployeeUID = new javax.swing.JLabel();
        ICLName = new javax.swing.JLabel();
        ICLEmail = new javax.swing.JLabel();
        ICLSubject = new javax.swing.JLabel();
        ICLDateAndTime = new javax.swing.JLabel();
        ICLSupportID = new javax.swing.JLabel();
        ICLStatusButton = new javax.swing.JButton();
        supportPanel = new javax.swing.JPanel();
        supportSubTopPanel = new javax.swing.JPanel();
        welcomeUserLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TopBackground7 = new javax.swing.JLabel();
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
        InvalidUIDLabel = new javax.swing.JLabel();
        InvalidNameLabel = new javax.swing.JLabel();
        InvalidEmailLabel = new javax.swing.JLabel();
        InvalidSubjectLabel = new javax.swing.JLabel();
        InvalidMessageLabel = new javax.swing.JLabel();
        contactSupportSendButton = new javax.swing.JButton();

        profilePopupMenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        profilePopupMenu.setForeground(new java.awt.Color(49, 65, 95));
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                topLoggedFullNameMouseReleased(evt);
            }
        });
        topPanel.add(topLoggedFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 240, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        topPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 10, 30));

        topTimeUpdateLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        topTimeUpdateLabel.setForeground(new java.awt.Color(49, 65, 95));
        topTimeUpdateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topTimeUpdateLabel.setText("EEE, d MMM yyyy | hh:mm:ss aa");
        topTimeUpdateLabel.setToolTipText(time);
        topPanel.add(topTimeUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 230, 30));

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
        leftPanel.add(Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 240, 10));

        manageEmployeeButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        manageEmployeeButton.setForeground(new java.awt.Color(49, 65, 95));
        manageEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/profile-default.png"))); // NOI18N
        manageEmployeeButton.setText("Manage Employees");
        manageEmployeeButton.setBorder(null);
        manageEmployeeButton.setFocusable(false);
        manageEmployeeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageEmployeeButton.setIconTextGap(15);
        manageEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageEmployeeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageEmployeeButtonMouseExited(evt);
            }
        });
        manageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeButtonActionPerformed(evt);
            }
        });
        leftPanel.add(manageEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 40));

        generatePaySlipButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        generatePaySlipButton.setForeground(new java.awt.Color(49, 65, 95));
        generatePaySlipButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/payslip-default.png"))); // NOI18N
        generatePaySlipButton.setText("Generate Pay Slips");
        generatePaySlipButton.setBorder(null);
        generatePaySlipButton.setFocusable(false);
        generatePaySlipButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        generatePaySlipButton.setIconTextGap(15);
        generatePaySlipButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generatePaySlipButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generatePaySlipButtonMouseExited(evt);
            }
        });
        generatePaySlipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePaySlipButtonActionPerformed(evt);
            }
        });
        leftPanel.add(generatePaySlipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 40));

        inquiryLogButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        inquiryLogButton.setForeground(new java.awt.Color(49, 65, 95));
        inquiryLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/time-log-default.png"))); // NOI18N
        inquiryLogButton.setText("Inquiry & Concern Log");
        inquiryLogButton.setBorder(null);
        inquiryLogButton.setFocusable(false);
        inquiryLogButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inquiryLogButton.setIconTextGap(15);
        inquiryLogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inquiryLogButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inquiryLogButtonMouseExited(evt);
            }
        });
        inquiryLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquiryLogButtonActionPerformed(evt);
            }
        });
        leftPanel.add(inquiryLogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 260, 40));
        leftPanel.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 10));

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
        leftPanel.add(supportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 40));

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

        TopBackground.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TopBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TopBackground.setToolTipText("");
        TopBackground.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        profileTopPanel.add(TopBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        profilePanel.add(profileTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        profileMainPanel.setBackground(new java.awt.Color(245, 246, 248));
        profileMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        profileMainPanel.add(profileGovIDInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 460, 160));

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

        profileMainPanel.add(profileEmegencyContactPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 460, 200));

        profileFYILabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        profileFYILabel.setForeground(new java.awt.Color(143, 156, 181));
        profileFYILabel.setText("<html><body><p align='justify'>For updating personal information. Please go to Contact Support section and fill out the form and we'll be in touch as as soon as possible or you can go to the Human Resources Office during office hours.</p></body></html>");
        profileMainPanel.add(profileFYILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 440, 70));

        profilePanel.add(profileMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 630));

        rightPanel.add(profilePanel, "card3");

        timeLogPanel.setBackground(new java.awt.Color(245, 246, 248));
        timeLogPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TLTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        TLTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TLTitleLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        TLTitleLabel.setForeground(new java.awt.Color(49, 65, 95));
        TLTitleLabel.setText("Time Log");
        TLTopPanel.add(TLTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        TopBackground8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TopBackground8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TopBackground8.setToolTipText("");
        TopBackground8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        TLTopPanel.add(TopBackground8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        timeLogPanel.add(TLTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

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
        TLSearchField.getAccessibleContext().setAccessibleName("");

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

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        TLTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time In", "Time Out", "Total Hours", "Overtime Approved"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        timeLogPanel.add(TLTimeLogsDetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 630, 160));

        TLFYI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TLFYI.setForeground(new java.awt.Color(143, 156, 181));
        TLFYI.setText("<html><body><p align='justify'>For overtime approvals and correcting time logs. Please go to Contact Support section and fill out the form and we'll be in touch as as soon as possible or you can go to the Human Resources Office during office hours.</p></body></html>");
        timeLogPanel.add(TLFYI, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 290, 110));

        rightPanel.add(timeLogPanel, "card4");

        payslipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payslipTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        payslipTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payslipTitlePanel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        payslipTitlePanel.setForeground(new java.awt.Color(49, 65, 95));
        payslipTitlePanel.setText("Payslips");
        payslipTopPanel.add(payslipTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        TopBackground2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TopBackground2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TopBackground2.setToolTipText("");
        TopBackground2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        payslipTopPanel.add(TopBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

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

        payslipFYILabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        payslipFYILabel.setForeground(new java.awt.Color(143, 156, 181));
        payslipFYILabel.setText("<html><body><p align='justify'>For salary concerns and issues. Please go to Contact Support section and fill out the form and we'll be in touch as as soon as possible or you can go to the Human Resources Office during office hours.</p></body></html>");
        payslipPanel.add(payslipFYILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 430, -1));

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

        PSTitle.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        PSTitle.setForeground(new java.awt.Color(49, 65, 95));
        PSTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PSTitle.setText("Payslip");
        PayslipForm.add(PSTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, -1));

        payslipPanel.add(PayslipForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 970, 430));

        rightPanel.add(payslipPanel, "card5");

        manageEmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        METopPanel.setBackground(new java.awt.Color(245, 246, 248));
        METopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        METitleLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        METitleLabel2.setForeground(new java.awt.Color(49, 65, 95));
        METitleLabel2.setText("Manage Employees");
        METopPanel.add(METitleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        TopBackground3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TopBackground3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TopBackground3.setToolTipText("");
        TopBackground3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        METopPanel.add(TopBackground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        manageEmployeePanel.add(METopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        MECardPanel.setLayout(new java.awt.CardLayout());

        METablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setBackground(new java.awt.Color(102, 102, 255));
        jScrollPane6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        METable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee UID", "First Name", "Middle Name", "Last Name", "Email", "Position", "Status", "Account Type", "Date Started"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        METable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(METable);
        if (METable.getColumnModel().getColumnCount() > 0) {
            METable.getColumnModel().getColumn(0).setResizable(false);
            METable.getColumnModel().getColumn(1).setResizable(false);
            METable.getColumnModel().getColumn(2).setResizable(false);
            METable.getColumnModel().getColumn(3).setResizable(false);
            METable.getColumnModel().getColumn(4).setResizable(false);
            METable.getColumnModel().getColumn(5).setResizable(false);
            METable.getColumnModel().getColumn(6).setResizable(false);
            METable.getColumnModel().getColumn(7).setResizable(false);
            METable.getColumnModel().getColumn(8).setResizable(false);
        }

        METablePanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 960, 450));

        MECheckInfoButton.setBackground(new java.awt.Color(55, 126, 249));
        MECheckInfoButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MECheckInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        MECheckInfoButton.setText("Check Employee Full Infomation");
        MECheckInfoButton.setBorder(null);
        MECheckInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MECheckInfoButtonActionPerformed(evt);
            }
        });
        METablePanel.add(MECheckInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 210, 40));

        MEMidPanel1.setBackground(new java.awt.Color(55, 126, 249));
        MEMidPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        METableSearchLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        METableSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        METableSearchLabel.setText("Search Employee");
        MEMidPanel1.add(METableSearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 25));

        METableSearchField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        METableSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                METableSearchFieldKeyTyped(evt);
            }
        });
        MEMidPanel1.add(METableSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 370, 25));

        METableSearchButton.setBackground(new java.awt.Color(10, 189, 158));
        METableSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        METableSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        METableSearchButton.setText("Search");
        METableSearchButton.setBorder(null);
        METableSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                METableSearchButtonActionPerformed(evt);
            }
        });
        MEMidPanel1.add(METableSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 100, 25));

        METablePanel.add(MEMidPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        MEUpdateEmployeeButton.setBackground(new java.awt.Color(55, 126, 249));
        MEUpdateEmployeeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        MEUpdateEmployeeButton.setText("Update Employe Information");
        MEUpdateEmployeeButton.setBorder(null);
        MEUpdateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEUpdateEmployeeButtonActionPerformed(evt);
            }
        });
        METablePanel.add(MEUpdateEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 210, 40));

        MEAddEmployeeButton.setBackground(new java.awt.Color(10, 189, 158));
        MEAddEmployeeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        MEAddEmployeeButton.setText("Add Employee");
        MEAddEmployeeButton.setBorder(null);
        MEAddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEAddEmployeeButtonActionPerformed(evt);
            }
        });
        METablePanel.add(MEAddEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 210, 40));

        MEDeleteEmployeeButton.setBackground(new java.awt.Color(235, 87, 87));
        MEDeleteEmployeeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEDeleteEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        MEDeleteEmployeeButton.setText("Delete Employee");
        MEDeleteEmployeeButton.setBorder(null);
        MEDeleteEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDeleteEmployeeButtonActionPerformed(evt);
            }
        });
        METablePanel.add(MEDeleteEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 210, 40));

        MECardPanel.add(METablePanel, "card2");

        MEAddPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEMidPanel2.setBackground(new java.awt.Color(55, 126, 249));
        MEMidPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddTitleLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        MEAddTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        MEAddTitleLabel.setText("Add Employees");
        MEMidPanel2.add(MEAddTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 40));

        MEAddBackButton.setBackground(new java.awt.Color(10, 189, 158));
        MEAddBackButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddBackButton.setForeground(new java.awt.Color(255, 255, 255));
        MEAddBackButton.setText("Back");
        MEAddBackButton.setBorder(null);
        MEAddBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEAddBackButtonActionPerformed(evt);
            }
        });
        MEMidPanel2.add(MEAddBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 40));

        MEAddPanel.add(MEMidPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(20);

        MEAddFieldsPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEAddFieldsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddProfileInformation.setBackground(new java.awt.Color(255, 255, 255));
        MEAddProfileInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEAddProfileInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddPIFirstNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPIFirstNameLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPIFirstNameLabel.setText("First Name: ");
        MEAddProfileInformation.add(MEAddPIFirstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        MEAddPIMiddleNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPIMiddleNameLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPIMiddleNameLabel.setText("Middle Name: ");
        MEAddProfileInformation.add(MEAddPIMiddleNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, -1));

        MEAddPILastNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPILastNameLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPILastNameLabel.setText("Last Name: ");
        MEAddProfileInformation.add(MEAddPILastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 120, -1));

        MEAddPIGenderLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPIGenderLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPIGenderLabel.setText("Gender:");
        MEAddProfileInformation.add(MEAddPIGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        MEAddPIBirthdayLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPIBirthdayLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPIBirthdayLabel.setText("Birthdate:");
        MEAddProfileInformation.add(MEAddPIBirthdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 260, -1));

        MEAddPIAddressLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPIAddressLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPIAddressLabel.setText("Complete Address:");
        MEAddProfileInformation.add(MEAddPIAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 400, -1));

        MEAddPIMobileNumberLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPIMobileNumberLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPIMobileNumberLabel.setText("Mobile Number / Telephone Number:");
        MEAddProfileInformation.add(MEAddPIMobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 400, -1));

        MEAddPIMaritalStatusLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPIMaritalStatusLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPIMaritalStatusLabel.setText("Martial Status:");
        MEAddProfileInformation.add(MEAddPIMaritalStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, -1));

        MEAddPIFirstName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddProfileInformation.add(MEAddPIFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        MEAddPIMiddleName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddProfileInformation.add(MEAddPIMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, 30));

        MEAddPILastName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddProfileInformation.add(MEAddPILastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 30));

        MEGenderRadio.add(MEAddPIMale);
        MEAddPIMale.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        MEAddPIMale.setText("Male");
        MEAddProfileInformation.add(MEAddPIMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 30));

        MEGenderRadio.add(MEAddPIFemale);
        MEAddPIFemale.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        MEAddPIFemale.setText("Female");
        MEAddProfileInformation.add(MEAddPIFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 30));

        MEAddPIBirthYear.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddPIBirthYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        MEAddProfileInformation.add(MEAddPIBirthYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 70, 30));

        MEAddPIBirthDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddPIBirthDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        MEAddProfileInformation.add(MEAddPIBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 70, 30));

        MEAddPIBirthMonth.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddPIBirthMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MEAddProfileInformation.add(MEAddPIBirthMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 30));

        MEAddPIAddress.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddProfileInformation.add(MEAddPIAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 30));

        MEAddPIMobileNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddPIMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddPIMobileNumberKeyTyped(evt);
            }
        });
        MEAddProfileInformation.add(MEAddPIMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 30));

        MEAddPIMaritalStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddPIMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Single", "Married", "Divorced", "Separated", "Widowed" }));
        MEAddProfileInformation.add(MEAddPIMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, 30));

        MEAddFieldsPanel.add(MEAddProfileInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, 340));

        MEAddConpanyInformation.setBackground(new java.awt.Color(255, 255, 255));
        MEAddConpanyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Company Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEAddConpanyInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddCIEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddCIEmployeeUIDLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddCIEmployeeUIDLabel.setText("Employee UID Number (Auto Generated)");
        MEAddConpanyInformation.add(MEAddCIEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEAddCIEmailLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddCIEmailLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddCIEmailLabel.setText("Company Email");
        MEAddConpanyInformation.add(MEAddCIEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        MEAddCIPositionLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddCIPositionLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddCIPositionLabel.setText("Position");
        MEAddConpanyInformation.add(MEAddCIPositionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        MEAddCIStatusLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddCIStatusLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddCIStatusLabel.setText("Status");
        MEAddConpanyInformation.add(MEAddCIStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        MEAddCIAccountTypeLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddCIAccountTypeLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddCIAccountTypeLabel.setText("Account Type");
        MEAddConpanyInformation.add(MEAddCIAccountTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        MEAddCIDateStartedLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddCIDateStartedLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddCIDateStartedLabel.setText("Date Started");
        MEAddConpanyInformation.add(MEAddCIDateStartedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        MEAddCIEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddConpanyInformation.add(MEAddCIEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 30));

        MEAddCIPosition.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddConpanyInformation.add(MEAddCIPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 30));

        MEAddCIEmployeeUID.setEditable(false);
        MEAddCIEmployeeUID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddConpanyInformation.add(MEAddCIEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 30));

        MEAddCIAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ADMIN", "HR", "ACCOUNTING", "MANAGER", "REGULAR" }));
        MEAddConpanyInformation.add(MEAddCIAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, 30));

        MEAddCIDateStartMonth.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddCIDateStartMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MEAddConpanyInformation.add(MEAddCIDateStartMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 30));

        MEAddCIDateStartDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddCIDateStartDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        MEAddConpanyInformation.add(MEAddCIDateStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 110, 30));

        MEAddCIDateStartYear.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddCIDateStartYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        MEAddConpanyInformation.add(MEAddCIDateStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 110, 30));

        MEAddCIStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Active", "Inactive" }));
        MEAddConpanyInformation.add(MEAddCIStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 30));

        MEAddFieldsPanel.add(MEAddConpanyInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 450, 400));

        MEAddCompensationDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEAddCompensationDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Compensation Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEAddCompensationDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddCIBasicPayLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddCIBasicPayLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddCIBasicPayLabel.setText("Basic Pay");
        MEAddCompensationDetailsPanel.add(MEAddCIBasicPayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEAddCIBasicPay.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddCIBasicPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddCIBasicPayKeyTyped(evt);
            }
        });
        MEAddCompensationDetailsPanel.add(MEAddCIBasicPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 30));

        MEAddFieldsPanel.add(MEAddCompensationDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 450, 100));

        MEAddGovIDInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEAddGovIDInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Government ID Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEAddGovIDInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddHDMFLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 20, 30));

        MEAddPHICLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddPHICLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddPHICLabel.setText("PhilHealth Identification Number");
        MEAddGovIDInformationPanel.add(MEAddPHICLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        MEAddSSSLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddSSSLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddSSSLabel.setText("Social Security System Number");
        MEAddGovIDInformationPanel.add(MEAddSSSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        MEAddTINLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddTINLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddTINLabel.setText("Taxpayer Identification Number");
        MEAddGovIDInformationPanel.add(MEAddTINLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        MEAddGIDTIN3.setDocument(new JTextFieldLimit(3));
        MEAddGIDTIN3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDTIN3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDTIN3KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDTIN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 120, 30));

        MEAddGIDPHIC3.setDocument(new JTextFieldLimit(1));
        MEAddGIDPHIC3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDPHIC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDPHIC3KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDPHIC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 50, 30));

        MEAddGIDSSS3.setDocument(new JTextFieldLimit(1));
        MEAddGIDSSS3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDSSS3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDSSS3KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDSSS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 50, 30));

        MEAddGIDHDMF3.setDocument(new JTextFieldLimit(4));
        MEAddGIDHDMF3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDHDMF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDHDMF3KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDHDMF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 30));

        MEAddGIDHDMF1.setDocument(new JTextFieldLimit(4));
        MEAddGIDHDMF1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDHDMF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDHDMF1KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDHDMF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        MEAddGIDHDMF2.setDocument(new JTextFieldLimit(4));
        MEAddGIDHDMF2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDHDMF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDHDMF2KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDHDMF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, 30));

        MEAddHDMFLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel1.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel1.setText("Pag-IBIG MID Number");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEAddHDMFLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel2.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel2.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 20, 30));

        MEAddGIDPHIC2.setDocument(new JTextFieldLimit(9));
        MEAddGIDPHIC2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDPHIC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDPHIC2KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDPHIC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 30));

        MEAddHDMFLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel3.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel3.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 20, 30));

        MEAddHDMFLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel4.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel4.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 20, 30));

        MEAddGIDPHIC1.setDocument(new JTextFieldLimit(2));
        MEAddGIDPHIC1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDPHIC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDPHIC1KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDPHIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        MEAddGIDSSS1.setDocument(new JTextFieldLimit(2));
        MEAddGIDSSS1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDSSS1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDSSS1KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDSSS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 30));

        MEAddGIDSSS2.setDocument(new JTextFieldLimit(7));
        MEAddGIDSSS2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDSSS2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDSSS2KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDSSS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

        MEAddHDMFLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel5.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel5.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 20, 30));

        MEAddHDMFLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel6.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel6.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 20, 30));

        MEAddGIDTIN1.setDocument(new JTextFieldLimit(3));
        MEAddGIDTIN1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDTIN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDTIN1KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDTIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 30));

        MEAddGIDTIN2.setDocument(new JTextFieldLimit(3));
        MEAddGIDTIN2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddGIDTIN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddGIDTIN2KeyTyped(evt);
            }
        });
        MEAddGovIDInformationPanel.add(MEAddGIDTIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 120, 30));

        MEAddHDMFLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel7.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel7.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 20, 30));

        MEAddHDMFLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel8.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel8.setText("-");
        MEAddGovIDInformationPanel.add(MEAddHDMFLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 20, 30));

        MEAddFieldsPanel.add(MEAddGovIDInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 450, 280));

        MEAddEmegencyContactPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEAddEmegencyContactPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " In Case Of Emergency", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEAddEmegencyContactPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddContactPersonLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddContactPersonLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddContactPersonLabel.setText("Contact Person");
        MEAddEmegencyContactPanel.add(MEAddContactPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEAddRelationshipLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddRelationshipLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddRelationshipLabel.setText("Relationship");
        MEAddEmegencyContactPanel.add(MEAddRelationshipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        MEAddAddressLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddAddressLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddAddressLabel.setText("Address");
        MEAddEmegencyContactPanel.add(MEAddAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        MEAddContactNumberLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddContactNumberLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEAddContactNumberLabel.setText("Contact Number");
        MEAddEmegencyContactPanel.add(MEAddContactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        MEAddEmerContactNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddEmerContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEAddEmerContactNumberKeyTyped(evt);
            }
        });
        MEAddEmegencyContactPanel.add(MEAddEmerContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 30));

        MEAddEmerContactPerson.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddEmegencyContactPanel.add(MEAddEmerContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 30));

        MEAddEmerRelationship.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddEmegencyContactPanel.add(MEAddEmerRelationship, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 30));

        MEAddEmerAddress.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEAddEmegencyContactPanel.add(MEAddEmerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 30));

        MEAddFieldsPanel.add(MEAddEmegencyContactPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 450, 280));

        MEAddEnderPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEAddFieldsPanel.add(MEAddEnderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 990, 970, 20));

        jScrollPane3.setViewportView(MEAddFieldsPanel);

        MEAddPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 980, 460));

        MEADDAddEmployeeButton.setBackground(new java.awt.Color(10, 189, 158));
        MEADDAddEmployeeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEADDAddEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        MEADDAddEmployeeButton.setText("Add Employee");
        MEADDAddEmployeeButton.setBorder(null);
        MEADDAddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEADDAddEmployeeButtonActionPerformed(evt);
            }
        });
        MEAddPanel.add(MEADDAddEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 300, 40));

        MECardPanel.add(MEAddPanel, "card3");

        MEInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEMidPanel3.setBackground(new java.awt.Color(55, 126, 249));
        MEMidPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEInfoTitleLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        MEInfoTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        MEInfoTitleLabel.setText("Employee General Information");
        MEMidPanel3.add(MEInfoTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 40));

        MEInfoBackButton.setBackground(new java.awt.Color(10, 189, 158));
        MEInfoBackButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEInfoBackButton.setForeground(new java.awt.Color(255, 255, 255));
        MEInfoBackButton.setText("Back");
        MEInfoBackButton.setBorder(null);
        MEInfoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEInfoBackButtonActionPerformed(evt);
            }
        });
        MEMidPanel3.add(MEInfoBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 40));

        MEInformationPanel.add(MEMidPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        MEInfoPersonalInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEInfoPersonalInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEInfoPersonalInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEInfoPIMaritalStatusLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoPIMaritalStatusLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoPIMaritalStatusLabel.setText("Martial Status:");
        MEInfoPersonalInformationPanel.add(MEInfoPIMaritalStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 30));

        MEInfoPINameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoPINameLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoPINameLabel.setText("Name: ");
        MEInfoPersonalInformationPanel.add(MEInfoPINameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        MEInfoPIGenderLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoPIGenderLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoPIGenderLabel.setText("Gender:");
        MEInfoPersonalInformationPanel.add(MEInfoPIGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        MEInfoPIBirthdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoPIBirthdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoPIBirthdateLabel.setText("Birthdate:");
        MEInfoPersonalInformationPanel.add(MEInfoPIBirthdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        MEInfoPIAddressLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoPIAddressLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoPIAddressLabel.setText("Address:");
        MEInfoPersonalInformationPanel.add(MEInfoPIAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        MEInfoPIMaritalStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoPIMaritalStatus.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoPersonalInformationPanel.add(MEInfoPIMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 280, 30));

        MEInfoPIName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoPIName.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoPersonalInformationPanel.add(MEInfoPIName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        MEInfoPIGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoPIGender.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoPersonalInformationPanel.add(MEInfoPIGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 280, 30));

        MEInfoPIBirthdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoPIBirthdate.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoPersonalInformationPanel.add(MEInfoPIBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 280, 30));

        MEInfoPIAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoPIAddress.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoPIAddress.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MEInfoPersonalInformationPanel.add(MEInfoPIAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 118, 280, 50));

        MEInfoPIMobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoPIMobileNumber.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoPersonalInformationPanel.add(MEInfoPIMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 280, 30));

        MEInfoPIMobileNumberLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoPIMobileNumberLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoPIMobileNumberLabel.setText("Mobile Number:");
        MEInfoPersonalInformationPanel.add(MEInfoPIMobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        MEInformationPanel.add(MEInfoPersonalInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 460, 270));

        MEInfoContactInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEInfoContactInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Company Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEInfoContactInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEInfoCIDateStartedLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoCIDateStartedLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoCIDateStartedLabel.setText("Date Started");
        MEInfoContactInformationPanel.add(MEInfoCIDateStartedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        MEInfoCIEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoCIEmployeeUIDLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoCIEmployeeUIDLabel.setText("Employee UID:");
        MEInfoContactInformationPanel.add(MEInfoCIEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        MEInfoCIEmailLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoCIEmailLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoCIEmailLabel.setText("Company Email:");
        MEInfoContactInformationPanel.add(MEInfoCIEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        MEInfoCIDateStarted.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoCIDateStarted.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoContactInformationPanel.add(MEInfoCIDateStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 280, 30));

        MEInfoCIEmployeeUID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoCIEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoContactInformationPanel.add(MEInfoCIEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        MEInfoCIEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoCIEmail.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoContactInformationPanel.add(MEInfoCIEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 280, 30));

        MEInfoCIPositionLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoCIPositionLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoCIPositionLabel.setText("Position");
        MEInfoContactInformationPanel.add(MEInfoCIPositionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        MEInfoCIStatusLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoCIStatusLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoCIStatusLabel.setText("Status:");
        MEInfoContactInformationPanel.add(MEInfoCIStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        MEInfoCIAccountTypeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoCIAccountTypeLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoCIAccountTypeLabel.setText("Account Type:");
        MEInfoContactInformationPanel.add(MEInfoCIAccountTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        MEInfoCIPosition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoCIPosition.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoContactInformationPanel.add(MEInfoCIPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 280, 30));

        MEInfoCIStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoCIStatus.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoContactInformationPanel.add(MEInfoCIStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 280, 30));

        MEInfoCIAccountType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoCIAccountType.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoContactInformationPanel.add(MEInfoCIAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 280, 30));

        MEInformationPanel.add(MEInfoContactInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 460, 210));

        MEInfoCompensationDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEInfoCompensationDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Compensation Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEInfoCompensationDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEInfoCDBasicPayLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoCDBasicPayLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoCDBasicPayLabel.setText("Gross Pay");
        MEInfoCompensationDetailsPanel.add(MEInfoCDBasicPayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        MEInfoCDBasicPay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoCDBasicPay.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoCompensationDetailsPanel.add(MEInfoCDBasicPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        MEInformationPanel.add(MEInfoCompensationDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 460, 60));

        MEInfoGovIDInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEInfoGovIDInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Government ID Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEInfoGovIDInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEInfoGIDHDMFLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoGIDHDMFLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoGIDHDMFLabel.setText("Pag-IBIG MID Number:");
        MEInfoGovIDInformationPanel.add(MEInfoGIDHDMFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        MEInfoGIDPHICLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoGIDPHICLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoGIDPHICLabel.setText("PhilHealth Identification Number:");
        MEInfoGovIDInformationPanel.add(MEInfoGIDPHICLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 30));

        MEInfoGIDSSSLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoGIDSSSLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoGIDSSSLabel.setText("Social Security System Number:");
        MEInfoGovIDInformationPanel.add(MEInfoGIDSSSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 30));

        MEInfoGIDTINLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoGIDTINLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoGIDTINLabel.setText("Taxpayer Identification Number:");
        MEInfoGovIDInformationPanel.add(MEInfoGIDTINLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 30));

        MEInfoGIDHDMF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoGIDHDMF.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoGovIDInformationPanel.add(MEInfoGIDHDMF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, 30));

        MEInfoGIDPHIC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoGIDPHIC.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoGovIDInformationPanel.add(MEInfoGIDPHIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 230, 30));

        MEInfoGIDTIN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoGIDTIN.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoGovIDInformationPanel.add(MEInfoGIDTIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 230, 30));

        MEInfoGIDSSS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoGIDSSS.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoGovIDInformationPanel.add(MEInfoGIDSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 230, 30));

        MEInformationPanel.add(MEInfoGovIDInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 460, 160));

        MEInfoEmegencyContactPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEInfoEmegencyContactPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " In Case Of Emergency", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEInfoEmegencyContactPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEInfoEmerContactPersonLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoEmerContactPersonLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoEmerContactPersonLabel.setText("Contact Person:");
        MEInfoEmegencyContactPanel.add(MEInfoEmerContactPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        MEInfoEmerRelationshipLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoEmerRelationshipLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoEmerRelationshipLabel.setText("Relationship");
        MEInfoEmegencyContactPanel.add(MEInfoEmerRelationshipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        MEInfoEmerAddressLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoEmerAddressLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoEmerAddressLabel.setText("Address:");
        MEInfoEmegencyContactPanel.add(MEInfoEmerAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        MEInfoEmerContactNumbeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEInfoEmerContactNumbeLabel.setForeground(new java.awt.Color(143, 156, 181));
        MEInfoEmerContactNumbeLabel.setText("Contact Number:");
        MEInfoEmegencyContactPanel.add(MEInfoEmerContactNumbeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        MEInfoEmerContactPerson.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoEmerContactPerson.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoEmegencyContactPanel.add(MEInfoEmerContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 280, 30));

        MEInfoEmerRelationship.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoEmerRelationship.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoEmegencyContactPanel.add(MEInfoEmerRelationship, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 280, 30));

        MEInfoEmerContactNumbe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoEmerContactNumbe.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoEmegencyContactPanel.add(MEInfoEmerContactNumbe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 280, 30));

        MEInfoEmerAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MEInfoEmerAddress.setForeground(new java.awt.Color(49, 65, 95));
        MEInfoEmerAddress.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MEInfoEmegencyContactPanel.add(MEInfoEmerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 88, 280, 50));

        MEInformationPanel.add(MEInfoEmegencyContactPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 460, 200));

        MEInfoUpdateEmployeeButton.setBackground(new java.awt.Color(55, 126, 249));
        MEInfoUpdateEmployeeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEInfoUpdateEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        MEInfoUpdateEmployeeButton.setText("Update Employe Information");
        MEInfoUpdateEmployeeButton.setBorder(null);
        MEInfoUpdateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEInfoUpdateEmployeeButtonActionPerformed(evt);
            }
        });
        MEInformationPanel.add(MEInfoUpdateEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 300, 40));

        MECardPanel.add(MEInformationPanel, "card4");

        MEUpdatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEMidPanel4.setBackground(new java.awt.Color(55, 126, 249));
        MEMidPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEUpdateTitleLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        MEUpdateTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        MEUpdateTitleLabel.setText("Update Employee Infomation");
        MEMidPanel4.add(MEUpdateTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 40));

        MEUpdateBackButton.setBackground(new java.awt.Color(10, 189, 158));
        MEUpdateBackButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateBackButton.setForeground(new java.awt.Color(255, 255, 255));
        MEUpdateBackButton.setText("Back");
        MEUpdateBackButton.setBorder(null);
        MEUpdateBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEUpdateBackButtonActionPerformed(evt);
            }
        });
        MEMidPanel4.add(MEUpdateBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 40));

        MEUpdatePanel.add(MEMidPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.getVerticalScrollBar().setUnitIncrement(20);

        MEUpdateFieldsPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEUpdateFieldsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEUpdateProfileInformation.setBackground(new java.awt.Color(255, 255, 255));
        MEUpdateProfileInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEUpdateProfileInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEUpdatePIFirstNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePIFirstNameLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePIFirstNameLabel.setText("First Name: ");
        MEUpdateProfileInformation.add(MEUpdatePIFirstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        MEUpdatePIMiddleNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePIMiddleNameLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePIMiddleNameLabel.setText("Middle Name: ");
        MEUpdateProfileInformation.add(MEUpdatePIMiddleNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, -1));

        MEUpdatePILastNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePILastNameLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePILastNameLabel.setText("Last Name: ");
        MEUpdateProfileInformation.add(MEUpdatePILastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 120, -1));

        MEUpdatePIGenderLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePIGenderLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePIGenderLabel.setText("Gender:");
        MEUpdateProfileInformation.add(MEUpdatePIGenderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        MEUpdatePIBirthdayLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePIBirthdayLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePIBirthdayLabel.setText("Birthdate:");
        MEUpdateProfileInformation.add(MEUpdatePIBirthdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 260, -1));

        MEUpdatePIAddressLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePIAddressLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePIAddressLabel.setText("Complete Address:");
        MEUpdateProfileInformation.add(MEUpdatePIAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 400, -1));

        MEUpdatePIMobileNumberLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePIMobileNumberLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePIMobileNumberLabel.setText("Mobile Number / Telephone Number:");
        MEUpdateProfileInformation.add(MEUpdatePIMobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 400, -1));

        MEUpdatePIMaritalStatusLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePIMaritalStatusLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePIMaritalStatusLabel.setText("Martial Status:");
        MEUpdateProfileInformation.add(MEUpdatePIMaritalStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, -1));

        MEUpdatePIFirstName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateProfileInformation.add(MEUpdatePIFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        MEUpdatePIMiddleName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateProfileInformation.add(MEUpdatePIMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, 30));

        MEUpdatePILastName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateProfileInformation.add(MEUpdatePILastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 30));

        MEGenderRadio.add(MEUpdatePIMale);
        MEUpdatePIMale.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        MEUpdatePIMale.setText("Male");
        MEUpdateProfileInformation.add(MEUpdatePIMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 30));

        MEGenderRadio.add(MEUpdatePIFemale);
        MEUpdatePIFemale.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        MEUpdatePIFemale.setText("Female");
        MEUpdateProfileInformation.add(MEUpdatePIFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 30));

        MEUpdatePIBirthYear.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdatePIBirthYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        MEUpdateProfileInformation.add(MEUpdatePIBirthYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 70, 30));

        MEUpdatePIBirthDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdatePIBirthDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        MEUpdateProfileInformation.add(MEUpdatePIBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 70, 30));

        MEUpdatePIBirthMonth.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdatePIBirthMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MEUpdateProfileInformation.add(MEUpdatePIBirthMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 30));

        MEUpdatePIAddress.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateProfileInformation.add(MEUpdatePIAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 30));

        MEUpdatePIMobileNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdatePIMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdatePIMobileNumberKeyTyped(evt);
            }
        });
        MEUpdateProfileInformation.add(MEUpdatePIMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 30));

        MEUpdatePIMaritalStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdatePIMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Single", "Married", "Divorced", "Separated", "Widowed" }));
        MEUpdateProfileInformation.add(MEUpdatePIMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, 30));

        MEUpdateFieldsPanel.add(MEUpdateProfileInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, 340));

        MEUpdateConpanyInformation.setBackground(new java.awt.Color(255, 255, 255));
        MEUpdateConpanyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Company Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEUpdateConpanyInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEUpdateCIEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateCIEmployeeUIDLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateCIEmployeeUIDLabel.setText("Employee UID Number");
        MEUpdateConpanyInformation.add(MEUpdateCIEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEUpdateCIEmailLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateCIEmailLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateCIEmailLabel.setText("Company Email");
        MEUpdateConpanyInformation.add(MEUpdateCIEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        MEUpdateCIPositionLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateCIPositionLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateCIPositionLabel.setText("Position");
        MEUpdateConpanyInformation.add(MEUpdateCIPositionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        MEUpdateCIStatusLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateCIStatusLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateCIStatusLabel.setText("Status");
        MEUpdateConpanyInformation.add(MEUpdateCIStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        MEUpdateCIAccountTypeLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateCIAccountTypeLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateCIAccountTypeLabel.setText("Account Type");
        MEUpdateConpanyInformation.add(MEUpdateCIAccountTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        MEUpdateCIDateStartedLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateCIDateStartedLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateCIDateStartedLabel.setText("Date Started");
        MEUpdateConpanyInformation.add(MEUpdateCIDateStartedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        MEUpdateCIEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateConpanyInformation.add(MEUpdateCIEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 30));

        MEUpdateCIPosition.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateConpanyInformation.add(MEUpdateCIPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 30));

        MEUpdateCIEmployeeUID.setEditable(false);
        MEUpdateCIEmployeeUID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateConpanyInformation.add(MEUpdateCIEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 30));

        MEUpdateCIAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ADMIN", "HR", "ACCOUNTING", "MANAGER", "REGULAR" }));
        MEUpdateConpanyInformation.add(MEUpdateCIAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, 30));

        MEUpdateCIDateStartMonth.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateCIDateStartMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MEUpdateConpanyInformation.add(MEUpdateCIDateStartMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 30));

        MEUpdateCIDateStartDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateCIDateStartDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        MEUpdateConpanyInformation.add(MEUpdateCIDateStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 110, 30));

        MEUpdateCIDateStartYear.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateCIDateStartYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        MEUpdateConpanyInformation.add(MEUpdateCIDateStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 110, 30));

        MEUpdateCIStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Active", "Inactive" }));
        MEUpdateConpanyInformation.add(MEUpdateCIStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 30));

        MEUpdateFieldsPanel.add(MEUpdateConpanyInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 450, 400));

        MEUpdateCompensationDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEUpdateCompensationDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Compensation Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEUpdateCompensationDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEUpdateCIBasicPayLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateCIBasicPayLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateCIBasicPayLabel.setText("Basic Pay");
        MEUpdateCompensationDetailsPanel.add(MEUpdateCIBasicPayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEUpdateCIBasicPay.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateCIBasicPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateCIBasicPayKeyTyped(evt);
            }
        });
        MEUpdateCompensationDetailsPanel.add(MEUpdateCIBasicPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 30));

        MEUpdateFieldsPanel.add(MEUpdateCompensationDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 450, 100));

        MEUpdateGovIDInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEUpdateGovIDInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Government ID Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEUpdateGovIDInformationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEAddHDMFLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel9.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel9.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 20, 30));

        MEUpdatePHICLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdatePHICLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdatePHICLabel.setText("PhilHealth Identification Number");
        MEUpdateGovIDInformationPanel.add(MEUpdatePHICLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        MEUpdateSSSLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateSSSLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateSSSLabel.setText("Social Security System Number");
        MEUpdateGovIDInformationPanel.add(MEUpdateSSSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        MEUpdateTINLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateTINLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateTINLabel.setText("Taxpayer Identification Number");
        MEUpdateGovIDInformationPanel.add(MEUpdateTINLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        MEUpdateGIDTIN3.setDocument(new JTextFieldLimit(3));
        MEUpdateGIDTIN3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDTIN3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDTIN3KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDTIN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 120, 30));

        MEUpdateGIDPHIC3.setDocument(new JTextFieldLimit(1));
        MEUpdateGIDPHIC3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDPHIC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDPHIC3KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDPHIC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 50, 30));

        MEUpdateGIDSSS3.setDocument(new JTextFieldLimit(1));
        MEUpdateGIDSSS3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDSSS3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDSSS3KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDSSS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 50, 30));

        MEUpdateGIDHDMF3.setDocument(new JTextFieldLimit(4));
        MEUpdateGIDHDMF3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDHDMF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDHDMF3KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDHDMF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 30));

        MEUpdateGIDHDMF1.setDocument(new JTextFieldLimit(4));
        MEUpdateGIDHDMF1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDHDMF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDHDMF1KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDHDMF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        MEUpdateGIDHDMF2.setDocument(new JTextFieldLimit(4));
        MEUpdateGIDHDMF2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDHDMF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDHDMF2KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDHDMF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, 30));

        MEUpdateHDMFLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateHDMFLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateHDMFLabel.setText("Pag-IBIG MID Number");
        MEUpdateGovIDInformationPanel.add(MEUpdateHDMFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEAddHDMFLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel11.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel11.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 20, 30));

        MEUpdateGIDPHIC2.setDocument(new JTextFieldLimit(9));
        MEUpdateGIDPHIC2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDPHIC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDPHIC2KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDPHIC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 30));

        MEAddHDMFLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel12.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel12.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 20, 30));

        MEAddHDMFLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel13.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel13.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 20, 30));

        MEUpdateGIDPHIC1.setDocument(new JTextFieldLimit(2));
        MEUpdateGIDPHIC1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDPHIC1.setToolTipText("");
        MEUpdateGIDPHIC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDPHIC1KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDPHIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        MEUpdateGIDSSS1.setDocument(new JTextFieldLimit(2));
        MEUpdateGIDSSS1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDSSS1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDSSS1KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDSSS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 30));

        MEUpdateGIDSSS2.setDocument(new JTextFieldLimit(7));
        MEUpdateGIDSSS2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDSSS2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDSSS2KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDSSS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

        MEAddHDMFLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel14.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel14.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 20, 30));

        MEAddHDMFLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel15.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel15.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 20, 30));

        MEUpdateGIDTIN1.setDocument(new JTextFieldLimit(3));
        MEUpdateGIDTIN1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDTIN1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDTIN1KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDTIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 30));

        MEUpdateGIDTIN2.setDocument(new JTextFieldLimit(3));
        MEUpdateGIDTIN2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateGIDTIN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateGIDTIN2KeyTyped(evt);
            }
        });
        MEUpdateGovIDInformationPanel.add(MEUpdateGIDTIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 120, 30));

        MEAddHDMFLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel16.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel16.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 20, 30));

        MEAddHDMFLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEAddHDMFLabel17.setForeground(new java.awt.Color(49, 65, 95));
        MEAddHDMFLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MEAddHDMFLabel17.setText("-");
        MEUpdateGovIDInformationPanel.add(MEAddHDMFLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 20, 30));

        MEUpdateFieldsPanel.add(MEUpdateGovIDInformationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 450, 280));

        MEUpdateEmegencyContactPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEUpdateEmegencyContactPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " In Case Of Emergency", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        MEUpdateEmegencyContactPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MEUpdateEmerContactPersonLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateEmerContactPersonLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateEmerContactPersonLabel.setText("Contact Person");
        MEUpdateEmegencyContactPanel.add(MEUpdateEmerContactPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        MEUpdateRelationshipLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateRelationshipLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateRelationshipLabel.setText("Relationship");
        MEUpdateEmegencyContactPanel.add(MEUpdateRelationshipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        MEUpdateAddressLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateAddressLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateAddressLabel.setText("Address");
        MEUpdateEmegencyContactPanel.add(MEUpdateAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        MEUpdateContactNumberLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUpdateContactNumberLabel.setForeground(new java.awt.Color(49, 65, 95));
        MEUpdateContactNumberLabel.setText("Contact Number");
        MEUpdateEmegencyContactPanel.add(MEUpdateContactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        MEUpdateEmerContactNumber.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateEmerContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MEUpdateEmerContactNumberKeyTyped(evt);
            }
        });
        MEUpdateEmegencyContactPanel.add(MEUpdateEmerContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 30));

        MEUpdateEmerContactPerson.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateEmegencyContactPanel.add(MEUpdateEmerContactPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 30));

        MEUpdateEmerRelationship.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateEmegencyContactPanel.add(MEUpdateEmerRelationship, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 30));

        MEUpdateEmerAddress.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        MEUpdateEmegencyContactPanel.add(MEUpdateEmerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 30));

        MEUpdateFieldsPanel.add(MEUpdateEmegencyContactPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 450, 280));

        MEUpdateEnderPanel.setBackground(new java.awt.Color(255, 255, 255));
        MEUpdateFieldsPanel.add(MEUpdateEnderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 990, 970, 20));

        jScrollPane4.setViewportView(MEUpdateFieldsPanel);

        MEUpdatePanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 980, 460));

        MEUDPATEupdateEmployeeButton.setBackground(new java.awt.Color(10, 189, 158));
        MEUDPATEupdateEmployeeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        MEUDPATEupdateEmployeeButton.setForeground(new java.awt.Color(255, 255, 255));
        MEUDPATEupdateEmployeeButton.setText("Update Employee Information");
        MEUDPATEupdateEmployeeButton.setBorder(null);
        MEUDPATEupdateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEUDPATEupdateEmployeeButtonActionPerformed(evt);
            }
        });
        MEUpdatePanel.add(MEUDPATEupdateEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 300, 40));

        MECardPanel.add(MEUpdatePanel, "card5");

        manageEmployeePanel.add(MECardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 630));

        rightPanel.add(manageEmployeePanel, "card7");

        generatePayslipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPSTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        GPSTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPTitle.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        GPTitle.setForeground(new java.awt.Color(49, 65, 95));
        GPTitle.setText("Generate Payslip");
        GPSTopPanel.add(GPTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        GPTopPanel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTopPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        GPTopPanel.setToolTipText("");
        GPTopPanel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        GPSTopPanel.add(GPTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        generatePayslipPanel.add(GPSTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        GSMidPanel.setBackground(new java.awt.Color(55, 126, 249));
        GSMidPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPBackButton.setBackground(new java.awt.Color(10, 189, 158));
        GPBackButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPBackButton.setForeground(new java.awt.Color(255, 255, 255));
        GPBackButton.setText("Back");
        GPBackButton.setBorder(null);
        GPBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPBackButtonActionPerformed(evt);
            }
        });
        GSMidPanel.add(GPBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 25));

        GPSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GPSearchFieldKeyTyped(evt);
            }
        });
        GSMidPanel.add(GPSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 360, 25));

        GPSearchButton.setBackground(new java.awt.Color(10, 189, 158));
        GPSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        GPSearchButton.setText("Search");
        GPSearchButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        GPSearchButton.setFocusable(false);
        GPSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPSearchButtonActionPerformed(evt);
            }
        });
        GSMidPanel.add(GPSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 80, 25));

        GPSearchLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        GPSearchLabel.setText("Search Employee");
        GSMidPanel.add(GPSearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 25));

        generatePayslipPanel.add(GSMidPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 60));

        GPCardPanel.setLayout(new java.awt.CardLayout());

        GPTableDisplay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPCheckPayslipButton.setBackground(new java.awt.Color(55, 126, 249));
        GPCheckPayslipButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPCheckPayslipButton.setForeground(new java.awt.Color(255, 255, 255));
        GPCheckPayslipButton.setText("Generate Payslips");
        GPCheckPayslipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPCheckPayslipButtonActionPerformed(evt);
            }
        });
        GPTableDisplay.add(GPCheckPayslipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 260, 40));

        jScrollPane2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        GPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee UID", "First Name", "Middle Name", "Last Name", "Email", "Position", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GPTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(GPTable);
        if (GPTable.getColumnModel().getColumnCount() > 0) {
            GPTable.getColumnModel().getColumn(0).setResizable(false);
            GPTable.getColumnModel().getColumn(1).setResizable(false);
            GPTable.getColumnModel().getColumn(2).setResizable(false);
            GPTable.getColumnModel().getColumn(3).setResizable(false);
            GPTable.getColumnModel().getColumn(4).setResizable(false);
            GPTable.getColumnModel().getColumn(5).setResizable(false);
            GPTable.getColumnModel().getColumn(6).setResizable(false);
        }

        GPTableDisplay.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 960, 450));

        GPCheckEmployeePayslipsButton.setBackground(new java.awt.Color(55, 126, 249));
        GPCheckEmployeePayslipsButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPCheckEmployeePayslipsButton.setForeground(new java.awt.Color(255, 255, 255));
        GPCheckEmployeePayslipsButton.setText("Show Employee Payslips");
        GPCheckEmployeePayslipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPCheckEmployeePayslipsButtonActionPerformed(evt);
            }
        });
        GPTableDisplay.add(GPCheckEmployeePayslipsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 260, 40));

        GPCardPanel.add(GPTableDisplay, "card2");

        GPManageHours.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        GPTimeLogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date and Time", "Time In", "Time Out", "Total Hours", "Overtime Approved"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GPTimeLogTable.getTableHeader().setReorderingAllowed(false);
        GPTimeLogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GPTimeLogTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(GPTimeLogTable);
        if (GPTimeLogTable.getColumnModel().getColumnCount() > 0) {
            GPTimeLogTable.getColumnModel().getColumn(0).setResizable(false);
            GPTimeLogTable.getColumnModel().getColumn(1).setResizable(false);
            GPTimeLogTable.getColumnModel().getColumn(2).setResizable(false);
            GPTimeLogTable.getColumnModel().getColumn(3).setResizable(false);
            GPTimeLogTable.getColumnModel().getColumn(4).setResizable(false);
        }

        GPManageHours.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 590, 480));

        GPTimeLogDetailsCardPanel.setLayout(new java.awt.CardLayout());

        GPTimeLogDetailsViewPanel.setBackground(new java.awt.Color(255, 255, 255));
        GPTimeLogDetailsViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Time Log Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        GPTimeLogDetailsViewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPTimeLogRenderedHoursLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogRenderedHoursLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogRenderedHoursLabel.setText("Rendered Hours:");
        GPTimeLogDetailsViewPanel.add(GPTimeLogRenderedHoursLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        GPTimeLogTimeOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPTimeLogTimeOut.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsViewPanel.add(GPTimeLogTimeOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 30));

        GPTimeLogRenderedHours.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPTimeLogRenderedHours.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsViewPanel.add(GPTimeLogRenderedHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 30));

        GPTimeLogTimeOutLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogTimeOutLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogTimeOutLabel.setText("Time Out");
        GPTimeLogDetailsViewPanel.add(GPTimeLogTimeOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        GPTimeLogTimeIn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPTimeLogTimeIn.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsViewPanel.add(GPTimeLogTimeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 30));

        GPTimeLogTimeInLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogTimeInLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogTimeInLabel.setText("Time In:");
        GPTimeLogDetailsViewPanel.add(GPTimeLogTimeInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        GPEmployeeUID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsViewPanel.add(GPEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 30));

        GPEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPEmployeeUIDLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPEmployeeUIDLabel.setText("Employee UID");
        GPTimeLogDetailsViewPanel.add(GPEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        GPTimeLogEditRenderedHoursButton.setBackground(new java.awt.Color(55, 126, 249));
        GPTimeLogEditRenderedHoursButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPTimeLogEditRenderedHoursButton.setForeground(new java.awt.Color(255, 255, 255));
        GPTimeLogEditRenderedHoursButton.setText("Edit Employee Time Log");
        GPTimeLogEditRenderedHoursButton.setFocusable(false);
        GPTimeLogEditRenderedHoursButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPTimeLogEditRenderedHoursButtonActionPerformed(evt);
            }
        });
        GPTimeLogDetailsViewPanel.add(GPTimeLogEditRenderedHoursButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, 50));

        GPTimeLogDateLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogDateLabel1.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogDateLabel1.setText("Date");
        GPTimeLogDetailsViewPanel.add(GPTimeLogDateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        GPFullNameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPFullNameLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPFullNameLabel.setText("Full Name");
        GPTimeLogDetailsViewPanel.add(GPFullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        GPTimeLogDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPTimeLogDate.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsViewPanel.add(GPTimeLogDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 200, 30));

        GPFullName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPFullName.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsViewPanel.add(GPFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 200, 30));

        GPTimeLogDetailsCardPanel.add(GPTimeLogDetailsViewPanel, "card2");

        GPTimeLogDetailsUpdatePanel.setBackground(new java.awt.Color(255, 255, 255));
        GPTimeLogDetailsUpdatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Time Log Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        GPTimeLogDetailsUpdatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPTimeLogDateUpdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogDateUpdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogDateUpdateLabel.setText("Date");
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogDateUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        GPTimeLogTimeInUpdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogTimeInUpdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogTimeInUpdateLabel.setText("Time In:");
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogTimeInUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        GPTimeLogTimeOutUpdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogTimeOutUpdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogTimeOutUpdateLabel.setText("Time Out");
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogTimeOutUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        GPTimeLogRenderedHoursUpdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPTimeLogRenderedHoursUpdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPTimeLogRenderedHoursUpdateLabel.setText("Rendered Hours:");
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogRenderedHoursUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        GPTimeLogRenderedHoursUpdate.setDocument(new JTextFieldLimit(2));
        GPTimeLogRenderedHoursUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GPTimeLogRenderedHoursUpdateKeyTyped(evt);
            }
        });
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogRenderedHoursUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 30));

        GPTimeLogTimeOutUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPTimeLogTimeOutUpdate.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogTimeOutUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 30));

        GPTimeLogTimeInUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPTimeLogTimeInUpdate.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogTimeInUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 30));

        GPTimeLogDateUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPTimeLogDateUpdate.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogDateUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 200, 30));

        GPFullNameUpdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPFullNameUpdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPFullNameUpdateLabel.setText("Full Name");
        GPTimeLogDetailsUpdatePanel.add(GPFullNameUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        GPEmployeeUIDUpdateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPEmployeeUIDUpdateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPEmployeeUIDUpdateLabel.setText("Employee UID");
        GPTimeLogDetailsUpdatePanel.add(GPEmployeeUIDUpdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        GPEmployeeUIDUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPEmployeeUIDUpdate.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsUpdatePanel.add(GPEmployeeUIDUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 30));

        GPFullNameUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPFullNameUpdate.setForeground(new java.awt.Color(49, 65, 95));
        GPTimeLogDetailsUpdatePanel.add(GPFullNameUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 200, 30));

        GPTimeLogUpdateRenderedHoursButton.setBackground(new java.awt.Color(10, 189, 158));
        GPTimeLogUpdateRenderedHoursButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPTimeLogUpdateRenderedHoursButton.setForeground(new java.awt.Color(255, 255, 255));
        GPTimeLogUpdateRenderedHoursButton.setText("Update Employee Time Log");
        GPTimeLogUpdateRenderedHoursButton.setFocusable(false);
        GPTimeLogUpdateRenderedHoursButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPTimeLogUpdateRenderedHoursButtonActionPerformed(evt);
            }
        });
        GPTimeLogDetailsUpdatePanel.add(GPTimeLogUpdateRenderedHoursButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, 50));

        GPTimeLogDetailsCardPanel.add(GPTimeLogDetailsUpdatePanel, "card3");

        GPManageHours.add(GPTimeLogDetailsCardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 380, 290));

        GPTimeLogPrintPayslip.setBackground(new java.awt.Color(55, 126, 249));
        GPTimeLogPrintPayslip.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPTimeLogPrintPayslip.setForeground(new java.awt.Color(255, 255, 255));
        GPTimeLogPrintPayslip.setText("Make Payslip");
        GPTimeLogPrintPayslip.setFocusable(false);
        GPTimeLogPrintPayslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPTimeLogPrintPayslipActionPerformed(evt);
            }
        });
        GPManageHours.add(GPTimeLogPrintPayslip, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 340, 50));

        GPManageHoursSearchLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPManageHoursSearchLabel.setText("Search Date:");
        GPManageHours.add(GPManageHoursSearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        GPManageHoursResetSearchButton.setBackground(new java.awt.Color(235, 87, 87));
        GPManageHoursResetSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPManageHoursResetSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        GPManageHoursResetSearchButton.setText("Reset Search");
        GPManageHoursResetSearchButton.setFocusable(false);
        GPManageHoursResetSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPManageHoursResetSearchButtonActionPerformed(evt);
            }
        });
        GPManageHours.add(GPManageHoursResetSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 120, 30));

        GPManageHoursSearchMonth.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPManageHoursSearchMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        GPManageHours.add(GPManageHoursSearchMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 30));

        GPManageHoursSearchToDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPManageHoursSearchToDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        GPManageHours.add(GPManageHoursSearchToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, 30));

        GPManageHoursSearchYear.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPManageHoursSearchYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        GPManageHours.add(GPManageHoursSearchYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 70, 30));

        GPManageHoursSearchFromDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPManageHoursSearchFromDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        GPManageHours.add(GPManageHoursSearchFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 100, 30));

        GPManageHoursSearchButton.setBackground(new java.awt.Color(10, 189, 158));
        GPManageHoursSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPManageHoursSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        GPManageHoursSearchButton.setText("Search Date");
        GPManageHoursSearchButton.setFocusable(false);
        GPManageHoursSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPManageHoursSearchButtonActionPerformed(evt);
            }
        });
        GPManageHours.add(GPManageHoursSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 120, 30));

        GPCardPanel.add(GPManageHours, "card3");

        GPGeneratorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PayslipGeneratorPanel.setBackground(new java.awt.Color(255, 255, 255));
        PayslipGeneratorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPGPayslipSummaryPanel.setBackground(new java.awt.Color(255, 255, 255));
        GPGPayslipSummaryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Payslip Summary", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        GPGPayslipSummaryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPGenerateNetIncomeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateNetIncomeLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateNetIncomeLabel.setText("Net Income:");
        GPGPayslipSummaryPanel.add(GPGenerateNetIncomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 30));

        GPGenerateNameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateNameLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateNameLabel.setText("Name:");
        GPGPayslipSummaryPanel.add(GPGenerateNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        GPGenerateEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateEmployeeUIDLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateEmployeeUIDLabel.setText("Employee UID:");
        GPGPayslipSummaryPanel.add(GPGenerateEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        GPGenerateNetIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateNetIncome.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateNetIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, 30));

        GPGenerateName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateName.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 30));

        GPGenerateEmployeeUID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 30));

        GPGenerateDailyGrossRateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateDailyGrossRateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateDailyGrossRateLabel.setText("Daily Gross Rate:");
        GPGPayslipSummaryPanel.add(GPGenerateDailyGrossRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        GPGenerateDailyGrossIncomeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateDailyGrossIncomeLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateDailyGrossIncomeLabel.setText("Gross Income:");
        GPGPayslipSummaryPanel.add(GPGenerateDailyGrossIncomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 30));

        GPGeneratePeriod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGeneratePeriod.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGeneratePeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 30));

        GPGenerateDailyGrossRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateDailyGrossRate.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateDailyGrossRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 30));

        GPGenerateGrossIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateGrossIncome.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateGrossIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, 30));

        GPGenerateHoursWorkedLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateHoursWorkedLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateHoursWorkedLabel.setText("Hours Worked:");
        GPGPayslipSummaryPanel.add(GPGenerateHoursWorkedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        GPGenerateHourlyGrossRateLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateHourlyGrossRateLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateHourlyGrossRateLabel.setText("Hourly Gross Rate:");
        GPGPayslipSummaryPanel.add(GPGenerateHourlyGrossRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        GPGenerateHourlyGrossRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateHourlyGrossRate.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateHourlyGrossRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

        GPGeneratePeriodLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePeriodLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGeneratePeriodLabel.setText("Pay Period:");
        GPGPayslipSummaryPanel.add(GPGeneratePeriodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        GPGenerateHoursWorked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateHoursWorked.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateHoursWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 30));

        GPGenerateDaysWorkedLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateDaysWorkedLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateDaysWorkedLabel.setText("Days Worked:");
        GPGPayslipSummaryPanel.add(GPGenerateDaysWorkedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        GPGenerateDaysWorked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateDaysWorked.setForeground(new java.awt.Color(49, 65, 95));
        GPGPayslipSummaryPanel.add(GPGenerateDaysWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 30));

        PayslipGeneratorPanel.add(GPGPayslipSummaryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 450, 300));

        GPGDeductionPanel.setBackground(new java.awt.Color(255, 255, 255));
        GPGDeductionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deductions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        GPGDeductionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPGenerateTaxLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateTaxLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateTaxLabel.setText("Tax:");
        GPGDeductionPanel.add(GPGenerateTaxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        GPGeneratePhilhealthLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePhilhealthLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGeneratePhilhealthLabel.setText("PHIC:");
        GPGDeductionPanel.add(GPGeneratePhilhealthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        GPGeneratePagibig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGeneratePagibig.setForeground(new java.awt.Color(49, 65, 95));
        GPGDeductionPanel.add(GPGeneratePagibig, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, 30));

        GPGenerateTax.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateTax.setForeground(new java.awt.Color(49, 65, 95));
        GPGDeductionPanel.add(GPGenerateTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, 30));

        GPGeneratePagibigLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePagibigLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGeneratePagibigLabel.setText("PAGIBIG:");
        GPGDeductionPanel.add(GPGeneratePagibigLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        GPGeneratePhilhealth.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGeneratePhilhealth.setForeground(new java.awt.Color(49, 65, 95));
        GPGDeductionPanel.add(GPGeneratePhilhealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 30));

        GPGenerateSSSLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateSSSLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateSSSLabel.setText("SSS:");
        GPGDeductionPanel.add(GPGenerateSSSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        GPGenerateTotalDeductionLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPGenerateTotalDeductionLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateTotalDeductionLabel.setText("Total Deductions:");
        GPGDeductionPanel.add(GPGenerateTotalDeductionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        GPGenerateSSS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateSSS.setForeground(new java.awt.Color(49, 65, 95));
        GPGDeductionPanel.add(GPGenerateSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, 30));

        GPGenerateOtherLoanLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateOtherLoanLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateOtherLoanLabel.setText("Other Loan:");
        GPGDeductionPanel.add(GPGenerateOtherLoanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 90, 30));

        GPGeneratePagibigLoanLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePagibigLoanLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGeneratePagibigLoanLabel.setText("PAGIBIG Loan:");
        GPGDeductionPanel.add(GPGeneratePagibigLoanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 30));

        GPGenerateSSSLoanLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateSSSLoanLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateSSSLoanLabel.setText("SSS Loan:");
        GPGDeductionPanel.add(GPGenerateSSSLoanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 90, 30));

        GPGenerateOtherLoanField.setText("0");
        GPGDeductionPanel.add(GPGenerateOtherLoanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 90, 30));

        GPGeneratePagibigLoanField.setText("0");
        GPGDeductionPanel.add(GPGeneratePagibigLoanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, 30));

        GPGenerateSSSLoanField.setText("0");
        GPGDeductionPanel.add(GPGenerateSSSLoanField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 90, 30));

        GPGenerateSSSLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGenerateSSSLabel1.setForeground(new java.awt.Color(143, 156, 181));
        GPGenerateSSSLabel1.setText("SSS:");
        GPGDeductionPanel.add(GPGenerateSSSLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        GPGenerateTotalDeduction.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPGenerateTotalDeduction.setForeground(new java.awt.Color(49, 65, 95));
        GPGDeductionPanel.add(GPGenerateTotalDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 90, 30));

        PayslipGeneratorPanel.add(GPGDeductionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 450, 200));

        GeneratePayslipButton.setBackground(new java.awt.Color(10, 189, 158));
        GeneratePayslipButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GeneratePayslipButton.setForeground(new java.awt.Color(255, 255, 255));
        GeneratePayslipButton.setText("Generate Pay Slip");
        GeneratePayslipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratePayslipButtonActionPerformed(evt);
            }
        });
        PayslipGeneratorPanel.add(GeneratePayslipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 320, 40));

        CalculatePayslipButton.setBackground(new java.awt.Color(55, 126, 249));
        CalculatePayslipButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CalculatePayslipButton.setForeground(new java.awt.Color(255, 255, 255));
        CalculatePayslipButton.setText("Recalculate Total Pay");
        CalculatePayslipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculatePayslipButtonActionPerformed(evt);
            }
        });
        PayslipGeneratorPanel.add(CalculatePayslipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 320, 40));

        GPGeneratePeriodMonth.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePeriodMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        PayslipGeneratorPanel.add(GPGeneratePeriodMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));

        GPGeneratePeriodFromDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePeriodFromDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        PayslipGeneratorPanel.add(GPGeneratePeriodFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, 30));

        GPGDayWorkedLabel.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        GPGDayWorkedLabel.setForeground(new java.awt.Color(143, 156, 181));
        GPGDayWorkedLabel.setText("To Date:");
        PayslipGeneratorPanel.add(GPGDayWorkedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 70, -1));

        GPGDayWorkedLabel2.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        GPGDayWorkedLabel2.setForeground(new java.awt.Color(143, 156, 181));
        GPGDayWorkedLabel2.setText("From Date:");
        PayslipGeneratorPanel.add(GPGDayWorkedLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 70, -1));

        GPGeneratePeriodToDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePeriodToDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        PayslipGeneratorPanel.add(GPGeneratePeriodToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 70, 30));

        GPGeneratePeriodYear.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPGeneratePeriodYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        PayslipGeneratorPanel.add(GPGeneratePeriodYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 90, 30));

        GPGetCompensationInforButton.setBackground(new java.awt.Color(55, 126, 249));
        GPGetCompensationInforButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPGetCompensationInforButton.setForeground(new java.awt.Color(255, 255, 255));
        GPGetCompensationInforButton.setText("Generate Details");
        GPGetCompensationInforButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPGetCompensationInforButtonActionPerformed(evt);
            }
        });
        PayslipGeneratorPanel.add(GPGetCompensationInforButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 210, 30));

        GPGeneratePeriodLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPGeneratePeriodLabel1.setForeground(new java.awt.Color(49, 65, 95));
        GPGeneratePeriodLabel1.setText("Pay Period:");
        PayslipGeneratorPanel.add(GPGeneratePeriodLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 30));

        GPGeneratorPanel.add(PayslipGeneratorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 960, 510));

        GPCardPanel.add(GPGeneratorPanel, "card4");

        GPEmployeePayslipsTablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPEmployeePayslipsTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        GPEmployeePayslipsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee UID", "First Name", "Middle Name", "Last Name", "Pay Period", "Days Worked", "Hours Worked", "Hourly Gross Rate", "Daily Gross Rate", "Gross Income", "Net Income", "PAGIBIG", "PHIC", "SSS", "Tax", "PAGIBIG Loan", "SSS Loan", "Other Loan", "Total Deduction"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GPEmployeePayslipsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        GPEmployeePayslipsTable.getTableHeader().setReorderingAllowed(false);
        GPEmployeePayslipsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GPEmployeePayslipsTableMouseReleased(evt);
            }
        });
        jScrollPane9.setViewportView(GPEmployeePayslipsTable);
        if (GPEmployeePayslipsTable.getColumnModel().getColumnCount() > 0) {
            GPEmployeePayslipsTable.getColumnModel().getColumn(0).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(1).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(2).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(3).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(4).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            GPEmployeePayslipsTable.getColumnModel().getColumn(5).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(6).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(7).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(8).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(8).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(9).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(9).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(10).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(10).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(11).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(11).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(12).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(12).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(13).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(13).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(14).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(15).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(15).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(16).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(16).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(17).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(17).setPreferredWidth(100);
            GPEmployeePayslipsTable.getColumnModel().getColumn(18).setResizable(false);
            GPEmployeePayslipsTable.getColumnModel().getColumn(18).setPreferredWidth(100);
        }

        GPEmployeePayslipsTablePanel.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 17, 980, 180));

        GPInformationViewPanel.setBackground(new java.awt.Color(255, 255, 255));
        GPInformationViewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payslipPayslipSummaryPanel1.setBackground(new java.awt.Color(255, 255, 255));
        payslipPayslipSummaryPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Payslip Summary", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        payslipPayslipSummaryPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GPPSNetIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPSNetIncome.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPSNetIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, 30));

        GPPSName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPSName.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 30));

        GPPSEmployeeUID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPSEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPSEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 30));

        GPPSPeriod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPSPeriod.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPSPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 30));

        GPPPSHoursWorked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPPSHoursWorked.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPPSHoursWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 30));

        GPPPSHourlyGrossRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPPSHourlyGrossRate.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPPSHourlyGrossRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 30));

        GPPSDailyGrossIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPSDailyGrossIncome.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPSDailyGrossIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, 30));

        GPPSDailyGrossRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPSDailyGrossRate.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPSDailyGrossRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 30));

        GPPSDaysWorked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPPSDaysWorked.setForeground(new java.awt.Color(49, 65, 95));
        payslipPayslipSummaryPanel1.add(GPPSDaysWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 30));

        PPSHoursWorkedLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSHoursWorkedLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSHoursWorkedLabel1.setText("Hours Worked:");
        payslipPayslipSummaryPanel1.add(PPSHoursWorkedLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        PPSNetIncomeLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSNetIncomeLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSNetIncomeLabel1.setText("Net Income:");
        payslipPayslipSummaryPanel1.add(PPSNetIncomeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 30));

        PPSNameLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSNameLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSNameLabel1.setText("Name:");
        payslipPayslipSummaryPanel1.add(PPSNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        PPSEmployeeUIDLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSEmployeeUIDLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSEmployeeUIDLabel1.setText("Employee UID:");
        payslipPayslipSummaryPanel1.add(PPSEmployeeUIDLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));

        PPSPeriodLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSPeriodLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSPeriodLabel1.setText("Pay Period:");
        payslipPayslipSummaryPanel1.add(PPSPeriodLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        PPSHourlyGrossRateLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSHourlyGrossRateLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSHourlyGrossRateLabel1.setText("Hourly Gross Rate:");
        payslipPayslipSummaryPanel1.add(PPSHourlyGrossRateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 30));

        PPSDailyGrossIncomeLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSDailyGrossIncomeLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSDailyGrossIncomeLabel1.setText("Gross Income:");
        payslipPayslipSummaryPanel1.add(PPSDailyGrossIncomeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 30));

        PPSDailyGrossRateLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSDailyGrossRateLabel2.setForeground(new java.awt.Color(143, 156, 181));
        PPSDailyGrossRateLabel2.setText("Daily Gross Rate:");
        payslipPayslipSummaryPanel1.add(PPSDailyGrossRateLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        PPSDaysWorkedLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PPSDaysWorkedLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PPSDaysWorkedLabel1.setText("Days Worked:");
        payslipPayslipSummaryPanel1.add(PPSDaysWorkedLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        GPInformationViewPanel.add(payslipPayslipSummaryPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 320));

        payslipDeductionPanel1.setBackground(new java.awt.Color(255, 255, 255));
        payslipDeductionPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deductions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        payslipDeductionPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PDPhilhealthLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDPhilhealthLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PDPhilhealthLabel1.setText("PHIC:");
        payslipDeductionPanel1.add(PDPhilhealthLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        GPDPagibig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDPagibig.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDPagibig, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, 30));

        GPDTotalDeduction.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDTotalDeduction.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDTotalDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 30));

        PDPagibigLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDPagibigLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PDPagibigLabel1.setText("PAGIBIG:");
        payslipDeductionPanel1.add(PDPagibigLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        GPDPhilhealth.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDPhilhealth.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDPhilhealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, 30));

        PDSSSLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDSSSLabel3.setForeground(new java.awt.Color(143, 156, 181));
        PDSSSLabel3.setText("SSS:");
        payslipDeductionPanel1.add(PDSSSLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        PDTotalDeductionLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        PDTotalDeductionLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PDTotalDeductionLabel1.setText("Total Deductions:");
        payslipDeductionPanel1.add(PDTotalDeductionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        GPDTax.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDTax.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 80, 30));

        PDOtherLoanLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDOtherLoanLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PDOtherLoanLabel1.setText("Other Loan:");
        payslipDeductionPanel1.add(PDOtherLoanLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 90, 30));

        GPDOtherLoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDOtherLoan.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDOtherLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 100, 30));

        PDPagibigLoanLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDPagibigLoanLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PDPagibigLoanLabel1.setText("PAGIBIG Loan:");
        payslipDeductionPanel1.add(PDPagibigLoanLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 90, 30));

        PDSSSLoanLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDSSSLoanLabel1.setForeground(new java.awt.Color(143, 156, 181));
        PDSSSLoanLabel1.setText("SSS Loan:");
        payslipDeductionPanel1.add(PDSSSLoanLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 90, 30));

        GPDPagibigLoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDPagibigLoan.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDPagibigLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, 30));

        GPDSSSLoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDSSSLoan.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDSSSLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 30));

        PDTaxLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PDTaxLabel3.setForeground(new java.awt.Color(143, 156, 181));
        PDTaxLabel3.setText("SSS:");
        payslipDeductionPanel1.add(PDTaxLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        GPDSSS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GPDSSS.setForeground(new java.awt.Color(49, 65, 95));
        payslipDeductionPanel1.add(GPDSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, 30));

        GPInformationViewPanel.add(payslipDeductionPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 480, 190));

        GPPaySlipInfoDeletePayslip.setBackground(new java.awt.Color(235, 87, 87));
        GPPaySlipInfoDeletePayslip.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        GPPaySlipInfoDeletePayslip.setForeground(new java.awt.Color(255, 255, 255));
        GPPaySlipInfoDeletePayslip.setText("Delete Payslip");
        GPPaySlipInfoDeletePayslip.setFocusable(false);
        GPPaySlipInfoDeletePayslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPPaySlipInfoDeletePayslipActionPerformed(evt);
            }
        });
        GPInformationViewPanel.add(GPPaySlipInfoDeletePayslip, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 210, 40));

        GPEmployeePayslipsTablePanel.add(GPInformationViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 980, 340));

        GPCardPanel.add(GPEmployeePayslipsTablePanel, "card5");

        generatePayslipPanel.add(GPCardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1020, 570));

        rightPanel.add(generatePayslipPanel, "card8");

        inquiryAndConcernLogPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ICLTopPanel.setBackground(new java.awt.Color(245, 246, 248));
        ICLTopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ICLTitleLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        ICLTitleLabel.setForeground(new java.awt.Color(49, 65, 95));
        ICLTitleLabel.setText("Inquiry & Concern Log");
        ICLTopPanel.add(ICLTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        TopBackground6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TopBackground6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TopBackground6.setToolTipText("");
        TopBackground6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ICLTopPanel.add(TopBackground6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        inquiryAndConcernLogPanel.add(ICLTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

        CILMidPanel.setBackground(new java.awt.Color(55, 126, 249));
        CILMidPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ICLSearchLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ICLSearchLabel.setForeground(new java.awt.Color(255, 255, 255));
        ICLSearchLabel.setText("Search Inquiries and Concern");
        CILMidPanel.add(ICLSearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 25));

        ICLSearchField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ICLSearchFieldKeyPressed(evt);
            }
        });
        CILMidPanel.add(ICLSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 370, 25));

        ICLSearchButton.setBackground(new java.awt.Color(10, 189, 158));
        ICLSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ICLSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        ICLSearchButton.setText("Search");
        ICLSearchButton.setBorder(null);
        ICLSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICLSearchButtonActionPerformed(evt);
            }
        });
        CILMidPanel.add(ICLSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, 25));

        inquiryAndConcernLogPanel.add(CILMidPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1020, 60));

        jScrollPane8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        ICLTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Support ID", "Employee UID", "First Name", "Last Name", "Email", "Subject", "Message", "Date", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ICLTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ICLTable.getTableHeader().setReorderingAllowed(false);
        ICLTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ICLTableFocusLost(evt);
            }
        });
        ICLTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ICLTableMouseClicked(evt);
            }
        });
        ICLTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ICLTableKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(ICLTable);
        if (ICLTable.getColumnModel().getColumnCount() > 0) {
            ICLTable.getColumnModel().getColumn(0).setResizable(false);
            ICLTable.getColumnModel().getColumn(1).setResizable(false);
            ICLTable.getColumnModel().getColumn(2).setResizable(false);
            ICLTable.getColumnModel().getColumn(3).setResizable(false);
            ICLTable.getColumnModel().getColumn(4).setResizable(false);
            ICLTable.getColumnModel().getColumn(5).setResizable(false);
            ICLTable.getColumnModel().getColumn(6).setResizable(false);
            ICLTable.getColumnModel().getColumn(7).setResizable(false);
            ICLTable.getColumnModel().getColumn(8).setResizable(false);
            ICLTable.getColumnModel().getColumn(9).setResizable(false);
        }

        inquiryAndConcernLogPanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 960, 220));

        personalInformationPanel16.setBackground(new java.awt.Color(255, 255, 255));
        personalInformationPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inquiry & Concern Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(49, 65, 95))); // NOI18N
        personalInformationPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ICLEmployeeUIDLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLEmployeeUIDLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLEmployeeUIDLabel.setText("Employee UID:");
        personalInformationPanel16.add(ICLEmployeeUIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 30));

        ICLNameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLNameLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLNameLabel.setText("Name:");
        personalInformationPanel16.add(ICLNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, 30));

        ICLEmailLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLEmailLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLEmailLabel.setText("Email:");
        personalInformationPanel16.add(ICLEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 30));

        ICLSubjectLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLSubjectLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLSubjectLabel.setText("Subject:");
        personalInformationPanel16.add(ICLSubjectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 30));

        ICLStatusLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLStatusLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLStatusLabel.setText("Status:");
        personalInformationPanel16.add(ICLStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 30));

        ICLDateAndTimeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLDateAndTimeLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLDateAndTimeLabel.setText("Date and Time:");
        personalInformationPanel16.add(ICLDateAndTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));

        ICLSupportIDLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLSupportIDLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLSupportIDLabel.setText("Support ID:");
        personalInformationPanel16.add(ICLSupportIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 30));

        ICLMessageLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ICLMessageLabel.setForeground(new java.awt.Color(143, 156, 181));
        ICLMessageLabel.setText("Message:");
        personalInformationPanel16.add(ICLMessageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 130, 30));

        ICLMessages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ICLMessages.setForeground(new java.awt.Color(49, 65, 95));
        ICLMessages.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        personalInformationPanel16.add(ICLMessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 530, 200));

        ICLEmployeeUID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ICLEmployeeUID.setForeground(new java.awt.Color(49, 65, 95));
        personalInformationPanel16.add(ICLEmployeeUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, 30));

        ICLName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ICLName.setForeground(new java.awt.Color(49, 65, 95));
        personalInformationPanel16.add(ICLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 220, 30));

        ICLEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ICLEmail.setForeground(new java.awt.Color(49, 65, 95));
        personalInformationPanel16.add(ICLEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, 30));

        ICLSubject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ICLSubject.setForeground(new java.awt.Color(49, 65, 95));
        personalInformationPanel16.add(ICLSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 220, 30));

        ICLDateAndTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ICLDateAndTime.setForeground(new java.awt.Color(49, 65, 95));
        personalInformationPanel16.add(ICLDateAndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 220, 30));

        ICLSupportID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ICLSupportID.setForeground(new java.awt.Color(49, 65, 95));
        personalInformationPanel16.add(ICLSupportID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 220, 30));

        ICLStatusButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ICLStatusButton.setBorder(null);
        ICLStatusButton.setEnabled(false);
        ICLStatusButton.setFocusable(false);
        ICLStatusButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ICLStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICLStatusButtonActionPerformed(evt);
            }
        });
        personalInformationPanel16.add(ICLStatusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 30));

        inquiryAndConcernLogPanel.add(personalInformationPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 960, 290));

        rightPanel.add(inquiryAndConcernLogPanel, "card9");

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

        TopBackground7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TopBackground7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Assets/1937.jpg"))); // NOI18N
        TopBackground7.setToolTipText("");
        TopBackground7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        supportSubTopPanel.add(TopBackground7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 120));

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

        CSFirstNameLabel.setFont(new java.awt.Font("Inter", 0, 11)); // NOI18N
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

        CSLastNameLabel.setFont(new java.awt.Font("Inter", 0, 11)); // NOI18N
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
        CSMessage.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        CSMessage.setLineWrap(true);
        CSMessage.setRows(5);
        CSMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CSMessageFocusGained(evt);
            }
        });
        CSMessageScroll.setViewportView(CSMessage);

        supportPanel.add(CSMessageScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 520, 210));

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

        rightPanel.add(supportPanel, "card6");

        getContentPane().add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 1020, 750));

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
        LoggedInUser.showCurrentLoggedIn();
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

    private void homeProfilePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseEntered
        homeProfilePanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homeProfilePanelMouseEntered

    private void homeProfilePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseExited
        homeProfilePanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homeProfilePanelMouseExited

    private void homeProfilePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseReleased
        homeProfilePanel.setBackground(new java.awt.Color(41, 117, 249));
    }//GEN-LAST:event_homeProfilePanelMouseReleased

    private void homeProfilePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMousePressed
        homeProfilePanel.setBackground(new java.awt.Color(7, 95, 247));
    }//GEN-LAST:event_homeProfilePanelMousePressed

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

    private void topLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topLogoMouseClicked
        changeCard(homePanel);
    }//GEN-LAST:event_topLogoMouseClicked

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

    private void homeProfilePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeProfilePanelMouseClicked
        changeCard(profilePanel);
        homeProfilePanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homeProfilePanelMouseClicked

    private void homeTimeLogPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTimeLogPanelMouseClicked
        changeCard(timeLogPanel);
        homeTimeLogPanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homeTimeLogPanelMouseClicked

    private void homePayslipPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePayslipPanelMouseClicked
        changeCard(payslipPanel);
        homePayslipPanel.setBackground(new java.awt.Color(56, 127, 249));
    }//GEN-LAST:event_homePayslipPanelMouseClicked

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
        changeCard(supportPanel);
        CSEmployeeUID.setText("");
        CSFirstName.setText("");
        CSLastName.setText("");
        CSEmail.setText("");
        CSSubject.setText("");
        CSMessage.setText("");
    }//GEN-LAST:event_supportButtonActionPerformed

    private void manageEmployeeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeButtonMouseEntered
        manageEmployeeButton.setBackground(new java.awt.Color(230, 239, 255));
        manageEmployeeButton.setForeground(new java.awt.Color(55, 126, 249));
        manageEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/profile-entered.png")));
    }//GEN-LAST:event_manageEmployeeButtonMouseEntered

    private void manageEmployeeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeButtonMouseExited
        manageEmployeeButton.setBackground(new java.awt.Color(255, 255, 255));
        manageEmployeeButton.setForeground(new java.awt.Color(0, 0, 0));
        manageEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/profile-default.png")));
    }//GEN-LAST:event_manageEmployeeButtonMouseExited

    private void manageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeButtonActionPerformed
        changeCard(manageEmployeePanel);
        changeMECard(METablePanel);
        displayAllEmployee.displayEmployeeTable(METable);
    }//GEN-LAST:event_manageEmployeeButtonActionPerformed

    private void generatePaySlipButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatePaySlipButtonMouseEntered
        generatePaySlipButton.setBackground(new java.awt.Color(230, 239, 255));
        generatePaySlipButton.setForeground(new java.awt.Color(55, 126, 249));
        generatePaySlipButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/payslip-entered.png")));
    }//GEN-LAST:event_generatePaySlipButtonMouseEntered

    private void generatePaySlipButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatePaySlipButtonMouseExited
        generatePaySlipButton.setBackground(new java.awt.Color(255, 255, 255));
        generatePaySlipButton.setForeground(new java.awt.Color(0, 0, 0));
        generatePaySlipButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/payslip-default.png")));
    }//GEN-LAST:event_generatePaySlipButtonMouseExited

    private void generatePaySlipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePaySlipButtonActionPerformed
        changeCard(generatePayslipPanel);
        changeGPCardPanelCard(GPTableDisplay);
        GPEmployeeUID.setText("");
        GPFullName.setText("");
        GPTimeLogDate.setText("");
        GPTimeLogTimeIn.setText("");
        GPTimeLogTimeOut.setText("");
        GPTimeLogRenderedHours.setText("");
        GPEmployeeUIDUpdate.setText("");
        GPFullNameUpdate.setText("");
        GPTimeLogDateUpdate.setText("");
        GPTimeLogTimeInUpdate.setText("");
        GPTimeLogTimeOutUpdate.setText("");
        GPTimeLogRenderedHoursUpdate.setText("");
        GPManageHoursSearchMonth.setSelectedIndex(0);
        GPManageHoursSearchFromDate.setSelectedIndex(0);
        GPManageHoursSearchToDate.setSelectedIndex(0);
        GPManageHoursSearchYear.setSelectedIndex(0);
        GPPSName.setText("");
        GPPSEmployeeUID.setText("");
        GPPSPeriod.setText("");
        GPPSDaysWorked.setText("");
        GPPPSHoursWorked.setText("");
        GPPPSHourlyGrossRate.setText("");
        GPPSDailyGrossRate.setText("");
        GPPSDailyGrossIncome.setText("");
        GPPSNetIncome.setText("");
        GPDPagibig.setText("");
        GPDPhilhealth.setText("");
        GPDTax.setText("");
        GPDPagibigLoan.setText("");
        GPDSSSLoan.setText("");
        GPDOtherLoan.setText("");
        GPDTotalDeduction.setText("");
        generatePayslip.displayEmployeeTable2(GPTable);
    }//GEN-LAST:event_generatePaySlipButtonActionPerformed

    private void inquiryLogButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inquiryLogButtonMouseEntered
        inquiryLogButton.setBackground(new java.awt.Color(230, 239, 255));
        inquiryLogButton.setForeground(new java.awt.Color(55, 126, 249));
        inquiryLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/time-log-entered.png")));
    }//GEN-LAST:event_inquiryLogButtonMouseEntered

    private void inquiryLogButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inquiryLogButtonMouseExited
        inquiryLogButton.setBackground(new java.awt.Color(255, 255, 255));
        inquiryLogButton.setForeground(new java.awt.Color(0, 0, 0));
        inquiryLogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assets/time-log-default.png")));
    }//GEN-LAST:event_inquiryLogButtonMouseExited

    private void inquiryLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inquiryLogButtonActionPerformed
        changeCard(inquiryAndConcernLogPanel);
        ICLTableAction.displayInquiryAndConcern(ICLTable);
    }//GEN-LAST:event_inquiryLogButtonActionPerformed

    private void contactSupportSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactSupportSendButtonActionPerformed
        CSAction.getAndSendMessage();
    }//GEN-LAST:event_contactSupportSendButtonActionPerformed

    private void ICLTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ICLTableMouseClicked
        ICLTableAction.onclickTable(ICLSupportID, ICLEmployeeUID, ICLName, ICLEmail, ICLSubject, ICLMessages, ICLDateAndTime, ICLTable, ICLStatusButton);
    }//GEN-LAST:event_ICLTableMouseClicked

    private void ICLSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICLSearchButtonActionPerformed
        ICLTableAction.searchTable(ICLTable, ICLSearchField);
    }//GEN-LAST:event_ICLSearchButtonActionPerformed

    private void ICLSearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ICLSearchFieldKeyPressed
        ICLTableAction.searchTable(ICLTable, ICLSearchField);
    }//GEN-LAST:event_ICLSearchFieldKeyPressed

    private void CSLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSLastNameFocusGained
        InvalidNameLabel.setText("");
    }//GEN-LAST:event_CSLastNameFocusGained

    private void CSFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSFirstNameFocusGained
        InvalidNameLabel.setText("");
    }//GEN-LAST:event_CSFirstNameFocusGained

    private void CSEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSEmailFocusGained
        InvalidEmailLabel.setText("");
    }//GEN-LAST:event_CSEmailFocusGained

    private void CSSubjectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSSubjectFocusGained
        InvalidSubjectLabel.setText("");
    }//GEN-LAST:event_CSSubjectFocusGained

    private void CSMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSMessageFocusGained
        InvalidMessageLabel.setText("");
    }//GEN-LAST:event_CSMessageFocusGained

    private void CSEmployeeUIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CSEmployeeUIDFocusGained
        InvalidUIDLabel.setText("");
    }//GEN-LAST:event_CSEmployeeUIDFocusGained

    private void ICLStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICLStatusButtonActionPerformed
        ICLTableAction.updateStatus(ICLTable, ICLStatusButton);
        ICLSupportID.setText("");
        ICLEmployeeUID.setText("");
        ICLName.setText("");
        ICLEmail.setText("");
        ICLSubject.setText("");
        ICLMessages.setText("");
        ICLDateAndTime.setText("");
        ICLStatusButton.setText("");
        ICLStatusButton.setBackground(new Color(255, 255, 255));
        ICLStatusButton.setForeground(new Color(0, 0, 0));
        ICLStatusButton.setText("");
        ICLStatusButton.setEnabled(false);
        ICLStatusButton.setHorizontalAlignment(SwingConstants.LEFT);
        ICLTableAction.displayInquiryAndConcern(ICLTable);
    }//GEN-LAST:event_ICLStatusButtonActionPerformed

    private void ICLTableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ICLTableFocusLost
        ICLSupportID.setText("");
        ICLEmployeeUID.setText("");
        ICLName.setText("");
        ICLEmail.setText("");
        ICLSubject.setText("");
        ICLMessages.setText("");
        ICLDateAndTime.setText("");
        ICLStatusButton.setText("");
        ICLStatusButton.setBackground(new Color(255, 255, 255));
        ICLStatusButton.setForeground(new Color(0, 0, 0));
        ICLStatusButton.setText("");
        ICLStatusButton.setEnabled(false);
        ICLStatusButton.setHorizontalAlignment(SwingConstants.LEFT);
    }//GEN-LAST:event_ICLTableFocusLost

    private void MEAddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEAddEmployeeButtonActionPerformed
        changeMECard(MEAddPanel);
        Random random = new Random();
        int generateUID = random.nextInt(9000000) + 1000000;
        MEAddCIEmployeeUID.setText(Integer.toString(generateUID));
    }//GEN-LAST:event_MEAddEmployeeButtonActionPerformed

    private void MEAddBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEAddBackButtonActionPerformed
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
        changeMECard(METablePanel);
    }//GEN-LAST:event_MEAddBackButtonActionPerformed

    private void MEInfoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEInfoBackButtonActionPerformed
        changeMECard(METablePanel);
        displayAllEmployee.displayEmployeeTable(METable);
    }//GEN-LAST:event_MEInfoBackButtonActionPerformed

    private void MEADDAddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEADDAddEmployeeButtonActionPerformed

        addEmployee.addAction(MEAddPIFirstName, MEAddPIMiddleName, MEAddPILastName, MEAddPIMale, MEAddPIFemale, MEAddPIBirthMonth, MEAddPIBirthDate, MEAddPIBirthYear, MEAddPIAddress, MEAddPIMobileNumber, MEAddPIMaritalStatus, MEAddCIEmployeeUID, MEAddCIEmail, MEAddCIPosition, MEAddCIStatus, MEAddCIAccountType, MEAddCIDateStartMonth, MEAddCIDateStartDate, MEAddCIDateStartYear, MEAddCIBasicPay, MEAddGIDHDMF1, MEAddGIDHDMF2, MEAddGIDHDMF3, MEAddGIDPHIC1, MEAddGIDPHIC2, MEAddGIDPHIC3, MEAddGIDSSS1, MEAddGIDSSS2, MEAddGIDSSS3, MEAddGIDTIN1, MEAddGIDTIN2, MEAddGIDTIN3, MEAddEmerContactPerson, MEAddEmerRelationship, MEAddEmerAddress, MEAddEmerContactNumber, METablePanel, MECardPanel);
        displayAllEmployee.displayEmployeeTable(METable);

    }//GEN-LAST:event_MEADDAddEmployeeButtonActionPerformed

    private void CSEmployeeUIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CSEmployeeUIDKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_CSEmployeeUIDKeyTyped

    private void MEAddPIMobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddPIMobileNumberKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddPIMobileNumberKeyTyped

    private void MEAddGIDHDMF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDHDMF1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDHDMF1KeyTyped

    private void MEAddGIDHDMF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDHDMF2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDHDMF2KeyTyped

    private void MEAddGIDHDMF3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDHDMF3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDHDMF3KeyTyped

    private void MEAddGIDPHIC1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDPHIC1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDPHIC1KeyTyped

    private void MEAddGIDPHIC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDPHIC2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDPHIC2KeyTyped

    private void MEAddGIDPHIC3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDPHIC3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDPHIC3KeyTyped

    private void MEAddGIDSSS1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDSSS1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDSSS1KeyTyped

    private void MEAddGIDSSS2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDSSS2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDSSS2KeyTyped

    private void MEAddGIDSSS3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDSSS3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDSSS3KeyTyped

    private void MEAddGIDTIN1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDTIN1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDTIN1KeyTyped

    private void MEAddGIDTIN2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDTIN2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDTIN2KeyTyped

    private void MEAddGIDTIN3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddGIDTIN3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddGIDTIN3KeyTyped

    private void MEAddCIBasicPayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddCIBasicPayKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddCIBasicPayKeyTyped

    private void MEAddEmerContactNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEAddEmerContactNumberKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEAddEmerContactNumberKeyTyped

    private void METableSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_METableSearchFieldKeyTyped
        displayAllEmployee.searchTable(METable, METableSearchField);
    }//GEN-LAST:event_METableSearchFieldKeyTyped

    private void METableSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_METableSearchButtonActionPerformed
        displayAllEmployee.searchTable(METable, METableSearchField);
    }//GEN-LAST:event_METableSearchButtonActionPerformed

    private void MEUpdateBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEUpdateBackButtonActionPerformed
        changeMECard(METablePanel);
    }//GEN-LAST:event_MEUpdateBackButtonActionPerformed

    private void MEUpdatePIMobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdatePIMobileNumberKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_MEUpdatePIMobileNumberKeyTyped

    private void MEUpdateCIBasicPayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateCIBasicPayKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateCIBasicPayKeyTyped

    private void MEUpdateGIDTIN3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDTIN3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDTIN3KeyTyped

    private void MEUpdateGIDPHIC3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDPHIC3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDPHIC3KeyTyped

    private void MEUpdateGIDSSS3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDSSS3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDSSS3KeyTyped

    private void MEUpdateGIDHDMF3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDHDMF3KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDHDMF3KeyTyped

    private void MEUpdateGIDHDMF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDHDMF1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDHDMF1KeyTyped

    private void MEUpdateGIDHDMF2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDHDMF2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDHDMF2KeyTyped

    private void MEUpdateGIDPHIC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDPHIC2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDPHIC2KeyTyped

    private void MEUpdateGIDPHIC1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDPHIC1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDPHIC1KeyTyped

    private void MEUpdateGIDSSS1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDSSS1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDSSS1KeyTyped

    private void MEUpdateGIDSSS2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDSSS2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDSSS2KeyTyped

    private void MEUpdateGIDTIN1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDTIN1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDTIN1KeyTyped

    private void MEUpdateGIDTIN2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateGIDTIN2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateGIDTIN2KeyTyped

    private void MEUpdateEmerContactNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MEUpdateEmerContactNumberKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_MEUpdateEmerContactNumberKeyTyped

    private void MEUDPATEupdateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEUDPATEupdateEmployeeButtonActionPerformed
        updateEmployee.updateInformation(
                MEUpdatePIFirstName,
                MEUpdatePIMiddleName,
                MEUpdatePILastName,
                MEUpdatePIMale,
                MEUpdatePIFemale,
                MEUpdatePIBirthMonth,
                MEUpdatePIBirthDate,
                MEUpdatePIBirthYear,
                MEUpdatePIAddress,
                MEUpdatePIMobileNumber,
                MEUpdatePIMaritalStatus,
                MEUpdateCIEmployeeUID,
                MEUpdateCIEmail,
                MEUpdateCIPosition,
                MEUpdateCIStatus,
                MEUpdateCIAccountType,
                MEUpdateCIDateStartMonth,
                MEUpdateCIDateStartDate,
                MEUpdateCIDateStartYear,
                MEUpdateCIBasicPay,
                MEUpdateGIDHDMF1,
                MEUpdateGIDHDMF2,
                MEUpdateGIDHDMF3,
                MEUpdateGIDPHIC1,
                MEUpdateGIDPHIC2,
                MEUpdateGIDPHIC3,
                MEUpdateGIDSSS1,
                MEUpdateGIDSSS2,
                MEUpdateGIDSSS3,
                MEUpdateGIDTIN1,
                MEUpdateGIDTIN2,
                MEUpdateGIDTIN3,
                MEUpdateEmerContactPerson,
                MEUpdateEmerRelationship,
                MEUpdateEmerAddress,
                MEUpdateEmerContactNumber,
                METablePanel,
                MECardPanel);
        displayAllEmployee.displayEmployeeTable(METable);
    }//GEN-LAST:event_MEUDPATEupdateEmployeeButtonActionPerformed

    private void MEInfoUpdateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEInfoUpdateEmployeeButtonActionPerformed
        changeMECard(MEUpdatePanel);
        checkEmployeeDetails.displayToUpdate(MEUpdatePIFirstName, MEUpdatePIMiddleName, MEUpdatePILastName, MEUpdatePIMale, MEUpdatePIFemale, MEUpdatePIBirthMonth, MEUpdatePIBirthDate, MEUpdatePIBirthYear, MEUpdatePIAddress, MEUpdatePIMobileNumber, MEUpdatePIMaritalStatus, MEUpdateCIEmployeeUID, MEUpdateCIEmail, MEUpdateCIPosition, MEUpdateCIStatus, MEUpdateCIAccountType, MEUpdateCIDateStartMonth, MEUpdateCIDateStartDate, MEUpdateCIDateStartYear, MEUpdateCIBasicPay, MEUpdateGIDHDMF1, MEUpdateGIDHDMF2, MEUpdateGIDHDMF3, MEUpdateGIDPHIC1, MEUpdateGIDPHIC2, MEUpdateGIDPHIC3, MEUpdateGIDSSS1, MEUpdateGIDSSS2, MEUpdateGIDSSS3, MEUpdateGIDTIN1, MEUpdateGIDTIN2, MEUpdateGIDTIN3, MEUpdateEmerContactPerson, MEUpdateEmerRelationship, MEUpdateEmerAddress, MEUpdateEmerContactNumber, MEUpdateHDMFLabel, METable);
    }//GEN-LAST:event_MEInfoUpdateEmployeeButtonActionPerformed

    private void MECheckInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MECheckInfoButtonActionPerformed
        ListSelectionModel selectionUpdateTable = METable.getSelectionModel();
        if (selectionUpdateTable.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a record to check information!", "Manage Employee", JOptionPane.WARNING_MESSAGE);
        } else {
            changeMECard(MEInformationPanel);
            checkEmployeeDetails.displayInfo(MEInfoPIName, MEInfoPIGender, MEInfoPIBirthdate, MEInfoPIAddress, MEInfoPIMobileNumber, MEInfoPIMaritalStatus, MEInfoCIEmployeeUID, MEInfoCIEmail, MEInfoCIPosition, MEInfoCIStatus, MEInfoCIAccountType, MEInfoCIDateStarted, MEInfoCDBasicPay, MEInfoGIDHDMF, MEInfoGIDPHIC, MEInfoGIDSSS, MEInfoGIDTIN, MEInfoEmerContactPerson, MEInfoEmerRelationship, MEInfoEmerAddress, MEInfoEmerContactNumbe, METable);
        }

    }//GEN-LAST:event_MECheckInfoButtonActionPerformed

    private void MEUpdateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEUpdateEmployeeButtonActionPerformed
        ListSelectionModel selectionUpdateTable = METable.getSelectionModel();
        if (selectionUpdateTable.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a record to update information!", "Manage Employee", JOptionPane.WARNING_MESSAGE);
        } else {
            changeMECard(MEUpdatePanel);
            checkEmployeeDetails.displayToUpdate(MEUpdatePIFirstName, MEUpdatePIMiddleName, MEUpdatePILastName, MEUpdatePIMale, MEUpdatePIFemale, MEUpdatePIBirthMonth, MEUpdatePIBirthDate, MEUpdatePIBirthYear, MEUpdatePIAddress, MEUpdatePIMobileNumber, MEUpdatePIMaritalStatus, MEUpdateCIEmployeeUID, MEUpdateCIEmail, MEUpdateCIPosition, MEUpdateCIStatus, MEUpdateCIAccountType, MEUpdateCIDateStartMonth, MEUpdateCIDateStartDate, MEUpdateCIDateStartYear, MEUpdateCIBasicPay, MEUpdateGIDHDMF1, MEUpdateGIDHDMF2, MEUpdateGIDHDMF3, MEUpdateGIDPHIC1, MEUpdateGIDPHIC2, MEUpdateGIDPHIC3, MEUpdateGIDSSS1, MEUpdateGIDSSS2, MEUpdateGIDSSS3, MEUpdateGIDTIN1, MEUpdateGIDTIN2, MEUpdateGIDTIN3, MEUpdateEmerContactPerson, MEUpdateEmerRelationship, MEUpdateEmerAddress, MEUpdateEmerContactNumber, MEUpdateHDMFLabel, METable);
        }
    }//GEN-LAST:event_MEUpdateEmployeeButtonActionPerformed

    private void topLogoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_topLogoFocusGained
        CSAction.setMessage(InvalidUIDLabel, InvalidNameLabel, InvalidEmailLabel, InvalidSubjectLabel, InvalidMessageLabel, CSEmployeeUID, CSFirstName, CSLastName, CSEmail, CSSubject, CSMessage);
        LoggedInUser.setInfo(topLoggedFullName, PPIName, homeWelcomeUserLabel, PPIGender, PPIBirthdate, PPIAddress, PPIMobileNumber, PPIMaritalStatus, PCIEmployeeUID, PCIEmail, PCIPosition, PCIStatus, PCIAccountType, PCIDateStarted, PCDBasicPay, PGIDHDMF, PGIDPHIC, PGIDSSS, PGIDTIN, PEmerContactPerson, PEmerRelationship, PEmerAddress, PEmerContactNumber, getEmployeeUID());
        LoggedInUser.showCurrentLoggedIn();
        isTimeIn();
        DisplayTimeLog.displayEmployeeTimeLog(TLTable, getEmployeeUID());

    }//GEN-LAST:event_topLogoFocusGained

    private void TLTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TLTableMouseClicked
        DisplayTimeLog.onclickTimeLogTable(TLTable, TLTimeLogDate, TLTimeLogTimeIn, TLTimeLogTimeOut, TLTimeLogRenderedHours);
    }//GEN-LAST:event_TLTableMouseClicked

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

    private void TLSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TLSearchFieldKeyTyped
        DisplayTimeLog.searchTimeLogTable(TLTable, TLSearchField);
    }//GEN-LAST:event_TLSearchFieldKeyTyped

    private void TLSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLSearchButtonActionPerformed
        DisplayTimeLog.searchTimeLogTable(TLTable, TLSearchField);
    }//GEN-LAST:event_TLSearchButtonActionPerformed

    private void GPTimeLogTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GPTimeLogTableMouseClicked
        DisplayTimeLog.onclickTimeLogUpdateTable(GPTable, GPTimeLogTable, GPEmployeeUID, GPFullName, GPTimeLogDate, GPTimeLogTimeIn, GPTimeLogTimeOut, GPTimeLogRenderedHours, GPEmployeeUIDUpdate, GPFullNameUpdate, GPTimeLogDateUpdate, GPTimeLogTimeInUpdate, GPTimeLogTimeOutUpdate, GPTimeLogRenderedHoursUpdate);
    }//GEN-LAST:event_GPTimeLogTableMouseClicked

    private void GPCheckPayslipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPCheckPayslipButtonActionPerformed
        ListSelectionModel selectionUpdateTable = GPTable.getSelectionModel();
        DefaultTableModel tableModel = (DefaultTableModel) GPTable.getModel();

        if (selectionUpdateTable.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a record to check!", "Generate Payslip", JOptionPane.WARNING_MESSAGE);
        } else {
            int selectedIndex = GPTable.getSelectedRow();
            int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
            DisplayTimeLog.displayEmployeeTimeLog(GPTimeLogTable, employeeUID);
            changeGPCardPanelCard(GPManageHours);
        }
    }//GEN-LAST:event_GPCheckPayslipButtonActionPerformed

    private void GPBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPBackButtonActionPerformed
        changeGPCardPanelCard(GPTableDisplay);
        GPEmployeeUID.setText("");
        GPFullName.setText("");
        GPTimeLogDate.setText("");
        GPTimeLogTimeIn.setText("");
        GPTimeLogTimeOut.setText("");
        GPTimeLogRenderedHours.setText("");
        GPEmployeeUIDUpdate.setText("");
        GPFullNameUpdate.setText("");
        GPTimeLogDateUpdate.setText("");
        GPTimeLogTimeInUpdate.setText("");
        GPTimeLogTimeOutUpdate.setText("");
        GPTimeLogRenderedHoursUpdate.setText("");
        GPManageHoursSearchMonth.setSelectedIndex(0);
        GPManageHoursSearchFromDate.setSelectedIndex(0);
        GPManageHoursSearchToDate.setSelectedIndex(0);
        GPManageHoursSearchYear.setSelectedIndex(0);
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
        GPGeneratePagibigLoanField.setText("0");
        GPGenerateSSSLoanField.setText("0");
        GPGenerateOtherLoanField.setText("0");
    }//GEN-LAST:event_GPBackButtonActionPerformed

    private void GPTimeLogEditRenderedHoursButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPTimeLogEditRenderedHoursButtonActionPerformed
        GPTimeLogDetailsCardPanelCard(GPTimeLogDetailsUpdatePanel);
    }//GEN-LAST:event_GPTimeLogEditRenderedHoursButtonActionPerformed

    private void GPTimeLogPrintPayslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPTimeLogPrintPayslipActionPerformed
        changeGPCardPanelCard(GPGeneratorPanel);
    }//GEN-LAST:event_GPTimeLogPrintPayslipActionPerformed

    private void GPTimeLogUpdateRenderedHoursButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPTimeLogUpdateRenderedHoursButtonActionPerformed
        ListSelectionModel selectionUpdateTable = GPTable.getSelectionModel();
        DefaultTableModel tableModel = (DefaultTableModel) GPTable.getModel();
        int selectedIndex = GPTable.getSelectedRow();
        int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
        TimeLogAction.updateRenderedHours(GPTimeLogRenderedHoursUpdate, GPEmployeeUIDUpdate, GPTimeLogDateUpdate);
        GPTimeLogDetailsCardPanelCard(GPTimeLogDetailsViewPanel);
        DisplayTimeLog.displayEmployeeTimeLog(GPTimeLogTable, employeeUID);
        GPEmployeeUID.setText("");
        GPFullName.setText("");
        GPTimeLogDate.setText("");
        GPTimeLogTimeIn.setText("");
        GPTimeLogTimeOut.setText("");
        GPTimeLogRenderedHours.setText("");
        GPEmployeeUIDUpdate.setText("");
        GPFullNameUpdate.setText("");
        GPTimeLogDateUpdate.setText("");
        GPTimeLogTimeInUpdate.setText("");
        GPTimeLogTimeOutUpdate.setText("");
        GPTimeLogRenderedHoursUpdate.setText("");
        GPManageHoursSearchMonth.setSelectedIndex(0);
        GPManageHoursSearchFromDate.setSelectedIndex(0);
        GPManageHoursSearchToDate.setSelectedIndex(0);
        GPManageHoursSearchYear.setSelectedIndex(0);
    }//GEN-LAST:event_GPTimeLogUpdateRenderedHoursButtonActionPerformed

    private void GPManageHoursResetSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPManageHoursResetSearchButtonActionPerformed
        ListSelectionModel selectionUpdateTable = GPTable.getSelectionModel();
        DefaultTableModel tableModel = (DefaultTableModel) GPTable.getModel();
        int selectedIndex = GPTable.getSelectedRow();
        int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
        DisplayTimeLog.displayEmployeeTimeLog(GPTimeLogTable, employeeUID);
        GPEmployeeUID.setText("");
        GPFullName.setText("");
        GPTimeLogDate.setText("");
        GPTimeLogTimeIn.setText("");
        GPTimeLogTimeOut.setText("");
        GPTimeLogRenderedHours.setText("");
        GPEmployeeUIDUpdate.setText("");
        GPFullNameUpdate.setText("");
        GPTimeLogDateUpdate.setText("");
        GPTimeLogTimeInUpdate.setText("");
        GPTimeLogTimeOutUpdate.setText("");
        GPTimeLogRenderedHoursUpdate.setText("");
        GPManageHoursSearchMonth.setSelectedIndex(0);
        GPManageHoursSearchFromDate.setSelectedIndex(0);
        GPManageHoursSearchToDate.setSelectedIndex(0);
        GPManageHoursSearchYear.setSelectedIndex(0);
    }//GEN-LAST:event_GPManageHoursResetSearchButtonActionPerformed

    private void GPTimeLogRenderedHoursUpdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GPTimeLogRenderedHoursUpdateKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_GPTimeLogRenderedHoursUpdateKeyTyped

    private void GPManageHoursSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPManageHoursSearchButtonActionPerformed
        String month = GPManageHoursSearchMonth.getSelectedItem().toString();
        String fromDate = GPManageHoursSearchFromDate.toString();
        String toDate = GPManageHoursSearchToDate.toString();
        String year = GPManageHoursSearchYear.toString();
        if (month.equals("Month") || fromDate.equals("From Date") || toDate.equals("To Date") || year.equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields to search", "Time Log", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel tableModel = (DefaultTableModel) GPTable.getModel();
            int selectedIndex = GPTable.getSelectedRow();
            int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
            DisplayTimeLog.displayEmployeeUpdateTimeLog(GPTimeLogTable, employeeUID, GPManageHoursSearchMonth, GPManageHoursSearchFromDate, GPManageHoursSearchToDate, GPManageHoursSearchYear);
        }
    }//GEN-LAST:event_GPManageHoursSearchButtonActionPerformed

    private void GPGetCompensationInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPGetCompensationInforButtonActionPerformed
        String month = GPGeneratePeriodMonth.getSelectedItem().toString();
        String fromDate = GPGeneratePeriodFromDate.getSelectedItem().toString();
        String toDate = GPGeneratePeriodToDate.getSelectedItem().toString();
        String year = GPGeneratePeriodYear.getSelectedItem().toString();
        if (month.equals("Month") || fromDate.equals("From Date") || toDate.equals("To Date") || year.equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please fill pay period fields to generate", "Generate Payslip", JOptionPane.WARNING_MESSAGE);
        } else {
            GeneratePayslip.generatePaySlipInfo(GPTable, GPTimeLogTable, GPGenerateName, GPGenerateEmployeeUID, GPGeneratePeriod, GPGeneratePeriodMonth, GPGeneratePeriodFromDate, GPGeneratePeriodToDate, GPGeneratePeriodYear, GPGenerateDaysWorked, GPGenerateHoursWorked, GPGenerateHourlyGrossRate, GPGenerateDailyGrossRate, GPGenerateGrossIncome, GPGenerateNetIncome, GPGeneratePagibig, GPGeneratePhilhealth, GPGenerateSSS, GPGenerateTax, GPGenerateTotalDeduction, GPGeneratePagibigLoanField, GPGenerateSSSLoanField, GPGenerateOtherLoanField);
        }

    }//GEN-LAST:event_GPGetCompensationInforButtonActionPerformed

    private void CalculatePayslipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculatePayslipButtonActionPerformed
        String month = GPGeneratePeriodMonth.getSelectedItem().toString();
        String fromDate = GPGeneratePeriodFromDate.getSelectedItem().toString();
        String toDate = GPGeneratePeriodToDate.getSelectedItem().toString();
        String year = GPGeneratePeriodYear.getSelectedItem().toString();
        if (month.equals("Month") || fromDate.equals("From Date") || toDate.equals("To Date") || year.equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please fill pay period fields to generate", "Generate Payslip", JOptionPane.WARNING_MESSAGE);
        } else {
            GeneratePayslip.generatePaySlipInfo(GPTable, GPTimeLogTable, GPGenerateName, GPGenerateEmployeeUID, GPGeneratePeriod, GPGeneratePeriodMonth, GPGeneratePeriodFromDate, GPGeneratePeriodToDate, GPGeneratePeriodYear, GPGenerateDaysWorked, GPGenerateHoursWorked, GPGenerateHourlyGrossRate, GPGenerateDailyGrossRate, GPGenerateGrossIncome, GPGenerateNetIncome, GPGeneratePagibig, GPGeneratePhilhealth, GPGenerateSSS, GPGenerateTax, GPGenerateTotalDeduction, GPGeneratePagibigLoanField, GPGenerateSSSLoanField, GPGenerateOtherLoanField);
        }
    }//GEN-LAST:event_CalculatePayslipButtonActionPerformed

    private void GeneratePayslipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneratePayslipButtonActionPerformed
        GeneratePayslip.generatePaySlipSave(GPTable, GPTimeLogTable, GPGenerateName, GPGenerateEmployeeUID, GPGeneratePeriod, GPGeneratePeriodMonth, GPGeneratePeriodFromDate, GPGeneratePeriodToDate, GPGeneratePeriodYear, GPGenerateDaysWorked, GPGenerateHoursWorked, GPGenerateHourlyGrossRate, GPGenerateDailyGrossRate, GPGenerateGrossIncome, GPGenerateNetIncome, GPGeneratePagibig, GPGeneratePhilhealth, GPGenerateSSS, GPGenerateTax, GPGenerateTotalDeduction, GPGeneratePagibigLoanField, GPGenerateSSSLoanField, GPGenerateOtherLoanField);
        changeGPCardPanelCard(GPTableDisplay);
    }//GEN-LAST:event_GeneratePayslipButtonActionPerformed

    private void payslipPayPeriodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payslipPayPeriodButtonActionPerformed
        changeCard(payslipPanel);
        LoggedInUser.getGeneratePayInfo(payslipPayPeriodList, getEmployeeUID(), PPSName, PPSEmployeeUID, PPSPeriod, PPSDaysWorked, PPSHoursWorked, PPSHourlyGrossRate, PPSDailyGrossRate, PPSDailyGrossIncome, PPSNetIncome, PDPagibig, PDPhilhealth, PDSSS, PDTax, PDPagibigLoan, PDSSSLoan, PDOtherLoan, PDTotalDeduction);
    }//GEN-LAST:event_payslipPayPeriodButtonActionPerformed

    private void PPrintPaySlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPrintPaySlipActionPerformed
        printPayslip(PayslipForm);
    }//GEN-LAST:event_PPrintPaySlipActionPerformed

    private void GPCheckEmployeePayslipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPCheckEmployeePayslipsButtonActionPerformed
        ListSelectionModel selectionUpdateTable = GPTable.getSelectionModel();
        DefaultTableModel tableModel = (DefaultTableModel) GPTable.getModel();
        if (selectionUpdateTable.isSelectionEmpty()) {

            JOptionPane.showMessageDialog(this, "Select a record to check!", "Generate Payslip", JOptionPane.WARNING_MESSAGE);
        } else {
            int selectedIndex = GPTable.getSelectedRow();
            int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
            DisplayTimeLog.displayEmployeeTimeLog(GPTimeLogTable, employeeUID);
            changeGPCardPanelCard(GPEmployeePayslipsTablePanel);
            generateGPEmployeePayslipsTable();
        }
    }//GEN-LAST:event_GPCheckEmployeePayslipsButtonActionPerformed

    private void GPEmployeePayslipsTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GPEmployeePayslipsTableMouseReleased
        onClickEmployeePayslipTable();
    }//GEN-LAST:event_GPEmployeePayslipsTableMouseReleased

    private void GPPaySlipInfoDeletePayslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPPaySlipInfoDeletePayslipActionPerformed
        deletePayslip();
        generateGPEmployeePayslipsTable();
    }//GEN-LAST:event_GPPaySlipInfoDeletePayslipActionPerformed

    private void MEDeleteEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDeleteEmployeeButtonActionPerformed
        deleteEmployee();
    }//GEN-LAST:event_MEDeleteEmployeeButtonActionPerformed

    private void topLoggedFullNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topLoggedFullNameMouseReleased
        profilePopupMenu.show(topPanel, 780, 50);
    }//GEN-LAST:event_topLoggedFullNameMouseReleased

    private void ICLTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ICLTableKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            ICLTableAction.onclickTable(ICLSupportID, ICLEmployeeUID, ICLName, ICLEmail, ICLSubject, ICLMessages, ICLDateAndTime, ICLTable, ICLStatusButton);
        }

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            ICLTableAction.onclickTable(ICLSupportID, ICLEmployeeUID, ICLName, ICLEmail, ICLSubject, ICLMessages, ICLDateAndTime, ICLTable, ICLStatusButton);
        }
    }//GEN-LAST:event_ICLTableKeyReleased

    private void GPSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GPSearchFieldKeyTyped
        displayAllEmployee.searchTable(GPTable, GPSearchField);
    }//GEN-LAST:event_GPSearchFieldKeyTyped

    private void GPSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPSearchButtonActionPerformed
        displayAllEmployee.searchTable(GPTable, GPSearchField);
    }//GEN-LAST:event_GPSearchButtonActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variable Declaration">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CILMidPanel;
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
    private javax.swing.JButton CalculatePayslipButton;
    private javax.swing.JButton GPBackButton;
    private javax.swing.JPanel GPCardPanel;
    private javax.swing.JButton GPCheckEmployeePayslipsButton;
    private javax.swing.JButton GPCheckPayslipButton;
    private javax.swing.JLabel GPDOtherLoan;
    private javax.swing.JLabel GPDPagibig;
    private javax.swing.JLabel GPDPagibigLoan;
    private javax.swing.JLabel GPDPhilhealth;
    private javax.swing.JLabel GPDSSS;
    private javax.swing.JLabel GPDSSSLoan;
    private javax.swing.JLabel GPDTax;
    private javax.swing.JLabel GPDTotalDeduction;
    private javax.swing.JTable GPEmployeePayslipsTable;
    private javax.swing.JPanel GPEmployeePayslipsTablePanel;
    private javax.swing.JLabel GPEmployeeUID;
    private javax.swing.JLabel GPEmployeeUIDLabel;
    private javax.swing.JLabel GPEmployeeUIDUpdate;
    private javax.swing.JLabel GPEmployeeUIDUpdateLabel;
    private javax.swing.JLabel GPFullName;
    private javax.swing.JLabel GPFullNameLabel;
    private javax.swing.JLabel GPFullNameUpdate;
    private javax.swing.JLabel GPFullNameUpdateLabel;
    private javax.swing.JLabel GPGDayWorkedLabel;
    private javax.swing.JLabel GPGDayWorkedLabel2;
    private javax.swing.JPanel GPGDeductionPanel;
    private javax.swing.JPanel GPGPayslipSummaryPanel;
    private javax.swing.JLabel GPGenerateDailyGrossIncomeLabel;
    private javax.swing.JLabel GPGenerateDailyGrossRate;
    private javax.swing.JLabel GPGenerateDailyGrossRateLabel;
    private javax.swing.JLabel GPGenerateDaysWorked;
    private javax.swing.JLabel GPGenerateDaysWorkedLabel;
    private javax.swing.JLabel GPGenerateEmployeeUID;
    private javax.swing.JLabel GPGenerateEmployeeUIDLabel;
    private javax.swing.JLabel GPGenerateGrossIncome;
    private javax.swing.JLabel GPGenerateHourlyGrossRate;
    private javax.swing.JLabel GPGenerateHourlyGrossRateLabel;
    private javax.swing.JLabel GPGenerateHoursWorked;
    private javax.swing.JLabel GPGenerateHoursWorkedLabel;
    private javax.swing.JLabel GPGenerateName;
    private javax.swing.JLabel GPGenerateNameLabel;
    private javax.swing.JLabel GPGenerateNetIncome;
    private javax.swing.JLabel GPGenerateNetIncomeLabel;
    private javax.swing.JTextField GPGenerateOtherLoanField;
    private javax.swing.JLabel GPGenerateOtherLoanLabel;
    private javax.swing.JLabel GPGeneratePagibig;
    private javax.swing.JLabel GPGeneratePagibigLabel;
    private javax.swing.JTextField GPGeneratePagibigLoanField;
    private javax.swing.JLabel GPGeneratePagibigLoanLabel;
    private javax.swing.JLabel GPGeneratePeriod;
    private javax.swing.JComboBox<String> GPGeneratePeriodFromDate;
    private javax.swing.JLabel GPGeneratePeriodLabel;
    private javax.swing.JLabel GPGeneratePeriodLabel1;
    private javax.swing.JComboBox<String> GPGeneratePeriodMonth;
    private javax.swing.JComboBox<String> GPGeneratePeriodToDate;
    private javax.swing.JComboBox<String> GPGeneratePeriodYear;
    private javax.swing.JLabel GPGeneratePhilhealth;
    private javax.swing.JLabel GPGeneratePhilhealthLabel;
    private javax.swing.JLabel GPGenerateSSS;
    private javax.swing.JLabel GPGenerateSSSLabel;
    private javax.swing.JLabel GPGenerateSSSLabel1;
    private javax.swing.JTextField GPGenerateSSSLoanField;
    private javax.swing.JLabel GPGenerateSSSLoanLabel;
    private javax.swing.JLabel GPGenerateTax;
    private javax.swing.JLabel GPGenerateTaxLabel;
    private javax.swing.JLabel GPGenerateTotalDeduction;
    private javax.swing.JLabel GPGenerateTotalDeductionLabel;
    private javax.swing.JPanel GPGeneratorPanel;
    private javax.swing.JButton GPGetCompensationInforButton;
    private javax.swing.JPanel GPInformationViewPanel;
    private javax.swing.JPanel GPManageHours;
    private javax.swing.JButton GPManageHoursResetSearchButton;
    private javax.swing.JButton GPManageHoursSearchButton;
    private javax.swing.JComboBox<String> GPManageHoursSearchFromDate;
    private javax.swing.JLabel GPManageHoursSearchLabel;
    private javax.swing.JComboBox<String> GPManageHoursSearchMonth;
    private javax.swing.JComboBox<String> GPManageHoursSearchToDate;
    private javax.swing.JComboBox<String> GPManageHoursSearchYear;
    private javax.swing.JLabel GPPPSHourlyGrossRate;
    private javax.swing.JLabel GPPPSHoursWorked;
    private javax.swing.JLabel GPPSDailyGrossIncome;
    private javax.swing.JLabel GPPSDailyGrossRate;
    private javax.swing.JLabel GPPSDaysWorked;
    private javax.swing.JLabel GPPSEmployeeUID;
    private javax.swing.JLabel GPPSName;
    private javax.swing.JLabel GPPSNetIncome;
    private javax.swing.JLabel GPPSPeriod;
    private javax.swing.JButton GPPaySlipInfoDeletePayslip;
    private javax.swing.JPanel GPSTopPanel;
    private javax.swing.JButton GPSearchButton;
    private javax.swing.JTextField GPSearchField;
    private javax.swing.JLabel GPSearchLabel;
    private javax.swing.JTable GPTable;
    private javax.swing.JPanel GPTableDisplay;
    private javax.swing.JLabel GPTimeLogDate;
    private javax.swing.JLabel GPTimeLogDateLabel1;
    private javax.swing.JLabel GPTimeLogDateUpdate;
    private javax.swing.JLabel GPTimeLogDateUpdateLabel;
    private javax.swing.JPanel GPTimeLogDetailsCardPanel;
    private javax.swing.JPanel GPTimeLogDetailsUpdatePanel;
    private javax.swing.JPanel GPTimeLogDetailsViewPanel;
    private javax.swing.JButton GPTimeLogEditRenderedHoursButton;
    private javax.swing.JButton GPTimeLogPrintPayslip;
    private javax.swing.JLabel GPTimeLogRenderedHours;
    private javax.swing.JLabel GPTimeLogRenderedHoursLabel;
    private javax.swing.JTextField GPTimeLogRenderedHoursUpdate;
    private javax.swing.JLabel GPTimeLogRenderedHoursUpdateLabel;
    private javax.swing.JTable GPTimeLogTable;
    private javax.swing.JLabel GPTimeLogTimeIn;
    private javax.swing.JLabel GPTimeLogTimeInLabel;
    private javax.swing.JLabel GPTimeLogTimeInUpdate;
    private javax.swing.JLabel GPTimeLogTimeInUpdateLabel;
    private javax.swing.JLabel GPTimeLogTimeOut;
    private javax.swing.JLabel GPTimeLogTimeOutLabel;
    private javax.swing.JLabel GPTimeLogTimeOutUpdate;
    private javax.swing.JLabel GPTimeLogTimeOutUpdateLabel;
    private javax.swing.JButton GPTimeLogUpdateRenderedHoursButton;
    private javax.swing.JLabel GPTitle;
    private javax.swing.JLabel GPTopPanel;
    private javax.swing.JPanel GSMidPanel;
    private javax.swing.JButton GeneratePayslipButton;
    private javax.swing.JLabel ICLDateAndTime;
    private javax.swing.JLabel ICLDateAndTimeLabel;
    private javax.swing.JLabel ICLEmail;
    private javax.swing.JLabel ICLEmailLabel;
    private javax.swing.JLabel ICLEmployeeUID;
    private javax.swing.JLabel ICLEmployeeUIDLabel;
    private javax.swing.JLabel ICLMessageLabel;
    private javax.swing.JLabel ICLMessages;
    private javax.swing.JLabel ICLName;
    private javax.swing.JLabel ICLNameLabel;
    private javax.swing.JButton ICLSearchButton;
    private javax.swing.JTextField ICLSearchField;
    private javax.swing.JLabel ICLSearchLabel;
    private javax.swing.JButton ICLStatusButton;
    private javax.swing.JLabel ICLStatusLabel;
    private javax.swing.JLabel ICLSubject;
    private javax.swing.JLabel ICLSubjectLabel;
    private javax.swing.JLabel ICLSupportID;
    private javax.swing.JLabel ICLSupportIDLabel;
    private javax.swing.JTable ICLTable;
    private javax.swing.JLabel ICLTitleLabel;
    private javax.swing.JPanel ICLTopPanel;
    private javax.swing.JLabel InvalidEmailLabel;
    private javax.swing.JLabel InvalidMessageLabel;
    private javax.swing.JLabel InvalidNameLabel;
    private javax.swing.JLabel InvalidSubjectLabel;
    private javax.swing.JLabel InvalidUIDLabel;
    private javax.swing.JButton MEADDAddEmployeeButton;
    private javax.swing.JLabel MEAddAddressLabel;
    private javax.swing.JButton MEAddBackButton;
    private javax.swing.JComboBox<String> MEAddCIAccountType;
    private javax.swing.JLabel MEAddCIAccountTypeLabel;
    private javax.swing.JTextField MEAddCIBasicPay;
    private javax.swing.JLabel MEAddCIBasicPayLabel;
    private javax.swing.JComboBox<String> MEAddCIDateStartDate;
    private javax.swing.JComboBox<String> MEAddCIDateStartMonth;
    private javax.swing.JComboBox<String> MEAddCIDateStartYear;
    private javax.swing.JLabel MEAddCIDateStartedLabel;
    private javax.swing.JTextField MEAddCIEmail;
    private javax.swing.JLabel MEAddCIEmailLabel;
    private javax.swing.JTextField MEAddCIEmployeeUID;
    private javax.swing.JLabel MEAddCIEmployeeUIDLabel;
    private javax.swing.JTextField MEAddCIPosition;
    private javax.swing.JLabel MEAddCIPositionLabel;
    private javax.swing.JComboBox<String> MEAddCIStatus;
    private javax.swing.JLabel MEAddCIStatusLabel;
    private javax.swing.JPanel MEAddCompensationDetailsPanel;
    private javax.swing.JPanel MEAddConpanyInformation;
    private javax.swing.JLabel MEAddContactNumberLabel;
    private javax.swing.JLabel MEAddContactPersonLabel;
    private javax.swing.JPanel MEAddEmegencyContactPanel;
    private javax.swing.JTextField MEAddEmerAddress;
    private javax.swing.JTextField MEAddEmerContactNumber;
    private javax.swing.JTextField MEAddEmerContactPerson;
    private javax.swing.JTextField MEAddEmerRelationship;
    private javax.swing.JButton MEAddEmployeeButton;
    private javax.swing.JPanel MEAddEnderPanel;
    private javax.swing.JPanel MEAddFieldsPanel;
    private javax.swing.JTextField MEAddGIDHDMF1;
    private javax.swing.JTextField MEAddGIDHDMF2;
    private javax.swing.JTextField MEAddGIDHDMF3;
    private javax.swing.JTextField MEAddGIDPHIC1;
    private javax.swing.JTextField MEAddGIDPHIC2;
    private javax.swing.JTextField MEAddGIDPHIC3;
    private javax.swing.JTextField MEAddGIDSSS1;
    private javax.swing.JTextField MEAddGIDSSS2;
    private javax.swing.JTextField MEAddGIDSSS3;
    private javax.swing.JTextField MEAddGIDTIN1;
    private javax.swing.JTextField MEAddGIDTIN2;
    private javax.swing.JTextField MEAddGIDTIN3;
    private javax.swing.JPanel MEAddGovIDInformationPanel;
    private javax.swing.JLabel MEAddHDMFLabel;
    private javax.swing.JLabel MEAddHDMFLabel1;
    private javax.swing.JLabel MEAddHDMFLabel11;
    private javax.swing.JLabel MEAddHDMFLabel12;
    private javax.swing.JLabel MEAddHDMFLabel13;
    private javax.swing.JLabel MEAddHDMFLabel14;
    private javax.swing.JLabel MEAddHDMFLabel15;
    private javax.swing.JLabel MEAddHDMFLabel16;
    private javax.swing.JLabel MEAddHDMFLabel17;
    private javax.swing.JLabel MEAddHDMFLabel2;
    private javax.swing.JLabel MEAddHDMFLabel3;
    private javax.swing.JLabel MEAddHDMFLabel4;
    private javax.swing.JLabel MEAddHDMFLabel5;
    private javax.swing.JLabel MEAddHDMFLabel6;
    private javax.swing.JLabel MEAddHDMFLabel7;
    private javax.swing.JLabel MEAddHDMFLabel8;
    private javax.swing.JLabel MEAddHDMFLabel9;
    private javax.swing.JLabel MEAddPHICLabel;
    private javax.swing.JTextField MEAddPIAddress;
    private javax.swing.JLabel MEAddPIAddressLabel;
    private javax.swing.JComboBox<String> MEAddPIBirthDate;
    private javax.swing.JComboBox<String> MEAddPIBirthMonth;
    private javax.swing.JComboBox<String> MEAddPIBirthYear;
    private javax.swing.JLabel MEAddPIBirthdayLabel;
    private javax.swing.JRadioButton MEAddPIFemale;
    private javax.swing.JTextField MEAddPIFirstName;
    private javax.swing.JLabel MEAddPIFirstNameLabel;
    private javax.swing.JLabel MEAddPIGenderLabel;
    private javax.swing.JTextField MEAddPILastName;
    private javax.swing.JLabel MEAddPILastNameLabel;
    private javax.swing.JRadioButton MEAddPIMale;
    private javax.swing.JComboBox<String> MEAddPIMaritalStatus;
    private javax.swing.JLabel MEAddPIMaritalStatusLabel;
    private javax.swing.JTextField MEAddPIMiddleName;
    private javax.swing.JLabel MEAddPIMiddleNameLabel;
    private javax.swing.JTextField MEAddPIMobileNumber;
    private javax.swing.JLabel MEAddPIMobileNumberLabel;
    private javax.swing.JPanel MEAddPanel;
    private javax.swing.JPanel MEAddProfileInformation;
    private javax.swing.JLabel MEAddRelationshipLabel;
    private javax.swing.JLabel MEAddSSSLabel;
    private javax.swing.JLabel MEAddTINLabel;
    private javax.swing.JLabel MEAddTitleLabel;
    private javax.swing.JPanel MECardPanel;
    private javax.swing.JButton MECheckInfoButton;
    private javax.swing.JButton MEDeleteEmployeeButton;
    private javax.swing.ButtonGroup MEGenderRadio;
    private javax.swing.JButton MEInfoBackButton;
    private javax.swing.JLabel MEInfoCDBasicPay;
    private javax.swing.JLabel MEInfoCDBasicPayLabel;
    private javax.swing.JLabel MEInfoCIAccountType;
    private javax.swing.JLabel MEInfoCIAccountTypeLabel;
    private javax.swing.JLabel MEInfoCIDateStarted;
    private javax.swing.JLabel MEInfoCIDateStartedLabel;
    private javax.swing.JLabel MEInfoCIEmail;
    private javax.swing.JLabel MEInfoCIEmailLabel;
    private javax.swing.JLabel MEInfoCIEmployeeUID;
    private javax.swing.JLabel MEInfoCIEmployeeUIDLabel;
    private javax.swing.JLabel MEInfoCIPosition;
    private javax.swing.JLabel MEInfoCIPositionLabel;
    private javax.swing.JLabel MEInfoCIStatus;
    private javax.swing.JLabel MEInfoCIStatusLabel;
    private javax.swing.JPanel MEInfoCompensationDetailsPanel;
    private javax.swing.JPanel MEInfoContactInformationPanel;
    private javax.swing.JPanel MEInfoEmegencyContactPanel;
    private javax.swing.JLabel MEInfoEmerAddress;
    private javax.swing.JLabel MEInfoEmerAddressLabel;
    private javax.swing.JLabel MEInfoEmerContactNumbe;
    private javax.swing.JLabel MEInfoEmerContactNumbeLabel;
    private javax.swing.JLabel MEInfoEmerContactPerson;
    private javax.swing.JLabel MEInfoEmerContactPersonLabel;
    private javax.swing.JLabel MEInfoEmerRelationship;
    private javax.swing.JLabel MEInfoEmerRelationshipLabel;
    private javax.swing.JLabel MEInfoGIDHDMF;
    private javax.swing.JLabel MEInfoGIDHDMFLabel;
    private javax.swing.JLabel MEInfoGIDPHIC;
    private javax.swing.JLabel MEInfoGIDPHICLabel;
    private javax.swing.JLabel MEInfoGIDSSS;
    private javax.swing.JLabel MEInfoGIDSSSLabel;
    private javax.swing.JLabel MEInfoGIDTIN;
    private javax.swing.JLabel MEInfoGIDTINLabel;
    private javax.swing.JPanel MEInfoGovIDInformationPanel;
    private javax.swing.JLabel MEInfoPIAddress;
    private javax.swing.JLabel MEInfoPIAddressLabel;
    private javax.swing.JLabel MEInfoPIBirthdate;
    private javax.swing.JLabel MEInfoPIBirthdateLabel;
    private javax.swing.JLabel MEInfoPIGender;
    private javax.swing.JLabel MEInfoPIGenderLabel;
    private javax.swing.JLabel MEInfoPIMaritalStatus;
    private javax.swing.JLabel MEInfoPIMaritalStatusLabel;
    private javax.swing.JLabel MEInfoPIMobileNumber;
    private javax.swing.JLabel MEInfoPIMobileNumberLabel;
    private javax.swing.JLabel MEInfoPIName;
    private javax.swing.JLabel MEInfoPINameLabel;
    private javax.swing.JPanel MEInfoPersonalInformationPanel;
    private javax.swing.JLabel MEInfoTitleLabel;
    private javax.swing.JButton MEInfoUpdateEmployeeButton;
    private javax.swing.JPanel MEInformationPanel;
    private javax.swing.JPanel MEMidPanel1;
    private javax.swing.JPanel MEMidPanel2;
    private javax.swing.JPanel MEMidPanel3;
    private javax.swing.JPanel MEMidPanel4;
    private javax.swing.JTable METable;
    private javax.swing.JPanel METablePanel;
    private javax.swing.JButton METableSearchButton;
    private javax.swing.JTextField METableSearchField;
    private javax.swing.JLabel METableSearchLabel;
    private javax.swing.JLabel METitleLabel2;
    private javax.swing.JPanel METopPanel;
    private javax.swing.JButton MEUDPATEupdateEmployeeButton;
    private javax.swing.JLabel MEUpdateAddressLabel;
    private javax.swing.JButton MEUpdateBackButton;
    private javax.swing.JComboBox<String> MEUpdateCIAccountType;
    private javax.swing.JLabel MEUpdateCIAccountTypeLabel;
    private javax.swing.JTextField MEUpdateCIBasicPay;
    private javax.swing.JLabel MEUpdateCIBasicPayLabel;
    private javax.swing.JComboBox<String> MEUpdateCIDateStartDate;
    private javax.swing.JComboBox<String> MEUpdateCIDateStartMonth;
    private javax.swing.JComboBox<String> MEUpdateCIDateStartYear;
    private javax.swing.JLabel MEUpdateCIDateStartedLabel;
    private javax.swing.JTextField MEUpdateCIEmail;
    private javax.swing.JLabel MEUpdateCIEmailLabel;
    private javax.swing.JTextField MEUpdateCIEmployeeUID;
    private javax.swing.JLabel MEUpdateCIEmployeeUIDLabel;
    private javax.swing.JTextField MEUpdateCIPosition;
    private javax.swing.JLabel MEUpdateCIPositionLabel;
    private javax.swing.JComboBox<String> MEUpdateCIStatus;
    private javax.swing.JLabel MEUpdateCIStatusLabel;
    private javax.swing.JPanel MEUpdateCompensationDetailsPanel;
    private javax.swing.JPanel MEUpdateConpanyInformation;
    private javax.swing.JLabel MEUpdateContactNumberLabel;
    private javax.swing.JPanel MEUpdateEmegencyContactPanel;
    private javax.swing.JTextField MEUpdateEmerAddress;
    private javax.swing.JTextField MEUpdateEmerContactNumber;
    private javax.swing.JTextField MEUpdateEmerContactPerson;
    private javax.swing.JLabel MEUpdateEmerContactPersonLabel;
    private javax.swing.JTextField MEUpdateEmerRelationship;
    private javax.swing.JButton MEUpdateEmployeeButton;
    private javax.swing.JPanel MEUpdateEnderPanel;
    private javax.swing.JPanel MEUpdateFieldsPanel;
    private javax.swing.JTextField MEUpdateGIDHDMF1;
    private javax.swing.JTextField MEUpdateGIDHDMF2;
    private javax.swing.JTextField MEUpdateGIDHDMF3;
    private javax.swing.JTextField MEUpdateGIDPHIC1;
    private javax.swing.JTextField MEUpdateGIDPHIC2;
    private javax.swing.JTextField MEUpdateGIDPHIC3;
    private javax.swing.JTextField MEUpdateGIDSSS1;
    private javax.swing.JTextField MEUpdateGIDSSS2;
    private javax.swing.JTextField MEUpdateGIDSSS3;
    private javax.swing.JTextField MEUpdateGIDTIN1;
    private javax.swing.JTextField MEUpdateGIDTIN2;
    private javax.swing.JTextField MEUpdateGIDTIN3;
    private javax.swing.JPanel MEUpdateGovIDInformationPanel;
    private javax.swing.JLabel MEUpdateHDMFLabel;
    private javax.swing.JLabel MEUpdatePHICLabel;
    private javax.swing.JTextField MEUpdatePIAddress;
    private javax.swing.JLabel MEUpdatePIAddressLabel;
    private javax.swing.JComboBox<String> MEUpdatePIBirthDate;
    private javax.swing.JComboBox<String> MEUpdatePIBirthMonth;
    private javax.swing.JComboBox<String> MEUpdatePIBirthYear;
    private javax.swing.JLabel MEUpdatePIBirthdayLabel;
    private javax.swing.JRadioButton MEUpdatePIFemale;
    private javax.swing.JTextField MEUpdatePIFirstName;
    private javax.swing.JLabel MEUpdatePIFirstNameLabel;
    private javax.swing.JLabel MEUpdatePIGenderLabel;
    private javax.swing.JTextField MEUpdatePILastName;
    private javax.swing.JLabel MEUpdatePILastNameLabel;
    private javax.swing.JRadioButton MEUpdatePIMale;
    private javax.swing.JComboBox<String> MEUpdatePIMaritalStatus;
    private javax.swing.JLabel MEUpdatePIMaritalStatusLabel;
    private javax.swing.JTextField MEUpdatePIMiddleName;
    private javax.swing.JLabel MEUpdatePIMiddleNameLabel;
    private javax.swing.JTextField MEUpdatePIMobileNumber;
    private javax.swing.JLabel MEUpdatePIMobileNumberLabel;
    private javax.swing.JPanel MEUpdatePanel;
    private javax.swing.JPanel MEUpdateProfileInformation;
    private javax.swing.JLabel MEUpdateRelationshipLabel;
    private javax.swing.JLabel MEUpdateSSSLabel;
    private javax.swing.JLabel MEUpdateTINLabel;
    private javax.swing.JLabel MEUpdateTitleLabel;
    private javax.swing.JLabel PCDBasicPay;
    private javax.swing.JLabel PCIAccountType;
    private javax.swing.JLabel PCIDateStarted;
    private javax.swing.JLabel PCIEmail;
    private javax.swing.JLabel PCIEmployeeUID;
    private javax.swing.JLabel PCIPosition;
    private javax.swing.JLabel PCIStatus;
    private javax.swing.JLabel PDOtherLoan;
    private javax.swing.JLabel PDOtherLoanLabel;
    private javax.swing.JLabel PDOtherLoanLabel1;
    private javax.swing.JLabel PDPagibig;
    private javax.swing.JLabel PDPagibigLabel;
    private javax.swing.JLabel PDPagibigLabel1;
    private javax.swing.JLabel PDPagibigLoan;
    private javax.swing.JLabel PDPagibigLoanLabel;
    private javax.swing.JLabel PDPagibigLoanLabel1;
    private javax.swing.JLabel PDPhilhealth;
    private javax.swing.JLabel PDPhilhealthLabel;
    private javax.swing.JLabel PDPhilhealthLabel1;
    private javax.swing.JLabel PDSSS;
    private javax.swing.JLabel PDSSSLabel;
    private javax.swing.JLabel PDSSSLabel2;
    private javax.swing.JLabel PDSSSLabel3;
    private javax.swing.JLabel PDSSSLoan;
    private javax.swing.JLabel PDSSSLoanLabel;
    private javax.swing.JLabel PDSSSLoanLabel1;
    private javax.swing.JLabel PDTax;
    private javax.swing.JLabel PDTaxLabel;
    private javax.swing.JLabel PDTaxLabel3;
    private javax.swing.JLabel PDTotalDeduction;
    private javax.swing.JLabel PDTotalDeductionLabel;
    private javax.swing.JLabel PDTotalDeductionLabel1;
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
    private javax.swing.JLabel PPSDailyGrossIncomeLabel1;
    private javax.swing.JLabel PPSDailyGrossRate;
    private javax.swing.JLabel PPSDailyGrossRateLabel1;
    private javax.swing.JLabel PPSDailyGrossRateLabel2;
    private javax.swing.JLabel PPSDaysWorked;
    private javax.swing.JLabel PPSDaysWorkedLabel;
    private javax.swing.JLabel PPSDaysWorkedLabel1;
    private javax.swing.JLabel PPSEmployeeUID;
    private javax.swing.JLabel PPSEmployeeUIDLabel;
    private javax.swing.JLabel PPSEmployeeUIDLabel1;
    private javax.swing.JLabel PPSHourlyGrossRate;
    private javax.swing.JLabel PPSHourlyGrossRateLabel;
    private javax.swing.JLabel PPSHourlyGrossRateLabel1;
    private javax.swing.JLabel PPSHoursWorked;
    private javax.swing.JLabel PPSHoursWorkedLabel;
    private javax.swing.JLabel PPSHoursWorkedLabel1;
    private javax.swing.JLabel PPSName;
    private javax.swing.JLabel PPSNameLabel;
    private javax.swing.JLabel PPSNameLabel1;
    private javax.swing.JLabel PPSNetIncome;
    private javax.swing.JLabel PPSNetIncomeLabel;
    private javax.swing.JLabel PPSNetIncomeLabel1;
    private javax.swing.JLabel PPSPeriod;
    private javax.swing.JLabel PPSPeriodLabel;
    private javax.swing.JLabel PPSPeriodLabel1;
    private javax.swing.JButton PPrintPaySlip;
    private javax.swing.JLabel PSTitle;
    private javax.swing.JPanel PayslipForm;
    private javax.swing.JPanel PayslipGeneratorPanel;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSeparator Separator2;
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
    private javax.swing.JPanel TLTopPanel;
    private javax.swing.JButton TimeLogButton;
    private javax.swing.JLabel TopBackground;
    private javax.swing.JLabel TopBackground2;
    private javax.swing.JLabel TopBackground3;
    private javax.swing.JLabel TopBackground6;
    private javax.swing.JLabel TopBackground7;
    private javax.swing.JLabel TopBackground8;
    private javax.swing.JButton contactSupportSendButton;
    private javax.swing.JButton generatePaySlipButton;
    private javax.swing.JPanel generatePayslipPanel;
    private javax.swing.JLabel homeBckg;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homePayslipPanel;
    private javax.swing.JPanel homeProfilePanel;
    private javax.swing.JPanel homeTimeLogPanel;
    private javax.swing.JLabel homeWelcomeUserLabel;
    private javax.swing.JPanel inquiryAndConcernLogPanel;
    private javax.swing.JButton inquiryLogButton;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton manageEmployeeButton;
    private javax.swing.JPanel manageEmployeePanel;
    private javax.swing.JPanel payslipDeductionPanel;
    private javax.swing.JPanel payslipDeductionPanel1;
    private javax.swing.JLabel payslipFYILabel;
    private javax.swing.JPanel payslipMidPanel;
    private javax.swing.JPanel payslipPanel;
    private javax.swing.JButton payslipPayPeriodButton;
    private javax.swing.JLabel payslipPayPeriodLabel;
    private javax.swing.JComboBox<String> payslipPayPeriodList;
    private javax.swing.JPanel payslipPayslipSummaryPanel;
    private javax.swing.JPanel payslipPayslipSummaryPanel1;
    private javax.swing.JLabel payslipTitlePanel;
    private javax.swing.JPanel payslipTopPanel;
    private javax.swing.JButton payslipsButton;
    private javax.swing.JPanel personalInformationPanel16;
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
    private javax.swing.JPanel profileTopPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton supportButton;
    private javax.swing.JPanel supportPanel;
    private javax.swing.JPanel supportSubTopPanel;
    private javax.swing.JButton timeLogButton;
    private javax.swing.JPanel timeLogPanel;
    private javax.swing.JLabel topLoggedFullName;
    private javax.swing.JLabel topLogo;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel topTimeUpdateLabel;
    private javax.swing.JLabel welcomeUserLabel4;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 

    InquiryAndConcernLogActions ICLTableAction = new InquiryAndConcernLogActions();
    ContactSupportAction CSAction = new ContactSupportAction();
    ShowCurrentLoggedInUser LoggedInUser = new ShowCurrentLoggedInUser();
    ManageEmployeeTable addEmployee = new ManageEmployeeAddEmployee();
    ManageEmployeeTable displayAllEmployee = new ManageEmployeeTable();
    ManageEmployeeTable checkEmployeeDetails = new ManageEmployeeGetInformation();
    ManageEmployeeTable updateEmployee = new ManageEmployeeUpdateEmployee();
    ManageEmployeeTable generatePayslip = new ManageEmployeeGeneratePayslip();
    DailyTimeRecordAction TimeLogAction = new DailyTimeRecordAction();
    DailyTimeRecordAction DisplayTimeLog = new DisplayTimeLogAction();
    GeneratePayslip GeneratePayslip = new GeneratePayslip();

    private void isTimeIn() {

        String Database = new DatabaseLocation().getDatabaseLocation();
        int employeeUID = getEmployeeUID();
        Date startDate = new Date(); // use whatever start date you need
        String latestDate;
        try {
            Connection conn = DriverManager.getConnection(Database);
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM `employee_time_log` WHERE `employee_uid` = ? AND `date` >= ? ORDER BY `date` DESC LIMIT 1");
            stmt.setInt(1, employeeUID);
            stmt.setString(2, new SimpleDateFormat("yyyy-MM-dd").format(startDate));
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
        } catch (SQLException e) {
            System.err.println("Failed to execute SQL query: " + e.getMessage());
        }
    }

    String time;

    public void run() {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy | hh:mm:ss a");
            Date date = calendar.getTime();
            time = dateFormat.format(date);
            topTimeUpdateLabel.setText(time);
        }
    }

    private String username;
    private String password;
    private int UID;

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

    void changeCard(Component Card) {
        rightPanel.removeAll();
        rightPanel.add(Card);
        rightPanel.repaint();
        rightPanel.revalidate();
    }

    void changeMECard(Component Card) {
        MECardPanel.removeAll();
        MECardPanel.add(Card);
        MECardPanel.repaint();
        MECardPanel.revalidate();
    }

    void changeGPCardPanelCard(Component Card) {
        GPCardPanel.removeAll();
        GPCardPanel.add(Card);
        GPCardPanel.repaint();
        GPCardPanel.revalidate();
    }

    void GPTimeLogDetailsCardPanelCard(Component Card) {
        GPTimeLogDetailsCardPanel.removeAll();
        GPTimeLogDetailsCardPanel.add(Card);
        GPTimeLogDetailsCardPanel.repaint();
        GPTimeLogDetailsCardPanel.revalidate();
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

    private void deleteEmployee() {
        String Database = new DatabaseLocation().getDatabaseLocation();

        DefaultTableModel tableModel = (DefaultTableModel) METable.getModel();
        int selectedIndex = METable.getSelectedRow();
        int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
        String fullName = tableModel.getValueAt(selectedIndex, 1).toString() + " " + tableModel.getValueAt(selectedIndex, 2).toString() + " " + tableModel.getValueAt(selectedIndex, 3).toString();
        String deleteCompanyInfoQuery = "DELETE FROM `employee_company_informations` WHERE `employee_uid` = ?";
        String deletePersonalInfoQuery = "DELETE FROM `employee_personal_informations` WHERE `employee_uid` = ?";
        String deleteGovIDInforQuery = "DELETE FROM `employee_government_id_info` WHERE `employee_uid`=?";
        String deleteEmergencyInfoQuery = "DELETE FROM `employee_emergency_contact` WHERE `employee_uid`=?";
        String deleteLoginInfoQuery = "DELETE FROM `employee_logins` WHERE `employee_uid`=?";

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to Delete " + fullName + " from the record?", "Manage Employee", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement deletePersonalInfoStmt = connection.prepareStatement(deletePersonalInfoQuery);
                PreparedStatement deleteCompanyInfoStmt = connection.prepareStatement(deleteCompanyInfoQuery);
                PreparedStatement deleteGovernmentInfoStmt = connection.prepareStatement(deleteGovIDInforQuery);
                PreparedStatement deleteEmegencyInfoStmt = connection.prepareStatement(deleteEmergencyInfoQuery);
                PreparedStatement deleteLoginInfoStmt = connection.prepareStatement(deleteLoginInfoQuery);

                deletePersonalInfoStmt.setInt(1, employeeUID);
                deleteCompanyInfoStmt.setInt(1, employeeUID);
                deleteGovernmentInfoStmt.setInt(1, employeeUID);
                deleteEmegencyInfoStmt.setInt(1, employeeUID);
                deleteLoginInfoStmt.setInt(1, employeeUID);

                int rowsDeletedPersonalInfo = deletePersonalInfoStmt.executeUpdate();
                int rowsDeletedCompanyInfo = deleteCompanyInfoStmt.executeUpdate();
                int rowsDeletedGovernmentInfo = deleteGovernmentInfoStmt.executeUpdate();
                int rowsDeletedEmegencyInfo = deleteEmegencyInfoStmt.executeUpdate();
                int rowsDeletedLoginInfo = deleteLoginInfoStmt.executeUpdate();

                if (rowsDeletedPersonalInfo > 0 || rowsDeletedCompanyInfo > 0 || rowsDeletedGovernmentInfo > 0 || rowsDeletedEmegencyInfo > 0 || rowsDeletedLoginInfo > 0) {
                    JOptionPane.showMessageDialog(this, "Employee deleted successfully.", "Employee Management", JOptionPane.INFORMATION_MESSAGE);
                    displayAllEmployee.displayEmployeeTable(METable);
                } else {
                    JOptionPane.showMessageDialog(this, "No data found for deletion.", "Employee Management", JOptionPane.ERROR_MESSAGE);
                }

                connection.close();
                deletePersonalInfoStmt.close();
                deleteCompanyInfoStmt.close();
                deleteGovernmentInfoStmt.close();
                deleteEmegencyInfoStmt.close();
                deleteLoginInfoStmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void generateGPEmployeePayslipsTable() {
        String Database = new DatabaseLocation().getDatabaseLocation();
        DefaultTableModel tableModel = (DefaultTableModel) GPTable.getModel();
        int selectedIndex = GPTable.getSelectedRow();
        int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
        String query = "SELECT * FROM `employee_payslip` WHERE `employee_uid`= ? ";
        try {
            Connection connection = DriverManager.getConnection(Database);
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, employeeUID);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel payslipTableModel = (DefaultTableModel) GPEmployeePayslipsTable.getModel();
            payslipTableModel.setRowCount(0);
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getInt("employee_uid"));
                vector.add(rs.getString("first_name"));
                vector.add(rs.getString("middle_name"));
                vector.add(rs.getString("last_name"));
                vector.add(rs.getString("pay_period"));
                vector.add(rs.getString("days_worked"));
                vector.add(rs.getString("hours_worked"));
                vector.add(rs.getString("hourly_gross_rate"));
                vector.add(rs.getString("daily_gross_rate"));
                vector.add(rs.getString("gross_income"));
                vector.add(rs.getString("net_income"));
                vector.add(rs.getString("PAGIBIG"));
                vector.add(rs.getString("PHIC"));
                vector.add(rs.getString("SSS"));
                vector.add(rs.getString("Tax"));
                vector.add(rs.getString("pagibig_loan"));
                vector.add(rs.getString("sss_loan"));
                vector.add(rs.getString("other_loan"));
                vector.add(rs.getString("total_deduction"));
                payslipTableModel.addRow(vector);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(InquiryAndConcernLogActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    private void onClickEmployeePayslipTable() {
        DefaultTableModel tableModel = (DefaultTableModel) GPEmployeePayslipsTable.getModel();
        int selectedIndex = GPEmployeePayslipsTable.getSelectedRow();
        GPPSName.setText(tableModel.getValueAt(selectedIndex, 1).toString() + " " + tableModel.getValueAt(selectedIndex, 2).toString() + " " + tableModel.getValueAt(selectedIndex, 3).toString());
        GPPSEmployeeUID.setText(tableModel.getValueAt(selectedIndex, 0).toString());
        GPPSPeriod.setText(tableModel.getValueAt(selectedIndex, 4).toString());
        GPPSDaysWorked.setText(tableModel.getValueAt(selectedIndex, 5).toString());
        GPPPSHoursWorked.setText(tableModel.getValueAt(selectedIndex, 6).toString());
        GPPPSHourlyGrossRate.setText(tableModel.getValueAt(selectedIndex, 7).toString());
        GPPSDailyGrossRate.setText(tableModel.getValueAt(selectedIndex, 8).toString());
        GPPSDailyGrossIncome.setText(tableModel.getValueAt(selectedIndex, 9).toString());
        GPPSNetIncome.setText(tableModel.getValueAt(selectedIndex, 10).toString());
        GPDPagibig.setText(tableModel.getValueAt(selectedIndex, 11).toString());
        GPDPhilhealth.setText(tableModel.getValueAt(selectedIndex, 12).toString());
        GPDSSS.setText(tableModel.getValueAt(selectedIndex, 13).toString());
        GPDTax.setText(tableModel.getValueAt(selectedIndex, 14).toString());
        GPDPagibigLoan.setText(tableModel.getValueAt(selectedIndex, 15).toString());
        GPDSSSLoan.setText(tableModel.getValueAt(selectedIndex, 16).toString());
        GPDOtherLoan.setText(tableModel.getValueAt(selectedIndex, 17).toString());
        GPDTotalDeduction.setText(tableModel.getValueAt(selectedIndex, 18).toString());
    }

    private void deletePayslip() {

        String Database = new DatabaseLocation().getDatabaseLocation();
        DefaultTableModel tableModel = (DefaultTableModel) GPEmployeePayslipsTable.getModel();
        int selectedIndex = GPEmployeePayslipsTable.getSelectedRow();
        int employeeUID = Integer.parseInt(tableModel.getValueAt(selectedIndex, 0).toString());
        String payPeriod = tableModel.getValueAt(selectedIndex, 4).toString();
        String fullName = tableModel.getValueAt(selectedIndex, 1).toString() + " " + tableModel.getValueAt(selectedIndex, 2).toString() + " " + tableModel.getValueAt(selectedIndex, 3).toString();
        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to delete this payslip? " + payPeriod + " for " + fullName, "Generate Payslip", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            try {

                System.out.println(payPeriod);
                System.out.println(employeeUID);
                Connection connection = DriverManager.getConnection(Database);
                PreparedStatement Stmt = connection.prepareStatement("DELETE FROM `employee_payslip` WHERE `employee_uid` = ? AND `pay_period` = ? ");

                Stmt.setInt(1, employeeUID);
                Stmt.setString(2, payPeriod);

                int rowsDeleted = Stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Payslip deleted successfully.", "Generate Paylip", JOptionPane.INFORMATION_MESSAGE);

                connection.close();
                Stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        GPPSName.setText("");
        GPPSEmployeeUID.setText("");
        GPPSPeriod.setText("");
        GPPSDaysWorked.setText("");
        GPPPSHoursWorked.setText("");
        GPPPSHourlyGrossRate.setText("");
        GPPSDailyGrossRate.setText("");
        GPPSDailyGrossIncome.setText("");
        GPPSNetIncome.setText("");
        GPDPagibig.setText("");
        GPDPhilhealth.setText("");
        GPDSSS.setText("");
        GPDTax.setText("");
        GPDPagibigLoan.setText("");
        GPDSSSLoan.setText("");
        GPDOtherLoan.setText("");
        GPDTotalDeduction.setText("");

    }
}
