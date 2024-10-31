package stepDefinitionsKart;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import utils.TestContextSetup;

import java.io.File;

public class Hooks {
    private TestContextSetup testContextSetup;
    private WebDriver driver;

        public Hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;  // 将 driver 初始化为 testContextSetup.driver which can simply use "driver" instead of "testContextSetup.driver"
    }

    @After
    public void tearDown(){
        driver.quit();
        Reporter.log("hooks - all : Clear the entries for all databases");
    }


    @AfterStep
        public void AddScreenshot (Scenario scenario) throws Exception {
          //  tackTakeScreenshot when step is failed
        if (scenario.isFailed()) {
            //screenshot
    File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent,"image/jpg", "image");
        }
    }
}

