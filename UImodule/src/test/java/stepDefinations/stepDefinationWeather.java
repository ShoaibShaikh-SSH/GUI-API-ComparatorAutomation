package stepDefinations;

import com.openWeatherUI.stepDefinationsUI;
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
    stepDefinationsUI steps = new stepDefinationsUI();

    public stepDefinationWeather() throws IOException {
    }

    @When("^User is one NDTV home page$")
    public void verifyIfUserIsOnHomePage() throws IOException, InterruptedException {

        steps.getUserToHomePage();

        System.out.println("Home page checked !");
    }

    @Then("^User expands header section$")
    public void HeaderOnHomePage() throws InterruptedException
    {
        steps.expandHeaderOnHomePage();
    }

    @Given("^User clicks on weather$")
    public void getUsertoWeatherSection() throws Throwable {
        steps.clickOnWeatherLink();
    }

    @Given("^Weather section is opened$")
    public void verifyIfWeatherSectionIsOpened() throws InterruptedException {
        steps.fetchCurrentWindowTitle();
    }

    @Given("^User is one NDTV weather section$")
    public void verifyCurrentPage() throws InterruptedException {
        steps.fetchCurrentWindowTitle();
    }

    @Given("^User types in the location$")
    public void searchGivenLocation() throws InterruptedException {
        steps.searchLocation();
    }

    @Given("^User checks the location to Pin it$")
    public void verifySelectedLocation() throws InterruptedException
    {
        steps.checkIfLocationSelected();
    }

    @Given("^User has selected location on weather section$")
    public void verifyIfLocationSelected() throws InterruptedException
    {
        steps.checkIfLocationSelected();
    }
    @Given("^User clicks on the location$")
    public void ClickOnLocationOnMap() throws InterruptedException
    {
        steps.ClickgivenLocationOnMap();
    }
    @Given("^User sees the weather information for that location$")
    public void getInformationOfLocationOnMap() throws InterruptedException
    {
        steps.fetchInformationOfLocationOnMap();
    }
    public HashMap<String,String> GetInformationOfLocationOnMap() throws InterruptedException
    {
        return steps.GetInformationOfGivenLocationOnMap();
    }
    @Then("^User puts that information as Weather object$")
    public void createTemObject()
    {
       // weatherObjectFromAPI=objCreater.temperatureObjCreator(11.22);
        //System.out.println("weather object from UI: "+weatherObjectFromAPI);
        System.out.println("Step to create temp obj");
    }

}