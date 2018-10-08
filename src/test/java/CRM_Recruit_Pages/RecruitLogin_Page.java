package CRM_Recruit_Pages;

import BaseFramework.Plumbing.Driver_Init;
import Program.ApplicationEnviroment;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.util.Set;

public class RecruitLogin_Page extends Driver_Init {

    public RecruitLogin_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//span[contains(text(),'Ellucian Dev ADFS')]")
    WebElement chooseAccount;

    @FindBy(xpath = "//span[contains(text(),'Other organization')]")
    public static WebElement chooseAccountAsOtherOrganisation;

    @FindBy(xpath = "//input[@id='emailInput']")
    public static WebElement emailInputtextBox;

    @FindBy(xpath = "//input[@value='Next']")
    public static WebElement nextButtonInputEmail;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password_label']")
    public static WebElement passwordtextBox;

    @FindBy(xpath = "//button[@id='submitButton']")
    public static WebElement loginButton;

    @FindBy(xpath = ".//span/img[@class='navTabButtonUserInfoProfileImage']")
    WebElement profileImage;

    @FindBy(xpath = ".//a[(@href='javascript:;') and contains(text(),'Sign out')]")
    WebElement signOutButton;


    public void urlCRMTest() throws MalformedURLException {

        ApplicationEnviroment.App.NavigationPage("CRM");
    }


    public void enterCRMUserName() throws Exception {
        chooseAccountAsOtherOrganisation.click();
        emailInputtextBox.sendKeys("a.prashan@ic.ac.uk");
        nextButtonInputEmail.click();
        Thread.sleep(3000);
        usernameTextBox.sendKeys("aprashan");
    }

    public void enterCRMPassword() {
        passwordtextBox.sendKeys("");
    }

    public void clickOnCRMSignInButton() throws Exception {
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);

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

