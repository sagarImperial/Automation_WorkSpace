package StepDefinitions.UCAS_StepDefinations.UCASRegistration_Steps;

import UCASPages.Registration_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class Registration_Stepdefs {
    Registration_Page registrationPage;
    public Registration_Stepdefs(){
        registrationPage = new Registration_Page(driver);

    }



    @Given("^I am on UCAS page$")
    public void iAmOnUCASPage() throws Throwable {

        driver.get("https://2018.hep1undergrad.apply.ucasenvironments.com/appreg/SecurityServlet");
    }


    @When("^I click on Registraion button$")
    public void iClickOnRegistraionButton() throws Throwable {
        registrationPage.enterRegistrationBtn();
    }

    @Then("^I should able to land on Registration Welcome Page$")
    public void iShouldAbleToLandOnRegistrationWelcomePage() throws Throwable {
       System.out.println("SUCCESSFULLY NAVIGATED TO REGISTRATION PAGE");
       System.out.println("");


    }

    @Given("^I am an Registration Welcome Page$")
    public void iAmAnRegistrationWelcomePage() throws Throwable {
        driver.get("https://2018.hep1undergrad.apply.ucasenvironments.com/appreg/SecurityServlet");

    }

    @When("^I complete registration process$")
    public void iCompleteRegistrationProcess() throws Throwable {
        registrationPage.registrationProcess();

    }

    @Then("^I successfully finish the registration of UCAS$")
    public void iSuccessfullyFinishTheRegistrationOfUCAS() throws Throwable {
        System.out.println("");
        System.out.println("SUCCESSFULLY COMPLETED REGISTRATION OF UCAS");
        System.out.println("");

    }



    }

