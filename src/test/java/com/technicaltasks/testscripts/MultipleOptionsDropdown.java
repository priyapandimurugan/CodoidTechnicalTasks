package com.technicaltasks.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.technicaltasks.testbase.TestBase;

public class MultipleOptionsDropdown extends TestBase {

	public static void main(String[] args) {

		launchTestApplication("https://demoqa.com/select-menu", "chrome");
		multiSelectDropdown();
		driver.close();

	}

	public static void multiSelectDropdown() {

		WebElement multiSelectDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select...')]"));
		multiSelectDropdown.click();

		multiSelectDropdown.sendKeys(Keys.ENTER);
		multiSelectDropdown.sendKeys(Keys.ENTER);
		multiSelectDropdown.sendKeys(Keys.ENTER);
		multiSelectDropdown.sendKeys(Keys.ENTER);
	}

	public void standardMultiSelect() {

	}

}
