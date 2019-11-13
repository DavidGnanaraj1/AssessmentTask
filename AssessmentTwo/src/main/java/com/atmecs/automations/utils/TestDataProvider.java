package com.atmecs.automations.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.atmecs.automations.constants.FilePath;

public class TestDataProvider {

	

	@DataProvider(name = "Shopping Gadgets")
	public Object[][] testData() throws IOException {
		ExcelFileReader readExcel = new ExcelFileReader(FilePath.TESTDATA_FILE);
		int sheetIndex = 0;

		int rowNum = readExcel.rowCounting(sheetIndex);
		int colNum = readExcel.columnCounting(sheetIndex);

		Object[][] details = new Object[rowNum][colNum];

		for (int rowIndex = 0; rowIndex < rowNum; rowIndex++) {
			for (int colIndex = 0; colIndex < colNum; colIndex++) {
				details[rowIndex][colIndex] = ExcelFileReader.getData(sheetIndex, rowIndex + 1, colIndex);
			}
		}
		return details;
	}

}
