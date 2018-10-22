package StepDefinitions.WFE;

import Pages.WFE.Doctoral_Chemistry_Research_PHD;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class Doctoral_ChemistryResearch_PHD_Programme_StepDefs {
    Doctoral_Chemistry_Research_PHD doctoral_chemistry_research_phd = new Doctoral_Chemistry_Research_PHD(driver);

    @And("^I create an account for Doctoral Chemistry Research PHD Programme$")
    public void iCreateAnAccountForDoctoralChemistryResearchPHDProgramme() throws Throwable {
        // This is by passing create account every time when test are been worked on
//        doctoral_chemistry_research_phd.loginByPass();

        //Enable for end to end test
        doctoral_chemistry_research_phd.clickOnCreateAccountLink();
        doctoral_chemistry_research_phd.select_YES_AS_PrivacyPolicy();
        doctoral_chemistry_research_phd.completeAllRequiredFields();
        doctoral_chemistry_research_phd.clickOnCreateAccountButton();
    }

    @And("^I apply for the Chemistry Research PHD Programme$")
    public void iApplyForTheChemistryResearchPHDPrograme() throws Throwable {
        //Enable for end to end test
        doctoral_chemistry_research_phd.clickOnCreateANewApplicationButton();
        doctoral_chemistry_research_phd.clickOnPostgraduateResearchButton();
        doctoral_chemistry_research_phd.clickOnContinueThisApplication();
        doctoral_chemistry_research_phd.completeApplicationForm_ChemistryResearchPHD();

    }

    @And("^I upload my PHD supporting documents$")
    public void iUploadMyPHDSupportingDocuments() throws Throwable {
        doctoral_chemistry_research_phd.uploadSupportingDocuments();
    }

    @When("^I submit the reference information$")
    public void iSubmitTheReferenceInformation() throws Throwable {
        doctoral_chemistry_research_phd.completeReferenceInformation();
    }
}
