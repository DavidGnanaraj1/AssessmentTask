package com.atmecs.automations.pageactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActionsScroll {

	public static void scrollDown(WebDriver driver,String scrollvalue) {

		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.scrollBy(0,"+scrollvalue+")");
	}

	

	public static void scrollUp(WebDriver driver,String scrollvalue) {

		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.scrollBy(0,"+scrollvalue+")");
	}

	public static void scrollDownToBottom(WebDriver driver) {

		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrolDownTillElementOccurs(WebDriver driver, WebElement element) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
	}

}
