package com.demoonline.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoonline.base.TestBase;
import com.demoonline.pages.CartPage;
import com.demoonline.pages.HomePage;
import com.demoonline.pages.LaptopsPage;
import com.demoonline.pages.PlaceOrder;

public class CompleteTest extends TestBase{
	HomePage homePage;
	LaptopsPage laptopsPage;
	CartPage cartPage;
	PlaceOrder placeOrder;
	
	public CompleteTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
		laptopsPage = homePage.navigateToLaptops();
	}
	
	@Test
	public void addToCart() throws InterruptedException
	{
		Thread.sleep(5000);
		laptopsPage.getLaptop("Sony vaio i5");
		laptopsPage.clickAddToCart();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		homePage.clickHome();
		Thread.sleep(2000);
		laptopsPage = homePage.navigateToLaptops();
		Thread.sleep(2000);
		laptopsPage.getLaptop("Dell i7 8gb");
		laptopsPage.clickAddToCart();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		cartPage = homePage.clickCart();
		Thread.sleep(5000);
		cartPage.clickDeleteButton("Dell");
		placeOrder = cartPage.clickPlaceOrderButton();
		placeOrder.EnterName("Rob");
		placeOrder.EnterCountry("USA");
		placeOrder.EnterCity("Newyork");
		placeOrder.EnterCardDetail("2345765487621");
		placeOrder.EnterMonth("June");
		placeOrder.EnterYear("2021");
		placeOrder.clickPurchase();
		List<String> ls = placeOrder.captureText(driver);
	//	Assert.assertEquals(ls.contains("Id%"), true);
	//	Assert.assertEquals(ls.contains("Amount"), true);
		placeOrder.clickOk();
	}
	
	
	
	  @AfterMethod 
	  public void tearDown() { 
		  driver.quit(); 
	}
	 
}
