package com.qa.easyjobs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.easyjobs.base.BaseTest;
import com.qa.easyjobs.constants.AppConstants;
import com.qa.easyjobs.pages.DashboardPage;

public class DashboardPageTest extends BaseTest {



	
	
	@Test(priority =1)
	public void dashboardPageTitleTest() {

                String actualDashboardPageTitle = dashboardPage.getDashboardPageTitle();
				System.out.println("page act title: " + actualDashboardPageTitle);
		        Assert.assertEquals(actualDashboardPageTitle, AppConstants.DASHBOARD_PAGE_TITLE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
