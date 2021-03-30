
package com.objectComparator;

import DataModel.WeatherPoJo;
import java.text.DecimalFormat;

/*This class serves the purpose of comparing objects of same type, this can be extended to have custom object comparison*/
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

        /*Get the bigger value of the two doubles
        * Subtract smaller value from bigger one to get the variance in temperature
        * Return the variance */
        return Double.max(temperatureFromUI,temperatureFromAPI)-Double.min(temperatureFromUI,temperatureFromAPI);
    }
}
