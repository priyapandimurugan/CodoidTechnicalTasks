package com.EstyIndia.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateActions {
	public CreateActions(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")
	public WebElement signin;

	@FindBy(how = How.XPATH, using = "//input[@id='join_neu_email_field']")
	public WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@id='join_neu_password_field']")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@name='submit_attempt']")
	public WebElement submit;

	@FindBy(how = How.XPATH, using = "//span[@class='wt-display-table-cell wt-text-left-xs']/parent::a[1]")
	public WebElement saleshub;

	@FindBy(how = How.XPATH, using = "(//img/parent::a)[13]")
	public WebElement weddingjewellery;

	@FindBy(how = How.XPATH, using = "//div[@class='anchored-listing-image wt-width-full wt-rounded-01']")
	public WebElement ring;

	// @FindBy(how=How.XPATH,using="//button[@class='wt-btn wt-btn--filled
	// wt-width-full']/parent::div")
	// public WebElement addtobasket;

	@FindBy(how = How.XPATH, using = "//select[@id='variation-selector-0']")
	public WebElement ringsize;

	@FindBy(how = How.XPATH, using = "//select[@id='variation-selector-1']")
	public WebElement material;

	@FindBy(how = How.XPATH, using = "//button[@class='wt-btn wt-btn--filled wt-width-full']/parent::div")
	public WebElement addtobasket;

}
