package com.technicaltasks.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technicaltasks.testbase.Constants;
import com.technicaltasks.testbase.TestBase;

public class UploadFile extends TestBase {
	

	/**
	 * Launch test application in Chrome browser
	 * Validate upload file feature and validated uploaded file
	 * @param args
	 */
	public static void main(String[] args) {

		launchTestApplication("https://www.foundit.in/seeker/registration", "chrome");
		uploadFile(Constants.UPLOAD_FILE);

	}

	public static void uploadFile(String filePath) {

		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		WebElement uploadedFileName = driver.findElement(By.id("registrationDetails"));

		chooseFile.sendKeys(filePath);

		String actualUploadedFileName = uploadedFileName.getText();

		if (actualUploadedFileName.contains("sampleData.txt")) {

			System.out.println("File Uploaded successfully...");

		} else {

			System.out.println("File not uploaded...Something wrong...");
		}

	}

}
