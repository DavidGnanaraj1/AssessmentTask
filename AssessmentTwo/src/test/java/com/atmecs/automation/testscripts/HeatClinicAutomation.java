package com.atmecs.automation.testscripts;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.pageactions.PageActions;
import com.atmecs.automations.pageactions.PageActionsGet;
import com.atmecs.automations.pageactions.PageActionsScroll;
import com.atmecs.automations.reports.LogReport;
import com.atmecs.automations.testbase.BrowserInvoke;
import com.atmecs.automations.utils.LocatorSelector;
import com.atmecs.automations.utils.PropertiesFileReader;

public class HeatClinicAutomation extends BrowserInvoke {
	LogReport log = new LogReport();

@Test
public void shoppingautomation() throws IOException, InterruptedException {
	   
	    PropertiesFileReader.loadingPropertyFile(FilePath.SCE2EXPECTEDDATA_FILE);
		PageActionsScroll pageactscroll = new PageActionsScroll();
		int footerno=6;
		String homefootertitleexp=PropertiesFileReader.gettingPropertyFileData("expdata.linktextpagetitle");
		String homefootertitleexparr[]=new String[footerno];
		homefootertitleexparr=homefootertitleexp.split(",");

	    PropertiesFileReader.loadingPropertyFile(FilePath.SCE2LOCATORS_FILE);
	   
 	    PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.hotsauce"));
 	    String acthotsauce=driver.getTitle();
  		Assert.assertEquals(homefootertitleexparr[0], acthotsauce);
  		PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.merchandise"));
 	    String actmerchandise=driver.getTitle();
  		Assert.assertEquals(homefootertitleexparr[1],actmerchandise);
  		
  		PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.clearance"));
 	    String actclearancetit=driver.getTitle();
  	    Assert.assertEquals(homefootertitleexparr[2],actclearancetit);
  	    PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.newtohotsauce"));
		String actnewtohotsauce=driver.getTitle();
		Assert.assertEquals(homefootertitleexparr[3],actnewtohotsauce);
	    PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.faq"));
	    String actfaq=driver.getTitle();
	    Assert.assertEquals(homefootertitleexparr[4],actfaq);
		
        PropertiesFileReader.loadingPropertyFile(FilePath.SCE2LOCATORS_FILE);
        WebElement merchandise=driver.findElement(By.cssSelector("#content>nav>ul li:nth-child(3) a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(merchandise).build().perform();

        PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.men"));
		
        String textexpval[]= new String[2];
		textexpval[0] = "Viewing";
		textexpval[1] = "of";
		
		PropertiesFileReader.loadingPropertyFile(FilePath.SCE2EXPECTEDDATA_FILE);
		String linktextexpvalstring=PropertiesFileReader.gettingPropertyFileData("expdata.linktext");
		String actualmenfir=driver.findElement(By.cssSelector("#content section header h1 span:nth-child(1)")).getText();
		String actualmensec=driver.findElement(By.cssSelector("#content section header h1 span:nth-child(2)")).getText();
		Assert.assertEquals(textexpval[0]+textexpval[1],actualmenfir+actualmensec);

		PropertiesFileReader.loadingPropertyFile(FilePath.SCE2LOCATORS_FILE);
		PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.buynow"));
		PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.redcolour"));
		actions.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		for (int index = 0; index < 3; index++) {
			actions.sendKeys(Keys.TAB);
		}
		actions.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(PropertiesFileReader.gettingPropertyFileData("loc.sizem"))).click();
		Thread.sleep(3000);
		
		for (int index = 0; index < 3; index++) {
			actions.sendKeys(Keys.TAB).click();
		}		
		
		PageActions.sendKeys(driver, PropertiesFileReader.gettingPropertyFileData("loc.personalisedname"), "david");
        WebElement buynowelem=driver.findElement(By.cssSelector("div.product-options:nth-of-type(1)>input[value=\"Buy Now!\"]"));
        pageactscroll.scrolDownTillElementOccurs(driver,buynowelem);
        PageActions.explicitwait(driver, buynowelem);
        buynowelem.click();
	
        WebElement viewcart=driver.findElement(By.cssSelector(".modalcart"));
        PageActions.explicitwait(driver,viewcart);
        PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.viewcart"));
        
		List<WebElement> cartpdtdetelements = driver.findElements(
	    LocatorSelector.separatingLocators(PropertiesFileReader.gettingPropertyFileData("loc.cartdet")));
		String cartactualarray[] = null;
		String cartdettextexpval[] = new String[cartpdtdetelements.size()];
		PropertiesFileReader.loadingPropertyFile(FilePath.SCE2EXPECTEDDATA_FILE);
		String cartdettexpvalstring = PropertiesFileReader.gettingPropertyFileData("expdata.detailsincart");
        
		for (int index = 0; index < cartpdtdetelements.size(); index++) {
			cartdettextexpval = cartdettexpvalstring.split(",");
			cartpdtdetelements.get(index);
			System.out.println(cartdettextexpval[index]);
			if (!(cartdettextexpval[index] == cartdettextexpval[index])) {
				System.out.println(" Cart details is not matching");
			}
		}
		
		Thread.sleep(3000);
		PropertiesFileReader.loadingPropertyFile(FilePath.SCE2LOCATORS_FILE);
		String shtprzact = driver.findElement(
				LocatorSelector.separatingLocators(PropertiesFileReader.gettingPropertyFileData("loc.unitpdtprz")))
				.getText();
		PropertiesFileReader.loadingPropertyFile(FilePath.SCE2EXPECTEDDATA_FILE);
		Assert.assertEquals(PropertiesFileReader.gettingPropertyFileData("expdata.shtunitprz"), shtprzact);
		
		
		String shtnameact = driver
				.findElement(By.xpath("(//a[@href='/merchandise/hawt_like_a_habanero_mens'])[2]"))
				.getText();
		Assert.assertEquals(PropertiesFileReader.gettingPropertyFileData("expdata.shtname"), shtnameact);
		
		String shtunitprzact = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		String input = PropertiesFileReader.gettingPropertyFileData("expdata.shtunitprz");
		String unitprzresult = input.replaceAll("[$-+.^:,]", "");
		int unitprz = Integer.parseInt(unitprzresult);
		String shttotprzact = driver.findElement(By.xpath("(//td[@align='center'])[4]")).getText();
    	Assert.assertEquals(PropertiesFileReader.gettingPropertyFileData("expdata.shttotprz"),shttotprzact);
		PropertiesFileReader.loadingPropertyFile(FilePath.SCE2LOCATORS_FILE);
   	    driver.findElement(By.cssSelector(PropertiesFileReader.gettingPropertyFileData("loc.quantityboxincart"))).click();
        actions.sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.cssSelector(PropertiesFileReader.gettingPropertyFileData("loc.quantityboxincart"))).sendKeys("2");
        PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.updbtn"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
		String sText2 = js.executeScript("return document.querySelector(\".name+td input:nth-child(4)\").value;").toString();
		System.out.println(sText2);
	
		int sTextvalue = Integer.parseInt(sText2);
		if (!(sTextvalue == 2)) {
			System.out.println("Not updating in the cart");
		}
	}
}
