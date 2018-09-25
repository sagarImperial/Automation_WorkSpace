package Pages.WFE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RequestDeferral {

    @FindBy(xpath = ".//div/a[@aria-label='Request a deferral for this application']")
    public static WebElement requestDeferral_Link;

    @FindBy(xpath = ".//select[@id='elcn_academictermid']")
    public static WebElement academicTerm_DropDown;

    @FindBy(xpath = ".//select[@id='elcn_reasonid']")
    public static WebElement reason_DropDown;

    @FindBy(xpath = ".//input[@value='Submit']")
    public static WebElement submitt_Button;

    public void selectFirstValueFromDropDown(WebElement element){
        Select select = new Select(element);
        select.selectByIndex(1);
    }

    public void selectValueByTextFromDropDown(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public RequestDeferral(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnRequestDeferral_Link() {
        requestDeferral_Link.click();
    }

    public void selectAcademicTerm() {
        selectFirstValueFromDropDown(academicTerm_DropDown);
    }

    public void selectReason(String reason) {
        selectValueByTextFromDropDown(reason_DropDown,reason);
    }

    public void clickOnSubmit() {
        submitt_Button.click();
    }
}
