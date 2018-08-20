package StepDefinitions.UCAS_StepDefinations.UCASApply_Steps;

import BaseFramework.Plumbing.Driver_Init;
import UCASPages.StudentApply.*;
import UCASPages.StudentRegistration.Registration_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UCASApply_Stepdefs extends Driver_Init {

    PersonalDetails_Page applyUCAS_page ;
    Registration_Page registration_page;
    Studentfinance_Page studentfinance_page;
    Choices_Page choices_page;
    AdditionalInfo_Page additionalInfo_page;
    Education_Page education_page;
    Employment_Page employment_page;
    Reference_Page reference_page;
    Statement_Page statement_page;
    ViewDetails_Page viewDetails_page;



    public UCASApply_Stepdefs(){
      applyUCAS_page = new PersonalDetails_Page(driver);
      registration_page = new Registration_Page(driver);
      studentfinance_page = new Studentfinance_Page(driver);
      choices_page = new Choices_Page(driver);
      additionalInfo_page = new AdditionalInfo_Page(driver);
      education_page = new Education_Page(driver);
      employment_page = new Employment_Page(driver);
      reference_page = new Reference_Page(driver);
      statement_page = new Statement_Page(driver);
      viewDetails_page = new ViewDetails_Page(driver);

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
        studentfinance_page.addStudentFinance();
        choices_page.addChoices();
        additionalInfo_page.additionalInformation();
        education_page.addEducationDetails();
        employment_page.addEmploymentDetails();
        reference_page.addReference();
        statement_page.addstatement();
        viewDetails_page.addViewAllDetails();




    }
}
