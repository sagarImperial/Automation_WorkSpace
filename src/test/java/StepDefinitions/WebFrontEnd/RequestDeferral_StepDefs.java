package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.RequestDeferral;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class RequestDeferral_StepDefs {

    RequestDeferral requestDeferral;

    public RequestDeferral_StepDefs(){
            requestDeferral = new RequestDeferral(driver);
    }

    @And("^I create an account for deferring my application$")
    public void iCreateAnAccountForDeferringMyApplication() throws Throwable {
        requestDeferral.clickOnCreateAccountLink();
        requestDeferral.select_YES_AS_PrivacyPolicy();
        requestDeferral.completeAllRequiredFields();
        requestDeferral.clickOnCreateAccountButton();
    }

    @And("^I apply for the program for deferral$")
    public void iApplyForTheProgramForDeferral() throws Throwable {
        requestDeferral.clickOnCreateANewApplicationButton();
        requestDeferral.clickOnPostgraduateTaughtButton();
        requestDeferral.clickOnContinueThisApplication();
        requestDeferral.completeApplicationForm();
    }

    @And("^I click on Request Deferral link$")
    public void iClickOnRequestDeferralLink() throws Throwable {
        requestDeferral.clickOnRequestDeferral_Link();
    }

    @And("^I select Academic Term$")
    public void iSelectAcademicTerm() throws Throwable {
       requestDeferral.selectAcademicTerm();
    }

    @And("^I select Reason \"([^\"]*)\"$")
    public void iSelectReason(String reason) throws Throwable {
        requestDeferral.selectReason(reason);
    }

    @When("^I click on Submit$")
    public void iClickOnSubmit() throws Throwable {
       requestDeferral.clickOnSubmit();
    }

}
