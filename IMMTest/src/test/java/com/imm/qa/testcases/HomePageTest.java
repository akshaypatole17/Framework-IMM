package com.imm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.imm.qa.base.TestBase;
import com.imm.qa.pages.CategoryDashboardPage;
import com.imm.qa.pages.CategoryViewPage;
import com.imm.qa.pages.HomePage;
import com.imm.qa.pages.LoginPage;
import com.imm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CategoryDashboardPage categoryDashboardPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));		 		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "IMM","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		//testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyCategoriesLinkTest() {
		categoryDashboardPage = homePage.clickOnCataegoriesLink();		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
