package StepDefinitions.Recruit;

import BaseFramework.Utils.Constants;
import Pages.CRM_Recruit.RecruitLogin;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class RecruitLogin_StepDefs {

    RecruitLogin recruitLogin;

    public RecruitLogin_StepDefs() {
        recruitLogin = new RecruitLogin(driver);
    }

    @Given("^I am on ICL CRM Recruit login page$")
    public void iAmOnICLCRMRecruitLoginPage() throws Throwable {
        driver.get(Constants.CRM_TEST_URL);
    }


    @And("^I enter my recruit username$")
    public void iEnterMyRecruitUsername() throws Throwable {
        recruitLogin.enterCRMUserName();
    }

    @And("^I enter my recruit password$")
    public void iEnterMyRecruitPassword() throws Throwable {
        recruitLogin.enterCRMPassword();
    }

    @When("^I click on Sign in button$")
    public void iClickOnSignInButton() throws Throwable {
        recruitLogin.clickOnCRMSignInButton();
    }

    @Then("^I should get \"([^\"]*)\" tab$")
    public void iShouldGetTab(String arg0) throws Throwable {
        System.out.println("Logged in..." + arg0);
    }
}
