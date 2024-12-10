package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/Signup.feature",
        glue = "stepDefinition",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports.json"
                 },
        monochrome = true,
        tags = "@Signup"
)
public class TestRunner {
    // This class will run the Cucumber tests
}