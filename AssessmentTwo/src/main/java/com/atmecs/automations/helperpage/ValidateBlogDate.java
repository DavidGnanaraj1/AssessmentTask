package com.atmecs.automations.helperpage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.reports.LogReport;
import com.atmecs.automations.utils.PropertiesFileReader;

import junit.framework.Assert;

public class ValidateBlogDate {

	public static void blogSearch(WebDriver driver) throws ParseException, IOException {
        PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		LocalDate date = LocalDate.now();
		

		WebElement blog = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.blog.blog")));
		Actions action = new Actions(driver);
		action.moveToElement(blog).build().perform();
		driver.findElement(By.xpath(PropertiesFileReader.getData("loc.blog.click"))).click();

		LogReport log = new LogReport();

		int i;
		int blogcount = driver.findElements(By.xpath(PropertiesFileReader.getData("loc.blog.blogcount"))).size();
		String text1 =PropertiesFileReader.getData("loc.blog.text1") ;

		for (i = 1; i < blogcount + 1; i++) {
			String text2 = Integer.toString(i);
			String text3 = "]";

			LocalDate date1 = date.minusMonths(3);

			WebElement elem = driver.findElement(By.xpath(text1 + text2 + text3));
			String datetext = elem.getText();

			DateFormat format1 = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
			Date date2 = format1.parse(datetext);
			System.out.println(date2);
			

			WebElement blog1= driver.findElement(By.xpath(PropertiesFileReader.getData("loc.blog.blog1")));
			LocalDate localDate = Instant.ofEpochMilli(date2.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
			
			
			if (localDate.isBefore(date1)) {
				log.info("Blog met the date criteria");
				blog1.click();
				break;

			}
		}
		//LocalDate localdate2=LocalDate.from(date1);
	    //Period period = Period.between(date1,date);
	    //int diff = period.getDays();
		//System.out.println("Diff bw blogdate and current date:"+diff);
		
		
		WebElement elem2 = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.blog.elem2")));
		String actualtext = elem2.getText();
		if (actualtext.contains("Artificial Intelligence")) {
			log.info("BlogTitle verified");
		}

		String array[] = { "Home", "AI" };
		int j;
		int index = driver.findElements(By.xpath(PropertiesFileReader.getData("loc.blog.index"))).size();
		for (j = 1; j < index; j++) {

			String jj = Integer.toString(j);
			String text11 = PropertiesFileReader.getData("loc.blog.text11");
			String text13 = "]";

			WebElement elem4 = driver.findElement(By.xpath(text11 + jj + text13));
			String breadcrumb = elem4.getText();

			if (!breadcrumb.equals(array[j - 1])) {
				log.info("Breadcrumb verification failed");
			}
			String actualbcrumb = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.blog.breadcrumb"))).getText();
			String breadcrumbtext = "Debunking Myths about AI";
			Assert.assertEquals(breadcrumbtext, actualbcrumb);
			log.info("Breadcrumb verified");
		}

	}

}
