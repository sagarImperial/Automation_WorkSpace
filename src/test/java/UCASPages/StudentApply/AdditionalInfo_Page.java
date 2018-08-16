package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalInfo_Page {


    public AdditionalInfo_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//select[@id='ethnicOriginCombo']")
    WebElement ethnicOrigin;
    @FindBy(xpath  = "//select[@id='nationalIdOneCombo']")
    WebElement nationalIdentity;


    public void  additionalInformation(){

    }
}
