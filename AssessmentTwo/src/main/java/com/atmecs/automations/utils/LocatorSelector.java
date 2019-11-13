package com.atmecs.automations.utils;

import org.openqa.selenium.By;

public class LocatorSelector {

	public static By separatingLocators(String locatorwithtype) {
		String locators[] = locatorwithtype.split(",");
		String locatortype = locators[0];
		String locatorvalue = locators[1];
		By by = null;
		
		switch (locators[0]) {
		case "XPATH":
			by = By.xpath(locatorvalue);
			break;
		case "CSS":
			by = By.cssSelector(locatorvalue);
			break;
		case "ID":
			by = By.id(locatorvalue);
			break;
//	        case 4: 
//	      
//	            break; 
//	        case 5: 
//	          
//	            break; 
//	        case 6: 
//	             
//	            break; 
//	        case 7: 
//	           
//	            break; 
		default:

			break;
		}
		return by;

	}

}
