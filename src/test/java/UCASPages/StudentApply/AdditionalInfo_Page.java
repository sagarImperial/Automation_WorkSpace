package UCASPages.StudentApply;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class AdditionalInfo_Page extends Driver_Init {


    public AdditionalInfo_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[contains(text(),'Additional information')]")
    WebElement additionalInfoButton;


    @FindBy(xpath = "//select[@id='ethnicOriginCombo']")
    WebElement ethnicOrigin;
    @FindBy(xpath  = "//select[@id='nationalIdOneCombo']")
    WebElement nationalIdentity;
    @FindBy(xpath = "//input[@value='find...']")
    WebElement occupationalBackground;
    @FindBy(xpath = "//input[@id='input']")
    WebElement searchOccupationTextBox;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/p[7]/a[1]")
    WebElement occupationChoice;
    @FindBy (xpath ="//input[@id='chkComplete']")
    WebElement sectionAdditionalInfoCompleted;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[34]/input[2]")
    WebElement saveAdditionalInfo;

    public void  additionalInformation() throws Exception{
        additionalInfoButton.click();

        Select ethnicOriginDropdown =new Select(ethnicOrigin);
        ethnicOriginDropdown.selectByVisibleText("Asian - Indian");

        Select nationalIdentityButton = new Select(nationalIdentity);
        nationalIdentityButton.selectByVisibleText("British");

        occupationalBackground.click();
        Set handles = driver.getWindowHandles();

        String parentWindowHandle =driver.getWindowHandle();
        handles.remove(parentWindowHandle);
        String winhandle = (String) handles.iterator().next();
        if(winhandle != parentWindowHandle){

            String childWindowHandle = winhandle;
            driver.switchTo().window(childWindowHandle);
            Thread.sleep(3000);
            searchOccupationTextBox.sendKeys("Prefer");
            Thread.sleep(3000);
            occupationChoice.click();
            driver.switchTo().window(parentWindowHandle);
        }
        sectionAdditionalInfoCompleted.click();
        saveAdditionalInfo.click();


    }
}
