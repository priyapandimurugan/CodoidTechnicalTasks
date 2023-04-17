package com.EstyIndia.HelperAction;

import org.testng.annotations.DataProvider;

import com.EstyIndia.pageObject.FilePath;

public class TestDataProvider {
	@DataProvider(name = "loginuserData")
	public static Object[][] testData() {
		ExcelFileReader file = new ExcelFileReader(FilePath.TESTDATA_FILE);
		int sheetIndex = 0;
		int rowCount = file.totalRowsinsheet(sheetIndex);
		int colCount = file.totalColsinSheet(sheetIndex);
		System.out.println("Total number of row in test data:" + rowCount);
		System.out.println("Total number of coloum in test data:" + rowCount);
		Object[][] data = new Object[rowCount][colCount];
		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
			for (int colIndex = 0; colIndex < colCount; colIndex++) {
				data[rowIndex][colIndex] = ExcelFileReader.getData(sheetIndex, rowIndex + 1, colIndex);
				System.out.println("Data:" + data[rowIndex][colIndex]);
			}

		}
		return data;
	}

	public static void main(String[] args) {
		testData();
	}

}
