package com.EstyIndia.pageObject;

import java.io.File;

public class FilePath {
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;
	public final static String TESTDATA_HOME = USER_HOME + "TestData" + File.separator;
	public final static String TESTDATA_FILE = TESTDATA_HOME + "datas.xlsx";
	public final static String EXTENTREPORTER_HOME = "C:\\Users\\ELCOT\\eclipse-workspace\\EstyIndia\\";
	public final static String EXTENTREPORTER_FILE = EXTENTREPORTER_HOME + "test-output\\successedscreenshot\\";

	public static void main(String[] args) {
		System.out.println(USER_HOME);
	}
}
