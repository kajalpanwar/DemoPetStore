package com.demoonline.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoonline.base.TestBase;

public class PlaceOrder extends TestBase {
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement card;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(xpath="//button[contains(@class,'primary') and text()='Purchase']")
	WebElement purchase;
	
	@FindBy(xpath="//button[contains(@class,'primary') and text()='Purchase']/preceding-sibling::button")
	WebElement close;
	
	@FindBy(xpath="//button[@class='confirm btn btn-lg btn-primary']")
	WebElement ok;
	
	public PlaceOrder() { 
		PageFactory.initElements(driver, this); 
		}
	
	public void EnterName(String nam)
	{
		name.sendKeys(nam);
	}
	
	public void EnterCountry(String con)
	{
		country.sendKeys(con);
	}
	 
	public void EnterCity(String cit)
	{
		city.sendKeys(cit);
	}
	
	public void EnterCardDetail(String cd)
	{
		card.sendKeys(cd);
	}
	
	public void EnterMonth(String mon)
	{
		month.sendKeys(mon);
	}
	
	public void EnterYear(String yr)
	{
		year.sendKeys(yr);
	}
	
	public CartPage clickPurchase()
	{
		purchase.click();
		return new CartPage();
	}
	
	public List<String> captureText(WebDriver driver) {

	    List<String> allParagraphsValues = new ArrayList<String>();
	    List<WebElement> allParagraphs = driver.findElements(By.xpath("//p[@class='lead text-muted ']"));

	    for(WebElement ele : allParagraphs){
	          allParagraphsValues.add(ele.getText());
	    }

	    return allParagraphsValues;

	}
	
	public void clickOk()
	{
		ok.click();
	}

}
