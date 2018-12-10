package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.WithdrawYourApplication;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class WithdrawApplication_StepDefs {
//    PGT_AdvanceChemicalEng_Application pgt_advanceChemicalEng_application;
    WithdrawYourApplication withdrawYourApplication;

    public WithdrawApplication_StepDefs() {
        withdrawYourApplication = new WithdrawYourApplication(driver);
    }

    @And("^I create an account for withdrawals$")
    public void iCreateAnAccountForWithdrawals() throws Throwable {
      withdrawYourApplication.clickOnCreateAccountLink();
      withdrawYourApplication.select_YES_AS_PrivacyPolicy();
      withdrawYourApplication.completeAllRequiredFields();
      withdrawYourApplication.clickOnCreateAccountButton();
    }

    @And("^I apply for the program$")
    public void iApplyForTheProgram() throws Throwable {
        withdrawYourApplication.clickOnCreateANewApplicationButton();
        withdrawYourApplication.clickOnPostgraduateTaughtButton();
        withdrawYourApplication.clickOnContinueThisApplication();
        withdrawYourApplication.completeApplicationForm();
    }

    @And("^I go to My application$")
    public void iGoToMyApplication() throws Throwable {
        withdrawYourApplication.clickOnApplicationLink();
    }

    @And("^I click on Withdraw link$")
    public void iClickOnWithdrawLink() throws Throwable {
        withdrawYourApplication.clickOnWithdrawLink();
    }

    @And("^I select reason \"([^\"]*)\"$")
    public void iSelectReason(String withdrawReason) throws Throwable {
        withdrawYourApplication.selectWithdrawReason(withdrawReason);
    }

    @When("^I click on Withdraw button$")
    public void iClickOnWithdrawButton() throws Throwable {
        withdrawYourApplication.clickOnWithdrawButton();
    }

    @And("^I click ok to withdraw alert message$")
    public void iClickOkToWithdrawAlertMessage() throws Throwable {
        withdrawYourApplication.clickOkToWithdrawAlertMessageDialogbox();
    }

    @Then("^the status should be  \"([^\"]*)\" for the given application$")
    public void theStatusShouldBeForTheGivenApplication(String status) throws Throwable {
        withdrawYourApplication.verifyApplicationStatus(status);
    }


}
