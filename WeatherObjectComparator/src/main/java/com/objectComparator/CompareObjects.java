package com.objectComparator;


import DataModel.TemperaturePoJo;
import com.openWeatherAPI.WeatherObjectCreator;
import com.openWeatherUI.WeatherObjectCreatorUI;

import java.io.IOException;
import java.text.DecimalFormat;


public class CompareObjects //extends WeatherObjectCreator
{

    //public WeatherObjectCreator

    public TemperaturePoJo TempPoJo = new TemperaturePoJo();

    public CompareObjects() throws IOException {
    }

    public double compareWeatherObjects(TemperaturePoJo objectAPI,TemperaturePoJo objectUI)
    {
        System.out.println("Comparison of object: "+objectAPI+" with another object: "+objectUI);
        System.out.println("TemperatureFromAPI :"+objectAPI.getTemperature() );
        System.out.println("TemperatureFromUI :"+objectUI.getTemperature() );
        double temperatureFromUI=objectUI.getTemperature();
        double temperatureFromAPI=objectAPI.getTemperature();

        double greaterTemperatureValue = Double.max(temperatureFromUI,temperatureFromAPI);
        double lesserTemperatureValue = Double.min(temperatureFromUI,temperatureFromAPI);
        DecimalFormat df = new DecimalFormat("###.###");;
        double dif = greaterTemperatureValue-lesserTemperatureValue;
//            System.out.println("Diff Val  : "+df.format(dif));
//            df = df.format(dif);

        return dif;
    }
}
