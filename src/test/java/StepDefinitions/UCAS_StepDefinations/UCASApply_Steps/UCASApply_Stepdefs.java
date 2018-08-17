package StepDefinitions.UCAS_StepDefinations.UCASApply_Steps;

import BaseFramework.Plumbing.Driver_Init;
import UCASPages.StudentApply.Choices_Page;
import UCASPages.StudentApply.PersonalDetails_Page;
import UCASPages.StudentRegistration.Registration_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UCASApply_Stepdefs extends Driver_Init {

    PersonalDetails_Page applyUCAS_page ;
    Registration_Page registration_page;
    Choices_Page choices_page;

    public UCASApply_Stepdefs(){
      applyUCAS_page = new PersonalDetails_Page(driver);
      registration_page = new Registration_Page(driver);
    }
    @Given("^I am already registered in UCAS$")
    public void iAmAlreadyRegisteredInUCAS() throws Throwable {

      //registration_page.registrationProcess();

    }

    @When("^I am logged in through the credentials$")
    public void iAmLoggedInThroughTheCredentials() throws Throwable {
        applyUCAS_page.enterLogin();
        applyUCAS_page.enterPassword();
        applyUCAS_page.loginButtonclick();
    }

    @Then("^I should be able to login to the UCAS site$")
    public void iShouldBeAbleToLoginToTheUCASSite() throws Throwable {
         System.out.println("SUCCESSFULLY LOGGEDIN");
    }

    @And("^I apply for the course through UCAS successfully$")
    public void iApplyForTheCourseThroughUCASSuccessfully() throws Throwable {
        applyUCAS_page.addPersonaDetails();
        choices_page.addChoices();

        //applyUCAS_page.addEducationDetails();
        //applyUCAS_page.addEmploymentDetails();


    }
}
