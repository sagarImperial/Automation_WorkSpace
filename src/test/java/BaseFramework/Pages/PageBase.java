package BaseFramework.Pages;

/******************************************************************************
 # BasePage Functionality
 # Select Text from DroppDown
 # Send Text to Text Box
 # Search Tex on Web Page
 # Assert Title on the Page
 # Application Navigation
 //****************************************************************************/

import BaseFramework.Utils.Constants;
import BaseFramework.Utils.ExceltestAPI;

import Program.ApplicationEnviroment;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.UUID;


public class PageBase {

    public static WebDriver driver;

    //Define Webelements here


    //Page Factory initial
    public PageBase(WebDriver driver) {
        //initialize elements
        PageFactory.initElements(driver, this);
    }


//    @Test
//    public String firstName() {
//        String[] name = {"Yurem", "Marshall", "Mara", "Noelle", "Forbe", "Adelyn", "Kirsten", "Laura", "Garrett"};
//        Random randomFirstName = new Random();
//        return name[randomFirstName.nextInt(name.length)];
//    }
//
//    @Test
//    public  String lastName() {
//        String[] name = {"Yurem", "Marshall", "Mara", "Noelle", "Forbe", "Adelyn", "Kirsten", "Laura", "Garrett"};
//        Random randomLastName = new Random();
//        System.out.println(name + "");
//        return name[randomLastName.nextInt(name.length)];
//    }
//

    // Select Text from DroppDown
    public static void SelectDroppDown(WebElement Menu, String txtvalue) {
        Select select = new Select(Menu);
        select.selectByVisibleText(txtvalue);
    }

    public static void SelectDroppDown(String Menu) {
        Select select = null;
        select.selectByVisibleText(Menu);
    }

    // Send Text to Text Box
    public static void SendText(WebElement UserID, String usern) {
        UserID.sendKeys(usern);
    }

    // Assert Title on the Page
    public static String Title(String arg0) {

        WebDriverWait wait = new WebDriverWait(driver, 18);
        wait.until(ExpectedConditions.titleIs(arg0));
        String Asserttitle = driver.getTitle();
        return Asserttitle;
    }

    public static WebElement TextContain(String arg0) {
        WebDriverWait wait = new WebDriverWait(driver, 18);
        WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("#spridenId")));
        return status;
    }

    public static void PageDown() {
    }

    // Get Yesterdays Date ****************
    private static String YesterdaysDate() {
        Date date = DateUtils.addDays(new Date(), -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);

    }

    // Generate Random Email ID
    public static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@ImpAutomation.com";
    }

    // Genrate Random DATE OF BIRTH
    public static String RandomDateOfBirth() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1970, 1995);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        String datecal = (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));

        return datecal;
    }

    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
