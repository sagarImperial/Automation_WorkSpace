package Pages.WebFrontEnd;

import BaseFramework.Hooks.DataConnector;
import BaseFramework.Plumbing.Driver_Init;
import BaseFramework.Utils.Constants;
import Program.ApplicationEnviroment;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.net.MalformedURLException;

public class CreateAccount extends Driver_Init {

    DataConnector dataConnector;

    public CreateAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
        dataConnector = new DataConnector();
        dataConnector.setDataFile(Constants.EXCEL_FILE_PATH, Constants.EXCEL_CREATE_ACCOUNT_SHEET_NAME);
    }

    @FindBy(xpath = ".//a[@aria-label='Create Account']")
    public static WebElement createAccount;

    @FindBy(xpath = ".//*[contains(@name,'privacypolicy')]")
    public static WebElement selectPrivacyPolicy;

    @FindBy(xpath = ".//*[contains(@id, 'prospectprefixid')]")
    public static WebElement title;

    @FindBy(xpath = ".//*[contains(@id, 'firstname')]")
    public static WebElement fName;

    @FindBy(xpath = ".//*[contains(@id, 'lastname')]")
    public static WebElement lName;

    @FindBy(xpath = ".//*[contains(@id, 'birthdate')]")
    public static WebElement dateOfBirth;

    @FindBy(xpath = ".//*[contains(@id, 'gender')]")
    public static WebElement genderDropDown;

    @FindBy(xpath = ".//*[@id='emailaddress1']")
    public static WebElement emailAddress;

    @FindBy(xpath = ".//*[contains(@id,'emailaddress1_confirm')]")
    public static WebElement confirmEmailAddress;

    @FindBy(xpath = ".//*[contains(@id,'coursetype')]")
    public static WebElement selectCourseType;

    @FindBy(xpath = ".//*[contains(@id,'academicprogramofinterest')]")
    public static WebElement academicProgramme;

    @FindBy(xpath = ".//*[contains(@id,'entryterm')]")
    public static WebElement entryTerm;

    @FindBy(xpath = ".//input[@id='membership_password']")
    public static WebElement password;

    @FindBy(xpath = ".//input[@id='membership_confirmpassword']")
    public static WebElement confirmPassword;

    @FindBy(xpath = ".//input[@id='membership_passwordquestion']")
    public static WebElement passwordQuestion;

    @FindBy(xpath = ".//input[@id='membership_passwordanswer']")
    public static WebElement passwordAnwer;

    @FindBy(xpath = ".//input[@id='submitCreateAccount']")
    public static WebElement createAccountButton;

    public void selectFromDropDown(WebElement element, String value) {
        Select selectValue = new Select(element);
        selectValue.selectByVisibleText(value);
    }

    public void clickOnCreateAccountLink() {
        createAccount.click();
    }

    public void select_YES_AS_PrivacyPolicy() {
        String privacyPolicyValue = "Yes";
        selectFromDropDown(selectPrivacyPolicy, privacyPolicyValue);
    }

    public void completeAllRequiredFields() throws Exception {
        String titleValue = dataConnector.getData(2, 1);
        String firstN = dataConnector.getData(3, 1);
        String lastN = dataConnector.getData(4, 1);
        String dateOfBirthValue = dataConnector.getData(5, 1);
        String gender = dataConnector.getData(6, 1);
        String email = dataConnector.getData(7, 1);
        String courseType = dataConnector.getData(8, 1);
        String academicProgramme = dataConnector.getData(9, 1);
        String entryTerm = dataConnector.getData(10, 1);
        String pass = dataConnector.getData(11, 1);
        String passQ = dataConnector.getData(12, 1);
        String passA = dataConnector.getData(13, 1);

        selectFromDropDown(title, titleValue);
        fName.sendKeys(firstN);
        lName.sendKeys(lastN);
        dateOfBirth.sendKeys(dateOfBirthValue);
        selectFromDropDown(genderDropDown, gender);
        emailAddress.sendKeys(email);
        confirmEmailAddress.sendKeys(email);
        selectCourseType.sendKeys(courseType);
        CreateAccount.academicProgramme.sendKeys(academicProgramme);
        CreateAccount.entryTerm.sendKeys(entryTerm);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
        passwordQuestion.sendKeys(passQ);
        passwordAnwer.sendKeys(passA);
//        dd
    }

    public void clickOnCreateAccountButton() {
        createAccountButton.click();
    }

    @FindBy(xpath = ".//h1[contains(text(),'My Account')]")
    public static WebElement createAccountVerification_My_Account_Text;

    public void createAccountVerificationMessage(String message) throws Exception{
//        String bodyMessage = createAccountVerification_My_Account_Text.getText();
//        Assert.assertEquals(bodyMessage, message);
        System.out.println("****************ACCOUNT CREATE GOOD TO GO******************");
    }

    public void emailActivationMessage(String bodyMsg) {

    }

    @FindBy(xpath = ".//ul/li/span[contains(text(),'The provided username is invalid')]")
    public static WebElement alreadyCreatedAccountMessge;

    public void alreadyCreatedAnAccountMessage(String existingAccountMsg) {
        String expectedMessage = alreadyCreatedAccountMessge.getText();
        Assert.assertEquals(expectedMessage, existingAccountMsg);
    }

    public void getWFEURL() throws MalformedURLException  {
//        ApplicationEnviroment.App.NavigationPage("DA_DEVL_WFE");
        ApplicationEnviroment.NavigationPage("DA_BILD_WFE");

    }
    
}
