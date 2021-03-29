package com.openWeatherUI;

import com.openWeatherUI.pageObjects.ndtvHome;
import com.openWeatherUI.pageObjects.ndtvWeather;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class stepDefinationsBase extends UIBase
{
    UIBase base = new UIBase();
    WebDriver localDriver = base.getDriver();

    ndtvHome homepage = new ndtvHome(localDriver);
    //ndtvWeather Weather = new ndtvWeather(localDriver);

    public static String temperatureFromUI;

    public stepDefinationsBase() throws IOException
    {
        prop=new Properties();
        FileInputStream fis=new FileInputStream(PROJECT_PATH +"/src/test/java/com/resources/UI.properties");
        prop.load(fis);
    }

    public void getUserToHomePage() throws IOException, InterruptedException
    {
        //Thread.sleep(2000);
        try
        {
            homepage.getNotificationAllow().click();
        }
        catch (Exception e)
        {
            System.out.println("Exception caught because of no notification alert!");
        }
        //Thread.sleep(2000);
//        wait
//              .ignoring(TimeoutException.class, NoSuchElementException.class)
//              .until(ExpectedConditions.visibilityOf(homepage.getNotificationAllow()))
//              .click();

        System.out.println("Home page checked !");
    }
    public void expandHeaderOnHomePage() throws InterruptedException {
        //Thread.sleep(3000);
//        wait
//                .ignoring(TimeoutException.class, NoSuchElementException.class)
//                .until(ExpectedConditions.visibilityOf(homepage.getSubHeader()))
//                .click();
        homepage.getSubHeader().click();
    }
    public void clickOnWeatherLink() throws Throwable
    {
       // Thread.sleep(3000);
        homepage.getWeatherNavigation().click();
//        wait
//                .ignoring(TimeoutException.class, NoSuchElementException.class)
//                .until(ExpectedConditions.visibilityOf(homepage.getWeatherNavigation()))
//                .click();

    }
    public void fetchCurrentWindowTitle() throws InterruptedException {
       // Thread.sleep(3000);
        localDriver.getTitle().equalsIgnoreCase("NDTV Weather - Weather in your Indian City");
    }
    public void searchLocation() throws InterruptedException {
       // Thread.sleep(2000);
        homepage.getLocationSearchBox().sendKeys("Bengaluru");
    }
    public void checkIfLocationSelected() throws InterruptedException
    {
        //Thread.sleep(2000);
        if(homepage.getSearchedLocation(prop.getProperty("cityNameToFetchWeather")).getCssValue("checked").equalsIgnoreCase("checked"))
        {
            System.out.println("Location is already selected: "+homepage.getSearchedLocation(prop.getProperty("cityNameToFetchWeather")).getCssValue("checked") );

        }
    }
    public void ClickgivenLocationOnMap() throws InterruptedException
    {
        //Thread.sleep(2000);
        homepage.getSearchedLocationOnMap(prop.getProperty("cityNameToFetchWeather")).click();

    }
    public void fetchInformationOfLocationOnMap() throws InterruptedException
    {
//        HashMap<String, String> weatherInformation = new HashMap<String, String>();
//        weatherInformation = extractWeatherInfo();
//        System.out.println("Size of map: "+weatherInformation.size());
        extractWeatherInfo().entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
    public HashMap<String,String> GetInformationOfGivenLocationOnMap() throws InterruptedException
    {
        return extractWeatherInfo();
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
                    System.out.println("Temp captured from UI: " + temperatureFromUI);
                }
            }
        }
        catch (Exception exception){ exception.printStackTrace(); }

        weatherInformation.entrySet().forEach(entry -> { System.out.println(entry.getKey() + " " + entry.getValue()); });

        return weatherInformation;
    }

    public void closeTheSession()
    {
        localDriver.close();
    }
}
