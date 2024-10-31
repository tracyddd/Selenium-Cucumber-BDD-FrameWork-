package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/features", //dryRun = true // same as compile
        tags="@new",  // tags="not @Regression"
        glue="stepDefinitions",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-TestNGRunner.html", "json:target/cucumber-TestNGRunner.json"
    }
)
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}
