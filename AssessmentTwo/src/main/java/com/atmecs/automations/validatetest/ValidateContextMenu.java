package com.atmecs.automations.validatetest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.pageactions.PageActions;
import com.atmecs.automations.pageactions.PageActionsGet;
import com.atmecs.automations.pageactions.PageActionsScrollDown;
import com.atmecs.automations.reports.LogReport;
import com.atmecs.automations.utils.ExcelFileReader;
import com.atmecs.automations.utils.PropertiesFileReader;

import junit.framework.Assert;

public class ValidateContextMenu {
LogReport log = new LogReport();
	
	public void validateContextMenu(WebDriver driver) throws IOException {
	PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
	ExcelFileReader readexcel = new ExcelFileReader(FilePath.TESTDATA_FILE);
	//PageActions.click(driver,PropertiesFileReader.getData("loc.homepage.services"));
	//PageActions.dropdown(driver,PropertiesFileReader.getData("loc.homepage.services"),ExcelFileReader.getData(0,1,0));
	WebElement element = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.homepage.services")));
	//Select select = new Select(element);
	  /* List<WebElement> options = select.getOptions();
    loop:  
    for(WebElement we:options)  
    {  
     for (int i=0; i<exp.length; i++){
         if (we.getText().equals(exp[i])){
         System.out.println("Matched");
         break loop;
         } */
	String actual    =  PageActionsGet.getText(driver, PropertiesFileReader.getData("loc.contextmenu.digitallife"));
	String expected  =  PropertiesFileReader.getData("expdata.contextmenu.digitallife");
	Assert.assertEquals(expected, actual);
	
	String actual1    =  PageActionsGet.getText(driver, PropertiesFileReader.getData("loc.contextmenu.infrastructure"));
	String expected1  =  PropertiesFileReader.getData("expdata.contextmenu.infrastructure");
	Assert.assertEquals(expected1, actual1);
	
	log.info("Context menu validated");
	
	
	
}
    }

    
    