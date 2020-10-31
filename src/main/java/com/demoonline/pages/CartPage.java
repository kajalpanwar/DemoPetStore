package com.demoonline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoonline.base.TestBase;

public class CartPage extends TestBase{


	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement placeOrder;

	
	public CartPage() { 
		PageFactory.initElements(driver, this); 
		}
	 
	public CartPage clickDeleteButton(String name)
	{

		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement delete = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[2]/a"));
		delete.click();
		wait.until(ExpectedConditions.invisibilityOf(delete));
		return new CartPage();
	}
	
	public PlaceOrder clickPlaceOrderButton()
	{
		placeOrder.click();
		return new PlaceOrder();
	}
}
