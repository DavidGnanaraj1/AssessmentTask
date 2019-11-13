package com.atmecs.AssessmentTwo.testscripts;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.automations.reports.LogReport;
import com.atmecs.automations.testbase.BrowserInvoke;



public class VerifyBlogs extends BrowserInvoke {
	LogReport log = new LogReport();
	
	
@Test
public  void verifyBlogDetails() throws IOException, ParseException, InterruptedException {
	  
	  com.atmecs.automations.utils.PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE); 
	  
//    PageActions.click(driver,PropertiesFileReader.getData("loc.homepage.insights"));
//    PageActions.click(driver,PropertiesFileReader.getData("loc.blogs.bloglink"));
//	  ValidateBlogDate.blogSearch(driver);
  
	  
	  //driver.findElement(By.cssSelector(".fl.search-box.date-box.gtm-onwardCalendar")).click();
		
//
//      WebTables table =new WebTables();
//      WebDriverWait wait1 = new WebDriverWait(driver,30);
//	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#rb-calendar_onward_cal table tbody tr:nth-of-type(5) td")));
//     // table.webtablecolrowno();
//      table.webtablecellddata(7, 2);
//      driver.findElement(By.cssSelector("div#rb-calendar_onward_cal td.next")).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement footer=driver.findElement(By.cssSelector(".w-100.pR.fl.footer-links div.row.fl:nth-of-type(1) a:nth-of-type(2)"));
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      int footernos=3,noofgroups=6;
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dib.foot-wrapper div.row.fl:nth-of-type(1)")));
	  for(int groupno=1;groupno<=noofgroups;groupno++) {
	  for(int footerno=1;footerno<=footernos;footerno++) {
		  String textfirst=".dib.foot-wrapper div.row.fl:nth-of-type(";
		  String textsec =Integer.toString(groupno);
		  String textthird = ") a";
	  
		  String fulltext = textfirst+textsec+textthird;
	  List <WebElement>footers = driver.findElements(By.cssSelector(fulltext));
	  footers.size();
	  for (int i=0; i<footers.size();i++){
	      System.out.println( footers.get(i).getText());
	    }
	  String footertext[];
	  String footertextstring=footers.get(footerno).getText();
	 
	  }
	  }}

@AfterSuite
public void driverClose() {
	
 driver.quit();
 
}



}
