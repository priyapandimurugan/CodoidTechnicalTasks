package com.technicaltasks.testscripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technicaltasks.testbase.Constants;
import com.technicaltasks.testbase.TestBase;

public class DownloadFile extends TestBase {

	public static void main(String[] args) {

		DownloadFile downloadFile = new DownloadFile();

		launchTestApplication("https://demo.imacros.net/Automate/Downloads", "chrome");
		downloadFile.downloadFile();
		downloadFile.validateDownloadedFile("Download");

	}

	public void downloadFile() {

		WebElement downloadButton = driver.findElement(By.xpath("(//a[text()='Download'])[1]"));
		downloadButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void validateDownloadedFile(String downloadedFileName) {

		File directory = new File(Constants.DOWNLOADS_DIRECTORY);
		File[] filesInDirectory = directory.listFiles();

		for (int i = 0; i < filesInDirectory.length; i++) {

			System.out.println("Downloaded file name is: " + filesInDirectory[i].getName());

			if (filesInDirectory[i].getName().contains(downloadedFileName)) {

				System.out.println("File downloaded successfully...");
				filesInDirectory[i].delete();

			} else {

				System.out.println("File not downloaded... Something wrong...");
			}
		}
	}

}
