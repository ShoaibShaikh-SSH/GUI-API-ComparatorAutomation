package DataCreationFromModel;

import DataModel.WeatherPoJo;

public class WeatherObjectCreator
{
    public static WeatherPoJo temperatureObject;

    public WeatherPoJo temperatureObjCreator(double temp)
    {
        temperatureObject = new WeatherPoJo();
        temperatureObject.setTemperature(temp);
        return temperatureObject;
    }
}
