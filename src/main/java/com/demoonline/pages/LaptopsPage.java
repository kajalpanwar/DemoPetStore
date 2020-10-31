package com.demoonline.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoonline.base.TestBase;

public class LaptopsPage extends TestBase{

	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	WebElement addToCart;
	
	@FindBy(xpath="//a[contains(text(),'Sony vaio i5')]")
	WebElement laptop1;
	
	public LaptopsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLaptopsPageTitle()
	{
		return driver.getTitle();
	}
	
	public void getLaptop(String lappy)
	{
		List<WebElement> laptops = driver.findElements(By.xpath("//a[contains(@href,'prod.html') and @class='hrefch']"));
		for(WebElement laptop : laptops)
		{
			if(lappy.equals(laptop.getText()))
			{
				laptop.click();
				break;
			}
		}
	}
	
	public void clickAddToCart()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-success btn-lg']")));
		addToCart.click();
	}
}
