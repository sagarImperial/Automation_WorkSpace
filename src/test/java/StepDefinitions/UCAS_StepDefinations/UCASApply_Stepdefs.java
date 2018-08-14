package StepDefinitions.UCAS_StepDefinations;

import BaseFramework.Plumbing.Driver_Init;
import UCASPages.ApplyUCAS_Page;
import UCASPages.Login_Logout;
import UCASPages.Registration_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UCASApply_Stepdefs extends Driver_Init {

    ApplyUCAS_Page applyUCAS_page ;
    Registration_Page registration_page;

    public UCASApply_Stepdefs(){
      applyUCAS_page = new ApplyUCAS_Page(driver);
      registration_page = new Registration_Page(driver);
    }
    @Given("^I am already registered in UCAS$")
    public void iAmAlreadyRegisteredInUCAS() throws Throwable {

      registration_page.registrationProcess();

    }

    @When("^I am logged in through the credentials$")
    public void iAmLoggedInThroughTheCredentials() throws Throwable {

    }

    @Then("^I should be able to login to the UCAS site$")
    public void iShouldBeAbleToLoginToTheUCASSite() throws Throwable {

    }

    @And("^I apply for the course through UCAS successfully$")
    public void iApplyForTheCourseThroughUCASSuccessfully() throws Throwable {

    }
}
