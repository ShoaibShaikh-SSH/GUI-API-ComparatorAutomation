package com.openWeatherUI;

import com.openWeatherUI.pageObjects.ndtvHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class stepDefinationsBase extends UIBase
{
    UIBase base = new UIBase();
    WebDriver localDriver = base.getDriver();

    ndtvHome homepage = new ndtvHome(localDriver);

    public static String temperatureFromUI;

    public stepDefinationsBase() throws IOException
    {
        prop=new Properties();
        FileInputStream fis=new FileInputStream(PROJECT_PATH +"/src/test/java/com/resources/UI.properties");
        prop.load(fis);
    }

    /* First time the website is opened, it does show a notification alert which needs to be handled - After caching there will be no notification & an exception will be caught.*/
    public void getUserToHomePage()
    {
        try { homepage.getNotificationAllow().click(); }
        catch (Exception e) { System.out.println("Exception caught because of no notification alert!"); }
    }
    public void expandHeaderOnHomePage() { homepage.getSubHeader().click(); }

    public void clickOnWeatherLink() { homepage.getWeatherNavigation().click(); }

    public void fetchCurrentWindowTitle() { localDriver.getTitle().equalsIgnoreCase("NDTV Weather - Weather in your Indian City"); }

    public void searchLocation() { homepage.getLocationSearchBox().sendKeys("Bengaluru"); }

    public void ClickgivenLocationOnMap(){ homepage.getSearchedLocationOnMap(prop.getProperty("cityNameToFetchWeather")).click(); }

    public void fetchInformationOfLocationOnMap() { extractWeatherInfo().entrySet().forEach(entry -> { System.out.println(entry.getKey() + " " + entry.getValue()); }); }

    public HashMap<String,String> GetInformationOfGivenLocationOnMap(){ return extractWeatherInfo(); }

    public void closeTheSession() { localDriver.close(); }

    public void checkIfLocationSelected()
    {
        if(homepage.getSearchedLocation(prop.getProperty("cityNameToFetchWeather")).getCssValue("checked").equalsIgnoreCase("checked"))
            System.out.println("Location is already selected: "+homepage.getSearchedLocation(prop.getProperty("cityNameToFetchWeather")).getCssValue("checked") );
    }

    public HashMap<String,String> extractWeatherInfo()
    {
        HashMap<String,String> weatherInformation = new HashMap<String, String>();
        List<WebElement> weatherInformationCompleteStrings = new ArrayList<WebElement>();
        weatherInformationCompleteStrings = homepage.getSearchedLocationInformationOnMap();
        String[] tempStringArray=null;
        try {

            for (int i = 0; i < weatherInformationCompleteStrings.size(); i++)
            {
                tempStringArray = weatherInformationCompleteStrings.get(i).getText().split(":");
                weatherInformation.put(tempStringArray[0], tempStringArray[1]);

                if (tempStringArray[0].equalsIgnoreCase("Temp in Fahrenheit"))
                {
                    temperatureFromUI = tempStringArray[1];
                }
            }
        }
        catch (Exception exception){ exception.printStackTrace(); }

        System.out.println("\n Weather information on NDTV-Weather section");
        weatherInformation.entrySet().forEach(entry -> { System.out.println(entry.getKey() + " " + entry.getValue()); });

        return weatherInformation;
    }
}
