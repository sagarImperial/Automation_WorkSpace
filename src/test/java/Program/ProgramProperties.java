package Program;

/*
#   Selection of  Hub / Node / Local  to run the tests
#   Default tests will run on Hub.
#   To run on Local  please  select  Local *****[Select_Test_Environment = "Local"] ***
#   Define the path for  Excel file, Logging .
#   Default Screenshot path is  at Node 1
#
*/


public class ProgramProperties {

 //*********Select Test_01 destination *******

//        public static final String Select_Test_Node = "Default";
     //static final String Select_Test_Node = "Local_Node";
        public static final String Select_Test_Node = "Local";

     // Select Environment
       static int build = 0;
       static int test = 1;
       static int prod = 2;
       public static int Select_Environment = build;

       //************Browser **************
           public static String browser = "chrome";
           //public static String browser = "firefox";
         // public static String browser = "IE";

    //Define Excel Path
        public static final String Path_TestData = "src/main/resources/Excel_Files/Impdata.xlsx";
        public static final String File_TestData = "Impdata.xlsx";

       // Screen Shot Location
        public static final String Path_ScreenShot = "//ICATESTS01/Selenium_Server/screenshot/PWP/";
}
