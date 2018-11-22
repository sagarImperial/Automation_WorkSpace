package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.ShortCourse;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class ShortCourse_StepDefs {

    ShortCourse shortCourse = new ShortCourse(driver);

    @And("^I Create account$")
    public void iCreateAccount() throws Throwable {
        shortCourse.clickOnCreateAccountLink();
        shortCourse.select_YES_AS_PrivacyPolicy();
        shortCourse.completeCreateAccount_RequiredFields();
        shortCourse.clickOnCreateAccountButton();
    }

    @And("^I continue with my application$")
    public void iContinueWithMyApplication() throws Throwable {
        shortCourse.clickOnCreateANewApplicationButton();
        shortCourse.clickOnShortCourseAndVisitingStudentNonDegreeButton();
        shortCourse.clickOnContinueThisApplication();
    }

    @And("^I complete my Proposed Studies and Personal Information tab$")
    public void iCompleteMyProposedStudiesAndPersonalInformationTab() throws Throwable {
        shortCourse.completeProposedStudiesAndPersonalInformation();
    }

    @And("^I complete my Additional Information Tab$")
    public void iCompleteMyAdditionalInformationTab() throws Throwable {
        shortCourse.additionalInformation();
    }

    @And("^I complete my English Language Tab$")
    public void iCompleteMyEnglishLanguageTab() throws Throwable {
        shortCourse.completeEnglishLanguageTabDetails();
    }

    @And("^I complete my Confidential Information Tab$")
    public void iCompleteMyConfidentialInformationTab() throws Throwable {
        shortCourse.confidentialInformationTabDetails();
    }

    @And("^I submit my application$")
    public void iSubmitMyApplication() throws Throwable {
        shortCourse.submissionTabDetails();
    }

    @When("^I upload my all the required supporting document$")
    public void iUploadMyAllTheRequiredSupportingDocument() throws Throwable {
        shortCourse.uploadSupportingDocuments();
    }

    @Then("^I should get status as \"([^\"]*)\" on my accounts page$")
    public void iShouldGetStatusAsOnMyAccountsPage(String status) throws Throwable {
        shortCourse.verifyApplicationStatusOnMyAccountsPage(status);
    }
}
