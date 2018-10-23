package StepDefinitions.WFE;

import Pages.CRM_Recruit.Offermade_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class DecissionFromApplicationStep_Defs {
    Offermade_Page offermade_page = new Offermade_Page(driver);

    @And("^I login as to CRM Recruit as a super user$")
    public void iLoginAsToCRMRecruitAsASuperUser() throws Throwable {
        offermade_page.urlCRM();
        offermade_page.LoginForOffermade();
    }

    @And("^I search for the applicant$")
    public void iSearchForTheApplicant() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
