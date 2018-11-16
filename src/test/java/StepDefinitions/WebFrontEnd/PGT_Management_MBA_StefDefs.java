package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.PGT_Management_MBA;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class PGT_Management_MBA_StefDefs {

    PGT_Management_MBA pgt_management_mba = new PGT_Management_MBA(driver);

    @And("^I create an account for Management MBA$")
    public void iCreateAnAccountForManagementMBA() throws Throwable {
//        pgt_management_mba.loginByPass();
        pgt_management_mba.clickOnCreateAccountLink();
        pgt_management_mba.completeAllRequiredFields();
        pgt_management_mba.clickOnCreateAccountButton();

    }

    @And("^I continue with the same application$")
    public void iContinueWithTheSameApplication() throws Throwable {
        pgt_management_mba.clickOnCreateANewApplicationButton();
        pgt_management_mba.clickOnPostgraduateResearchButton();
        pgt_management_mba.clickOnContinueThisApplication();
    }

    @And("^I complete Proposed Studies and Personal Information tab$")
    public void iCompleteProposedStudiesAndPersonalInformationTab() throws Throwable {
        pgt_management_mba.completeProposedStudiesAndPersonalInformation();
    }

    @And("^I complete Academic Experience tab$")
    public void iCompleteAcademicExperienceTab() throws Throwable {
        pgt_management_mba.completeAcademicExperienceTabDetails();
    }

    @And("^I complete Additional Qualifications tab$")
    public void iCompleteAdditionalQualificationsTab() throws Throwable {
        pgt_management_mba.completeAdditionalQualificationTabDetails();
    }

    @And("^I complete Additional Information tab$")
    public void iCompleteAdditionalInformationTab() throws Throwable {
        pgt_management_mba.completeAdditionalInformationTabDetails();
    }

    @And("^I complete Confidential Information tab$")
    public void iCompleteConfidentialInformationTab() throws Throwable {
        pgt_management_mba.confidentialInformationTabDetails();
    }

    @And("^I complete Marketing Information tab$")
    public void iCompleteMarketingInformationTab() throws Throwable {
        pgt_management_mba.marketingInformationTabDetails();
    }

    @And("^I submit my MBA application$")
    public void iSubmitMyApplication() throws Throwable {
        pgt_management_mba.submissionTabDetails();
    }

    //------MBA Application fees paid using Promo Code
    @And("^I make MBA application fees using promo code$")
    public void iMakeMBAApplicationFeesUsingPromoCode() throws Throwable {
        pgt_management_mba.mabApplicationFees();
    }


    @Then("^I should get \"([^\"]*)\" message$")
    public void iShouldGetMessage(String successfulPaymentMessage) throws Throwable {
        pgt_management_mba.mbaSuccessfulPayment(successfulPaymentMessage);
    }



    @And("^I upload my MBA supporting documents$")
    public void iUploadMyMBASupportingDocuments() throws Throwable {
        pgt_management_mba.uploadSupportingDocuments();
    }

    @And("^I return to check my application status$")
    public void iReturnToCheckMyApplicationStatus() throws Throwable {
        pgt_management_mba.clickToCheckYourApplicationStatus();
    }


    @When("^I submit my reference information for the MBA application$")
    public void iSubmitMyReferenceInformationForTheMBAApplication() throws Throwable {
        pgt_management_mba.completeMBAApplicationReferenceInformation();
    }

    @And("^go back to my Application$")
    public void goBackMyTheApplication() throws Throwable {
        pgt_management_mba.goBackToTheApplication();
    }

    @Then("^I should get my \"([^\"]*)\"$")
    public void iShouldGetMy(String applicationNumber) throws Throwable {

    }


    @Then("^I should get \"([^\"]*)\" link$")
    public void iShouldGetLink(String verificationLink) throws Throwable {
        pgt_management_mba.verifyApplicationNumberText(verificationLink);
    }
}
