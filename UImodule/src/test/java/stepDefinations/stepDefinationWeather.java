package stepDefinations;

import com.openWeatherUI.stepDefinationsBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import java.io.IOException;
import java.util.HashMap;


@RunWith(Cucumber.class)
public class stepDefinationWeather
{
    stepDefinationsBase steps = new stepDefinationsBase();

    public stepDefinationWeather() throws IOException {
    }

    @When("^User is one NDTV home page$")
    public void verifyIfUserIsOnHomePage() { steps.getUserToHomePage(); }

    @Then("^User expands header section$")
    public void HeaderOnHomePage() { steps.expandHeaderOnHomePage(); }

    @Given("^User clicks on weather$")
    public void getUsertoWeatherSection() { steps.clickOnWeatherLink(); }

    @Given("^Weather section is opened$")
    public void verifyIfWeatherSectionIsOpened() { steps.fetchCurrentWindowTitle(); }

    @Given("^User is one NDTV weather section$")
    public void verifyCurrentPage() { steps.fetchCurrentWindowTitle(); }

    @Given("^User types in the location$")
    public void searchGivenLocation() { steps.searchLocation(); }

    @Given("^User checks the location to Pin it$")
    public void verifySelectedLocation() { steps.checkIfLocationSelected(); }

    @Given("^User has selected location on weather section$")
    public void verifyIfLocationSelected() { steps.checkIfLocationSelected(); }

    @Given("^User clicks on the location$")
    public void ClickOnLocationOnMap() { steps.ClickgivenLocationOnMap(); }

    @Given("^User sees the weather information for that location$")
    public void verifyWeatherInformationOfLocationOnMap() { steps.fetchInformationOfLocationOnMap(); }

    public HashMap<String,String> GetInformationOfLocationOnMap() { return steps.GetInformationOfGivenLocationOnMap(); }

}