package com.technicaltasks.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.technicaltasks.testbase.Constants;
import com.technicaltasks.testbase.TestBase;

public class TakeScreenshot extends TestBase {

	public static void main(String[] args) throws IOException {

		launchTestApplication("https://www.foundit.in/seeker/registration", "chrome");
		takeScreenshot(Constants.SCREENSHOT_FILE);

	}

	/*
	 * Take screenshot and save with mentioned file name and path
	 */
	public static void takeScreenshot(String filePath) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(filePath);
		FileUtils.copyFile(SrcFile, DestFile);

	}

}
