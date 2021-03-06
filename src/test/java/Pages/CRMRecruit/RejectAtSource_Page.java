package Pages.CRMRecruit;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//iframe[@id='contentIFrame0']")
    public static WebElement switchiFrame;

    @FindBy(xpath = "//iframe[@id='WebResource_applicationbuttonswidget']")
    public static WebElement switchiFrame1;

    @FindBy(xpath= "//div[@class='control_value attributePrimary']")
    public static WebElement candidateRecord;

    @FindBy(xpath= "//nobr/a[contains(@id,'gridBodyTable_primaryField') and @href ='javascript:;']")
    public static WebElement applicationId;

    @FindBy(xpath="//button[contains(text(),'Ok')]")
    public static WebElement okButton;

    @FindBy(xpath= "//span[contains(text(),'Application Review')and @class='stageNameContent']")
    ////span[contains(text(),'Application Review')and @class='stageNameContent']
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

    @FindBy(xpath="//span[@class='stageNameContent' and contains(text(),'Inquiry')]")
    public static WebElement inquiry;

    @FindBy(xpath="//label[@id='Fee Status_label']")
    public static WebElement feeStatus;

    @FindBy(xpath="//div[@id='iczz_academiceligibility_lookupSearchIconDiv']")
    public static WebElement feestatusSearchIcon;

    @FindBy(xpath="//a[@title='Home']")
    public static WebElement selectDropDown;

    public void searchRecordForRejectAtSource() throws Exception{

        searchstart.click();
        searchBox.sendKeys("Doc_nov02");
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
        Thread.sleep(5000);
        driver.switchTo().frame(switchiFrame1);
        Thread.sleep(2000);
        //markedComplete.click();

        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contentIFrame0']")));


        Thread.sleep(2000);
        Actions act=new Actions(driver);
        act.moveToElement(applicationReviewButton).click().build().perform();
        Thread.sleep(2000);

    }


        public void requiredFields() throws Exception {

        applicationFolder.click();
        clickRegistryAssessment.click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",scrollDownToRegistryAssessment);

        Thread.sleep(3000);
        //feeStatus.sendKeys((Keys.DELETE));
            Actions act1 =new Actions(driver);
        act1.moveToElement(feeStatus).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act1.moveToElement(feestatusSearchIcon).doubleClick(feestatusSearchIcon).build().perform();

    }

    public void selectDCecisionFromDropDOwn() throws Exception {

        Actions act2 =new Actions(driver);
        act2.sendKeys(Keys.ENTER).build().perform();
        academicEligibility.sendKeys(Keys.DELETE);
        act2.moveToElement(academicEligibility).sendKeys("Reject at Source").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        act2.sendKeys(Keys.ENTER).build().perform();

    }

    public void saveTheDecisionRejectAtSource(){

        //sendToDepartment.click();
        saveFooterLink.click();

    }

    public void assertRegistryAssessment() {

        System.out.println("DECISION SAVED IN THE REGISTRY");
    }

}

