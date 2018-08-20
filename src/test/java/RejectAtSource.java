import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class RejectAtSource {
    @Given("^I logged in as IC Registry user$")
    public void iLoggedInAsICRegistryUser() throws Throwable {
      driver.get("https://www.bbc.co.uk/");
    }
}
