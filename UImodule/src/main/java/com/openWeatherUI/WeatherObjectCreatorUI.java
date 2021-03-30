package com.openWeatherUI;

import DataCreationFromModel.WeatherObjectCreator;
import DataModel.WeatherPoJo;
import java.util.HashMap;

public class WeatherObjectCreatorUI
{
    public WeatherObjectCreatorUI() { }

    public static WeatherObjectCreator objCreater = new WeatherObjectCreator();
    public static stepDefinationsBase UIstep;


    public WeatherPoJo getWeatherInfoByNameonUI() throws Throwable
    {
        double temperatureFromUI = 0.0;
        try
        {
            /*Detailed step actions are kept in 'stepDefinationsBase' so that those steps can be re-used & to keep actual step defination abstract*/
            UIstep = new stepDefinationsBase();
            HashMap<String, String> weatherInformationfromMapUI = new HashMap<String, String>();

            UIstep.getUserToHomePage();
            UIstep.expandHeaderOnHomePage();
            UIstep.clickOnWeatherLink();
            UIstep.searchLocation();
            UIstep.checkIfLocationSelected();
            UIstep.ClickgivenLocationOnMap();

            weatherInformationfromMapUI = UIstep.GetInformationOfGivenLocationOnMap();
            temperatureFromUI = Double.parseDouble(weatherInformationfromMapUI.get("Temp in Fahrenheit"));

            UIstep.closeTheSession();
        }
        catch(Exception exception){exception.printStackTrace();}

        /*Return an object of type Weather with Temperature attribute*/
        return objCreater.temperatureObjCreator(temperatureFromUI);
    }

}
