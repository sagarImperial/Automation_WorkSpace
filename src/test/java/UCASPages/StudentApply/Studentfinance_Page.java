package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Studentfinance_Page {

   public Studentfinance_Page(WebDriver driver ){ PageFactory.initElements(driver,this); }

   @FindBy(xpath = "//a[contains(text(),'Student finance')]")
    WebElement studentFinance;
    @FindBy(xpath = "//input[@id='applyFinanceNoRadio']")
    WebElement applyStudentFinance;
    @FindBy(xpath = "//input[@name='chkComplete']")
    WebElement sectionStudentFinanceCompleted;
    @FindBy(xpath = "//input[@value='save']")
    WebElement saveStudentFinance;

    public void addStudentFinance(){
        studentFinance.click();
        applyStudentFinance.click();
        sectionStudentFinanceCompleted.click();
        saveStudentFinance.click();
    }


}
