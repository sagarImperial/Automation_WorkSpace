package StepDefinitions.CRMRecruit;

import Pages.CRMRecruit.Offermade_Page;
import Pages.CRMRecruit.RecruitLogin_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static BaseFramework.Plumbing.Driver_Init.driver;

public class Offermade_Stepdefs {

    RecruitLogin_Page recruitLogin_page = new RecruitLogin_Page(driver);
    Offermade_Page offermade_page = new Offermade_Page(driver);


//    public Offermade_Stepdefs (){
//        recruitLogin_page = new RecruitLogin_Page(driver);
//        offermade_page = new Offermade_Page(driver);
//    }


    @Given("^I logged in as IC Registry user in CRM$")
    public void iLoggedInAsICRegistryUserInCRM() throws Throwable {

           // driver.get(ProgramProperties.CRM_TEST_URL);
            offermade_page.urlCRM();
            offermade_page.LoginForOffermade();

    }

    @And("^I search for record which meets with the program criteria$")
    public void iSearchForRecordWhichMeetsWithTheProgramCriteria() throws Throwable {

        offermade_page.searchRecordForOffer();

    }

    @And("^I complete all required fields as a Registry User$")
    public void iCompleteAllRequiredFieldsAsARegistryUser() throws Throwable {

        offermade_page.fillTheRequiredfieldsForOfferMade();
    }

    @When("^I select Proceed meets department requirements from drop down for to proceed to offermade$")
    public void iSelectProceedMeetsDepartmentRequirementsFromDropDownForToProceedToOffermade() throws Throwable {

        offermade_page.academicEligibilityForOfferMade();

    }

    @And("^I select English Assessment as \"([^\"]*)\" as a mandatory$")
    public void iSelectEnglishAssessmentAsAsAMandatory(String arg0) throws Throwable {

        offermade_page.checkEnglishAssessmentforOffermade();

    }

    @And("^I click on sent to department tick check box$")
    public void iClickOnSentToDepartmentTickCheckBox() throws Throwable {

        offermade_page.checkBoxSendToDepartment();

    }

    @And("^I save the record in Registry Assessment$")
    public void iSaveTheRecordInRegistryAssessment() throws Throwable {
        offermade_page.saveTheRecordInRegistry();

    }

    @Then("^I the record should be saved in Registry$")
    public void iTheRecordShouldBeSavedInRegistry() throws Throwable {
        offermade_page.assertRegistryAssessment();

    }
}
