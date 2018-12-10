package Pages.CRMRecruit;

import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Programme_OfferMade extends Driver_Init {

    public Programme_OfferMade(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
