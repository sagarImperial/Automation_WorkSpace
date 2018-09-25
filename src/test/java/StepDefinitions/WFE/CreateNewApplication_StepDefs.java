package StepDefinitions.WFE;

import Pages.WFE.CreateAccount;
import Pages.WFE.CreateNewApplication;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class CreateNewApplication_StepDefs {
    CreateAccount createAccount;
    CreateNewApplication createNewApplication;

    public CreateNewApplication_StepDefs() {
        createNewApplication = new CreateNewApplication(driver);
        createAccount = new CreateAccount(driver);
    }

    @And("^I create an account$")
    public void iCreateAnAccount() throws Throwable {
        createAccount.clickOnCreateAccountLink();
        createAccount.select_YES_AS_PrivacyPolicy();
        createAccount.completeAllRequiredFields();
        createAccount.clickOnCreateAccountButton();
    }

    @And("^I login$")
    public void iLogin() throws Throwable {
        createNewApplication.login();
    }

    @And("^I click Create a New Application$")
    public void iClickCreateANewApplication() throws Throwable {
        createNewApplication.clickOnCreateANewApplicationButton();
    }

    @And("^I select Postgraduate Taught$")
    public void iSelectPostgraduateTaught() throws Throwable {
        createNewApplication.clickOnPostgraduateTaughtButton();
    }

    @And("^I click on Continue this application$")
    public void iClickOnContinueThisApplication() throws Throwable {
        createNewApplication.clickOnContinueThisApplication();
    }

    @And("^I complete Proposed Studies and Personal Information$")
    public void iCompleteProposedStudiesAndPersonalInformation() throws Throwable {
        createNewApplication.completeProposedStudiesAndPersonalInformation();
    }

    @And("^I complete Academic Experience tab details$")
    public void iCompleteAcademicExperienceTabDetails() throws Throwable {
        createNewApplication.completeAcademicExperienceTabDetails();
    }

    @And("^I complete Additional Qualifications tab details$")
    public void iCompleteAdditionalQualificationsTabDetails() throws Throwable {
        createNewApplication.completeAdditionalQualificationTabDetails();
    }

    @And("^I complete Additional Information tab details$")
    public void iCompleteAdditionalInformationTabDetails() throws Throwable {
        createNewApplication.completeAdditionalInformationTabDetails();
    }

    @And("^I complete Confidential Information tab details$")
    public void iCompleteConfidentialInformationTabDetails() throws Throwable {
        createNewApplication.confidentialInformationTabDetails();
    }

    @And("^I complete Marketing Information tab details$")
    public void iCompleteMarketingInformationTabDetails() throws Throwable {
        createNewApplication.marketingInformationTabDetails();
    }

    @And("^I complete Submission tab details$")
    public void iCompleteSubmissionTabDetails() throws Throwable {
        createNewApplication.submissionTabDetails();
    }

    @And("^I upload my supporting documents$")
    public void iUploadMySupportingDocuments() throws Throwable {
        createNewApplication.uploadSupportingDocuments();
    }

    @And("^I submit my reference information$")
    public void iSubmitMyReferenceInformation() throws Throwable {
        createNewApplication.completeReferenceInformation();
    }

    @Then("^I should go back to My Account page$")
    public void iShouldGoBackToMyAccountPage() throws Throwable {
        createNewApplication.clickOnyMyAccountLink();
    }
}
