package com.technicaltasks.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technicaltasks.testbase.TestBase;

public class HandleIFrame extends TestBase {

	public static void main(String[] args) {
		HandleIFrame handleIFrame = new HandleIFrame();

		launchTestApplication("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame", "chrome");
		handleIFrame.switchIFrame();
		handleIFrame.validateElementInsideIFrame();

	}

	public void switchIFrame() {

		WebElement iframeElement = driver.findElement(By.cssSelector("[name='globalSqa']"));
		driver.switchTo().frame(iframeElement);

	}

	public void validateElementInsideIFrame() {

		WebElement automationTab = driver.findElement(By.xpath("//*[@data-image-title='SelenimTraining']"));
		automationTab.click();
		System.out.println("Able to open the automation sub tab inside the IFrame");

	}

}
