package com.atmecs.automation.testscripts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.helperpage.ValidateBlogDate;
import com.atmecs.automations.pageactions.PageActions;
import com.atmecs.automations.reports.ExtentReport;
import com.atmecs.automations.reports.LogReport;
import com.atmecs.automations.testbase.BrowserInvoke;
import com.atmecs.automations.utils.PropertiesFileReader;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyBlogs extends BrowserInvoke {
	LogReport log = new LogReport();
	
	
@Test
public  void verifyBlogDetails() throws IOException, ParseException, InterruptedException {
	  
	  PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE); 
	  
//    PageActions.click(driver,PropertiesFileReader.getData("loc.homepage.insights"));
//    PageActions.click(driver,PropertiesFileReader.getData("loc.blogs.bloglink"));
//	  ValidateBlogDate.blogSearch(driver);
  
	  
	  //driver.findElement(By.cssSelector(".fl.search-box.date-box.gtm-onwardCalendar")).click();
		
//
//      WebTables table =new WebTables();
//      WebDriverWait wait1 = new WebDriverWait(driver,30);
//	   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#rb-calendar_onward_cal table tbody tr:nth-of-type(5) td")));
//     // table.webtablecolrowno();
//     table.webtablecellddata(7, 2);
//     driver.findElement(By.cssSelector("div#rb-calendar_onward_cal td.next")).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement footer=driver.findElement(By.cssSelector(".w-100.pR.fl.footer-links div.row.fl:nth-of-type(1) a:nth-of-type(2)"));
	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     
	  int footernos=3, noofgroups=3;
	  
      WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dib.foot-wrapper div.row.fl:nth-of-type(1)")));
	  
	  for(int groupno=1;groupno<=noofgroups;groupno++) {
	 
		  String textfirst=".dib.foot-wrapper div.row.fl:nth-of-type(";
		  String textsec =Integer.toString(groupno);
		  String textthird = ") a";
	  
		  String fulltext = textfirst+textsec+textthird;
	  List <WebElement>footers = driver.findElements(By.cssSelector(fulltext));
	 // footers.size();
	// System.out.println(footers);
	  for (int i=0; i<footers.size();i++){
		  String footertext[] = null;
	       footertext[i]=footers.get(i).getText();
	       System.out.println(footertext[i]);
	       File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(shot, new File("D:\\ shot1.jpg"));
	    }
	//  driver.switchTo().window(nameOrHandle)
	  driver.navigate().to("https://www.guru99.com/find-element-selenium.html");
	  
	 // String footertext1[];
	//  String footertextstring=footers.get(footerno).getText();
//	  for(int i=0;i<footertext[].size();i++) {
//			 System.out.println(footertext[i]);
//			  }
	  }
	  

}

@AfterSuite
public void driverClose() {
	
 driver.quit();
 
}



}
