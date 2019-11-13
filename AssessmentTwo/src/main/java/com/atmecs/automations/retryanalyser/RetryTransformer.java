package com.atmecs.automations.retryanalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class RetryTransformer {


	
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyser.class);	
	}
}

