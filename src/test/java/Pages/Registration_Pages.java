package Pages;

import BaseFramework.Plumbing.Driver_Init;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration_Pages extends Driver_Init {
    public Registration_Pages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//input[@name='btnRegister']")
    WebElement registerButton;

    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    //.//*[contains(@value,'next') and @class='submitBtn']
            WebElement nextBtnPage1;

    @FindBy(id = "termsCheckBox")
    WebElement checkBox;

    @FindBy(xpath = "/html[1]/body[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    WebElement nextBtnpage2;

    @FindBy(xpath = "//select[@id='titleCombo']")
    WebElement titleDropdown;

    @FindBy(xpath = "//select[@id='genderCombo']")
    WebElement genderDropdown;

    @FindBy(xpath = "//input[@id='forenameText']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='surnameText']")
    WebElement surname;

    @FindBy(xpath = "//select[@id='dobDayCombo']")
    WebElement dobDay;

    @FindBy(xpath = "//select[@id='dobMonthCombo']")
    WebElement dobMonth;

    @FindBy(xpath = "//select[@id='dobYearCombo']")
    WebElement dobYear;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[3]/form[1]/div[1]/div[10]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    WebElement nextBtnPage3;

    @FindBy(xpath = "//input[@id='locationRadioHome']")
    WebElement locationRadioBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[3]/form[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    WebElement nextBtnPage4;

    @FindBy(xpath = "//input[@id='houseNoText']")
    WebElement houseNumber;

    @FindBy(xpath = "//input[@id='postcodeText']")
    WebElement postcode;

    // Using this xpath for all Next buttons
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[3]/form[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    WebElement nextBtnPage5;

    @FindBy(xpath = "//input[@id='addrLine1Text']")
    WebElement postalAddress;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[7]/form[1]/div[1]/div[9]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    WebElement nextBtnPage6;

    @FindBy(xpath = "//input[@id='mobilePhoneText']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='emailText']")
    WebElement emailAddress;

    @FindBy(xpath = "//input[@id='emailConfirmText']")
    WebElement confirmEmailAddress;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[3]/form[1]/div[1]/div[9]/div[3]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]")
    WebElement nextbtnPage7;

    @FindBy(xpath = "//input[@id='passwordText']")
    WebElement password;

    @FindBy(xpath = "//input[@id='confirmPasswordText']")
    WebElement confirmPassword;

    @FindBy(xpath = "//select[@name='cboSecurityQuestion1']")
    WebElement securityQ1;

    @FindBy(xpath = "//input[@id='reply1Text']")
    WebElement answer1;

    @FindBy(xpath = "//select[@name='cboSecurityQuestion2']")
    WebElement securityQ2;

    @FindBy(xpath = "//input[@id='reply2Text']")
    WebElement answer2;

    @FindBy(xpath = "//select[@name='cboSecurityQuestion3']")
    WebElement securityQ3;

    @FindBy(xpath = "//input[@id='reply3Text']")
    WebElement answer3;

    @FindBy(xpath = "//select[@name='cboSecurityQuestion4']")
    WebElement securityQ4;

    @FindBy(xpath = "//input[@id='reply4Text']")
    WebElement answer4;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[3]/form[1]/div[1]/div[11]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/input[2]")
    WebElement nextBtnPage8;


    public static String FName = "Alexx";
    public static String LName = "Moorex";


    public void enterRegistrationBtn() throws Exception {


        registerButton.click();
        //Thread.sleep(5000);

        nextBtnPage1.click();
        //Thread.sleep(5000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,350)", "");

        checkBox.click();
        //Thread.sleep(5000);

        nextBtnpage2.click();
        //Thread.sleep(5000);

        Select drpTitle = new Select(titleDropdown);
        drpTitle.selectByVisibleText("Mr");

        Select drpGender = new Select(genderDropdown);
        drpGender.selectByVisibleText("Male");

        firstName.sendKeys(FName);
        surname.sendKeys(LName);

        Select dob_Day = new Select(dobDay);
        dob_Day.selectByVisibleText("10");

        Select dob_Month = new Select(dobMonth);
        dob_Month.selectByVisibleText("April");

        Select dob_Year = new Select(dobYear);
        dob_Year.selectByVisibleText("1999");

        nextBtnPage3.click();

        locationRadioBtn.click();
        //Thread.sleep(5000);
        nextBtnPage4.click();

        houseNumber.sendKeys((" Flat 12"));
        postcode.sendKeys("IG2 6LQ");
        nextBtnPage5.click();
        //Thread.sleep(5000);

        postalAddress.sendKeys("Flat 12");
        nextBtnPage6.click();
        //Thread.sleep(5000);

        mobileNumber.sendKeys("07777777777");
        emailAddress.sendKeys(FName + LName + "@test.com");
        confirmEmailAddress.sendKeys(FName + LName + "@test.com");
        nextbtnPage7.click();
        //Thread.sleep(5000);

        password.sendKeys("Test123!");
        confirmPassword.sendKeys("Test123!");

        Select secques1 = new Select(securityQ1);
        secques1.selectByIndex(1);
        answer1.sendKeys("Something");

        Select secques2 = new Select(securityQ2);
        secques2.selectByIndex(2);
        answer2.sendKeys("Something");

        Select secques3 = new Select(securityQ3);
        secques3.selectByIndex(3);
        answer3.sendKeys("Something");

        Select secques4 = new Select(securityQ4);
        secques4.selectByIndex(4);
        answer4.sendKeys("Something");

        nextBtnPage8.click();
        Thread.sleep(5000);


    }
    //public void  registrationProcessPage1() throws  Exception{
    //  nextBtnPage1.click();
    //  Thread.sleep(5000);
    // }

}
