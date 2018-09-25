package Pages.WFE;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WithdrawYourApplication extends Driver_Init {

    public WithdrawYourApplication(WebDriver driver){
        PageFactory.initElements(driver, this );
    }

    public void selectFromDropDown(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    @FindBy(xpath = ".//a[contains(@aria-label,'Withdraw')]")
    public static WebElement withdraw_Link;

    @FindBy(xpath = ".//select[@id='SelectedWithdrawReason']")
    public static WebElement chooseYourReason_Dropdown;

    @FindBy(xpath = ".//input[@id='withdrawBtn']")
    public static WebElement withdraw_Button;

    @FindBy(xpath = ".//td/span[@class='appStatusWithdrawn']")
    public static WebElement applicationStatus_Value;

    @FindBy(xpath = ".//td/a[contains(text(),'View')]")
    public static WebElement clickViewTrackApplication_Link;

     public void clickOnApplicationLink() throws Exception{
        Thread.sleep(3000);
        clickViewTrackApplication_Link.click();
    }

    public void clickOnWithdrawLink(){
        withdraw_Link.click();
    }

    public void selectWithdrawReason(String withdrawReason) {
        selectFromDropDown(chooseYourReason_Dropdown,withdrawReason);
    }

    public void clickOnWithdrawButton(){
        withdraw_Button.click();
    }

    public void clickOkToWithdrawAlertMessageDialogbox() {
        driver.switchTo().alert().accept();
    }

    public void verifyApplicationStatus(String status) {
        String bodyStatus = applicationStatus_Value.getText();
        Assert.assertEquals(bodyStatus,status);
    }
}
