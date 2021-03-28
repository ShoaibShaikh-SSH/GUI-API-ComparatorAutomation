package com.openWeatherUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import DataCreationFromModel.TemperatureObjectCreator;
import DataModel.TemperaturePoJo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenWeatherUIBase {
	public static WebDriver driver;
	public static Properties prop;
	final static String PROJECT_PATH = System.getProperty("user.dir");

	public static TemperaturePoJo weatherObjectFromAPI = new TemperaturePoJo();
	public static TemperatureObjectCreator objCreater = new TemperatureObjectCreator();

	public WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("src/test/resources/global.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", PROJECT_PATH + "/src/test/resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
   	 
  		driver.get(prop.getProperty("url"));
   	 	return driver;
		
	}
	
}
