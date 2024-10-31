package stepDefinitions;

import io.cucumber.java.en.When;
import org.testng.Reporter;

public class newLoginTest {
    @When("launch the browser")
    public void launch_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        Reporter.log("newTest: launch_the_browser");
    }
    @When("click on home button")
    public void click_on_home_button() {
        // Write code here that turns the phrase above into concrete actions
        Reporter.log("newTest: click_on_home_button");
    }
}
