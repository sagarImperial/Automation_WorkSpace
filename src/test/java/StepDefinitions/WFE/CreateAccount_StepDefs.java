package StepDefinitions.WFE;

import Pages.WFE.CreateAccount;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class CreateAccount_StepDefs {
    CreateAccount createAccount;

    public CreateAccount_StepDefs() {
        createAccount = new CreateAccount(driver);
    }

    @Given("^I am on ICL gateway web page$")
    public void iAmOnICLGatewayWebPage() throws Throwable {
//        driver.get("https://imperialuktest.elluciancrmrecruit.com/Apply/Account/Login?ReturnUrl=%2fapply");
        createAccount.getWFEURL();
    }

    @And("^I click on Create account$")
    public void iClickOnCreateAccount() throws Throwable {
        createAccount.clickOnCreateAccountLink();
    }

    @And("^I accept the privacy policy$")
    public void iAcceptThePrivacyPolicy() throws Throwable {
        createAccount.select_YES_AS_PrivacyPolicy();

    }

    @And("^I enter all required fields$")
    public void iEnterAllRequiredFields() throws Throwable {
        createAccount.completeAllRequiredFields();
    }

    @When("^I click \"([^\"]*)\" button$")
    public void iClickButton(String buttonName) throws Throwable {
        createAccount.clickOnCreateAccountButton();
    }

    @Then("^I should get \"([^\"]*)\" Message$")
    public void iShouldGetMessage(String emailActivatioMessage) throws Throwable {
        System.out.println(emailActivatioMessage);
        System.out.println("                                   ");
    }

    @Then("^I should get \"([^\"]*)\" Message page$")
    public void iShouldGetMessagePage(String message) throws Throwable {
        createAccount.alreadyCreatedAnAccount(message);
    }


    @Then("^I should get \"([^\"]*)\" page$")
    public void iShouldGetPage(String text_My_Account) throws Throwable {
        createAccount.createAccountVerificationMessage(text_My_Account);
    }

    @And("^I should get option \"([^\"]*)\"$")
    public void iShouldGetOption(String option) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
