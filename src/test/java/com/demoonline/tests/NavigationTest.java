package com.demoonline.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoonline.base.TestBase;
import com.demoonline.pages.HomePage;

public class NavigationTest extends TestBase {
	HomePage homePage;
	public NavigationTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority =1)
	public void navigateToLaptopsPage()
	{
		homePage.navigateToLaptops();
	}
	
	@Test(priority =2)
	public void navigateToPhonesPage()
	{
		homePage.navigateToPhones();
	}
	
	@Test(priority =3)
	public void navigateToMonitorsPage()
	{
		homePage.navigateToMonitors();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
