package StepDefinitions.CRMRecruit;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.CRMRecruit.Offermade_Doctoral_Page;
import Pages.CRMRecruit.Offermade_Page;
import Pages.CRMRecruit.RecruitLogin_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static BaseFramework.Plumbing.Driver_Init.driver;


    public class Offermade_Doctoral_Stepdefs {

        Offermade_Doctoral_Page offermade_doctoral_page = new Offermade_Doctoral_Page(driver);

        @Given("^I logged in as IC Registry user in CRM to make an offer for PGR applicant$")
        public void iLoggedInAsICRegistryUserInCRMToMakeAnOfferForPGRApplicant() throws Throwable {
            offermade_doctoral_page.urlCRM();
            offermade_doctoral_page.LoginForOffermade();

        }

        @And("^I search for record which meets with the program criteria for PGR applicant$")
        public void iSearchForRecordWhichMeetsWithTheProgramCriteriaForPGRApplicant() throws Throwable {

            offermade_doctoral_page.searchRecordForOffer();

        }

        @And("^I complete all required fields for a PGR applicant as a Registry User$")
        public void iCompleteAllRequiredFieldsForAPGRApplicantAsARegistryUser() throws Throwable {
            offermade_doctoral_page.fillTheRequiredfieldsForOfferMade();

        }

        @When("^I select Proceed meets department requirements from drop down for to proceed to offermade for PGR applicant$")
        public void iSelectProceedMeetsDepartmentRequirementsFromDropDownForToProceedToOffermadeForPGRApplicant() throws Throwable {
            offermade_doctoral_page.academicEligibilityForOfferMade();

        }

        @And("^I select English Assessment as \"([^\"]*)\" as a mandatory for to proceed to offermade$")
        public void iSelectEnglishAssessmentAsAsAMandatoryForToProceedToOffermade(String arg0) throws Throwable {
            offermade_doctoral_page.checkEnglishAssessmentforOffermade();
        }

        @And("^I click on sent to department tick check box for a PGR applicant$")
        public void iClickOnSentToDepartmentTickCheckBoxForAPGRApplicant() throws Throwable {
            offermade_doctoral_page.checkBoxSendToDepartment();

        }

        @And("^I save the record in Registry Assessment fro a PGR program$")
        public void iSaveTheRecordInRegistryAssessmentFroAPGRProgram() throws Throwable {
            offermade_doctoral_page.saveTheRecordInRegistry();

        }

        @Then("^I the record should be saved in Registry for a PGR applicant$")
        public void iTheRecordShouldBeSavedInRegistryForAPGRApplicant() throws Throwable {
            offermade_doctoral_page.assertRegistryAssessment();

    }
}
