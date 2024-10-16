package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/features", //dryRun = true // same as compile
        tags="@new",  glue="stepDefinitions", monochrome = true //, plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"

)  // tags="not @Regression"
public class TestNGRunner extends AbstractTestNGCucumberTests
{
}

