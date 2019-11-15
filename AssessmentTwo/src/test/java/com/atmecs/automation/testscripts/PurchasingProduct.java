package com.atmecs.automation.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.pageactions.PageActions;
import com.atmecs.automations.pageactions.PageActionsScroll;

import com.atmecs.automations.reports.LogReport;
import com.atmecs.automations.testbase.BrowserInvoke;
import com.atmecs.automations.utils.ExcelFileReader;
import com.atmecs.automations.utils.LocatorSelector;
import com.atmecs.automations.utils.PropertiesFileReader;
import com.atmecs.automations.utils.TestDataProvider;

public class PurchasingProduct extends BrowserInvoke {
	LogReport log = new LogReport();

	@Test // (dataProvider = "Shopping Gadgets",dataProviderClass=TestDataProvider.class)
	public void addingPdtsToCart() throws IOException, InterruptedException {

		PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
		int noofpdts = Integer.parseInt(PropertiesFileReader.gettingPropertyFileData("expdata.noofpdt"));
		PageActionsScroll pageactscroll = new PageActionsScroll();

		String pdtnames = PropertiesFileReader.gettingPropertyFileData("expdata.pdtnames");
		String[] pdtname = new String[noofpdts];
		pdtname = pdtnames.split(",");

		String pdtqty = PropertiesFileReader.gettingPropertyFileData("expdata.pdtqty");
		String[] pdtqtyarray = new String[noofpdts];
		pdtqtyarray = pdtqty.split(",");

		for (int pdtindex = 0; pdtindex < noofpdts; pdtindex++) {

			PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
			PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.searchinputbox"));
			PageActions.sendKeys(driver, PropertiesFileReader.gettingPropertyFileData("loc.searchinputbox"),
					pdtname[pdtindex]);
			PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.searchbtn"));

			WebElement addtocartelement = driver.findElement(LocatorSelector
					.separatingLocators(PropertiesFileReader.gettingPropertyFileData("loc.addtocartbtn")));
			PageActionsScroll.scrollDown(driver, "700");
			pageactscroll.scrolDownTillElementOccurs(driver, addtocartelement);
			addtocartelement.click();
			log.info("Product " + pdtname[pdtindex] + " of quantity " + pdtqtyarray[pdtindex] + " added to cart");

			PageActionsScroll.scrollUp(driver, "-700");
			PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.viewcart"));
			String pdtqtytextfir = PropertiesFileReader.gettingPropertyFileData("loc.pdtqtytextfir");
			String pdtqtytextsec = Integer.toString(pdtindex + 1);
			String pdtqtytextthird = PropertiesFileReader.gettingPropertyFileData("loc.pdtqtytextthird");
			String pdtqtytextfull = pdtqtytextfir + pdtqtytextsec + pdtqtytextthird;
			WebElement elempdtqty = driver.findElement(By.cssSelector(pdtqtytextfull));

			elempdtqty.sendKeys(Keys.BACK_SPACE);
			elempdtqty.sendKeys(pdtqtyarray[pdtindex]);

			String updatebuttonfir = PropertiesFileReader.gettingPropertyFileData("loc.updatebuttonfir");
			String updatebuttonsec = Integer.toString(pdtindex + 1);
			String updatebuttonthird = PropertiesFileReader.gettingPropertyFileData("loc.updatebuttonthird");
			String updatebuttontext[] = new String[noofpdts];
			String updatebuttontextfull = updatebuttonfir + updatebuttonsec + updatebuttonthird;

			driver.findElement(By.cssSelector(updatebuttontextfull)).click();

			driver.navigate().to("http://tutorialsninja.com/demo/");
		}
	}

	@Test
	public void verifyCart() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
		PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.viewcart"));
		PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
		int noofpdts = Integer.parseInt(PropertiesFileReader.gettingPropertyFileData("expdata.noofpdt"));

		String pdtnamearray[] = new String[noofpdts];
		String pdtnames = PropertiesFileReader.gettingPropertyFileData("expdata.pdtnames");
		String[] pdtname = new String[noofpdts];
		pdtname = pdtnames.split(",");

		String pdtqty = PropertiesFileReader.gettingPropertyFileData("expdata.pdtqty");
		String[] pdtqtyarray = new String[noofpdts];
		pdtqtyarray = pdtqty.split(",");
		int pdtqtyint[] = new int[noofpdts];
		String pricetextexp[] = new String[noofpdts];

		for (int pdtqtyindex = 0; pdtqtyindex <noofpdts; pdtqtyindex++) {

			pdtqtyint[pdtqtyindex] = Integer.parseInt(pdtqtyarray[pdtqtyindex]);
			PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
			String arrayactualpdtincart[] = new String[noofpdts];

			String pdtnametextfirst = PropertiesFileReader.gettingPropertyFileData("loc.pdtnametextfir");
			String pdtnametextsec = Integer.toString(pdtqtyindex + 1);
			String pdtnametextthird = PropertiesFileReader.gettingPropertyFileData("loc.pdtnametextthird");
			String fulltextpdtname = pdtnametextfirst + pdtnametextsec + pdtnametextthird;
			arrayactualpdtincart[pdtqtyindex] = driver.findElement(By.cssSelector(fulltextpdtname)).getText();
		
			String pricetexttot[] = new String[noofpdts];

			Assert.assertEquals(arrayactualpdtincart[pdtqtyindex], pdtname[pdtqtyindex]);

			String unitprztextfirst = PropertiesFileReader.gettingPropertyFileData("loc.unittextfirst");
			String unitprztextsec = Integer.toString(pdtqtyindex + 1);
			String unitprztextthird = PropertiesFileReader.gettingPropertyFileData("loc.unittextthird");
			String fulltextunitprz = unitprztextfirst + unitprztextsec + unitprztextthird;

			String pricetextact[] = new String[noofpdts];
			pricetextact[pdtqtyindex] = driver.findElement(By.cssSelector(fulltextunitprz)).getText();
			PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
			String pricetextexpected = PropertiesFileReader.gettingPropertyFileData("expdata.unitprz");
			pricetextexp = pricetextexpected.split("\\s");
			PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
			Assert.assertEquals(pricetextexp[pdtqtyindex], pricetextact[pdtqtyindex]);
			
			String totprztextfirst = PropertiesFileReader.gettingPropertyFileData("loc.pdttotprztextfir");
			String totprztextsec = Integer.toString(pdtqtyindex+1);
			String totprztextthird = PropertiesFileReader.gettingPropertyFileData("loc.pdttotprztextthird");
			String fulltexttotalprz = totprztextfirst + totprztextsec + totprztextthird;

			pricetexttot[pdtqtyindex] = driver.findElement(By.cssSelector(fulltexttotalprz)).getText();

			String totprzresult = pricetexttot[pdtqtyindex].replaceAll("[$-+.^:,]", "");
			int grandtotaltextact = Integer.parseInt(totprzresult);

			String[] pricenum = new String[noofpdts];
			pricenum[pdtqtyindex] = pricetextexp[pdtqtyindex].replaceAll("[$-+.^:,]", "");

			PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
			int grandtotal = pdtqtyint[pdtqtyindex] * Integer.parseInt(pricenum[pdtqtyindex]);
			Assert.assertEquals(grandtotal,grandtotaltextact);
			
			String grandtotalexp=PropertiesFileReader.gettingPropertyFileData("expdata.pdttot");
			String grandtotforsinglepdt[]= new String[noofpdts];
			grandtotforsinglepdt=grandtotalexp.split("\\s");
			String grandtotact=PropertiesFileReader.gettingPropertyFileData("expdata.pdttot");
			String grandtotarr[]=new String[noofpdts];
			Assert.assertEquals(grandtotforsinglepdt[pdtqtyindex],pricetexttot[pdtqtyindex]);
			
    		PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
			String pdtdesctextfir = PropertiesFileReader.gettingPropertyFileData("loc.pdtdesctextfir");
			String pdtdesctextsec = Integer.toString(pdtqtyindex+1);
			String pdtdesctextthird = PropertiesFileReader.gettingPropertyFileData("loc.pdtdesctextthird");
			String pdtdesctext[] = new String[noofpdts];
			String pdtdesctextfull = pdtdesctextfir + pdtdesctextsec + pdtdesctextthird;

			PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
			String pdtdesc = PropertiesFileReader.gettingPropertyFileData("expdata.pdtdesc");
			pdtdesctext = pdtdesc.split(",");
			String pdtdesctextact=driver.findElement(By.cssSelector(pdtdesctextfull)).getText();
			
            Assert.assertEquals(pdtdesctext[pdtqtyindex],pdtdesctextact);
            
            PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
            WebElement elem=driver.findElement(By.cssSelector(PropertiesFileReader.gettingPropertyFileData("loc.extax")));
            PageActionsScroll.scrollDown(driver,"700");
            PageActionsScroll pagescroll= new PageActionsScroll();
			pagescroll.scrolDownTillElementOccurs(driver, elem);
			
			PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
			String extaxexp=PropertiesFileReader.gettingPropertyFileData("expdata.extax");
			PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
			String extaxact=driver.findElement(By.cssSelector(PropertiesFileReader.gettingPropertyFileData("loc.extax"))).getText();
			Assert.assertEquals(extaxexp,extaxact);
			
		
		
		
		PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
		PageActions.click(driver,PropertiesFileReader.gettingPropertyFileData("loc.viewcart"));
		PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
		String grandtotalexp1=PropertiesFileReader.gettingPropertyFileData("expdata.pdttot");
		String grandtotforsinglepdt1[]= new String[noofpdts];
		grandtotforsinglepdt1=grandtotalexp1.split("\\s");
		
		PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
		String totprztextfirst1 = PropertiesFileReader.gettingPropertyFileData("loc.pdttotprztextfir");
		String totprztextsec1 = Integer.toString(pdtqtyindex+1);
		String totprztextthird1 = PropertiesFileReader.gettingPropertyFileData("loc.pdttotprztextthird");
		String fulltexttotalprz1 = totprztextfirst1 + totprztextsec1 + totprztextthird1;

		String grandtotact1=driver.findElement(By.cssSelector(fulltexttotalprz1)).getText();
		String grandtotarr1[]=new String[noofpdts];
	   	Assert.assertEquals(grandtotforsinglepdt1[pdtqtyindex],grandtotact1);

		}
		PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
		String expdata=PropertiesFileReader.gettingPropertyFileData("expdata.errorinput");
		PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
		PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.searchinputbox"));
		PageActions.sendKeys(driver,PropertiesFileReader.gettingPropertyFileData("loc.searchinputbox"),expdata);
		PageActions.click(driver, PropertiesFileReader.gettingPropertyFileData("loc.searchbtn"));
		
		PropertiesFileReader.loadingPropertyFile(FilePath.EXPECTEDDATA_FILE);
		PageActionsScroll.scrollUp(driver, "-700");
		String experrmsg=PropertiesFileReader.gettingPropertyFileData("expdata.errormsg");   
		PropertiesFileReader.loadingPropertyFile(FilePath.LOCATORS_FILE);
		String acterrmsg=driver.findElement(By.cssSelector(PropertiesFileReader.gettingPropertyFileData("loc.negsce"))).getText();
		Assert.assertEquals(experrmsg,acterrmsg);
	}

}

