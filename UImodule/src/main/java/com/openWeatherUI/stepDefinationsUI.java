package com.openWeatherUI;

import com.openWeatherUI.pageObjects.ndtvHome;
import com.openWeatherUI.pageObjects.ndtvWeather;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class stepDefinationsUI extends OpenWeatherUIBase
{
    OpenWeatherUIBase base = new OpenWeatherUIBase();
    WebDriver localDriver = base.getDriver();

    ndtvHome homepage = new ndtvHome(localDriver);
    ndtvWeather Weather = new ndtvWeather(localDriver);

    public static String temperatureFromUI;

    public stepDefinationsUI() throws IOException
    {
        prop=new Properties();
        FileInputStream fis=new FileInputStream("src/test/resources/global.properties");
        prop.load(fis);
    }

    public void getUserToHomePage() throws IOException, InterruptedException {

        localDriver.manage().window().maximize();
        Thread.sleep(2000);
        try {
            homepage.getNotificationAllow().click();
        }
        catch (Exception e)
        {
            System.out.println("Exception caught because of no notification alert!");
        }
        Thread.sleep(2000);

        System.out.println("Home page checked !");
    }
    public void expandHeaderOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
        homepage.getMoreHeader().click();
    }
    public void clickOnWeatherLink() throws Throwable {
        Thread.sleep(3000);
        homepage.getWeatherNavigation().click();

    }
    public void fetchCurrentWindowTitle() throws InterruptedException {
        Thread.sleep(3000);
        localDriver.getTitle().equalsIgnoreCase("NDTV Weather - Weather in your Indian City");
    }
    public void searchLocation() throws InterruptedException {
        Thread.sleep(2000);
        homepage.getLocationSearchBox().sendKeys("Bengaluru");
    }
    public void checkIfLocationSelected() throws InterruptedException
    {
        Thread.sleep(2000);
        if(homepage.getSearchedLocation(prop.getProperty("cityNameToFetchWeather")).getCssValue("checked").equalsIgnoreCase("checked"))
        {
            System.out.println("Location is already selected: "+homepage.getSearchedLocation(prop.getProperty("cityNameToFetchWeather")).getCssValue("checked") );

        }
    }
    public void ClickgivenLocationOnMap() throws InterruptedException
    {
        Thread.sleep(2000);
        homepage.getSearchedLocationOnMap(prop.getProperty("cityNameToFetchWeather")).click();

    }
    public void fetchInformationOfLocationOnMap() throws InterruptedException
    {
        Thread.sleep(2000);
        HashMap<String, String> weatherInformation = new HashMap<String, String>();
        List<WebElement> weatherInformationCompleteStrings = new ArrayList<WebElement>();
        weatherInformationCompleteStrings = homepage.getSearchedLocationInformationOnMap();
        String[] tempStringArray;
        for (int i = 0; i < weatherInformationCompleteStrings.size(); i++) {
            tempStringArray = weatherInformationCompleteStrings.get(i).getText().split(":");
            weatherInformation.put(tempStringArray[0], tempStringArray[1]);

            if (tempStringArray[0].equalsIgnoreCase("Temp in Fahrenheit")) {
                temperatureFromUI = tempStringArray[1];
                System.out.println("Temp for Obj: " + temperatureFromUI);
            }
            tempStringArray = null;
        }
        weatherInformation.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
    public HashMap<String,String> GetInformationOfGivenLocationOnMap() throws InterruptedException
    {
        Thread.sleep(2000);
        HashMap<String,String> weatherInformation = new HashMap<String, String>();
        List<WebElement> weatherInformationCompleteStrings = new ArrayList<WebElement>();
        weatherInformationCompleteStrings = homepage.getSearchedLocationInformationOnMap();
        String[] tempStringArray;
        for(int i=0;i<weatherInformationCompleteStrings.size();i++)
        {
            tempStringArray = weatherInformationCompleteStrings.get(i).getText().split(":");
            weatherInformation.put(tempStringArray[0],tempStringArray[1]);

            if(tempStringArray[0].equalsIgnoreCase("Temp in Fahrenheit"))
            {
                temperatureFromUI = tempStringArray[1];
                System.out.println("Temp for Obj: "+temperatureFromUI);
            }
            tempStringArray=null;
        }
        weatherInformation.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return weatherInformation;
    }
    public void closeTheSession()
    {
        localDriver.close();
    }
}
