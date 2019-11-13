package com.atmecs.automations.reports;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.automations.constants.FilePath;

public class LogReport {
	
	Logger logger = null;
	public LogReport() {
		getlogger();
		logger = Logger.getLogger(LogReport.class.getName());
	}

	public void getlogger() {
		PropertyConfigurator.configure(FilePath.LOG4J_FILE);
	}

	public void info(String message) {
		logger.info(message);
	}
}
