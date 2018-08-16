package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Education_Page {

    public Education_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

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

    @FindBy(xpath = "")
    WebElement finishMonth;

    @FindBy(xpath = "")
    WebElement finishYear;

    @FindBy(xpath = "//select[@id='formalQualsCombo']")
    WebElement formalQualification;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[10]/input[2]")
    WebElement saveSchoolDetails;

    public void addEducationDetails() {

        education.click();
        addNewSchool.click();
        schoolName.click();
        startMonth.click();
        startYear.click();
        finishMonth.click();
        finishYear.click();
        attendance.click();
        formalQualification.click();
        saveSchoolDetails.click();

        Select select = new Select(highestLevelOfEducation);
        select.selectByIndex(3);

        section3Completed.click();
        saveEducation.click();

    }
}
