package com.imm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.imm.qa.base.TestBase;
import com.imm.qa.pages.CategoryDashboardPage;
import com.imm.qa.pages.CollectionViewPage;
import com.imm.qa.pages.HomePage;
import com.imm.qa.pages.LoginPage;
import com.imm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CategoryDashboardPage categoryDashboardPage;
	CollectionViewPage collectionViewPage;
	
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
		categoryDashboardPage = homePage.clickOnCategoriesLink();		
	}
	
	@Test(priority=4)
	public void verifyImmLogoLinkTest() {
		homePage = homePage.immLogoLink();	
	}
	
	@Test(priority=5)
	public void verifyCollectionLinkTest() {
		collectionViewPage = homePage.clickOnCollectionLink();		
	}
	
	@Test(priority=6)
	public void verifyAddCollectionLinkTest() {
		homePage.clickOnAddCollectionLink();		
	}
	
	@Test(priority=7)
	public void verifyEditCollectionLinkTest() {
		homePage.clickOnCollectionLink();
		homePage.clickOnEditCollectionLink();	
	}
	
	@Test(priority=8)
	public void verifyDeleteCollectionLinkTest() {
		homePage.clickOnCollectionLink();
		homePage.clickOnDeleteCollectionLink();	
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
