package BaseFramework.Plumbing;

//import com.btr.proxy.util.PlatformUtil;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static Program.ProgramProperties.*;
//import static Program.ProgramProperties.Local_Node_IP;
import static java.lang.System.setProperty;


public class Driver_Init {
    String baseUrl;
    public static String nodeURL;
    public static WebDriver driver;

    //public static String Select_Test_Node ="Default";
    //public static final String Select_Test_Node = "Local_Node";
    // public String Select_Test_Node = "Local";

    public static void GetDriver(String Select_Test_Node, String browser) throws MalformedURLException {

        //*****Selection of  Hub  or Node  or Local ***

        if (Select_Test_Node == "Default") {
            nodeURL = "http://icatests01.cc.ic.ac.uk:4444/wd/hub/";
            Remote_Browser(browser);

        } else if (Select_Test_Node == "Local_Node") {
            nodeURL = "http://155.198.136.120:5555/wd/hub/";
            //nodeURL = Local_Node;
            Remote_Browser(browser);

        } else if (Select_Test_Node == "Local") {
            Local_Browser(browser);
        }

    }
// this is a comment

    public static void Remote_Browser(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            setProperty("webdriver.Chrome", "src/main/resources/BrowserDriver/chromedriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.WINDOWS);
            capabilities.setCapability("chrome.binary", "C://Selelnium_Server//chrome.exe");
            driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("firefox")) {
            setProperty("webdriver.Firefox", "C://Selelnium_Server//gecodriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setBrowserName("firefox");
            capabilities.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src/main/resources/BrowserDriver/IEDriverServer.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setBrowserName("IE");
            capabilities.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
            driver.manage().window().maximize();
        }

    }

    public static void Local_Browser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/BrowserDriver/geckodriver.exe");
            FirefoxOptions options = new FirefoxOptions();
            options.setCapability("marionette", false);
            //WebDriver webDriver = new FirefoxDriver(options);
            driver = new FirefoxDriver(options);

        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src/main/resources/BrowserDriver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }


    }
}