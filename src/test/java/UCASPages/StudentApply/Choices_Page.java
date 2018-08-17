package UCASPages.StudentApply;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class Choices_Page extends Driver_Init {
    public Choices_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Choices')]")
    WebElement choices;



    @FindBy(xpath="//input[@id='chkComplete']")
    WebElement section4Completed;

    @FindBy(xpath = "//a[contains(text(),'add a choice')]")
    WebElement addChoiceLink;
    @FindBy(xpath = "//input[@id='instcodeTextEntry']")
    WebElement institutionCode;
    @FindBy(xpath = "//input[@id='coursecodeTextEntry']")
    WebElement courseCode;
    @FindBy(xpath = "//input[@id='campuscodeTextEntry']")
    WebElement campusCode;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/span[1]/input[1]")
    WebElement startDate;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/table[1]/tbody[1]/tr[3]/td[1]/a[1]")
    WebElement currentEntryStartDate;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/input[1]")
    WebElement liveAtHome;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/form[1]/div[13]/input[1]")
    WebElement saveChoices;

    public void addChoices()  {

        choices.click();
        addChoiceLink.click();
        institutionCode.sendKeys("I50");
        courseCode.sendKeys("B101");
        campusCode.sendKeys("-");


        startDate.click();
        Set handles = driver.getWindowHandles();
        System.out.println("Name of the 1st window is :--------------- " +handles );
        String parentWindowHandle =driver.getWindowHandle();
        handles.remove(parentWindowHandle);
        String winhandle = (String) handles.iterator().next();
        if(winhandle != parentWindowHandle){
            String childWindowHandle = winhandle;
            driver.switchTo().window(childWindowHandle);
            currentEntryStartDate.click();
            driver.switchTo().window(parentWindowHandle);
        }
        liveAtHome.click();
        saveChoices.click();


    }
}
