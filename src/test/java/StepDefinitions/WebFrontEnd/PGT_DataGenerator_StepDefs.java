package StepDefinitions.WebFrontEnd;

import Pages.WebFrontEnd.PGT_DataGenerator;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class PGT_DataGenerator_StepDefs {

    PGT_DataGenerator pgt_dataGenerator = new PGT_DataGenerator(driver);

    @And("^I click on Create account on basis of excel data$")
    public void iClickOnCreateAccountOnBasisOfExcelData() throws Throwable {

    }
}
