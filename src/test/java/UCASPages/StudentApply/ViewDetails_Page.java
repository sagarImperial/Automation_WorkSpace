package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewDetails_Page {


    public ViewDetails_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'View all details')]")
    WebElement viewDetailsButton;

    @FindBy (xpath = "//input[@id='chkComplete']")
    WebElement sectionViewCompleted;

    @FindBy (xpath = "//input[@value='save']")
    WebElement saveViewDetails;

    public void addViewAllDetails() {
              viewDetailsButton.click();
              sectionViewCompleted.click();
              saveViewDetails.click();

    }
}
