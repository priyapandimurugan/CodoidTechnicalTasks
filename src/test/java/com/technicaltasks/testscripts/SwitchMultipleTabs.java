package com.technicaltasks.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technicaltasks.testbase.TestBase;

public class SwitchMultipleTabs extends TestBase {

	public static void main(String[] args) {

		SwitchMultipleTabs multipleTabs = new SwitchMultipleTabs();

		launchTestApplication("https://demoqa.com/browser-windows", "chrome");
		multipleTabs.clickNewTab();
		multipleTabs.switchToWindow(1);
		multipleTabs.switchToWindow(0);
	}

	public void clickNewTab() {

		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
	}

	public void switchToWindow(int windowIndex) {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(windowIndex));

		System.out.println("Page Title for tab " + windowIndex + " is: " + driver.getTitle());
		System.out.println("Page URL for tab " + windowIndex + " is: " + driver.getCurrentUrl());

	}

}
