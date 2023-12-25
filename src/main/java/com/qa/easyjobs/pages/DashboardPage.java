package com.qa.easyjobs.pages;

import com.microsoft.playwright.Page;


public class DashboardPage {
	
	private Page page;
	
	//locator
	//private String dashboardPageTitle = "//main[@class='content-area']";
	
	
	// 2. page constructor:
			public DashboardPage(Page page) {
				this.page = page;
			}

	
	//Actions
			
			public String getDashboardPageTitle() {
				String title =  page.title();
				System.out.println("page title: " + title);
				return title;
			}

	
	
	
	
	
	
	
	
	
	
}
