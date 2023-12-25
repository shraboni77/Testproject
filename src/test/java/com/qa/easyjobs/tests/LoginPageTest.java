package com.qa.easyjobs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.easyjobs.base.BaseTest;
import com.qa.easyjobs.constants.AppConstants;


public class LoginPageTest extends BaseTest {


	@Test(priority = 1)
	public void loginPageTitleTest() {

		String actualLoginPageTitle = loginPage.getLoginPageTitle();
		System.out.println("page act title: " + actualLoginPageTitle);
		Assert.assertEquals(actualLoginPageTitle, AppConstants.LOGIN_PAGE_TITLE);
	}
	

	@Test(priority=2)
	public void loginPageURL() {
		
		
		String actualURL = loginPage.getLoginPageURL();
		Assert.assertEquals(actualURL, prop.get("url"));
		
		
	}

	@Test(priority =3)
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@Test(priority = 4)
	public void doLoginTest() {
		Assert.assertTrue(loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim()));
	}
	
	
}
