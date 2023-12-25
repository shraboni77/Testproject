package com.qa.easyjobs.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    
	private Page page;
	
	//1. Sting locator OR-
	private String emailId = "input[type='email']";
	private String password = "input[type='password']";
	private String loginBtn = "button[type='submit']";
	private String forgotPwdLink = "//a[normalize-space()='Forgot Password?']";
	private String logoutLink = "//a[@href='/logout']//div[@class='navigation-icon']";
	private String companyMenu = " //button[@class='button dropdown-toggle']";


	
	
	// 2. page constructor:
		public LoginPage(Page page) {
			this.page = page;
		}
	
	
		// 3. page actions/methods:
		public String getLoginPageTitle() {
			String title =  page.title();
			System.out.println("page title: " + title);
			return title;
		}

		public String getLoginPageURL() {
			String url =  page.url();
			System.out.println("page url : " + url);
			return url;
		}
	
		
		public boolean isForgotPwdLinkExist() {
			return page.isVisible(forgotPwdLink);
		}
		
		public boolean doLogin(String appUserName, String appPassword) {
			System.out.println("App creds: " + appUserName + ":" + appPassword);
			page.fill(emailId, appUserName);
			page.fill(password, appPassword);
			page.click(loginBtn);
			page.click(companyMenu);
			page.locator(logoutLink).waitFor();
			
			if(page.locator(logoutLink).isVisible()) {
				System.out.println("user is logged in successfully....");
				return true;
			}else {
				System.out.println("user is not logged in successfully....");
				return false;
			}
		
		}
		
		public DashboardPage navigateToDashboardPage(){
		page.click(loginBtn);
		return new DashboardPage(page);
		
	
}
}