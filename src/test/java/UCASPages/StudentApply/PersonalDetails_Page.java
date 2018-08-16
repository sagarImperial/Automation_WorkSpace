package UCASPages.StudentApply;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class PersonalDetails_Page extends Driver_Init {


    public PersonalDetails_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    //@FindBy(xpath = "//a[contains(text(),'Log in')]")
    // WebElement loginApply;


    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username_login;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password_login;
    @FindBy(xpath = "//input[@value='log in']")
    WebElement login_apply;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutUCAS;
    @FindBy(xpath = "//a[contains(text(),'Personal details')]")
    WebElement personalDetails;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[17]/div[2]/input[1]")
    WebElement permanentHome;

    @FindBy(id = "countryOfBirthTextEntry")
    WebElement countryOfBirthTextField;

    @FindBy(xpath = "//select[@name='cboEntryUkDay']")
    WebElement entryDay;
    @FindBy(xpath = "//select[@name='cboEntryUkMonth']")
    WebElement entryMonth;
    @FindBy(xpath = "//select[@name='cboEntryUKyear']")
    WebElement entryYear;
    @FindBy(xpath = "//input[@id='nationalityTextEntry']")
    WebElement nationality;
    @FindBy(xpath = "//input[@id='areaOfResidenceTextEntry']")
    WebElement permanentResidence;
    @FindBy(xpath = "//input[@id='residentialCategoryTextEntry']")
    WebElement residentialCategory;
    @FindBy(xpath = "//select[@id='feeCodeCombo']")
    WebElement feeCode;
    @FindBy(xpath = "//select[@id='euAnswers']")
    WebElement workedEU;
    @FindBy(xpath = "//select[@id='parentSpouse']")
    WebElement parentEU;
    @FindBy(xpath = ".//input[@name='btnDisList1']")
    WebElement disabilityNeeds;
    @FindBy (xpath = ".//*[contains(text(),'No disability')]")
    WebElement place;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[19]/div[54]/div[2]/input[1]")
    WebElement section1completed;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[19]/div[57]/input[2]")
    WebElement savePersonalDetails;




    public void enterLogin() {
        //loginApply.click();
        username_login.sendKeys("atestimperi2");
    }

    public void enterPassword() {
        password_login.sendKeys("Test123!");
    }

    public void loginButtonclick() {
        login_apply.click();
    }

    public void addPersonaDetails() throws Exception {

        personalDetails.click();
        permanentHome.click();
        countryOfBirthTextField.clear();
        countryOfBirthTextField.sendKeys("United Kingdom");


        Select day = new Select(entryDay);
        day.selectByVisibleText("11");
        Select month = new Select(entryMonth);
        month.selectByVisibleText("October");
        Select year = new Select(entryYear);
        year.selectByVisibleText("2004");

        nationality.clear();
        nationality.sendKeys("UK national");
        permanentResidence.clear();
        permanentResidence.sendKeys("Aberdeen");
        residentialCategory.clear();
        residentialCategory.sendKeys("UK Citizen - England");

        Select fee = new Select(feeCode);
        fee.selectByIndex(1);
        Select workedInEU = new Select(workedEU);
        workedInEU.selectByVisibleText("No");
        Select parentSpouseInEU = new Select(parentEU);
        parentSpouseInEU.selectByVisibleText("No");

        Thread.sleep(2000);

         disabilityNeeds.click();
          Set handles = driver.getWindowHandles();
          System.out.println("Name of the 1st window is :--------------- " +handles );
          String parentWindowHandle =driver.getWindowHandle();
          handles.remove(parentWindowHandle);
          String winhandle = (String) handles.iterator().next();
          if(winhandle != parentWindowHandle){
              String childWindowHandle = winhandle;
              driver.switchTo().window(childWindowHandle);
              place.click();
              driver.switchTo().window(parentWindowHandle);
          }

        //section1completed.clear();
        section1completed.click();
        savePersonalDetails.click();
        //logoutUCAS.click();
    }


}
