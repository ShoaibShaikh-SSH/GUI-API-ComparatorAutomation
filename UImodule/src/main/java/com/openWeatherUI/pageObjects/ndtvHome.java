package com.openWeatherUI.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ndtvHome
{
	public WebDriver driver;
	String xpathPartOne ;
	String xpathPartTwo ;
	WebDriverWait webElementWait;

	public ndtvHome(WebDriver driver)
	{
		this.driver=driver;

		// Explicit wait - This will be applied case to case basis on individual web elements, It provides a more flexible & intelligent way to wait.
		webElementWait =new WebDriverWait(driver, 20);
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

	public WebElement getLocationSearchBox()
	{
		webElementWait
				.until(ExpectedConditions.visibilityOf(driver.findElement(LocationSearchBox)));
		return driver.findElement(LocationSearchBox);
	}
	public WebElement getSearchedLocation(String cityName) { return driver.findElement(By.id(cityName)); }
	public WebElement getSearchedLocationOnMap(String cityName)
	{
		xpathPartOne = "//div[@class='cityText'][text()='";
		xpathPartTwo = "']";
		webElementWait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathPartOne+cityName+xpathPartTwo)));
		return driver.findElement(By.xpath(xpathPartOne+cityName+xpathPartTwo));
	}
	public List<WebElement> getSearchedLocationInformationOnMap()
	{
		webElementWait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(SearchedLocationInformationOnMap));
		return driver.findElements(SearchedLocationInformationOnMap);
	}
}
