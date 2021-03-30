/*This file is created to serve purpose of data model for Weather which can have multiple attributes (Example: Temperature)*/
package DataModel;

public class WeatherPoJo
{
    public double getTemperature() { return temperature; }

    public void setTemperature(double temperature) { this.temperature = temperature; }

    /*Temperature attribute for weather object*/
    private double temperature;

}
