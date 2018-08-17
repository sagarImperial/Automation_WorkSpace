package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reference_Page {


public Reference_Page(WebDriver driver){ PageFactory.initElements(driver,this); }
    @FindBy (xpath = "//a[contains(text(),'Reference')]")
    WebElement referenceButton;
    @FindBy (xpath = "//input[@id='chkNoReference']")
    WebElement checkReferenceBox;
    @FindBy (xpath = "//input[@id='refereeNameTextEntry']")
    WebElement fullnameReferee;
    @FindBy (xpath = "//input[@id='postTextEntry']")
    WebElement relationshipReferee;
    @FindBy (xpath = "//input[@id='orgNameTextEntry']")
    WebElement organisationNameReferee;
    @FindBy (xpath = "//input[@id='addr1TextEntry']")
    WebElement addressReferee;
    @FindBy (xpath = "//input[@id='telephoneNumberTextEntry']")
    WebElement telephoneNumberReferee;
    @FindBy (xpath = "//input[@id='emailTextEntry']")
    WebElement emailReferee;
    @FindBy (xpath = "//input[@id='confirmEmailTextEntry']")
    WebElement confirmEmailReferee;
    @FindBy (xpath = "//input[@value='save']")
    WebElement saveReference;
    @FindBy(xpath = "//a[contains(text(),'Send reference request')]")
    WebElement sendReferenceRequest;


    public void addReference() {
        referenceButton.click();
        //checkReferenceBox.click();
        fullnameReferee.sendKeys("Testreferee");
        relationshipReferee.sendKeys("TestReferee");
        organisationNameReferee.sendKeys("Test");
        addressReferee.sendKeys("Test");
        telephoneNumberReferee.sendKeys("07777777777");
        emailReferee.sendKeys("testimperial@gmail.com");
        confirmEmailReferee.sendKeys("testimperial@gmail.com");
        saveReference.click();
        sendReferenceRequest.click();
        saveReference.click();

    }
}
