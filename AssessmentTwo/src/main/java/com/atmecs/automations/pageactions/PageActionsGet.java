package com.atmecs.automations.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.automations.utils.LocatorSelector;

public class PageActionsGet {
   
	static String text;
	
    public static String getAttribute(WebDriver driver,String locator,String value)
    {
		WebElement element = driver.findElement(LocatorSelector.separatingLocators(locator));
		 text = element.getAttribute(value);
		return text;
	}
	
	public static String getTitle(WebDriver driver,String locator) 
	{
		WebElement element = driver.findElement(By.xpath(locator));
		text=driver.getTitle();
		return text;	
	}
	
	
	public static String getImageSrc(WebDriver driver,String locator,String value)
	{
	WebElement element = driver.findElement(By.xpath(locator));
	text = element.getAttribute("src");
	return text;
	}
	
	public static String  getAttributeTitle(WebDriver driver,String locator) {
		WebElement element =driver.findElement(By.xpath(locator));
		text =element.getAttribute("title");
		return text;
	}
	public static String getText(WebDriver driver,String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		text = element.getText();
		return text;
	}
}

