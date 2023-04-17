package com.EstyIndia.HelperAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.EstyIndia.PageActions.PageAction;
import com.EstyIndia.pageObject.CreateActions;

public class AccountDetails extends PageAction {

	public void accountdetails(String email, String password, WebDriver driver) throws Exception {
		CreateActions create = new CreateActions(driver);
		clickevent(create.signin);
		sendKey(create.email, email);
		sendKey(create.password, password);

		clickevent(create.submit);
		jsClick(driver, create.saleshub);
//        clickevent(create.saleshub);

		clickevent(create.weddingjewellery);
		clickevent(create.ring);
		// clickevent(create.addtobasket);

		Select ringsize = new Select(create.ringsize);
		ringsize.selectByVisibleText("2 US");

		Select material = new Select(create.material);
		material.selectByValue("2678988178");
		clickevent(create.addtobasket);

		// Assert.assertTrue(create.visibletext.isDisplayed());

	}

}
