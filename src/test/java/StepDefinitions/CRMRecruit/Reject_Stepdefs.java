package StepDefinitions.CRMRecruit;

import Pages.CRMRecruit.RecruitLogin_Page;
import Pages.CRMRecruit.RejectAtSource_Page;
import Pages.CRMRecruit.Reject_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static BaseFramework.Plumbing.Driver_Init.driver;

public class Reject_Stepdefs {

   Reject_Page reject_page = new Reject_Page(driver);
   RecruitLogin_Page recruitLogin_page = new RecruitLogin_Page(driver);
   RejectAtSource_Page rejectAtSource_page = new RejectAtSource_Page(driver);

//   public Reject_Stepdefs(){
//
//       reject_page = new Reject_Page(driver);
//       recruitLogin_page = new RecruitLogin_Page(driver);
//       rejectAtSource_page = new RejectAtSource_Page(driver);
//
//   }

   @And("^I search for record which matches with the program criteria$")
    public void iSearchForRecordWhichMatchesWithTheProgramCriteria() throws Throwable {

       //driver.get(ProgramProperties.CRM_TEST_URL);
       reject_page.url_CRM();
       reject_page.searchRecord();

    }

    @When("^I select Proceed meets department requirements from drop down$")
    public void iSelectProceedMeetsDepartmentRequirementsFromDropDown() throws Throwable {

      reject_page.meetsDepartmentRequirements();
    }

    @And("^I select English Assessment as \"([^\"]*)\"$")
    public void iSelectEnglishAssessmentAs(String arg0) throws Throwable {

      reject_page.checkEnglishAssessment();

    }

    @And("^I click on sent to department check box$")
    public void iClickOnSentToDepartmentCheckBox() throws Throwable {

       reject_page.checkboxSendToDepartment();

    }

    @Then("^my record should be saved$")
    public void myRecordShouldBeSaved() throws Throwable {

       reject_page.saveRegistryAssessment();

    }

    @When("^I logged in as IC Department User$")
    public void iLoggedInAsICDepartmentUser() throws Throwable {

       reject_page.gotoDepartmentRegistry();

    }

    @And("^I search for the record which ready for review$")
    public void iSearchForTheRecordWhichReadyForReview() throws Throwable {

        reject_page.recordReadyForReview();

    }

    @And("^I select Department Decision as reject$")
    public void iSelectDepartmentDecisionAsReject() throws Throwable {

        reject_page.decisionReject();

    }

    @And("^I provide the reason for rejection$")
    public void iProvideTheReasonForRejection() throws Throwable {

        reject_page.rejectionReason();
    }

    @And("^I click on Decision to registry$")
    public void iClickOnDecisionToRegistry() throws Throwable {

        reject_page.checkboxSendToRegistry();

    }

    @Then("^I should be able to see Application folder status should be - Registry decision made$")
    public void iShouldBeAbleToSeeApplicationFolderStatusShouldBeRegistryDecisionMade() throws Throwable {

        reject_page.saveDepartmentAssessment();

    }
}
