package Pages.CRM_Recruit;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RecruitLogin extends Driver_Init {

    public RecruitLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userNameInput")
    public static WebElement crmUserName_TextField;

    @FindBy(id = "passwordInput")
    public static WebElement crmPassword_TextField;

    @FindBy(id = "submitButton")
    public static WebElement crmSignInButton;


    @FindBy(xpath = ".//span[contains(text(),'Ellucian Dev ADFS')]")
    public static WebElement chooseAccount;


    @FindBy(xpath = ".//span/img[@class='navTabButtonUserInfoProfileImage']")
    public static WebElement profileImage;

    @FindBy(xpath = ".//a[(@href='javascript:;') and contains(text(),'Sign out')]")
    public static WebElement signOutButton;

    public void enterCRMUserName() throws Exception {
        chooseAccount.click();
        Thread.sleep(3000);
        crmUserName_TextField.sendKeys("euadmin\\syadav");
    }

    public void enterCRMPassword() {
        crmPassword_TextField.sendKeys("16P@rkcourt");
    }

    public void clickOnCRMSignInButton() throws Exception {
        crmSignInButton.click();
        Thread.sleep(1000);
    }

    public void clickOnProfileImage() {
        profileImage.click();
    }

    public void clickOnSignOutButton() throws Exception {
        Thread.sleep(1000);
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("navTabButtonUserInfoSignOutId")));
        a.click().build().perform();

    }
}
