package Pages.WebFrontEnd;

import BaseFramework.Plumbing.Driver_Init;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogout extends Driver_Init{


    public LoginLogout(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //dsfsdf
    //testJan072019


    @FindBy(xpath = ".//input[@id='Username']")
    public static WebElement userName_TextField;

    @FindBy(xpath = ".//input[@id='Password']")
    public static WebElement password_TextField;

    @FindBy(xpath = ".//input[@id='submitLogin']")
    public static WebElement login_Button;

    @FindBy(xpath = ".//li[@class='active']/a")
    public static WebElement getVerification_Text;

    @FindBy(xpath = ".//span[@class='user-name']")
    public static WebElement userName_Link;

    @FindBy(xpath = ".//form[@id='logoutForm']")
    public static WebElement logout_Button;


    public void enterStudentUserName(){
        userName_TextField.sendKeys("Derick.Kirby@mailinator.com");
    }

    public void enterStudentPassword(){
        password_TextField.sendKeys("Test123!");
    }

    public void clickOnLoginButton(){
        login_Button.click();
    }

    public void verifyLoginText(String loginBodyText){
        String actualText = getVerification_Text.getText();
        Assert.assertEquals(loginBodyText,actualText);
    }

    public void loginAsStudent(){
        userName_TextField.sendKeys();
        password_TextField.sendKeys();
        login_Button.click();
    }

    public void logoutAsStudent(){
        userName_Link.click();
        logout_Button.click();
    }

    public void verifyLogoutText(String logoutBodyText){
        String actualText = getVerification_Text.getText();
        Assert.assertEquals(logoutBodyText,actualText);
    }

}
