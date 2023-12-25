package com.qa.easyjobs.base;
import java.util.Properties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.easyjobs.factory.PlaywrightFactory;
import com.qa.easyjobs.pages.DashboardPage;
import com.qa.easyjobs.pages.LoginPage;

public class BaseTest {

	PlaywrightFactory pf;
	Page page;
	protected Properties prop;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
	
	@BeforeTest
	
	public void setup()
	
	{
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
		page = pf.initBrowser(prop);
		loginPage = new LoginPage(page);
		
			
	}
	
	
	
	//@AfterTest

	//public void tearDown() {

		//page.context().browser().close();
		
		
	//}
	
	
	
	
	
	
}
