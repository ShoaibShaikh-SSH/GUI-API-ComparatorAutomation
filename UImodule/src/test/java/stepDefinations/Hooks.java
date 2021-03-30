package stepDefinations;

import com.openWeatherUI.UIBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends UIBase {


	@Before("@MobileTest")
	public void beforevaldiation()
	{
		System.out.println("Before Mobile  hook");
	}

	@After("@SmokeTest")
	public void Aftervaldiation()
	{
		System.out.println("After smoke hook");
	}
	@After("@RegressionTest")
	public void AfterSeleniumTest()
	{
		driver.close();
	}

	@Before("@WebTest")
	public void beforeWebvaldiation()
	{
		System.out.println("Before Web  hook");
	}

	@After("@WebTest")
	public void AfterWebvaldiation()
	{
		System.out.println("  After Web before hook");
	}
	}

