package Pages.CRM_Recruit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitLogin {

    public RecruitLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userNameInput")
    public static WebElement crmUserName_TextField;

    @FindBy(id = "passwordInput")
    public static WebElement crmPassword_TextField;

    @FindBy(id = "submitButton")
    public static WebElement crmSignInButton;


    @FindBy(xpath=".//span[contains(text(),'Ellucian Dev ADFS')]")
    public static WebElement chooseAccount;


    public void enterCRMUserName() throws Exception {
//        chooseAccount.click();
        Thread.sleep(3000);
        crmUserName_TextField.sendKeys("euadmin\\syadav");
    }

    public void enterCRMPassword() {
        crmPassword_TextField.sendKeys("16P@rkcourt");
    }

    public void clickOnCRMSignInButton() {
        crmSignInButton.click();
    }

}
