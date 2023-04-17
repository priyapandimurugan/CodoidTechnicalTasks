package com.EstyIndia.PageActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageAction {

	public static void clickEvent(String locatorType, String locatorValue, WebDriver driver) {

		switch (locatorType) {

		case "id":
			driver.findElement(By.id(locatorValue)).click();
			break;
		case "name":
			driver.findElement(By.name(locatorValue)).click();
			break;

		case "xpath":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "linktext":
			driver.findElement(By.linkText(locatorValue)).click();
			break;
		case "partiallinktext":
			driver.findElement(By.partialLinkText(locatorValue)).click();
			break;
		case "tagName":
			driver.findElement(By.tagName(locatorValue)).click();
			break;
		case "cssselector":

			driver.findElement(By.cssSelector(locatorValue)).click();

		}
	}

	public static void sendKeys(String locatorType, String locatorValue, String keyValue, WebDriver driver) {

		switch (locatorType) {
		case "id":

			driver.findElement(By.id(locatorValue)).sendKeys(keyValue);
			break;

		case "name":
			driver.findElement(By.name(locatorValue)).click();
			break;

		case "xpath":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "linktext":
			driver.findElement(By.linkText(locatorValue)).click();
			break;
		case "partiallinktext":
			driver.findElement(By.partialLinkText(locatorValue)).click();
			break;
		case "tagname":
			driver.findElement(By.tagName(locatorValue)).click();
			break;
		case "cssselector":

			driver.findElement(By.cssSelector(locatorValue)).sendKeys(keyValue);

		}
	}

	public static WebElement find(String locatorType, String locatorValue, WebDriver driver) {
		WebElement element = null;
		switch (locatorType) {
		case "id":
			element = driver.findElement(By.id(locatorValue));
			break;
		case "name":
			element = driver.findElement(By.name(locatorValue));
			break;

		case "xpath":
			element = driver.findElement(By.xpath(locatorValue));
			break;
		case "linktext":
			element = driver.findElement(By.linkText(locatorValue));
			break;
		case "partiallinktext":
			element = driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "tagName":
			element = driver.findElement(By.tagName(locatorValue));
			break;
		case "cssselector":

			element = driver.findElement(By.cssSelector(locatorValue));

		}
		return element;
	}

	public static void clear(String locatorType, String locatorValue, WebDriver driver) {
		switch (locatorType) {

		case "id":
			driver.findElement(By.id(locatorValue)).click();
			break;
		case "name":
			driver.findElement(By.name(locatorValue)).click();
			break;

		case "xpath":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "linktext":
			driver.findElement(By.linkText(locatorValue)).click();
			break;
		case "partiallinktext":
			driver.findElement(By.partialLinkText(locatorValue)).click();
			break;
		case "tagName":
			driver.findElement(By.tagName(locatorValue)).click();
			break;
		case "cssselector":

			driver.findElement(By.cssSelector(locatorValue)).click();

		}
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public void clickevent(WebElement element) {
		element.click();
	}

	public void sendKey(WebElement element, String email) {
		element.sendKeys(email);
	}

	public static void switchWindow(WebDriver driver, int index) {
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> opt = new ArrayList<String>(windowIDs);
		driver.switchTo().window(opt.get(index));
	}

	public static void moveTo(String locatorType, String source, String targert, WebDriver driver) {
		WebElement sourceElement = PageAction.find(locatorType, source, driver);
		WebElement targertElement = PageAction.find(locatorType, targert, driver);
		Actions action = new Actions(driver);
		action.moveToElement(sourceElement).click(targertElement).perform();
	}

	public static void moveTo(WebElement sourceElement, WebElement targetElement, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(sourceElement).click(targetElement).perform();

	}

	public static void visible(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		element = wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void jsClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void javaScriptClicker(WebElement element, WebElement driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("argument[0].click();", element);
	}

}
