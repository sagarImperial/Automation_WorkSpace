package StepDefinitions.WFE;

import Pages.WFE.CreateNewApplication;
import Pages.WFE.RequestDeferral;
import Pages.WFE.WithdrawYourApplication;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class RequestDeferral_StepDefs {
    CreateNewApplication createNewApplication;
    RequestDeferral requestDeferral;

    public RequestDeferral_StepDefs(){
        createNewApplication = new CreateNewApplication(driver);
        requestDeferral = new RequestDeferral(driver);
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
