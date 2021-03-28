package com.objectComparator;


import DataModel.TemperaturePoJo;
import com.openWeather.WeatherObjectCreator;

public class CompareObjects extends WeatherObjectCreator
{
    public WeatherObjectCreator tempObjectFromAPI = new WeatherObjectCreator();

    public TemperaturePoJo TempPoJo = new TemperaturePoJo();

    public void compareWeatherObjects(TemperaturePoJo objectAPI,TemperaturePoJo objectUI)
    {
        System.out.println("Comparison of object: "+objectAPI+" with another object: "+objectUI);
    }
}
