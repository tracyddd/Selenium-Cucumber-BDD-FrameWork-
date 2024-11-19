package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ="src/test/java/featuresListener", //dryRun = true // same as compile
       // tags="@Test",  // tags="not @Regression"
        glue="testclasses", //glue="stepDefinitions",
        monochrome = true,
        plugin = {"pretty", "html:target/listener-TestNGRunner.html", "json:target/listener-TestNGRunner.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

    }
)
public class TestNGTestClass extends AbstractTestNGCucumberTests
{
}
