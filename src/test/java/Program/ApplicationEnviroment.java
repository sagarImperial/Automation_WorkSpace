package Program;

//import BaseFramework.Plumbing.Driver_Init;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;

import static Program.ProgramProperties.Select_Test_Node;
import static Program.ProgramProperties.browser;

/**
 * Created by sjoshi10 on 11/10/2017.
 */
public class ApplicationEnviroment extends Driver_Init{

    public ApplicationEnviroment(WebDriver driver) {
        //initialize elements
        PageFactory.initElements(driver, this);
    }

  /*  public void openBrowser() throws MalformedURLException {
        String browser = System.getProperty("BROWSER");
        if(browser==null)
        {
            browser = System.getenv("BROWSER");
            if(browser==null)
            {
                browser= "chrome";
            }
        }
        //GetDriver(Select_Test_Node,browser);
    }*/
    static
    WebElement EnvironmentTRNG;

    public class AppLink {
        static final String Imperial_HomePage = "http://www.imperial.ac.uk/";
        static final String WikiPage = "https://wiki.imperial.ac.uk/";
        static final String PWP_PROD = "http://www.imperial.ac.uk/people/david.dye";
    }

    public class Env_Selet {
        static final String Build = "http://10.220.13.13:8500/";
        static final String Imperial_HomePage = "http://www.imperial.ac.uk/";
        static final String WikiPage = "http://www.imperial.ac.uk/";
    }

    public void NavigationPage(String application) throws MalformedURLException {

        if (application.equals("Imperial Website")) {
            Driver_Init.GetDriver(Select_Test_Node,browser);
            driver.navigate().to(AppLink.Imperial_HomePage);
        } else if (application.equals("ImperialWiki")) {
            Driver_Init.GetDriver(Select_Test_Node,browser);
            driver.navigate().to(AppLink.WikiPage);
        } else if (application.equals("PWP PROD")) {
            Driver_Init.GetDriver(Select_Test_Node,browser);
             driver.navigate().to(AppLink.PWP_PROD);

        } else {

        }

    }
}
