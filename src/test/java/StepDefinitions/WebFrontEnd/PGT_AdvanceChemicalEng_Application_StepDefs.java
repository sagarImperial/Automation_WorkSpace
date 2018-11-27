package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.PGT_AdvanceChemicalEng_Application;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class PGT_AdvanceChemicalEng_Application_StepDefs {
      PGT_AdvanceChemicalEng_Application pgt_advanceChemicalEng_application;

    public PGT_AdvanceChemicalEng_Application_StepDefs() {
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

    @And("^I upload my supporting documents$")
    public void iUploadMySupportingDocuments() throws Throwable {
        pgt_advanceChemicalEng_application.uploadSupportingDocuments();
    }

    @And("^I submit my reference information$")
    public void iSubmitMyReferenceInformation() throws Throwable {
        pgt_advanceChemicalEng_application.completeReferenceInformation();
    }

    @Then("^I should go back to My Account page$")
    public void iShouldGoBackToMyAccountPage() throws Throwable {
        pgt_advanceChemicalEng_application.clickOnyMyAccountLink();
    }
}
