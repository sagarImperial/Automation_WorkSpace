package CRM_Recruit_Pages;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Set;

    public class Offermade_Page extends Driver_Init {

        public Offermade_Page(WebDriver driver) {
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

        @FindBy(xpath = "//span[contains(text(),'Application Review')and @class='stageNameContent']")
        public static WebElement clickOnApplicationReview;

        @FindBy(xpath = "//img[@alt='Click here to select a different form for this record']")
        public static WebElement clickOnApplicationFolder;

        @FindBy(xpath = ".//span[@title='IC - Registry Assessment']")
        public static WebElement clickOnRegistryAssessment;

        @FindBy(xpath = "//h2[@id='tab_9_header_h2']")
        public static WebElement scrollDownToRegistryAssessment;

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


        //@FindBy(xpath ="(//td[@class='ms-crm-List-DataCell-Lite']//nobr[@title='Not Received'])[1]")
        //@FindBy(xpath = "(//nobr[@title='Not Received'])[1]")
        @FindBy(xpath = "(//span[contains(text(),'Not Received')])[1]")
        public static WebElement substatus1;

        @FindBy(xpath = "//label[@id='Submission Status_label']")
        public static WebElement substatus2;

        @FindBy(xpath = "(//nobr[@title='Not Received'])[2]")
        public static WebElement substatus3;

        @FindBy(xpath="//div[@id='closeButton']")
        public static WebElement closeButton;

        public void offermade() throws Exception {

            chooseAccountAsOtherOrganisation.click();
            emailInputtextBox.sendKeys("a.prashan@ic.ac.uk");
            nextButtonInputEmail.click();
            usernameTextBox.sendKeys("aprashan");
            passwordtextBox.sendKeys("Babzbabz1408");
            loginButton.click();

            Thread.sleep(2000);
            searchClick.click();
            searchTextBox.sendKeys("2000174705");
            Thread.sleep(2000);
            searchBoxClick.click();

            Thread.sleep(2000);
            driver.switchTo().frame(iframeRecord);
            clickCandidateRecord.click();
            Thread.sleep(2000);

            clickOnApplicationID.click();
            Thread.sleep(2000);
            clickOnApplicationReview.click();
            Thread.sleep(2000);

            clickOnApplicationFolder.click();
            Thread.sleep(2000);
            clickOnRegistryAssessment.click();

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView();", scrollDownToRegistryAssessment);

            clickOnAcademicEligibility.sendKeys(Keys.DELETE);
            Actions actions = new Actions(driver);
            actions.moveToElement(clickOnAcademicEligibility).sendKeys("Proceed - Meets Department Requirements").sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(2000);
            actions.sendKeys(Keys.ENTER).build().perform();

            englishAssessment.sendKeys((Keys.DELETE));
            Thread.sleep(2000);
            actions.moveToElement(englishAssessment).sendKeys("English Language required").sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(2000);
            actions.sendKeys(Keys.ENTER).build().perform();

            Thread.sleep(2000);
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].scrollIntoView();", clickOnSendToDepartment);

            clickOnSendToDepartment.click();
            Thread.sleep(2000);
            saveButton.click();

            clickOnApplicationFolder.click();
            clickOnDepartmentAssessment.click();

            Thread.sleep(2000);

            actions.moveToElement(decision).sendKeys(Keys.DELETE).build().perform();
            actions.moveToElement(decision).sendKeys("Offer").sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(2000);
            actions.sendKeys(Keys.ENTER).build().perform();

            Thread.sleep(3000);
            actions.moveToElement(offerLibrary).sendKeys(Keys.DELETE).build().perform();
            actions.moveToElement(offerLibrary).sendKeys("E-AE-AL010").sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(2000);
            actions.sendKeys(Keys.ENTER).build().perform();

            decionMadesendToRegistry.click();
            Thread.sleep(2000);
            saveButton.click();

            clickOnApplicationFolder.click();
            clickOnRegistryAssessment.click();

            //JavascriptExecutor scrollRegDecPro = (JavascriptExecutor) driver;
            //scrollRegDecPro.executeScript("arguments[0].scrollIntoView();", registryDecisionProcessing);

            Thread.sleep(2000);
            //actions.moveToElement(registryDecisionProcessing).build().perform();
            //actions.sendKeys(Keys.DELETE);
            actions.moveToElement(statuses).build().perform();
            actions.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(2000);
            //actions.moveToElement(substatus1).build().perform();
            //actions.contextClick(substatus1).sendKeys(Keys.ENTER).build().perform();

            actions.doubleClick(substatus1).build().perform();
            Thread.sleep(2000);
            substatus2.click();

            actions.moveToElement(substatus2).build().perform();
            actions.sendKeys("Met").build().perform();
            saveButton.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            saveButton.click();
            //actions.moveToElement(substatus3).build().perform();
            //actions.doubleClick(substatus3).build().perform();
            //actions.contextClick(substatus3).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();



        }


    }

