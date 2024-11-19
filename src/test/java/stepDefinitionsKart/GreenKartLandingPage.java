package stepDefinitionsKart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.LandingPage;
import utils.ConfigReader;
import utils.Log;
import utils.ReporterLogger;
import utils.TestContextSetup;

public class GreenKartLandingPage {
    private final TestContextSetup testContextSetup;
    public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;

    // Constructor to inject the driver from TestContextSetup
    public GreenKartLandingPage(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;  // Use the driver from TestContextSetup
    }

    @Given("User is on GreenCart landing page")
    public void user_is_on_green_cart_landing_page() {
        // No need to initialize the driver here, as it is already provided by TestContextSetup

        // 使用 ConfigReader 来读取 QAUrl
        ConfigReader configReader = new ConfigReader();
        String url = configReader.getProperty("QAUrl");
        driver.get(url);
        driver.manage().window().maximize();
    }

    @ When("User searched with Shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName)throws InterruptedException {
        LandingPage landingPage = new LandingPage(testContextSetup.driver); // Pass the existing driver
        landingPage.searchItem(shortName);
        landingPage.getSearchText();
        Thread.sleep(2000);
        String productName = landingPage.getProductName(); // Store the extracted product name
        testContextSetup.ProductName = productName; // Set it in the TestContextSetup
    }

}
