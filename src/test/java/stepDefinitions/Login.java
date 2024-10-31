package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Reporter;

public class Login {
    @Given("System shows Step {int} for {string} to show the login screen")
    public void system_shows_step_for_to_show_the_login_screen(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        Reporter.log("System shows Step "+int1+" for "+string+" to show the login screen");
    }

    @When("System shows Step {int} for {string} to input user name")
    public void system_shows_step_for_to_input_user_name(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        Reporter.log("step 2");
        Reporter.log("System shows Step "+int1+" for "+string+" to show the login screen");
    }
    @When("System show Step {int} for {string} to input password")
    public void system_show_step_for_to_input_password(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        Reporter.log("Step 3");
        Reporter.log("System shows Step "+int1+" for "+string+" to show the login screen");
    }
    @Then("System shows Step {int} for {string} to login successfully with a successful message")
    public void system_shows_step_for_to_login_successfully_with_a_successful_message(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        Reporter.log("Step 4");
        Reporter.log("System shows Step "+int1+" for "+string+" to show the login screen");
    }


}
