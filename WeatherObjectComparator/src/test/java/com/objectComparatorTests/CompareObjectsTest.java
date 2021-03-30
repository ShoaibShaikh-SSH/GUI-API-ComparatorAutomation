package com.objectComparatorTests;

import com.objectComparator.CompareObjects;
import com.openWeatherAPI.WeatherObjectCreator;
import com.openWeatherUI.WeatherObjectCreatorUI;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.fail;

public class CompareObjectsTest extends CompareObjects
{
    public CompareObjectsTest() throws IOException { }

    public static Properties prop;
    double magnitudeOfVariance ;

    @Test
    public void objectComparisonTest() throws Throwable
    {
        prop=new Properties();
        FileInputStream fis=new FileInputStream("src/test/resources/comparator.properties");
        prop.load(fis);
        double variance=0;

        /*Here, we compare the two values(Temperature from API Vs Temperature from UI) & receive variance*/
        try { variance = compareTemperatureAttribute(new WeatherObjectCreator().getWeatherInfoByName(), new WeatherObjectCreatorUI().getWeatherInfoByNameonUI()); }
        catch (Exception e){e.printStackTrace();}

        if(variance==0) { System.out.println("The temperature value from UI is same as temperature value from API"); }
        else
        {
            System.out.println("Temperature variance is : "+variance);

            /*Magnitude of variance is based on the value fetched from properties*/
            magnitudeOfVariance= Double.parseDouble(prop.getProperty("variance"));
            System.out.println("Acceptable Magnitude of variance is : "+magnitudeOfVariance);

            /*Failing the test case if the variance is exceeding permissible limit*/
            if(variance>magnitudeOfVariance)
            fail("Temperature variance is outside permissible limit");
        }
    }
}
