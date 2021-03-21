package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	final static String PROJECT_PATH = System.getProperty("user.dir");

	public WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("src/test/java/Cucumber/Automation/global.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", PROJECT_PATH + "/src/test/java/Cucumber/Automation/chromedriver");
   	 	driver=new ChromeDriver();
   	 
  		driver.get(prop.getProperty("url"));
   	 	return driver;
		
	}
	
}
