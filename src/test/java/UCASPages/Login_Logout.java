package UCASPages;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseFramework.Utils.Constants.*;


public class Login_Logout extends Driver_Init {



    public Login_Logout(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUsername")
    WebElement userNameTextBox;


    @FindBy(id = "txtPassword")
    WebElement passwordTextBox;


    @FindBy(name = "btnLogin")
    WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutButton;


    public void enterUserName() {
        userNameTextBox.sendKeys(UCAS_USERNAME);
    }

    public void enterPassword() {
        passwordTextBox.sendKeys(PASSWORD);
    }

    public void clickOnLoginButton() throws Exception {
        Thread.sleep(5000);
        loginButton.click();
    }

    public void logout() throws Exception {
        Thread.sleep(5000);
        logoutButton.click();
    }

}
