package StepDefinitions.UCAS_StepDefinations;

import BaseFramework.Plumbing.Driver_Init;
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
        driver.get("https://2018.hep1undergrad.apply.ucasenvironments.com/appreg/SecurityServlet");
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
    }

    @Then("^I should get successfully message \"([^\"]*)\"$")
    public void iShouldGetSuccessfullyMessage(String arg0) throws Throwable {
        System.out.println("SUCCESSFUL LOGIN ");
        login_logout.logout();
    }
    //--------End of Scenario: Student Login----------------



    //--------Scenario: Student Logout----------------------
    @Given("^I am logged in on UCAC site$")
    public void iAmLoggedInOnUCACSite() throws Throwable {
        System.out.println("---------------");
    }

    @When("^I click on Logout button$")
    public void iClickOnLogoutButton() throws Throwable {
        System.out.println("---------------");
       login_logout.logout();
    }

    @Then("^I should see \"([^\"]*)\" text$")
    public void iShouldSeeText(String arg0) throws Throwable {
        System.out.println("---------------");
    }
    //--------End of Scenario: Student Logout----------------------
}
