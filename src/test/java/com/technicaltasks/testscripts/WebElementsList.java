package com.technicaltasks.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technicaltasks.testbase.TestBase;

public class WebElementsList extends TestBase {

	public static void main(String[] args) {

		WebElementsList elementsList = new WebElementsList();

		launchTestApplication("https://www.ironspider.ca/forms/checkradio.htm", "chrome");
		elementsList.selectMultipleCheckBoxes();

	}

	public void selectMultipleCheckBoxes() {

		List<WebElement> checkboxesList = driver.findElements(By.xpath("//input[@type='checkbox' and @name='color']"));

		int listSize = checkboxesList.size();

		for (int i = 0; i < listSize; i++) {
			// Clicking on each checkbox
			checkboxesList.get(i).click();
		}
	}
}
