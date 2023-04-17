package com.EstyIndia.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.EstyIndia.HelperAction.ExtentReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EstyIndiatestbase extends ExtentReporter {

	@BeforeClass
	public static WebDriver lanuchbrowser() {
		switch (BrowserObjects.BROWSER) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.get(BrowserObjects.URL);
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.get(BrowserObjects.URL);
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BrowserObjects.MAX_WAIT));
			driver.get(BrowserObjects.URL);
			break;
		}
		return driver;

	}

}
