package com.atmecs.automations.validatetest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.automations.constants.FilePath;
import com.atmecs.automations.utils.PropertiesFileReader;

import junit.framework.Assert;

public class ValidateFooter {
	
	
public static void checkSitemapText(WebDriver driver) throws IOException {
	PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
	String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.sitemap"))).getText();
	PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
	String expected = PropertiesFileReader.getData("expdata.sitemap");
	Assert.assertEquals(expected, actual);
}
public static void checkServicesText(WebDriver driver) throws IOException {
	PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
	String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.services"))).getText();
	PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
	String expected = PropertiesFileReader.getData("expdata.services");
	Assert.assertEquals(expected, actual);
}

public static void checkCareersText(WebDriver driver) throws IOException {
	PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
	String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.careers"))).getText();
	PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
	String expected = PropertiesFileReader.getData("expdata.careers");
	Assert.assertEquals(expected, actual);
}
	public static void checkContactusText(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.contactus"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.contactus");
		Assert.assertEquals(expected, actual);
	}
	public static void checkHomeLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.home"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.home");
		Assert.assertEquals(expected, actual);
	}
	public static void checkAboutusLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.aboutus"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.aboutus");
		Assert.assertEquals(expected, actual);
	}
	public static void checkServicesLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.linktextservices"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.linktextservices");
		Assert.assertEquals(expected, actual);
	}
	public static void checkPartnersLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.partners"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.partners");
		Assert.assertEquals(expected, actual);
	}
	public static void checkCaseStudiesLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.casestudies"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.casestudies");
		Assert.assertEquals(expected, actual);
	}
	public static void checkNewsLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.news"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.news");
		Assert.assertEquals(expected, actual);
	}
	public static void checkCareersLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.careers"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.careers");
		Assert.assertEquals(expected, actual);
	}
	public static void checkContactusLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.contactus"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.contactus");
		Assert.assertEquals(expected, actual);
	}
	public static void checkArtificialIntelligenceLinkText(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.ai/ml"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.ai/ml");
		Assert.assertEquals(expected, actual);
	}
	public static void checkAugmentRealityLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.ar/vr"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.ar/vr");
		Assert.assertEquals(expected, actual);
	}
	public static void checkQualityEngineeringLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.qualityengineering"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.qualityengineering");
		Assert.assertEquals(expected, actual);
	}
	public static void checkBlockChainLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.blockchain"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.blockchain");
		Assert.assertEquals(expected, actual);
	}
	public static void checkRoboticsLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.roboticprocess"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.roboticprocess");
		Assert.assertEquals(expected, actual);
	}
	public static void checkCloudServicesLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.cloudservices"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.cloudservices");
		Assert.assertEquals(expected, actual);
	}
	public static void checkEnterpriseAnalyticsLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.enterpriseanalysis"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.enterpriseanalysis");
		Assert.assertEquals(expected, actual);
	}
	public static void checkIotLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.iot"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.iot");
		Assert.assertEquals(expected, actual);
	}
	public static void checkMobilecomputingLinkText(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.mobilecomputing"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.mobilecomputing");
		Assert.assertEquals(expected, actual);
	}
	public static void checkProductEngineeringLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.productengineering"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.productengineering");
		Assert.assertEquals(expected, actual);
	}
	public static void checkAutomationEngrLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.automationengineer"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.automationengineer");
		Assert.assertEquals(expected, actual);
	}
	public static void checkDevopsEngrLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.devopsengineer"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.devopsengineer");
		Assert.assertEquals(expected, actual);
	}
	public static void checkSeniordotnetLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.seniordotnetengr"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.seniordotnetengr");
		Assert.assertEquals(expected, actual);
	}
	public static void checkSeniorjavaLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.seniorjava"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.seniorjava");
		Assert.assertEquals(expected, actual);
	}
	public static void checkUsHeadquartersLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.usheadquarters"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.usheadquarters");
		Assert.assertEquals(expected, actual);
	}
	public static void checkusrdcenterLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.usr&dcentre"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.usr&dcentre");
		Assert.assertEquals(expected, actual);
	}
	public static void checkHyderabadLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.india-hyderabad"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.india-hyderabad");
		Assert.assertEquals(expected, actual);
	}
	public static void checkBanagaloreLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.india-bangalore"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.india-bangalore");
		Assert.assertEquals(expected, actual);
	}
	public static void checkChennaiLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.india-chennai"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.india-chennai");
		Assert.assertEquals(expected, actual);
	}
	public static void checkInfoatmecsLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.info@atmecscom"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.info@atmecscom");
		Assert.assertEquals(expected, actual);
	}
	public static void checkIrelandLinkext(WebDriver driver) throws IOException {
		PropertiesFileReader.loadProperty(FilePath.LOCATORS_FILE);
		String actual   = driver.findElement(By.xpath(PropertiesFileReader.getData("loc.validatefooter.europe-ireland"))).getText();
		PropertiesFileReader.loadProperty(FilePath.VALIDATION_FILE);
		String expected = PropertiesFileReader.getData("expdata.europe-ireland");
		Assert.assertEquals(expected, actual);
	}
	public static void validateFooterdata(WebDriver driver) throws IOException {
		ValidateFooter.checkSitemapText(driver);
		ValidateFooter.checkServicesText(driver);
		ValidateFooter.checkCareersText(driver);
		ValidateFooter.checkCareersText(driver);
		ValidateFooter.checkHomeLinkext(driver);
		ValidateFooter.checkAboutusLinkext(driver);
		ValidateFooter.checkServicesLinkext(driver);
		ValidateFooter.checkPartnersLinkext(driver);
		ValidateFooter.checkCaseStudiesLinkext(driver);
		ValidateFooter.checkNewsLinkext(driver);
		ValidateFooter.checkCareersLinkext(driver);
		ValidateFooter.checkContactusLinkext(driver);
		ValidateFooter.checkArtificialIntelligenceLinkText(driver);
		ValidateFooter.checkAugmentRealityLinkext(driver);
		ValidateFooter.checkQualityEngineeringLinkext(driver);
		ValidateFooter.checkBlockChainLinkext(driver);
		ValidateFooter.checkCloudServicesLinkext(driver);
		ValidateFooter.checkEnterpriseAnalyticsLinkext(driver);
		ValidateFooter.checkMobilecomputingLinkText(driver);
		ValidateFooter.checkProductEngineeringLinkext(driver);
		ValidateFooter.checkAutomationEngrLinkext(driver);
		ValidateFooter.checkDevopsEngrLinkext(driver);
        ValidateFooter.checkSeniordotnetLinkext(driver);
        ValidateFooter.checkSeniorjavaLinkext(driver);
        ValidateFooter.checkUsHeadquartersLinkext(driver);
        ValidateFooter.checkusrdcenterLinkext(driver);
        ValidateFooter.checkHyderabadLinkext(driver);
        ValidateFooter.checkBanagaloreLinkext(driver);
        ValidateFooter.checkChennaiLinkext(driver);
        ValidateFooter.checkInfoatmecsLinkext(driver);
        ValidateFooter.checkIrelandLinkext(driver);
	
	} 
	}

