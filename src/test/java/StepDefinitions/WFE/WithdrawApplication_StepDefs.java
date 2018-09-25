package StepDefinitions.WFE;

import Pages.WFE.CreateNewApplication;
import Pages.WFE.WithdrawYourApplication;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class WithdrawApplication_StepDefs {
    CreateNewApplication createNewApplication;
    WithdrawYourApplication withdrawYourApplication;

    public WithdrawApplication_StepDefs() {
        createNewApplication = new CreateNewApplication(driver);
        withdrawYourApplication = new WithdrawYourApplication(driver);
    }

    @And("^I apply for the program$")
    public void iApplyForTheProgram() throws Throwable {
        createNewApplication.createWholeANewApplicationInOneMethod();
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
