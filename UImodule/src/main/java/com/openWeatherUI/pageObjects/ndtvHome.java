package com.openWeatherUI.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Properties;

public class ndtvHome
{
	public WebDriver driver;
	String xpathPart1 ;
	String xpathPart2 ;
	String fullPath;


	public ndtvHome(WebDriver driver)
	{
		this.driver=driver;
	}

	By moreHeader=By.xpath("//a[@id='h_sub_menu']");

	By weatherNavigation=By.xpath("//div[@id='subnav']//a[text()='WEATHER']");

	By NotificationAllow=By.xpath("//div[@class='noti_wrap']//a[@class='allow']");

	//By LocationSearchBox=By.id("searchBox");
	// The use of ID as locator for this element fails intermittently as the locator returns more than one web element
	By LocationSearchBox=By.xpath("//div[@class='searchContainer']//input[@id='searchBox']");

	By SearchedLocationInformationOnMap=By.xpath("//span[@class='heading']/b");



	public WebElement getSubHeader() { return driver.findElement(moreHeader); }
	public WebElement getWeatherNavigation()
	{
		return driver.findElement(weatherNavigation);
	}
	public WebElement getNotificationAllow() { return driver.findElement(NotificationAllow); }

	public WebElement getLocationSearchBox() { return driver.findElement(LocationSearchBox); }
	public WebElement getSearchedLocation(String cityName) { return driver.findElement(By.id(cityName)); }
	public WebElement getSearchedLocationOnMap(String cityName)
	{
		xpathPart1 = "//div[@class='cityText'][text()='";
		xpathPart2 = "']";
		fullPath = xpathPart1+cityName+xpathPart2;
		System.out.println("xpath: "+fullPath);
		return driver.findElement(By.xpath(fullPath));
	}
	public List<WebElement> getSearchedLocationInformationOnMap() { return driver.findElements(SearchedLocationInformationOnMap); }
}
