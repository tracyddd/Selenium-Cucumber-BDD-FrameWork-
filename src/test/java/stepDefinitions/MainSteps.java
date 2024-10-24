package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class MainSteps {

    @Given("setup the entire in database")
    public void setup_the_entire_in_database() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps- Given: setup the entire in database");
    }
    @When("launch the browser from config variables")
    public void launch_the_browser_from_config_variables() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps - Background - When : launch the browser from config variables");
    }
    @And("hit the home page url of banking site")
    public void  hit_the_home_page_url_of_banking_site() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps - Background - And: hit the home page url of banking site");
    }


    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Launch Google.com
        driver.get("https://www.bing.com");

        // Optionally, you can maximize the browser window
        driver.manage().window().maximize();
        // Close the browser
        System.out.println("Bing is closed, MainSteps - Given: user_is_on_net_banking_landing_page is done");
         driver.quit();
    }

    @Given("User is on Practise landing page")
    public void user_is_on_practise_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps - Given: User is on Practise landing page");
    }

    @When("user login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps - When: user login into application with username: "+username+ "   password: " +password);
    }

    @Then("Home Page is displayed.")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps - Then : home_page_is_displayed");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps - Then: cards_are_displayed");
        System.out.println("================================================================");
    }

    @When("^user login into application with (.+) and password (.+) combination$")
    public void user_login_into_application_with_and_password_combination(String Username, String Password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MainSteps: Username: " + Username + "   Password: " + Password);
       // throw new io.cucumber.java.PendingException();
    }

    @When("user signup into application")
    public void user_signup_into_application(List<String> data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));

    }



}
