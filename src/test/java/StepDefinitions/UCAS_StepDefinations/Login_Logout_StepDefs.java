package StepDefinitions.UCAS_StepDefinations;

import BaseFramework.Plumbing.Driver_Init;
import BaseFramework.Utils.Constants;
import UCASPages.Login_Logout;
import UCASPages.Registration_Page;
import cucumber.api.java.en.*;

import static BaseFramework.Plumbing.Driver_Init.driver;


public class Login_Logout_StepDefs extends Driver_Init {
    Login_Logout login_logout;

    public Login_Logout_StepDefs() {
        login_logout = new Login_Logout(driver);
    }

    //--------Scenario: Student Login----------------
    @Given("^I am on UCAS Site$")
    public void iAmOnUCASSite() throws Throwable {
        System.out.println("I AM ON UCAS SITE ");
        System.out.println("");
        driver.get(Constants.UCAS_URL);
    }

    @And("^I enter my username$")
    public void iEnterMyUsername() throws Throwable {
        login_logout.enterUserName();
    }

    @And("^I enter my password$")
    public void iEnterMyPassword() throws Throwable {
        login_logout.enterPassword();
    }

    @When("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
        login_logout.clickOnLoginButton();
        login_logout.logout();
    }

    @Then("^I should get successfully message \"([^\"]*)\"$")
    public void iShouldGetSuccessfullyMessage(String arg0) throws Throwable {
        System.out.println("---------------");
        System.out.println("SUCCESSFUL LOGIN ");
        System.out.println("---------------");
        System.out.println(" ");
    }
    //--------End of Scenario: Student Login----------------


    //--------Scenario: Student Logout----------------------
    @Given("^I am logged in on UCAC site$")
    public void iAmLoggedInOnUCACSite() throws Throwable {
        driver.get(Constants.UCAS_URL);
        login_logout.enterUserName();
        login_logout.enterPassword();
        login_logout.clickOnLoginButton();
    }

    @When("^I click on Logout button$")
    public void iClickOnLogoutButton() throws Throwable {
        login_logout.logout();
    }

    @Then("^I should see \"([^\"]*)\" text$")
    public void iShouldSeeText(String arg0) throws Throwable {
        System.out.println("SUCCESSFUL LOGOUT ");
        System.out.println("---------------");
        System.out.println("");
    }
    //--------End of Scenario: Student Logout----------------------
}
