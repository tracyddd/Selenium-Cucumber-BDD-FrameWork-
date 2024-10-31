package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import utils.TestContextSetup;

public class hooks {
    private final TestContextSetup testContextSetup;
    private final WebDriver driver;

    public hooks(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;  // 将 driver 初始化为 testContextSetup.driver which can simply use "driver" instead of "testContextSetup.driver"
    }
    @Before("@NetBanking")  //  @Before only run for NetBanking annotations
    public void netBankingSetup()
    {
        Reporter.log("hooks: Setup the entries in NetBanking database");
    }

    @Before("@NetBanking")
    public void mortgageSetup()
    {
        Reporter.log("hooks: Setup the entries in Mortgage database");
    }

    @Before("@new")
    public void newSetup()
    {
        Reporter.log("hooks - new: Setup the entries in new test database");
    }

    @After
    public void tearDown(){
        driver.quit();
        Reporter.log("hooks - all : Clear the entries for all databases");
    }
}

