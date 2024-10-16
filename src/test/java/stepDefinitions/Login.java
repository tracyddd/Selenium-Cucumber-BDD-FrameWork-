package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("System shows Step {int} for {string} to show the login screen")
    public void system_shows_step_for_to_show_the_login_screen(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("System shows Step "+int1+" for "+string+" to show the login screen");
    }

    @When("System shows Step {int} for {string} to input user name")
    public void system_shows_step_for_to_input_user_name(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("step 2");
        System.out.println("System shows Step "+int1+" for "+string+" to show the login screen");
    }
    @When("System show Step {int} for {string} to input password")
    public void system_show_step_for_to_input_password(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 3");
        System.out.println("System shows Step "+int1+" for "+string+" to show the login screen");
    }
    @Then("System shows Step {int} for {string} to login successfully with a successful message")
    public void system_shows_step_for_to_login_successfully_with_a_successful_message(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Step 4");
        System.out.println("System shows Step "+int1+" for "+string+" to show the login screen");
    }


}
