package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features ="src/test/java/featuresKart",// dryRun = true, // same as compile
//        tags="@kart",  glue="stepDefinitionsKart", monochrome = true, plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}

       tags="@kart",  glue="stepDefinitionsKart",  monochrome = true, plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failed_scenarios.txt"
}
)  // tags="not @Regression"
public class TestNGRunnerKart extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel=false)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}



