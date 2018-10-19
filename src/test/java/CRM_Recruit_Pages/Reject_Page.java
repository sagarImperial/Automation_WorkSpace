package CRM_Recruit_Pages;

import BaseFramework.Plumbing.Driver_Init;
import Program.ApplicationEnviroment;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class Reject_Page extends Driver_Init {


    public Reject_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Other organization')]")
    public static WebElement chooseAccountAsOtherOrganisation;

    @FindBy(xpath = "//input[@id='emailInput']")
    public static WebElement emailInputtextBox;

    @FindBy(xpath = "//input[@value='Next']")
    public static WebElement nextButtonInputEmail;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password_label']")
    public static WebElement passwordtextBox;

    @FindBy(xpath = "//button[@id='submitButton']")
    public static WebElement loginButton;

    @FindBy(xpath = "//a[@title='Start search']")
    public static WebElement searchClick;

    @FindBy(xpath = "//input[@id='search']")
    public static WebElement searchTextBox;

    @FindBy(xpath = "//img[@id='findCriteriaImg']")
    public static WebElement searchBoxClick;

    @FindBy(xpath = "//iframe[@id='contentIFrame0']")
    public static WebElement iframeRecord;

    @FindBy(xpath = "//div[@class='control_value attributePrimary']")
    public static WebElement clickCandidateRecord;

    @FindBy(xpath = "//nobr/a[contains(@id,'gridBodyTable_primaryField') and @href ='javascript:;']")
    public static WebElement clickOnApplicationID;

    @FindBy(xpath="//span[contains(text(),'Applicant')]")
    public static WebElement applicant;

    @FindBy(xpath = "//iframe[@id='WebResource_applicationbuttonswidget']")
    public static WebElement switchiFrame1;

    @FindBy(xpath="//input[@id='MarkAsCompletedButton']")
    public static WebElement markedComplete;

    @FindBy(xpath = "//span[contains(text(),'Application Review')and @class='stageNameContent']")
    public static WebElement clickOnApplicationReview;

    @FindBy(xpath = "//img[@alt='Click here to select a different form for this record']")
    public static WebElement clickOnApplicationFolder;

    @FindBy(xpath = ".//span[@title='IC - Registry Assessment']")
    public static WebElement clickOnRegistryAssessment;

    @FindBy(xpath = "//h2[@id='tab_9_header_h2']")
    public static WebElement scrollDownToRegistryAssessment;

    @FindBy(xpath="//label[@id='Fee Status_label']")
    public static WebElement feeStatus;



    public void searchRecord() throws Exception {

        chooseAccountAsOtherOrganisation.click();
        emailInputtextBox.sendKeys("crmrec1@ic.ac.uk");
        nextButtonInputEmail.click();
        usernameTextBox.sendKeys("crmrec1");
        passwordtextBox.sendKeys("TstBanner");
        loginButton.click();

        Thread.sleep(2000);
        searchClick.click();
        searchTextBox.sendKeys("Ash");
        Thread.sleep(2000);
        searchBoxClick.click();

        Thread.sleep(2000);
        driver.switchTo().frame(iframeRecord);
        clickCandidateRecord.click();
        Thread.sleep(2000);

        clickOnApplicationID.click();
        Thread.sleep(2000);

        applicant.click();
        Thread.sleep(5000);
        driver.switchTo().frame(switchiFrame1);
        Thread.sleep(2000);
        markedComplete.click();

        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contentIFrame0']")));


        Thread.sleep(2000);
        Actions act=new Actions(driver);
        act.moveToElement(clickOnApplicationReview).click().build().perform();
        Thread.sleep(2000);

        clickOnApplicationFolder.click();
        Thread.sleep(2000);
        clickOnRegistryAssessment.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", scrollDownToRegistryAssessment);

        act.moveToElement(feeStatus).click().sendKeys("Home").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).build().perform();
    }

    @FindBy(xpath = "//div[@id='iczz_academiceligibility']")
    public static WebElement clickOnAcademicEligibility;


    public void meetsDepartmentRequirements() throws Exception{

        clickOnAcademicEligibility.sendKeys(Keys.DELETE);
        Actions act1=new Actions(driver);
        act1.moveToElement(clickOnAcademicEligibility).sendKeys("Proceed - Meets Department Requirements").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act1.sendKeys(Keys.ENTER).build().perform();
    }

    @FindBy(xpath = "//div[@id='iczz_englishassessment']")
    public static WebElement englishAssessment;

        public void checkEnglishAssessment() throws Exception {

        englishAssessment.sendKeys((Keys.DELETE));
        Thread.sleep(2000);
        Actions act2=new Actions(driver);
        act2.moveToElement(englishAssessment).sendKeys("English Language required").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act2.sendKeys(Keys.ENTER).build().perform();
    }

    @FindBy(xpath = "//input[@id='iczz_sendtodepartment_i']")
    public static WebElement clickOnSendToDepartment;


        public void checkboxSendToDepartment () throws Exception{

        Thread.sleep(2000);
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView();", clickOnSendToDepartment);
        clickOnSendToDepartment.click();
    }

    @FindBy(xpath = ".//img[@id='savefooter_statuscontrol']")
    public static WebElement saveButton;

        public void saveRegistryAssessment() throws Exception{

        Thread.sleep(2000);
        saveButton.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = ".//span[@title='IC - Department Assessment']")
    public static WebElement clickOnDepartmentAssessment;

        public void gotoDepartmentRegistry()throws Exception{

        clickOnApplicationFolder.click();
        clickOnDepartmentAssessment.click();
    }

    @FindBy(xpath = ".//span[@id='iczz_academiceligibility1_lookupValue']")
    public static WebElement scrollDownToDepartmentDecision;

    public void recordReadyForReview() throws Exception{

        Thread.sleep(2000);
        JavascriptExecutor scrolldownDD = (JavascriptExecutor) driver;
        scrolldownDD.executeScript("arguments[0].scrollIntoView();", scrollDownToDepartmentDecision);
    }

    @FindBy(xpath = "//label[@id='Decision_label']")
    public static WebElement decision;

        public void decisionReject() throws Exception{

        Thread.sleep(3000);
        Actions act3 =new Actions(driver);
        act3.moveToElement(decision).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        act3.moveToElement(decision).click().sendKeys("Reject").click().sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act3.sendKeys(Keys.ENTER).build().perform();
    }

    @FindBy(xpath = "//label[@id='Rejection Reason_label']")
    public static WebElement rejectionReason;

        public void  rejectionReason() throws Exception {

        Thread.sleep(3000);
        Actions act4 =new Actions(driver);
        act4.moveToElement(rejectionReason).sendKeys(Keys.DELETE).build().perform();
        act4.moveToElement(rejectionReason).click().sendKeys("Admissions test performance did not meet the required standard").click().sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act4.sendKeys(Keys.ENTER).build().perform();
    }

    @FindBy(xpath = "//input[@id='iczz_sendtoregistry_i']")
    public static WebElement decionMadesendToRegistry;

        public void checkboxSendToRegistry() throws Exception {

            decionMadesendToRegistry.click();
            Thread.sleep(2000);

    }
        public void saveDepartmentAssessment(){

        saveButton.click();

    }

    public void url_CRM() throws MalformedURLException {
        ApplicationEnviroment.App.NavigationPage("CRM");
    }
}
