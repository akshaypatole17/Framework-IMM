package com.imm.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.imm.qa.base.TestBase;
import com.imm.qa.pages.AddCollectionPopUpPage;
import com.imm.qa.pages.CategoryDashboardPage;
import com.imm.qa.pages.CollectionViewPage;
import com.imm.qa.pages.EditCollectionPopUpPage;
import com.imm.qa.pages.HomePage;
import com.imm.qa.pages.LoginPage;
import com.imm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CategoryDashboardPage categoryDashboardPage;
	CollectionViewPage collectionViewPage;
	AddCollectionPopUpPage addCollectionPopUp;
	EditCollectionPopUpPage editCollectionPopUp; 
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));	
		addCollectionPopUp = new AddCollectionPopUpPage();
		editCollectionPopUp = new EditCollectionPopUpPage();
		collectionViewPage = new CollectionViewPage();
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
	public void verifyAddCollectionLinkTest() throws InterruptedException, AWTException {
		addCollectionPopUp = homePage.clickOnAddCollectionLink();
		Thread.sleep(5000);
		String Title = addCollectionPopUp.validateAddCollectionTitle();
		Assert.assertEquals(Title, "+ Add Collection");
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
	
	@Test(priority=9)
	public void enterCollectionNameTest() {
		addCollectionPopUp = homePage.clickOnAddCollectionLink();
		addCollectionPopUp.enterCollectionName();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
