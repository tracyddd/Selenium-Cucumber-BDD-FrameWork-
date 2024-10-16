package stepDefinitionsKart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.picocontainer.annotations.Inject;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class GreenKartLandingPage {
    private final TestContextSetup testContextSetup;
    public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;

    // 构造函数注入 DriverManager
    public GreenKartLandingPage(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;  // 将 driver 初始化为 testContextSetup.driver which can simply use "driver" instead of "testContextSetup.driver"
    }

    @Given("User is on GreenCart landing page")
    public void user_is_on_green_cart_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");

        // Create a new instance of the Chrome driver
      driver = new ChromeDriver();

      driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        // Optionally, you can maximize the browser window
      driver.manage().window().maximize();
    }
    @When("user searched with Shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {

        driver.findElement(By.xpath("//input[@type='search']")).sendKeys((shortName));
        Thread.sleep(2000);
        String productName =  driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        System.out.println("productName: " + productName +"is extracted from Home page");
    }
}
