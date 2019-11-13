package com.atmecs.automations.pageactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.utils.LocatorSelector;
import com.atmecs.automations.utils.PropertiesFileReader;

public class PageActions {
	PropertiesFileReader prop = new PropertiesFileReader();

	LocatorSelector locsel = new LocatorSelector();

	public static void click(WebDriver driver, String locatorwithtype) {
        driver.findElement(LocatorSelector.separatingLocators(locatorwithtype)).click();
	}

	public static void dropdown(WebDriver driver, String locatorwithtype, String value) {
		WebElement element = driver.findElement(LocatorSelector.separatingLocators(locatorwithtype));
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void sendKeys(WebDriver driver, String locatorwithtype, String value) {
		WebElement element = driver.findElement(LocatorSelector.separatingLocators(locatorwithtype));
		element.sendKeys(value);
	}

	public static void explicitwait(WebDriver driver, By byvalue) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(byvalue));

	}
}
