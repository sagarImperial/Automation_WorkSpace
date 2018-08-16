package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employment_Page {

    public Employment_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement section4Completed;

    @FindBy(xpath = " /html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/input[2]")
    WebElement saveEmploymentDetails;

    public void addEmploymentDetails() {

        section4Completed.click();
        saveEmploymentDetails.click();

    }

}
