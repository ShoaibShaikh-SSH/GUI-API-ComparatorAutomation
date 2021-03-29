package com.openWeatherUI;

import DataCreationFromModel.WeatherObjectCreator;
import DataModel.WeatherPoJo;

import java.io.IOException;
import java.util.HashMap;

public class WeatherObjectCreatorUI
{
    public WeatherObjectCreatorUI() throws IOException {
    }

    public static WeatherObjectCreator objCreater = new WeatherObjectCreator();
    public static stepDefinationsUI UIstep;


    public WeatherPoJo getWeatherInfoByNameonUI() throws Throwable {

        UIstep= new stepDefinationsUI();
        HashMap<String, String> weatherInformationfromMapUI = new HashMap<String, String>();
        double temperatureFromUI;
        UIstep.getUserToHomePage();
        UIstep.expandHeaderOnHomePage();
        UIstep.clickOnWeatherLink();
        UIstep.searchLocation();
        UIstep.checkIfLocationSelected();
        UIstep.ClickgivenLocationOnMap();
        weatherInformationfromMapUI = UIstep.GetInformationOfGivenLocationOnMap();
        temperatureFromUI = Double.parseDouble(weatherInformationfromMapUI.get("Temp in Fahrenheit"));
        System.out.println("Temperature from UI: "+temperatureFromUI);
        UIstep.closeTheSession();
        return objCreater.temperatureObjCreator(temperatureFromUI);
    }

}
