package Pages.CRMRecruit;

import BaseFramework.Hooks.DataConnector;
import BaseFramework.Plumbing.Driver_Init;
import BaseFramework.Utils.Constants;
import Program.ApplicationEnviroment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.*;

import java.net.MalformedURLException;

public class Offermade_Page extends Driver_Init {

    DataConnector dataConnector;

    public Offermade_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        dataConnector = new DataConnector();
        dataConnector.setDataFile(Constants.EXCEL_FILE_PATH, Constants.EXCEL_CRM_DATA_SHEET_NAME);
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

    @FindBy(xpath = "//span[contains(text(),'Applicant')]")
    public static WebElement applicant_Tab;

    @FindBy(xpath = "//iframe[@id='WebResource_applicationbuttonswidget']")
    public static WebElement switchiFrame1;

    @FindBy(xpath = "//input[@id='MarkAsCompletedButton']")
    public static WebElement markedComplete;

    @FindBy(xpath = "//span[contains(text(),'Application Review')and @class='stageNameContent']")
    public static WebElement clickOnApplicationReview;

    @FindBy(xpath = "//img[@alt='Click here to select a different form for this record']")
    public static WebElement clickOnApplicationFolder;

    @FindBy(xpath = ".//span[@title='IC - Registry Assessment']")
    public static WebElement clickOnRegistryAssessment;

    @FindBy(xpath = "//h2[@id='tab_9_header_h2']")
    public static WebElement scrollDownToRegistryAssessment;

    @FindBy(xpath = "//label[@id='Fee Status_label']")
    public static WebElement feeStatus;

    @FindBy(xpath = "//div[@id='iczz_academiceligibility']")
    public static WebElement clickOnAcademicEligibility;

    @FindBy(xpath = "//div[@id='iczz_englishassessment']")
    public static WebElement englishAssessment;

    @FindBy(xpath = "//input[@id='iczz_sendtodepartment_i']")
    public static WebElement clickOnSendToDepartment;

    @FindBy(xpath = ".//img[@id='savefooter_statuscontrol']")
    public static WebElement saveButton;

    @FindBy(xpath = ".//span[@title='IC - Department Assessment']")
    public static WebElement clickOnDepartmentAssessment;

    @FindBy(xpath = "//label[@id='Decision_label']")
    public static WebElement decision;

    @FindBy(xpath = "//input[@id='iczz_sendtoregistry_i']")
    public static WebElement decionMadesendToRegistry;

    @FindBy(xpath = "//label[@id='UCAS Offer Library_label']")
    public static WebElement offerLibrary;

    @FindBy(xpath = "//h2[@id='tab_13_header_h2']")
    public static WebElement registryDecisionProcessing;

    @FindBy(xpath = "//div[@id='BradStatuses_titleText']")
    public static WebElement statuses;

    @FindBy(xpath = ".//tr[@class='ms-crm-List-SelectedRow-Lite']")
    public static WebElement submissionStatus;

    @FindBy(xpath = "(//span[contains(text(),'Not Received')])[1]")
    public static WebElement substatus1;

    @FindBy(xpath = "//label[@id='Submission Status_label']")
    public static WebElement substatus2;

    @FindBy(xpath = "(//nobr[@title='Not Received'])[2]")
    public static WebElement substatus3;

    @FindBy(xpath = "//div[@id='closeButton']")
    public static WebElement closeButton;

    public void urlCRM() throws MalformedURLException {


        ApplicationEnviroment.NavigationPage("CRM_TEST");
        System.out.println("TEST ENV");
        System.out.println("____________________________________________________");
        System.out.println("~~~~~~~~~~~CRM TESTS STARTED and CRM - URL launched ");
        System.out.println("____________________________________________________");

    }

    public void LoginForOffermade() throws Exception {

        String CRM_SUPERUSER_EMAIL = dataConnector.getData(3, 1);
        String CRM_SUPERUSER_NAME = dataConnector.getData(4, 1);
        String CRM_SUPERUSER_PASSWORD = dataConnector.getData(5, 1);

        System.out.println("CRM User email entered : - " + CRM_SUPERUSER_EMAIL);
        System.out.println("CRM User email entered : - " + CRM_SUPERUSER_NAME);
        System.out.println("CRM User email entered : - " + CRM_SUPERUSER_PASSWORD);

        chooseAccountAsOtherOrganisation.click();
        emailInputtextBox.sendKeys(CRM_SUPERUSER_EMAIL);
        System.out.println("CRM User email entered : - " + CRM_SUPERUSER_EMAIL);
        nextButtonInputEmail.click();
        usernameTextBox.sendKeys(CRM_SUPERUSER_NAME);
        System.out.println("CRM User name entered : - " + CRM_SUPERUSER_NAME);
        System.out.println("User Logged in................");
        passwordtextBox.sendKeys(CRM_SUPERUSER_PASSWORD);
        loginButton.click();
        Thread.sleep(2000);

    }

    public void searchRecordForOffer() throws Exception {

        searchClick.click();
        searchTextBox.sendKeys("ash");
        Thread.sleep(2000);
        searchBoxClick.click();
        Thread.sleep(2000);
        driver.switchTo().frame(iframeRecord);
        clickCandidateRecord.click(); //-- Click on first record from the search result
        Thread.sleep(2000);

        clickOnApplicationID.click(); // --- Click on First Application under the Person View
        Thread.sleep(2000);

        applicant_Tab.click(); //-- Click on  Applicant Tab next to Inquiry
        Thread.sleep(5000);
        driver.switchTo().frame(switchiFrame1);
        Thread.sleep(2000);
        //  markedComplete.click();

        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contentIFrame0']")));
        clickOnApplicationReview.click();
        Thread.sleep(2000);

    }

    public void fillTheRequiredfieldsForOfferMade() throws Exception {

        clickOnApplicationFolder.click();
        Thread.sleep(2000);
        clickOnRegistryAssessment.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", scrollDownToRegistryAssessment);

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(feeStatus).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).build().perform();

    }

    public void academicEligibilityForOfferMade() throws Exception {


        Actions actions1 = new Actions(driver);
        clickOnAcademicEligibility.sendKeys(Keys.DELETE);
        actions1.moveToElement(clickOnAcademicEligibility).sendKeys("Proceed - Meets Department Requirements").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        actions1.sendKeys(Keys.ENTER).build().perform();

    }

    public void checkEnglishAssessmentforOffermade() throws Exception {

        englishAssessment.sendKeys((Keys.DELETE));
        Thread.sleep(2000);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(englishAssessment).sendKeys("English Language required").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        actions1.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);

    }

    public void checkBoxSendToDepartment() throws Exception {


        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView();", clickOnSendToDepartment);

        clickOnSendToDepartment.click();
        Thread.sleep(2000);
        saveButton.click();

        clickOnApplicationFolder.click();
        clickOnDepartmentAssessment.click();

        Thread.sleep(2000);
        Actions actions1 = new Actions(driver);
        //actions1.moveToElement(decision).sendKeys(Keys.DELETE).build().perform();
        actions1.moveToElement(decision).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        actions1.moveToElement(decision).click().sendKeys("Offer").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        actions1.sendKeys(Keys.ENTER).build().perform();

//        Thread.sleep(3000);
//        actions1.moveToElement(offerLibrary).sendKeys(Keys.DELETE).build().perform();
//        Thread.sleep(2000);
//        actions1.moveToElement(offerLibrary).click().sendKeys("E-AE-AL010").click().sendKeys(Keys.ENTER).build().perform();
//        Thread.sleep(2000);
//        actions1.sendKeys(Keys.ENTER).build().perform();

        decionMadesendToRegistry.click();
        Thread.sleep(2000);
        saveButton.click();

        clickOnApplicationFolder.click();
        clickOnRegistryAssessment.click();

//            Thread.sleep(2000);
//
//            actions1.moveToElement(statuses).build().perform();
//            actions1.sendKeys(Keys.PAGE_DOWN);
//            Thread.sleep(2000);
//
//            actions1.doubleClick(substatus1).build().perform();
//            Thread.sleep(2000);
//            substatus2.click();
//
//            actions1.moveToElement(substatus2).build().perform();
//            actions1.sendKeys("Met").build().perform();
//            saveButton.click();
//            Thread.sleep(2000);
//            driver.navigate().back();
//            Thread.sleep(2000);
//            saveButton.click();
        //actions1.moveToElement(substatus3).build().perform();
        //actions1.doubleClick(substatus3).build().perform();
        //actions1.contextClick(substatus3).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

    }

    public void saveTheRecordInRegistry() throws Exception {

        Thread.sleep(2000);
        saveButton.click();
    }

    public void assertRegistryAssessment() throws Exception {
        Thread.sleep(2000);
        System.out.println("DECISION IS SAVED IN REGISTRY");
    }


}

