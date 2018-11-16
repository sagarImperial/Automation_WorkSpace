package BaseFramework.Plumbing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","json:target/cucmber.js"},
        features = {"src/test/"},glue = {"classpath:StepDefinitions",
        "BaseFramework/Hooks"},
        tags = {"@Monitor"}
)
public class RunCukesTest{
}