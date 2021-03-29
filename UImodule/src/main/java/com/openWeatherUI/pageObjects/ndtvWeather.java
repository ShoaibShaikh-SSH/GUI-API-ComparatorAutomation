package com.openWeatherUI.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ndtvWeather {
	public WebDriver driver;

	public ndtvWeather(WebDriver driver)
	{
		this.driver=driver;
	}


	By LocationSearchBox=By.id("searchBox");

	By SearchedLocation=By.id("Bengaluru");

	By SearchedLocationOnMap=By.xpath("//div[@class='cityText'][text()='Bengaluru']");

	By SearchedLocationInformationOnMap=By.xpath("//span[@class='heading']/b");

	public WebElement getLocationSearchBox()
	{
		return driver.findElement(LocationSearchBox);
	}
	public WebElement getSearchedLocation()
	{
		return driver.findElement(SearchedLocation);
	}
	public WebElement getSearchedLocationOnMap()
	{
		return driver.findElement(SearchedLocationOnMap);
	}
	public List<WebElement> getSearchedLocationInformationOnMap()
	{
		return driver.findElements(SearchedLocationInformationOnMap);
	}
}
