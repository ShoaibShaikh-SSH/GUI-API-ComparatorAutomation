package com.openWeatherUI;

import DataCreationFromModel.TemperatureObjectCreator;
import DataModel.TemperaturePoJo;

import java.io.IOException;
import java.util.HashMap;

public class WeatherObjectCreatorUI //extends stepDefinationsUI
{
    public WeatherObjectCreatorUI() throws IOException {
    }
    public static double temperatureFromAPI;
    public static TemperaturePoJo weatherObjectFromUI = new TemperaturePoJo();
    public static TemperatureObjectCreator objCreater = new TemperatureObjectCreator();
    public static stepDefinationsUI stepDef;
    public static String temperatureFromUI;

    public TemperaturePoJo getWeatherInfoByNameonUI() throws Throwable {
//        WebDriver localDriver = getDriver();
//        ndtvHome ndtv = new ndtvHome(localDriver);
         stepDef= new stepDefinationsUI();
        HashMap<String, String> weatherInformationfromMapUI = new HashMap<String, String>();
        double tempFromUI;
        stepDef.getUserToHomePage();
        stepDef.expandHeaderOnHomePage();
        stepDef.clickOnWeatherLink();
        stepDef.searchLocation();
        stepDef.checkIfLocationSelected();
        stepDef.ClickgivenLocationOnMap();
        weatherInformationfromMapUI = stepDef.GetInformationOfGivenLocationOnMap();
        tempFromUI = Double.parseDouble(weatherInformationfromMapUI.get("Temp in Fahrenheit"));
        stepDef.closeTheSession();
        return objCreater.temperatureObjCreator(tempFromUI);
    }

}
