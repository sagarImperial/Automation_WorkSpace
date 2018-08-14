package BaseFramework.Utils;

import Program.ProgramProperties;
import UCASPages.Registration_Page;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebDriver;


/**
 * Created by sjoshi10 on 08/12/2017.
 */
public class Constants {

    public static final String Path_TestData = ProgramProperties.Path_TestData;
    public static final String File_TestData = ProgramProperties.File_TestData;

    public static final String UCAS_URL = "https://2018.hep1undergrad.apply.ucasenvironments.com/appreg/SecurityServlet";



    public static String UCAS_USERNAME = "bbell1";
    public static String PASSWORD = "Test123!";


}
