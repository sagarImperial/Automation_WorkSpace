package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Logout {

    public static String USERNAME = "bbell1";
    public static String PASSWORD = "Test123!";


    public Login_Logout(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    public static WebElement userNameTextBox;


    @FindBy(id = "txtPassword")
    public static WebElement passwordTextBox;


    @FindBy(name = "btnLogin")
    public static WebElement loginButton;


    public void enterUserName() {
        userNameTextBox.sendKeys(USERNAME);
    }

    public void enterPassword() {
        passwordTextBox.sendKeys(PASSWORD);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

}
