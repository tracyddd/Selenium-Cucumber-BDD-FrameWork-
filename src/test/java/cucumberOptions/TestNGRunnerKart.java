package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features ="src/test/java/featuresKart",// dryRun = true, // same as compile
        tags="@kart",  glue="stepDefinitionsKart", monochrome = true //, plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)  // tags="not @Regression"
class TestNGRunnerKart extends AbstractTestNGCucumberTests {
}


