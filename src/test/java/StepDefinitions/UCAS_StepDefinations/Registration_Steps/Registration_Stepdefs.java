package StepDefinitions.UCAS_StepDefinations.Registration_Steps;

import Pages.Registration_Pages;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class Registration_Stepdefs {
    Registration_Pages registrationPage;
    public Registration_Stepdefs(){
        registrationPage = new Registration_Pages(driver);

    }



    @Given("^I am on UCAS page$")
    public void iAmOnUCASPage() throws Throwable {
       // System.out.println("I am on UCAS Site");
        driver.get("https://2018.hep1undergrad.apply.ucasenvironments.com/appreg/SecurityServlet");
    }


    @When("^I click on Registraion button$")
    public void iClickOnRegistraionButton() throws Throwable {
        registrationPage.enterRegistrationBtn();



    }

    @Then("^I should able to land on Registration Welcome Page$")
    public void iShouldAbleToLandOnRegistrationWelcomePage() throws Throwable {
         System.out.println(" I am on Welcome Page ");

    }

    @Given("^I am an Registration Welcome Page$")
    public void iAmAnRegistrationWelcomePage() throws Throwable {
        System.out.println((" Register : Welcome"));
    }

    @When("^I complete registration process$")
    public void iCompleteRegistrationProcess() throws Throwable {
       // registrationPage.registrationProcessPage1();

    }

    @Then("^I successfully finish the registration of UCAS$")
    public void iSuccessfullyFinishTheRegistrationOfUCAS() throws Throwable {
        System.out.println("Success");

    }



    }

