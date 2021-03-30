package com.openWeatherUI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import DataCreationFromModel.WeatherObjectCreator;
import DataModel.WeatherPoJo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIBase {
	public static WebDriver driver;
	public static Properties prop;
	final static String PROJECT_PATH = System.getProperty("user.dir");

	public WebDriver getDriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream( PROJECT_PATH +"/src/test/java/com/resources/UI.properties");
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", PROJECT_PATH + "/src/test/java/com/resources/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);

		// Implicit wait - This will be applied as a blanket wait & will be alive for the whole driver session
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
   	 	return driver;
	}
}
