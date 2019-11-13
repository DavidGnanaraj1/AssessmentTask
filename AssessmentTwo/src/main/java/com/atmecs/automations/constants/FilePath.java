package com.atmecs.automations.constants;

import java.io.File;

public class FilePath {

	public static final String USER_DIR = System.getProperty("user.dir") + File.separator;

	public static final String CHROME_FILE = USER_DIR + "lib2" + File.separator + "chromedriver.exe";

	public static final String FIREFOX_FILE = USER_DIR + "lib" + File.separator + "geckodriver.exe";

	public static final String IE_FILE = USER_DIR + "lib3" + File.separator + "IEDriverServer.exe";

	public static final String CONFIG_FILE = USER_DIR + "resources" + File.separator + "configurations" + File.separator
			+ "config.properties";

	public static final String LOCATORS_FILE = USER_DIR + "resources" + File.separator + "locators" + File.separator
			+ "locators.properties";

	public static final String SCE2LOCATORS_FILE = USER_DIR + "resources" + File.separator + "locators" + File.separator
			+ "Scenario2.properties";

	public static final String LOG4J_FILE = USER_DIR + "resources" + File.separator + "log4j" + File.separator
			+ "log4j.properties";

	public static final String TESTDATA_FILE = USER_DIR + "resources" + File.separator + "testdata" + File.separator
			+ "Scenario1TestData.xlsx";
	public static final String SCE2TESTDATA_FILE = USER_DIR + "resources" + File.separator + "testdata" + File.separator
			+ "TestData.xlsx";

	public static final String EXPECTEDDATA_FILE = USER_DIR + "resources" + File.separator + "expecteddata"
			+ File.separator + "expecteddata.properties";
	

	public static final String SCE2EXPECTEDDATA_FILE = USER_DIR + "resources" + File.separator + "expecteddata"
			+ File.separator + "Scenario2expdata.properties";
}
