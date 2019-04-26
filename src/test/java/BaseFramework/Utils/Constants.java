package BaseFramework.Utils;

import Program.ProgramProperties;

public class Constants {

    public static final String Path_TestData = ProgramProperties.Path_TestData;
    public static final String File_TestData = ProgramProperties.File_TestData;


    public static String UCAS_USERNAME = "bbell1";
    public static String PASSWORD = "Test123!";

    public static String EXCEL_FILE_PATH = "src\\test\\java\\Database\\Reference Documents\\DA.xlsx";

    public static String EXCEL_FILE_PATH_2 = "src\\test\\java\\Database\\DA2.xlsx";


    // Sheet Names per test
    public static String EXCEL_CREATE_ACCOUNT_SHEET_NAME = "01_Create Account";
    public static String CREATE_PROGRAMME_AND_MAKE_OFFER_SHEET_NAME = "02_PGT_Advance_OFFER";
    public static String EXCEL_CREATE_AND_APPLY_DOCTORAL_CHEMISTRY_RESEARCH_PHD_PROGRAMME_SHEET_NAME="03_Doctoral_Chem_Research_PHD";
    public static String EXCEL_CREATE_AND_APPLY_PGT_MANAGEMENT_MBA_PROGRAMME_SHEET_NAME="04_Management_MBA";
    public static String EXCEL_CREATE_AND_APPLY_SHORT_COURSE_SHEET_NAME="05_ShortCourse";
    public static String EXCEL_CREATE_AND_WITHDRAW_PROGRAMME_SHEET_NAME = "06_Withdraw_Application";
    public static String EXCEL_CREATE_AND_DEFER_PROGRAMME_SHEET_NAME = "07_RequestDeferral_Application";
    public static String EXCEL_CREATE_DATA_SHEET_NAME="ShortCourse Data";
    public static String EXCEL_CRM_DATA_SHEET_NAME="Recruit_Users";
}
