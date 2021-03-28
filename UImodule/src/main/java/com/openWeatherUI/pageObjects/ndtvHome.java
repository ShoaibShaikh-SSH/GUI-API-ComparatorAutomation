package com.openWeatherUI.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ndtvHome {
	public WebDriver driver;

	public ndtvHome(WebDriver driver)
	{
		this.driver=driver;
	}
	By moreHeader=By.xpath("//a[@id='h_sub_menu']");

	By weatherNavigation=By.xpath("//div[@id='subnav']//a[text()='WEATHER']");

	By NotificationAllow=By.xpath("//div[@class='noti_wrap']//a[@class='allow']");

	By LocationSearchBox=By.id("searchBox");

	By SearchedLocation=By.id("Bengaluru");

	By SearchedLocationOnMap=By.xpath("//div[@class='cityText'][text()='Bengaluru']");

	By SearchedLocationInformationOnMap=By.xpath("//span[@class='heading']/b");



	public WebElement getMoreHeader()
	{
		return driver.findElement(moreHeader);
	}
	public WebElement getWeatherNavigation()
	{
		return driver.findElement(weatherNavigation);
	}
	public WebElement getNotificationAllow()
	{
		return driver.findElement(NotificationAllow);
	}

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
