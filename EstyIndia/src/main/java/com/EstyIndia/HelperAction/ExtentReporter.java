package com.EstyIndia.HelperAction;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import com.EstyIndia.pageObject.FilePath;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporter {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;

	public void startReport(String testName) {
		extent=new ExtentReports(FilePath.EXTENTREPORTER_HOME+"ExtentReport\\"+testName+".html");
		
	
	}

	public static String getScreenshot( String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/test-output/FailedTestsScreenshots/" + screenshotName
				+ "-" + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);  
		return destination;
	}

	@AfterMethod
	public void getReport(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			ExtentReporter.logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			ExtentReporter.logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());

			String screenshotPath = ExtentReporter.getScreenshot(result.getName());

			ExtentReporter.logger.log(LogStatus.FAIL, ExtentReporter.logger.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			ExtentReporter.logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}

		else if (result.getStatus() == ITestResult.SUCCESS) {
			ExtentReporter.logger.log(LogStatus.PASS, "Test Case Passed is " + result.getName());
			String screenshotPath = ExtentReporter.getScreenshot(result.getName());

			ExtentReporter.logger.log(LogStatus.PASS, ExtentReporter.logger.addScreenCapture(screenshotPath));
		}

		ExtentReporter.extent.endTest(ExtentReporter.logger);
	}

	public static void logPassedStepToReportWithScreenshot( ExtentTest test, String passedMessage) {

		test.log(LogStatus.PASS, passedMessage);
		String base64Info = takeScreenshotAsBase64(driver);
		test.log(LogStatus.PASS, "" + test.addBase64ScreenShot(base64Info));
		extent.endTest(test);
		extent.flush();
	}

	public static String takeScreenshotAsBase64(WebDriver driver) {
		String destination = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		return "data:image/jpg;base64, " + destination;
	}

	@AfterTest
	public void testEnd() {

		extent.flush();
		extent.close();
	}
}