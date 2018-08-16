package UCASPages.StudentApply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choices_Page {
    public Choices_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Choices')]")
    WebElement choices;



    @FindBy(xpath="//input[@id='chkComplete']")
    WebElement section4Completed;

    @FindBy(xpath = "//a[contains(text(),'add a choice')]")
    WebElement addChoiceLink;
    @FindBy(xpath = "//input[@id='instButton']")
    WebElement institutionCode;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/span[1]/input[1]")
    WebElement courseCode;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/span[1]/input[1]")
    WebElement campusCode;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/span[1]/input[1]")
    WebElement startDate;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/input[2]")
    WebElement liveAtHome;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[13]/input[1]")
    WebElement saveChoices;

    public void addChoices() {

        choices.click();
        addChoiceLink.click();
        institutionCode.click();
        courseCode.click();
        campusCode.click();
        liveAtHome.click();
        saveChoices.click();


    }
}
