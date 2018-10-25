package Pages.WebFrontEnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PGT_DataGenerator {

    public PGT_DataGenerator(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//a[@aria-label='Create Account']")
    public static WebElement createAccount;

    public void clickOnCreateAccountLink() {
        createAccount.click();
    }
}
