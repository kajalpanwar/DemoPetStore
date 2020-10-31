package com.demoonline.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoonline.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//a[text()='Laptops']")
	WebElement laptops;
	
	@FindBy(xpath="//a[text()='Phones']")
	WebElement phones;
	
	@FindBy(xpath="//a[text()='Monitors']")
	WebElement monitors;
	
	@FindBy(xpath="//a[contains(@href,'cart')]")
	WebElement cart;
	
	@FindBy(xpath="//a[contains(@href,'index') and text()='Home ']")
	WebElement home;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LaptopsPage navigateToLaptops()
	{
		laptops.click();
		return new LaptopsPage();
	}
	
	public PhonesPage navigateToPhones()
	{
		phones.click();
		return new PhonesPage();
	}
	
	public MonitorsPage navigateToMonitors()
	{
		monitors.click();
		return new MonitorsPage();
	}
	
	public CartPage clickCart()
	{
		cart.click();
		return new CartPage();
	}
	
	public HomePage clickHome()
	{
		home.click();
		return new HomePage();
	}
	
}
