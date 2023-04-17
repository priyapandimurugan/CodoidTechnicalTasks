package com.technicaltasks.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.technicaltasks.testbase.TestBase;

public class MenuSubMenu extends TestBase {

	public static void main(String[] args) {

		launchTestApplication("https://www.browserstack.com/", "chrome");
		validateLinkInSubMenu();

	}

	/**
	 * Validating the page title of the Selenium page which is available inside the
	 * Documentation submenu.
	 */
	static void validateLinkInSubMenu() {

		WebElement developersLink = driver.findElement(
				By.xpath("//button[@aria-label='Developers' and @data-target='developers-menu-dropdown']/span"));
		WebElement documentationLinkFromSubmenu = driver
				.findElement(By.xpath("//a[@title='Documentation' and text()='Documentation']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(developersLink).build().perform();

		documentationLinkFromSubmenu.click();

		WebElement seleniumLink = driver.findElement(By.cssSelector("[aria-label='Selenium']"));
		seleniumLink.click();

		if (driver.getTitle().contains("Run Selenium tests on BrowserStack Automate | BrowserStack Docs")) {

			System.out.println("Opened Selenium page inside the submenu of Documentations");
		} else {
			System.out.println("Something wrong....");
		}

	}

}
