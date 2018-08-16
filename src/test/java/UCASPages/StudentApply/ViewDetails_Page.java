package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewDetails_Page {


    public ViewDetails_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[3]/input[1]")
    WebElement sectionViewCompleted;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/input[2]")
    WebElement saveViewDetails;

    public void addViewAllDetails() {

              sectionViewCompleted.click();
              saveViewDetails.click();

    }
}
