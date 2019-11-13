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

		PageActionsScroll pageactscroll = new PageActionsScroll();
		int footerno=6;
		
//        for(int footerindex=0;footerindex<footerno;footerindex++) {
//        PropertiesFileReader.loadingPropertyFile(FilePath.SCE2LOCATORS_FILE);
//
//        PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.home"));
//	    String footerlinktextfir=PropertiesFileReader.gettingPropertyFileData("loc.footerlinktextstart");
//	    String footerlinktextmid=Integer.toString(footerindex+1);
//	    String footerlinktextend=PropertiesFileReader.gettingPropertyFileData("loc.footerlinkendtext");
//        String footerlinkfulltext=footerlinktextfir+footerlinktextmid+footerlinktextend;
//    	PropertiesFileReader.loadingPropertyFile(FilePath.SCE2EXPECTEDDATA_FILE);
// 		WebElement footerlinkhome = driver.findElement(By.cssSelector(footerlinkfulltext));
// 		footerlinkhome.click();
// 		
// 		String homefooterexp=PropertiesFileReader.gettingPropertyFileData("expdata.title");
//	String homefootertitleact=driver.getTitle();
//		Assert.assertEquals(homefooterexp,homefootertitleact);
//	
//		String homefootertitleexp=PropertiesFileReader.gettingPropertyFileData("expdata.linktextpagetitle");
//		String homefootertitleexparr[]=new String[footerno];
//		homefootertitleexparr=homefootertitleexp.split(",");
//		Assert.assertEquals(homefootertitleexparr[footerindex],homefootertitleact);
//		}	
        
        WebElement merchandise=driver.findElement(By.xpath("//a[@href='/merchandise']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(merchandise).build().perform();
        PropertiesFileReader.loadingPropertyFile(FilePath.SCE2LOCATORS_FILE);
        PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.men"));
		
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
		
		for (int index = 0; index < 3; index++) {
			actions.sendKeys(Keys.TAB).click();
		}

		for (int index = 0; index < 3; index++) {
			actions.sendKeys(Keys.TAB).click();
		}		
		
		PageActions.sendKeys(driver, PropertiesFileReader.gettingPropertyFileData("loc.personalisedname"), "david");

		// PageActions.click(driver,
		// PropertiesFileReader.gettingPropertyFileData("loc.addtocart"));
		driver.findElement(By.cssSelector(".simplemodal-wrap")).click();
		PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.personalisedname"));
		actions.sendKeys(Keys.TAB).click();
		driver.findElement(By.xpath("//a[@title='Close']")).click();
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
		//	Assert.assertEquals(cartdettextexpval[index], );
		}
		Thread.sleep(3000);
		// PageActions.explicitwait(driver,LocatorSelector.separatingLocators(PropertiesFileReader.gettingPropertyFileData("loc.unitpdtprz")));
		String shtprzact = driver.findElement(
				LocatorSelector.separatingLocators(PropertiesFileReader.gettingPropertyFileData("loc.unitpdtprz")))
				.getText();
		Assert.assertEquals(PropertiesFileReader.gettingPropertyFileData("expdata.shtunitprz"), shtprzact);
		PropertiesFileReader.gettingPropertyFileData(FilePath.SCE2LOCATORS_FILE);
		String shtnameact = driver
				.findElement(LocatorSelector
						.separatingLocators(PropertiesFileReader.gettingPropertyFileData("loc.pdtnameincart")))
				.getText();
		Assert.assertEquals(PropertiesFileReader.gettingPropertyFileData("expdata.shtname"), shtnameact);

		String shttotprzact = driver.findElement(
				LocatorSelector.separatingLocators(PropertiesFileReader.gettingPropertyFileData("loc.unitpdtprz")))
				.getText();
		PropertiesFileReader.gettingPropertyFileData(FilePath.SCE2EXPECTEDDATA_FILE);

		String input = PropertiesFileReader.gettingPropertyFileData("expdata.shtunitprz");
		String unitprzresult = input.replaceAll("[$-+.^:,]", "");
		int unitprz = Integer.parseInt(unitprzresult);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String sText = js.executeScript("return document.value;").toString();
		System.out.println(sText);

		int quantity = Integer.parseInt(sText);
		int totprz = unitprz * quantity;
		String totalprz = Integer.toString(totprz);
		Assert.assertEquals(totalprz, shttotprzact);

		PageActions.click(driver, "loc.updbtn");
		WebElement uparrows = driver.findElement(LocatorSelector.separatingLocators("loc.incrqty"));

		actions.moveToElement(uparrows).build().perform();

		String sText2 = js.executeScript("return document.value;").toString();
		System.out.println(sText2);
		int sTextvalue = Integer.parseInt(sText2);
		if (!(sTextvalue == 2)) {
			System.out.println("Not updating in the cart");
		}
	
	}
}
