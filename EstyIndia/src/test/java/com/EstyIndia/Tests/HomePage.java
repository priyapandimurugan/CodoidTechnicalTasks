package com.EstyIndia.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.EstyIndia.HelperAction.AccountDetails;
import com.EstyIndia.HelperAction.ExtentReporter;
import com.EstyIndia.HelperAction.TestDataProvider;
import com.EstyIndia.TestBase.EstyIndiatestbase;

public class HomePage extends EstyIndiatestbase {
	AccountDetails login = new AccountDetails();

	@BeforeTest
	public void startreport() {

		startReport("logintest");
	}

	/**
	 * TS-001(Add to cart) TC-001
	 * 
	 * @param email
	 * @param password
	 * @throws Exception
	 */
	@Test(dataProvider = "loginuserData", dataProviderClass = TestDataProvider.class)
	public void accountdetails(String email, String password) throws Exception {
		ExtentReporter.logger = ExtentReporter.extent.startTest("afterlogin");
		login.accountdetails(email, password, driver);

	}
	/**
	 * TS-001 TC-002
	 * 
	 * @param email
	 * @param password
	 * @throws Exception
	 */
	/*
	 * @Test(dataProvider="loginuserData", dataProviderClass=TestDataProvider.class)
	 * public void withRequiredField(String email,String password) throws Exception
	 * { ExtentReporter.logger=ExtentReporter.extent.startTest("afterlogin");
	 * login.accountdetails(email, password, driver);
	 * 
	 * }
	 */

}
