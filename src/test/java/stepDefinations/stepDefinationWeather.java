package stepDefinations;

import Cucumber.Automation.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import java.io.IOException;

@RunWith(Cucumber.class)
public class stepDefinationWeather extends Base {

    public stepDefinationWeather() throws IOException {
    }

    @Given("^User is on Screen A$")
    public void performGiven() throws IOException, InterruptedException {

        System.out.println("User is on Screen A");
    }

    @When("^User clicks on link x$")
    public void performWhen() throws IOException, InterruptedException {

        System.out.println("Clicked on link X");
    }

    @Then("^User navigates to screen B$")
    public void performThen() throws IOException, InterruptedException {

        System.out.println("Navigated to screen B");
    }
}