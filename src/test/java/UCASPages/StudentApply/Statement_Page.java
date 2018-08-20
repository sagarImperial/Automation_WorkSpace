package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Statement_Page {

    public Statement_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Statement')]")
    WebElement statementButton;
    @FindBy(xpath = "//textarea[@id='statementTextEntry']")
    WebElement statementTextBox;
    @FindBy(xpath = "//input[@value='save']")
    WebElement saveStatement;

    public void addstatement() {

        statementButton.click();
        statementTextBox.sendKeys("Test Statement");
        saveStatement.click();
    }
}
