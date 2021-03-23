package stepDefinations;

import Automation.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.ndtvHome;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(Cucumber.class)
public class stepDefinationWeather extends Base {

    WebDriver localDriver = getDriver();
    ndtvHome ndtv = new ndtvHome(localDriver);
    public stepDefinationWeather() throws IOException {
    }

    @When("^User is one NDTV home page$")
    public void verifyIfUserIsOnHomePage() throws IOException, InterruptedException {

        localDriver.manage().window().maximize();
        Thread.sleep(2000);
        try {
            ndtv.getNotificationAllow().click();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println("Exception caught !");
        }
        Thread.sleep(2000);

        System.out.println("Home page checked !");
    }

    @Then("^User expands header section$")
    public void expandHeaderOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
        ndtv.getMoreHeader().click();
    }

    @Given("^User clicks on weather$")
    public void clickOnWeatherLink() throws Throwable {
        Thread.sleep(3000);
        ndtv.getWeatherNavigation().click();

    }

    @Given("^Weather section is opened$")
    public void verifyIfWeatherSectionIsOpened() throws InterruptedException {
        Thread.sleep(3000);
        driver.getTitle().equalsIgnoreCase("NDTV Weather - Weather in your Indian City");
    }

    @Given("^User is one NDTV weather section$")
    public void verifyCurrentPage() throws InterruptedException {
        verifyIfWeatherSectionIsOpened();
    }

    @Given("^User types in the location$")
    public void searchLocation() throws InterruptedException {
        Thread.sleep(2000);
        ndtv.getLocationSearchBox().sendKeys("Bengaluru");
    }

    @Given("^User checks the location to Pin it$")
    public void checkIfLocationSelected() throws InterruptedException {
        Thread.sleep(2000);
        if(ndtv.getSearchedLocation().getCssValue("checked").equalsIgnoreCase("checked"))
        {
            System.out.println("Location is already selected: "+ndtv.getSearchedLocation().getCssValue("checked") );

        }
    }

    @Given("^User has selected location on weather section$")
    public void verifyIfLocationSelected() throws InterruptedException
    {
        Thread.sleep(2000);
        if(ndtv.getSearchedLocation().getCssValue("checked").equalsIgnoreCase("checked"))
        {
            System.out.println("Location is already selected: "+ndtv.getSearchedLocation().getCssValue("checked") );

        }

    }
    @Given("^User clicks on the location$")
    public void ClickOnLocationOnMap() throws InterruptedException
    {
        Thread.sleep(2000);
        ndtv.getSearchedLocationOnMap().click();

    }
    @Given("^User sees the weather information for that location$")
    public void GetInformationOfLocationOnMap() throws InterruptedException
    {
        Thread.sleep(2000);
        HashMap<String,String> weatherInformation = new HashMap<String, String>();
        List<WebElement> weatherInformationCompleteStrings = new ArrayList<WebElement>();
        weatherInformationCompleteStrings = ndtv.getSearchedLocationInformationOnMap();
        String[] tempStringArray;
        for(int i=0;i<weatherInformationCompleteStrings.size();i++)
        {
            System.out.println("Information: "+weatherInformationCompleteStrings.get(i).getText());
            tempStringArray = weatherInformationCompleteStrings.get(i).getText().split(":");
            weatherInformation.put(tempStringArray[0],tempStringArray[1]);
            tempStringArray=null;
        }
    }
}