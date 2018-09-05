package CRM_Recruit_Pages;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RejectAtSource_Page extends Driver_Init {

    public RejectAtSource_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath="//input[@id='MarkAsCompletedButton']")
    public static WebElement markedComplete;

    @FindBy(xpath="//span[contains(text(),'Applicant')]")
    public static WebElement applicant;

    @FindBy(xpath ="//a[@title='Start search']")
    public static WebElement searchstart;

    @FindBy(xpath= "//input[@id='search']")
    public static WebElement searchBox;

    @FindBy(xpath="//img[@id='findCriteriaImg']")
    public static WebElement searchBoxclick;

    @FindBy(xpath = "//iframe[@id='contentIFrame0'] ")
    public static WebElement switchiFrame;

    @FindBy(xpath= "//div[@class='control_value attributePrimary']")
    public static WebElement candidateRecord;

    @FindBy(xpath= "//nobr/a[contains(@id,'gridBodyTable_primaryField') and @href ='javascript:;']")
    public static WebElement applicationId;

    @FindBy(xpath= "//span[contains(text(),'Application Review')and @class='stageNameContent']")
    public static WebElement applicationReviewButton;

    @FindBy(xpath= "//img[@class='ms-crm-ImageStrip-formSelectorDropdown ms-crm-FormSelector' and @id='formSelectorDropdown']")
    public static WebElement applicationFolderDropdownArrow;

    @FindBy(xpath="//img[@alt='Click here to select a different form for this record']")
    public static WebElement applicationFolder;

    @FindBy(xpath = "//span[@title ='IC - Registry Assessment']")
    public static WebElement clickRegistryAssessment;

    @FindBy(xpath= "//div[@id='iczz_academiceligibility']")
    WebElement academicEligibility;

    @FindBy(xpath = ".//*[contains(@command,'datatel_applicationfolder|NoRelationship|Form|Mscrm.SaveAndClosePrimary')]//a")
    public static WebElement saveAndClose;

    @FindBy(xpath ="//input[@id='iczz_sendtodepartment_i']")
    public static WebElement sendToDepartment;

    @FindBy(xpath=".//ul[@role='application']//li[2]")
    public static WebElement save; // ANOTHER LOCATOR FOR SAVE FROM TOP MENU BAR
    //.//li[@id='datatel_applicationfolder|NoRelationship|Form|elcn.Mscrm.Form.datatel_applicationfolder.Save']/span

    @FindBy(xpath = "//li//span//a//span[@command ='iczz_icacademiceligibility|NoRelationship|Form|Mscrm.SaveAndClosePrimary']")
    public static WebElement saveNClose; // ANOTHER LOCATOR FOR SAVE AND CLOSE FROM TOP MENU BAR

    @FindBy(xpath ="//h2[@id='tab_9_header_h2']" )
    public static WebElement scrollDownToRegistryAssessment;

    @FindBy(xpath= ".//img[@id='savefooter_statuscontrol']")
    public static WebElement saveFooterLink;


    public void rejectAtSource() throws Exception{
        searchstart.click();
        searchBox.sendKeys("2000144906");
        Thread.sleep(2000);
        searchBoxclick.click();
        Thread.sleep(2000);

        //int iframes = driver.findElements(By.xpath("//iframe")).size();
        //System.out.println("Number of iframes in this page =" +iframes);

        driver.switchTo().frame(switchiFrame);
        candidateRecord.click();
        Thread.sleep(2000);
        applicationId.click();
        Thread.sleep(2000);
        applicant.click();
        Thread.sleep(2000);
        markedComplete.click();
        saveFooterLink.click();
        Thread.sleep(2000);
        applicationReviewButton.click();
        Thread.sleep(2000);

        applicationFolder.click();
        clickRegistryAssessment.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",scrollDownToRegistryAssessment);

        Thread.sleep(3000);
        academicEligibility.sendKeys(Keys.DELETE);
        Actions act=new Actions(driver);
        act.moveToElement(academicEligibility).sendKeys("Reject at Source").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).build().perform();

        sendToDepartment.click();
        saveFooterLink.click();

    }

}

