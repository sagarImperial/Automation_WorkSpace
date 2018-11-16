package BaseFramework.Hooks;

import BaseFramework.Plumbing.Driver_Init;
import BaseFramework.Utils.Constants;
import Program.ProgramProperties;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.rules.Timeout;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import static BaseFramework.Plumbing.Driver_Init.driver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static BaseFramework.Plumbing.Driver_Init.GetDriver;
import static Program.ProgramProperties.Select_Test_Node;

//import org.testng.Reporter;


public class CheckoutHooks {


    // *** Browser Selcetion & Driver ***

    @Before(order = 0)
    public void openBrowser() throws MalformedURLException {

        String browser = System.getProperty("BROWSER");

        if (browser == null) {
            browser = "chrome";
        }

        GetDriver(Select_Test_Node, browser);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    //*** Taking Screen Shot on Scenario Failure and  Closing the  Browser ***

    @After(order = 0)
    public void getscreentshot(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            File scrFile = ((TakesScreenshot) Driver_Init.driver).getScreenshotAs(OutputType.FILE);
            DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");
            String destDir = ProgramProperties.Path_ScreenShot;
            new File(destDir).mkdirs();
            String destFile = dateFormat.format(new Date()) + scenario.getName() + ".png";
            byte[] data = FileUtils.readFileToByteArray(scrFile);
            scenario.embed(data, "image/png");

            Logger log = Logger.getLogger("Logger");
            log.debug("Fail");
            try {
                FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Reporter.setEscapeHtml(false);
            Reporter.log("Saved <a href=../screenshots/" + destFile + ">Screenshot</a>");

        }

        driver.close();
        driver.quit();
    }
}













