package UCASPages.StudentApply;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Education_Page extends Driver_Init {

    public Education_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Education')]")
    WebElement education;
    @FindBy(xpath = "//select[@id='highestExpectedQualCombo']")
    WebElement highestLevelOfEducation;
    @FindBy(xpath = "//input[@id='chkComplete']")
    WebElement section3Completed;
    @FindBy(xpath = "//input[@value='save']")
    WebElement saveEducation;
    @FindBy(xpath = "//a[contains(text(),'add new school/college/centre')]")
    WebElement addNewSchool;
    @FindBy(xpath = "//input[@value='find...']")
    WebElement schoolName;
    @FindBy(xpath = "//input[@id='input']")
    WebElement schoolNameSearchBox;
    @FindBy(xpath ="//a[contains(text(),'Westcliff High School for Boys, Kenilworth Gardens')]")
    WebElement schoolChoiceList;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/select[1]")
    WebElement startMonth;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/select[2]")
    WebElement startYear;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/input[1]")
    WebElement attendance;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/select[1]")
    WebElement finishMonth;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/select[2]")
    WebElement finishYear;

    @FindBy(xpath = "//a[contains(text(),'add qualifications')]")
    WebElement addQualifications;

    @FindBy (xpath = "//input[@id='input']")
    WebElement searchQualificationTextBox;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/p[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
    WebElement searchQualificationList;

    @FindBy(xpath = "//select[@id='titleCombo']")
    WebElement subjectDropdown;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/select[1]")
    WebElement qualificationMonth;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/select[2]")
    WebElement qualificationYear;
    @FindBy(xpath = "//select[@id='awardingBodyCombo']")
    WebElement awardingOrganisation;
    @FindBy(xpath = "//select[@id='gradeCombo']")
    WebElement grade;
    @FindBy(xpath = "//input[@value='save']")
    WebElement saveQualification;




    @FindBy(xpath = "//select[@id='formalQualsCombo']")
    WebElement formalQualification;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[10]/input[2]")
    WebElement saveSchoolDetails;

    public void addEducationDetails() throws Exception{

        education.click();
        addNewSchool.click();
        schoolName.click();

        Set handles = driver.getWindowHandles();

        String parentWindowHandle =driver.getWindowHandle();
        handles.remove(parentWindowHandle);
        String winhandle = (String) handles.iterator().next();
        if(winhandle != parentWindowHandle){
            String childWindowHandle = winhandle;
            driver.switchTo().window(childWindowHandle);
            Thread.sleep(3000);
            schoolNameSearchBox.sendKeys("westcliff");
            Thread.sleep(3000);
            schoolChoiceList.click();
            driver.switchTo().window(parentWindowHandle);
        }


        Select startMonthDropdown = new Select(startMonth);
        startMonthDropdown.selectByVisibleText("January");
        Select startYearDropdown = new Select(startYear);
        startYearDropdown.selectByVisibleText("2010");
        Select finishMonthDropdown = new Select(finishMonth);
        finishMonthDropdown.selectByIndex(3);
        Thread.sleep(3000);
        Select finishYearDropdown = new Select(finishYear);
        finishYearDropdown.selectByIndex(3);
        Thread.sleep(3000);
        Select receiveQualification = new Select(formalQualification);
        receiveQualification.selectByVisibleText("Yes");
        attendance.click();
        saveSchoolDetails.click();
        addQualifications.click();
        Thread.sleep(3000);
        searchQualificationTextBox.sendKeys("A Level");
        Thread.sleep(3000);
        searchQualificationList.click();

        Select subject = new Select(subjectDropdown);
        subject.selectByIndex(2);

        Select month = new Select(qualificationMonth);
        month.selectByIndex(2);
        Select year = new Select(qualificationYear);
        year.selectByIndex(2);
        Select award = new Select(awardingOrganisation);
        award.selectByIndex(2);
        Select gradeDropdown = new Select(grade);
        gradeDropdown.selectByIndex(2);
        saveQualification.click();

        Select highestlevelOfEducationCombo = new Select(highestLevelOfEducation);
        highestlevelOfEducationCombo.selectByIndex(1);
        section3Completed.click();
        saveEducation.click();

    }
}
