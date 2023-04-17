package com.EstyIndia.HelperAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelFileReader(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInput = new FileInputStream(file);
			try {
				workbook = new XSSFWorkbook(fileInput);

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static String getData(int index, int rowNum, int cellNum) {
		sheet = workbook.getSheetAt(index);
		String data = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		System.out.println("total rows:" + data);
		return data;

	}

	public int totalRowsinsheet(int sheet) {
		int rowCount = workbook.getSheetAt(0).getLastRowNum();
		System.out.println("total rows:" + rowCount);
		return rowCount;
	}

	public int totalColsinSheet(int sheetIndex) {
		int colCount = workbook.getSheetAt(sheetIndex).getRow(1).getLastCellNum();
		System.out.println("total col:" + colCount);
		return colCount;

	}

}
