package StepDefinitions.CRM_Recruit_StepDefinations;

import Pages.CRM_Recruit.RecruitLogin_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class RecruitLogin_Stepdefs {

    RecruitLogin_Page recruitLogin_page = new RecruitLogin_Page(driver);

    @Given("^I am on ICL CRM Recruit login page$")
    public void iAmOnICLCRMRecruitLoginPage() throws Throwable {

        recruitLogin_page.urlCRMTest();

    }

    @And("^I enter my recruit username$")
    public void iEnterMyRecruitUsername() throws Throwable {

        recruitLogin_page.enterCRMUserName();

    }

    @And("^I enter my recruit password$")
    public void iEnterMyRecruitPassword() throws Throwable {

        recruitLogin_page.enterCRMPassword();

    }

    @When("^I click on Sign in button$")
    public void iClickOnSignInButton() throws Throwable {

        recruitLogin_page.clickOnSignOutButton();

    }

    @Then("^I should be able to Sign Out$")
    public void iShouldBeAbleToSignOut() throws Throwable {

        recruitLogin_page.clickOnProfileImage();
        recruitLogin_page.clickOnSignOutButton();

    }
}
