package Program;

//import BaseFramework.Plumbing.Driver_Init;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static Program.ProgramProperties.Select_Test_Node;
import static Program.ProgramProperties.browser;


public class ApplicationEnviroment extends Driver_Init {

    public ApplicationEnviroment(WebDriver driver) {
        //initialize elements using Page Factory
        PageFactory.initElements(driver, this);
    }

//    public static ApplicationEnviroment App = new ApplicationEnviroment(driver);

    static WebElement EnvironmentTRNG;

    public class AppLink {
        public AppLink(WebDriver driver){
            PageFactory.initElements(driver, this);
        }

        static final String Imperial_HomePage = "http://www.imperial.ac.uk/";
        static final String WikiPage = "https://wiki.imperial.ac.uk/";
        static final String PWP_PROD = "http://www.imperial.ac.uk/people/david.dye";
//        static final String CRM_TEST = "https://imperialuktestcrm.elluciancrmrecruit.com/main.aspx";
        static final String CRM_DEVL = "https://imperialukdevlcrm.elluciancrmrecruit.com/main.aspx";
        static final String DA_DEVL_WFE = "https://imperialukdevl.elluciancrmrecruit.com/Apply/";
        static final String DA_TEST_WFE = "https://imperialuktest.elluciancrmrecruit.com/Apply/";
        static final String CRM_TEST = "https://imperialuktestcrm.elluciancrmrecruit.com/main.aspx";

        static final String DA_BILD_WFE = "https://imperialukbild.elluciancrmrecruit.com/Apply/";
        static final String CRM_BILD = "https://imperialukbildcrm.elluciancrmrecruit.com/main.aspx";

    }

    public class Env_Selet {

        static final String Build = "http://10.220.13.13:8500/";
        static final String Imperial_HomePage = "http://www.imperial.ac.uk/";
        static final String WikiPage = "http://www.imperial.ac.uk/";

    }

    public static void NavigationPage(String application) throws MalformedURLException {

        if (application.equals("Imperial Website")) {
            Driver_Init.GetDriver(Select_Test_Node, browser);
            driver.navigate().to(AppLink.Imperial_HomePage);
        } else if (application.equals("ImperialWiki")) {
            Driver_Init.GetDriver(Select_Test_Node, browser);
            driver.navigate().to(AppLink.WikiPage);
        } else if (application.equals("PWP PROD")) {
            Driver_Init.GetDriver(Select_Test_Node, browser);
            driver.navigate().to(AppLink.PWP_PROD);
        }else if (application.equals("CRM_TEST")) {
                driver.navigate().to(AppLink.CRM_TEST);
        } else if (application.equals("CRM_DEVL")) {
            driver.navigate().to(AppLink.CRM_DEVL);
        } else if (application.equals("DA_DEVL_WFE")) {
            driver.navigate().to(AppLink.DA_DEVL_WFE);
        } else if (application.equals("DA_TEST_WFE")) {
            driver.navigate().to(AppLink.DA_TEST_WFE);
        }
        else if (application.equals("DA_BILD_WFE")) {
            driver.navigate().to(AppLink.DA_BILD_WFE);
        } else if (application.equals("CRM_BILD")) {
            driver.navigate().to(AppLink.CRM_BILD);
        }else{
            System.out.println("URL not found");
        }

    }
}