package com.objectComparator;

import DataModel.WeatherPoJo;

import java.text.DecimalFormat;


public class CompareObjects
{
    double temperatureFromUI;
    double temperatureFromAPI;
    DecimalFormat decimalFormat;

    public CompareObjects() { }

    public double compareTemperatureAttribute(WeatherPoJo objectAPI, WeatherPoJo objectUI)
    {
        temperatureFromUI=objectUI.getTemperature();
        temperatureFromAPI=objectAPI.getTemperature();

        decimalFormat = new DecimalFormat("###.###");

        return Double.max(temperatureFromUI,temperatureFromAPI)-Double.min(temperatureFromUI,temperatureFromAPI);
    }
}
