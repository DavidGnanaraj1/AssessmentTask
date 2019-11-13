package com.atmecs.automation.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.atmecs.automations.testbase.BrowserInvoke;

public class WebTables extends BrowserInvoke{

	public void webtablecellddata(int rowno,int cellno) {
		
		    String textfirst  = ".table.table-striped td:nth-child(";
		    String textsec    = Integer.toString(rowno);
		    String textthird  = ") a";

			String textfull   = textfirst+textsec+textthird;
		    WebElement celldata = driver.findElement(By.cssSelector(textfull));
		    String celltext   = celldata.getText();
		    System.out.println(celltext);
	}
	
	public void webtablecolrowno() {
		
		List  col = driver.findElements(By.cssSelector("div#rb-calendar_onward_cal table tbody tr:nth-of-type(5) td"));
        System.out.println("No of cols are : " +col.size()); 

        List  rows = driver.findElements(By.cssSelector("div#rb-calendar_return_cal table tbody tr")); 
        System.out.println("No of rows are : " + rows.size());
		
		}
	
	public void webtablerowvalues(int rowno) {
		String textfirst  = ".table.table-striped td:nth-child(";
	    String textsec    = Integer.toString(rowno);
	    String textthird  = ") td:nth-of-type(";
        List<WebElement> listsize = driver.findElements(By.cssSelector(textfirst+textsec+textthird));
        int size=listsize.size();
		for(int listindex = 0;listindex<size;listindex++) {
	    String textfourth = Integer.toString(listindex)+")";
		List<WebElement>list = driver.findElements(By.cssSelector("div#rb-calendar_onward_cal table tbody tr:nth-of-type(6) td:nth-of-type(1)"));
		driver.findElement(By.cssSelector("div#rb-calendar_onward_cal table tbody tr:nth-of-type(6) td:nth-of-type(1)"));

	}
		
}


}