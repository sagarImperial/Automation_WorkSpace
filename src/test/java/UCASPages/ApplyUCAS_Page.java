package UCASPages;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplyUCAS_Page extends Driver_Init {


    public ApplyUCAS_Page(WebDriver driver) {
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
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[17]/div[2]/input[2]")
    WebElement permanentHome;

//    @FindBy(xpath = "//input[@id='countryOfBirthTextEntry']")
//    WebElement countryOfBirth;

    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[19]/div[11]/div[2]/span[1]/input[1]")
    WebElement countryOfBirthList;

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
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[19]/div[50]/div[2]/textarea[1]")
    WebElement disabilityNeeds;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[19]/div[54]/div[2]/input[1]")
    WebElement section1completed;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[19]/div[57]/input[2]")
    WebElement savePersonalDetails;
    @FindBy(xpath = "//a[contains(text(),'Choices')]")
    WebElement choices;
    @FindBy(xpath = "//a[contains(text(),'add a choice')]")
    WebElement addChoiceLink;
    @FindBy(xpath = "//input[@id='instButton']")
    WebElement institutionCode;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/span[1]/input[1]")
    WebElement courseCode;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/span[1]/input[1]")
    WebElement campusCode;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/span[1]/input[1]")
    WebElement startDate;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/input[2]")
    WebElement liveAtHome;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[13]/input[1]")
    WebElement saveChoices;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]/a[1]")
    WebElement education;
    @FindBy(xpath = "//select[@id='highestExpectedQualCombo']")
    WebElement highestLevelOfEducation;
    @FindBy(xpath = "//input[@id='chkComplete']")
    WebElement section3Completed;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[4]/div[1]/div[2]/input[2]")
    WebElement saveEducation;
    @FindBy(xpath = "//a[contains(text(),'add new school/college/centre')]")
    WebElement addNewSchool;
    @FindBy(xpath = "//input[@value='find...']")
    WebElement schoolName;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/select[1]")
    WebElement startMonth;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/select[2]")
    WebElement startYear;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/input[1]")
    WebElement attendance;
    @FindBy(xpath ="//select[@id='formalQualsCombo']")
    WebElement  formalQualification;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[10]/input[2]")
    WebElement saveSchoolDetails;


    public void enterLogin() {
        //loginApply.click();
        username_login.sendKeys("atestimperi2");
    }

    public void enterPassword() {
        password_login.sendKeys("Test123!");
    }

    public void loginButtobclick() {
        login_apply.click();
    }

    public void addPersonaDetails() throws Exception{
        personalDetails.click();

        permanentHome.click();
        Thread.sleep(2000);
        countryOfBirthList.click();
                //sendKeys("United Kingdom");
        // Actions actions = new Actions(driver);
        //actions.

        Thread.sleep(1000);

        String handle = driver.getWindowHandle();
        driver.switchTo().window(handle);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
        //driver.switchTo().defaultContent();
        //driver.findElement(By.xpath(".//a[contains(text(),'United Kingdom')]")).click();
        //.sendKeys("United Kingdom"); // Refactor to select from the list given on the site
        Select day = new Select(entryDay);
        day.selectByVisibleText("11");
        Select month = new Select(entryMonth);
        month.selectByVisibleText("October");
        Select year = new Select(entryYear);
        year.selectByVisibleText("2004");
        nationality.sendKeys("UK national");
        Thread.sleep(1000);
        permanentResidence.sendKeys("Afghanistan");
        Thread.sleep(1000);
        residentialCategory.sendKeys("UK Citizen - England");
        Thread.sleep(1000);
        Select fee = new Select(feeCode);
        fee.selectByIndex(1);
        Select workedInEU = new Select(workedEU);
        workedInEU.selectByVisibleText("No");
        Select parentSpouseInEU = new Select(parentEU);
        parentSpouseInEU.selectByVisibleText("No");
        Thread.sleep(1000);
        disabilityNeeds.sendKeys("No disability");
        Thread.sleep(1000);
        section1completed.click();
        savePersonalDetails.click();
        //logoutUCAS.click();
    }
    public void addChoices(){
        choices.click();
        addChoiceLink.click();
        institutionCode.click();
        courseCode.click();
        campusCode.click();
        liveAtHome.click();
        saveChoices.click();


    }
    public void addEducationDetails(){}
    public void addEmploymentDetails(){}
    public void addstatement(){}
    public void addReference(){}
    public void viewAllDetails(){}
    public void addPaymentDetails(){}

}
