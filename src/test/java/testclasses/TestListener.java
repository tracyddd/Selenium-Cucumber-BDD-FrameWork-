package testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Listeners;
import utils.TestNGListener;

@Listeners(TestNGListener.class)
public class TestListener {
    @Given("test1")
    public void test1() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Executing test1");
        assert true;
    }
    @When("test2")
    public void test2() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Executing test2");
        assert false;
    }
    @Then("test3")
    public void test3() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Executing test3");
        assert false;
    }


}