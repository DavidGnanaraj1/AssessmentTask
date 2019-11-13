package com.atmecs.automations.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.automations.reports.LogReport;



public class PageActionsCheckAvailablity {

	static LogReport log = new LogReport();

	public static void validateProduct(WebDriver driver,String path) {
	boolean isDisplayed=driver.findElement(By.xpath(path)).isDisplayed();
	
	if(isDisplayed==true)
	{
		log.info("Yellow tie dye bardot bodycon mini dress is present");
	}
	else
	{
		log.info("Yellow tie dye bardot bodycon mini dress is not present");
	}
	}
}
