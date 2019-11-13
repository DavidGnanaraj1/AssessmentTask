package com.atmecs.automation.testscripts;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.helperpage.ValidateContextMenu;
import com.atmecs.automations.pageactions.PageActions;
import com.atmecs.automations.pageactions.PageActionsScrollDown;
import com.atmecs.automations.reports.LogReport;
import com.atmecs.automations.testbase.BrowserInvoke;
import com.atmecs.automations.utils.ExcelFileReader;
import com.atmecs.automations.utils.PropertiesFileReader;

public class VerifyFootersAndContexts extends SeleniumGrid {
	LogReport log = new LogReport();

@Test
public void verifyFooterContext() throws IOException {

		PropertiesFileReader prop = new PropertiesFileReader();
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
//		driver.findElement(By.cssSelector("div.menu-line>:nth-child(4)")).click();
//		WebElement elem =driver.findElement(By.cssSelector("div#price>:nth-child(2)>:nth-child(2)"));
//		WebElement elem1 =driver.findElement(By.cssSelector("div#price>:nth-child(2)>:nth-child(3)"));
//		Actions action=new Actions(driver);
//		action.clickAndHold(elem).perform();
//		action.dragAndDropBy(elem1, 0, 0).build().perform();
		
        String footers[]= {"loc.homepage.services","loc.homepage.partners","loc.homepage.media","loc.homepage.insights","loc.homepage.home"};
        
	for(int k=0;k<footers.length;k++) {
		int i;
		int sheet =0;
		int colnum = 0;
		String array[]= {"Sitemap","Services","Careers","Contact Us","Home","About Us","Services","Partners","Case Studies old"};
		PageActions.click(driver,footers[k] );
		PageActionsScrollDown.scrollDownToBottom(driver);
		
		for(i=0;i<array.length;i++) {
			 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				        .withTimeout(30, TimeUnit.SECONDS)
				        .pollingEvery(5, TimeUnit.SECONDS)
				        .ignoring(NoSuchElementException.class);
				 
		ExcelFileReader readexcel = new ExcelFileReader(FilePath.TESTDATA_FILE);
			
		int j=i+2;
		array[i]  = ExcelFileReader.getData(sheet,j,colnum);
		

	
		String xpath = (PropertiesFileReader.getData("loc.footers.xpath")).replace("xxxx", array[i]);
	    driver.findElement(By.xpath(xpath)).isDisplayed();

		}
		
		}
		
		ValidateContextMenu valid = new ValidateContextMenu();
		valid.validateContextMenu(driver);
		
		}
		
}
	



