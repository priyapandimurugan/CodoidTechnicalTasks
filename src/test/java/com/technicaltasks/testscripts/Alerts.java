package com.technicaltasks.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.technicaltasks.testbase.TestBase;

public class Alerts extends TestBase {

	public static void main(String[] args) {

		Alerts alertsValidations = new Alerts();
		alertsValidations.handleAuthenticationAlertWithValidCredentials();
		alertsValidations.handleAuthenticationAlertWithInValidCredentials();

	}

	/*
	 * Handled alert by the positive scenario
	 */
	public void handleAuthenticationAlertWithValidCredentials() {

		String validUsername = "admin";
		String validPassword = "admin";

		launchTestApplication(
				"https://" + validUsername + ":" + validPassword + "@" + "the-internet.herokuapp.com/basic_auth",
				"chrome");

		String successMessage = driver.findElement(By.cssSelector(".example>p")).getText();

		if (successMessage.contains("Congratulations! You must have the proper credentials.")) {

			System.out.println("User landed on home page after successfull alert authentication.");
		} else {

			System.out.println("Something went wrong...");
		}
	}

	/*
	 * Validated alert by the negative scenario
	 */
	public void handleAuthenticationAlertWithInValidCredentials() {

		String validUsername = "invalidUsername";
		String validPassword = "admin";

		launchTestApplication(
				"https://" + validUsername + ":" + validPassword + "@" + "the-internet.herokuapp.com/basic_auth",
				"chrome");

		List<WebElement> successMessageElementList = driver.findElements(By.cssSelector(".example>p"));
		int webElementSize = successMessageElementList.size();

		if (webElementSize == 0) {

			System.out.println("Authentication popup not handeled due to invalid credentials as expected.");

		} else {

			System.out.println("Something went wrong...");
		}

	}

}
