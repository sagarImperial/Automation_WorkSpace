package UCASPages;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyUCAS_Page  {


    public ApplyUCAS_Page(WebDriver driver){
       PageFactory.initElements(driver ,this);

    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username_login;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password_login;
    @FindBy(xpath = "//input[@value='log in']")
    WebElement login_apply;


    //@FindBy(xpath = "")
    //WebElement username_login;
    //@FindBy(xpath = "")
    //WebElement username_login;
    //@FindBy(xpath = "")
    //WebElement username_login;
    //@FindBy(xpath = "")
    //WebElement username_login;

    public void enterLogin(){username_login.sendKeys();}

}
