package StepDefinitions.WFE.CRM_Recruit_StepDefinations;

import BaseFramework.Utils.Constants;
import CRM_Recruit_Pages.RecruitLogin_Page;
import CRM_Recruit_Pages.RejectAtSource_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class RejectAtSource_Stepdefs {

    RecruitLogin_Page recruitLogin;
    RejectAtSource_Page rejectAtSource_page;

    public RejectAtSource_Stepdefs(){
        recruitLogin = new RecruitLogin_Page(driver);
        rejectAtSource_page = new RejectAtSource_Page(driver);
    }

    @Given("^I logged in as IC Registry user$")
    public void iLoggedInAsICRegistryUser() throws Throwable {
         driver.get(Constants.CRM_TEST_URL);
         recruitLogin.enterCRMUserName();
         recruitLogin.enterCRMPassword();
         recruitLogin.clickOnCRMSignInButton();

    }

    @And("^I search for record which does not match program criteria$")
    public void iSearchForRecordWhichDoesNotMatchProgramCriteria() throws Throwable {

              rejectAtSource_page.rejectAtSource();
    }

    @And("^I complete all required fields$")
    public void iCompleteAllRequiredFields() throws Throwable {


    }

    @When("^I select \"([^\"]*)\" from drop down$")
    public void iSelectFromDropDown(String arg0) throws Throwable {


    }

    @And("^I save the record$")
    public void iSaveTheRecord() throws Throwable {


    }

    @Then("^I the record should be saved$")
    public void iTheRecordShouldBeSaved() throws Throwable {


    }

    @And("^record should be rejected$")
    public void recordShouldBeRejected() throws Throwable {


    }
}
