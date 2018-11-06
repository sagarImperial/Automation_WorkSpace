package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.PGT_Management_MBA;
import cucumber.api.java.en.And;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class PGT_Management_MBA_StefDefs {

    PGT_Management_MBA pgt_management_mba = new PGT_Management_MBA(driver);

    @And("^I create an account for Management MBA$")
    public void iCreateAnAccountForManagementMBA() throws Throwable {
        pgt_management_mba.loginByPass();
//        pgt_management_mba.clickOnCreateAccountLink();
//        pgt_management_mba.completeAllRequiredFields();
//        pgt_management_mba.clickOnCreateAccountButton();
    }

    @And("^I apply for the Management MBA Programme$")
    public void iApplyForTheManagementMBAProgramme() throws Throwable {
//        pgt_management_mba.clickOnCreateANewApplicationButton();
//        pgt_management_mba.clickOnPostgraduateResearchButton();
//        pgt_management_mba.clickOnContinueThisApplication();
        pgt_management_mba.complete_Management_MBA_Application();

    }

    @And("^I upload my MBA supporting documents$")
    public void iUploadMyMBASupportingDocuments() throws Throwable {
        System.out.println("And I upload my documents.......");
    }
}
