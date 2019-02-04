package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.LoginLogout;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class Student_Login_Logout_StepDefs {

    LoginLogout  loginLogout;

    public Student_Login_Logout_StepDefs(){
        loginLogout = new LoginLogout(driver);
    }

    @And("^I enter my username$")
    public void iEnterMyUsername() throws Throwable {
        loginLogout.enterStudentUserName();
    }

    @And("^I enter my password$")
    public void iEnterMyPassword() throws Throwable {
        loginLogout.enterStudentPassword();
    }

    @And("^I click on Log in button$")
    public void iClickOnLogInButton() throws Throwable {
        loginLogout.clickOnLoginButton();
    }

    @And("^I should get \"([^\"]*)\"$")
    public void iShouldGet(String loginMessageCheck) throws Throwable {
        loginLogout.verifyLoginText(loginMessageCheck);
    }

    @When("^I click on Logout$")
    public void iClickOnLogout() throws Throwable {
        loginLogout.logoutAsStudent();
    }

    @Then("^I should get \"([^\"]*)\" option$")
    public void iShouldGetOption(String logoutMessageCheck) throws Throwable {
        loginLogout.verifyLogoutText(logoutMessageCheck);
    }
}
