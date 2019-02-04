package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.PGT_AdvanceChemicalEng_Application;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class PGT_AdvanceChemicalEng_Application_StepDefs {
    PGT_AdvanceChemicalEng_Application pgt_advanceChemicalEng_application;

    public PGT_AdvanceChemicalEng_Application_StepDefs() throws Exception {
        pgt_advanceChemicalEng_application = new PGT_AdvanceChemicalEng_Application(driver);
    }

    @And("^I create an account$")
    public void iCreateAnAccount() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnCreateAccountLink();
        pgt_advanceChemicalEng_application.select_YES_AS_PrivacyPolicy();
        pgt_advanceChemicalEng_application.completeAllRequiredFields();
        pgt_advanceChemicalEng_application.clickOnCreateAccountButton();
    }

    @And("^I login$")
    public void iLogin() throws Throwable {
        pgt_advanceChemicalEng_application.login();
    }

    @And("^I click Create a New Application$")
    public void iClickCreateANewApplication() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnCreateANewApplicationButton();
    }

    @And("^I select Postgraduate Taught$")
    public void iSelectPostgraduateTaught() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnPostgraduateTaughtButton();
    }

    @And("^I click on Continue this application$")
    public void iClickOnContinueThisApplication() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnContinueThisApplication();
    }

    @And("^I complete Proposed Studies and Personal Information$")
    public void iCompleteProposedStudiesAndPersonalInformation() throws Throwable {
        pgt_advanceChemicalEng_application.completeProposedStudiesAndPersonalInformation();
    }

    @And("^I complete Academic Experience tab details$")
    public void iCompleteAcademicExperienceTabDetails() throws Throwable {
        pgt_advanceChemicalEng_application.completeAcademicExperienceTabDetails();
    }

    @And("^I complete Additional Qualifications tab details$")
    public void iCompleteAdditionalQualificationsTabDetails() throws Throwable {
        pgt_advanceChemicalEng_application.completeAdditionalQualificationTabDetails();
    }

    @And("^I complete Additional Information tab details$")
    public void iCompleteAdditionalInformationTabDetails() throws Throwable {
        pgt_advanceChemicalEng_application.completeAdditionalInformationTabDetails();
    }

    @And("^I complete Confidential Information tab details$")
    public void iCompleteConfidentialInformationTabDetails() throws Throwable {
        pgt_advanceChemicalEng_application.confidentialInformationTabDetails();
    }

    @And("^I complete Marketing Information tab details$")
    public void iCompleteMarketingInformationTabDetails() throws Throwable {
        pgt_advanceChemicalEng_application.marketingInformationTabDetails();
    }

    @And("^I complete Submission tab details$")
    public void iCompleteSubmissionTabDetails() throws Throwable {
        pgt_advanceChemicalEng_application.submissionTabDetails();
    }

    @And("^I submit my reference information$")
    public void iSubmitMyReferenceInformation() throws Throwable {
        pgt_advanceChemicalEng_application.completeReferenceInformation();
    }

    @And("^I upload my supporting documents$")
    public void iUploadMySupportingDocuments() throws Throwable {
        pgt_advanceChemicalEng_application.uploadSupportingDocuments();
    }


    @Then("^I should go back to My Account page$")
    public void iShouldGoBackToMyAccountPage() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnyMyAccountLink();
    }


    //-------CRM recruit step defs
    @And("^I search for record above$")
    public void iSearchForRecordAbove() throws Throwable {
        pgt_advanceChemicalEng_application.searchForRecord();
    }


    @And("^I navigate to the student application$")
    public void iNavigateToTheStudentApplication() throws Throwable {
        pgt_advanceChemicalEng_application.navigateToTheRecord();
    }

    @And("^I go to Applicant Tab$")
    public void iGoToApplicantTab() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnApplicantTab();
    }

    @And("^I click on Mark As Completed Button$")
    public void iClickOnMarkAsCompletedButton() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnMarkAsCompleted();
    }

    @And("^I go to Application Review Tab$")
    public void iGoToApplicationReviewTab() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnApplicationReviewTab();
    }

    @And("^I change switch user as Registry User$")
    public void iChangeSwtichUserAsRegistryUser() throws Throwable {
        pgt_advanceChemicalEng_application.selectRegistryUserFromTheDropDown();
    }

    @And("^I set Fee status to \"([^\"]*)\"$")
    public void iSetFeeStatusTo(String feeStatus) throws Throwable {
        pgt_advanceChemicalEng_application.setFeesStatus_Field(feeStatus);
        System.out.println("");
        System.out.println("Fees Done.." + feeStatus);
    }

    @And("^I set Academic Eligibility to \"([^\"]*)\"$")
    public void iSetAcademicEligibilityTo(String academicEligibility) throws Throwable {
        pgt_advanceChemicalEng_application.setAcademicProgramme_Field(academicEligibility);
        System.out.println("");
        System.out.println("Academic Eligibility...." + academicEligibility);
    }

    @And("^I set English Assessment to \"([^\"]*)\"$")
    public void iSetEnglishAssessmentTo(String englishLanguageAssessment) throws Throwable {
        pgt_advanceChemicalEng_application.setEnglishLanguageAssessment_Field(englishLanguageAssessment);
        System.out.println("");
        System.out.println("English Assessment..." + englishLanguageAssessment);
    }

    @And("^I tick Send to Department checkbox$")
    public void iTickSendToDepartmentCheckbox() throws Throwable {
        pgt_advanceChemicalEng_application.setSendToDepartment_CheckBox();
        System.out.println("Send to Department checked");

    }

    @And("^I Save the changes$")
    public void iSaveTheChanges() throws Throwable {
        pgt_advanceChemicalEng_application.saveAllChanges();
        System.out.println("IC Registry user changed Saved......");
    }


    @And("^I change application folder user to \"([^\"]*)\"$")
    public void iChangeApplicationFolderUserTo(String user) throws Throwable {
        pgt_advanceChemicalEng_application.selectUserFromTheApplicationFolder_DropDown(user);
        System.out.println("User now been switched to " + user);
    }

    @And("^I set Decision as \"([^\"]*)\"$")
    public void iSetDecisionAs(String decision) throws Throwable {
        pgt_advanceChemicalEng_application.setDepartmentDecision_Field(decision);
        System.out.println("IC Department user sets Decision field to : - " + decision);
    }

    @And("^I tick Decision Made Send to Registry checkbox$")
    public void iTickDecisionMadeSendToRegistryCheckbox() throws Throwable {
        pgt_advanceChemicalEng_application.decisionMadeSendToRegistry();
        System.out.println("Send to Registry checked");
    }

    @And("^I enter Department Academic Condition Notes \"([^\"]*)\"$")
    public void iEnterDepartmentAcademicConditionNotes(String notes) throws Throwable {
        pgt_advanceChemicalEng_application.enterDepartmentAcademicConditionNotes(notes);
        System.out.println("IC Department user sets academic notes : - " + notes);
    }

    @And("^I should get Application Folder status as \"([^\"]*)\"$")
    public void iShouldGetApplicationFolderStatusAs(String text) throws Throwable {
        pgt_advanceChemicalEng_application.verifyApplicationFolderStatus_Text(text);
        System.out.println("Application folder status is set to :- " +text);
    }

    @And("^I to verify decision made I go to Application Review Tab$")
    public void iToVerifyDecisionMadeIGoToApplicationReviewTab() throws Throwable {
        pgt_advanceChemicalEng_application.decisionMade_GoToApplicationReviewTab();
    }
}
