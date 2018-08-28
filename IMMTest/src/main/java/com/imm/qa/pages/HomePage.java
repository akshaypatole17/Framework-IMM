package com.imm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imm.qa.base.TestBase;

public class HomePage extends TestBase  {
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/section/imm-nav/header/div[1]/imm-user-info/div/button/span")
	WebElement userNameLabel;
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/section/imm-collection-category-search-bar/div/div/div/span[2]/a/button")
	WebElement categoriesLink;
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/section/imm-nav/header/div[1]/div/a/imm-brand/div/h1")
	WebElement immLogoLink;
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/div/div[1]/imm-product-collection-browser/div/imm-add-collection-button/div/button")
	WebElement addCollectionLink;
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/div/div[2]/imm-product-collection-list/table/tbody/tr[1]/td[1]/a/span")
	WebElement clickOnCollectionLink;
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/div/div[2]/imm-product-collection-list/table/tbody/tr[1]/td[1]/a/span\n")
	WebElement clickOnRecentCollectionLink;

	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/div/div[2]/imm-product-collection-detail/imm-product-collection-header/div/div[2]/div/imm-product-collection-edit/span/span/i[2]")
	WebElement clickOnEditCollectionLink;
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/div/div[2]/imm-product-collection-detail/imm-product-collection-header/div/div[2]/div/imm-product-collection-remove/div/button/span/i[2]")
	WebElement clickOnDeleteCollectionLink;
	
	@FindBy(xpath="/html/body/imm-root/imm-product-collections/div/div/div[2]/imm-product-collection-detail/imm-product-collection-header/div/div[2]/div/imm-product-collection-download/span/span/i[2]")
	WebElement clickOnExportCollectionLink;
	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public CategoryDashboardPage clickOnCategoriesLink() {
		categoriesLink.click();
		return new CategoryDashboardPage();
	}
	
	public HomePage immLogoLink() {
		immLogoLink.click();
		return new HomePage();
	}
	
	public CollectionViewPage clickOnCollectionLink() {
		clickOnCollectionLink.click();
		return new CollectionViewPage();
	}
	
	public AddCollectionPopUpPage clickOnAddCollectionLink() {
		addCollectionLink.click();
		return new AddCollectionPopUpPage();
	}
	
	public CollectionViewPage clickoOnRecentCollectionLink(){
		clickOnRecentCollectionLink.click();
		return new CollectionViewPage();
	}
	public EditCollectionPopUpPage clickOnEditCollectionLink() {
		clickOnEditCollectionLink.click();
		return new EditCollectionPopUpPage();
	}
	
	public void clickOnDeleteCollectionLink() {
		clickOnDeleteCollectionLink.click();
	}
	
	public void clickOnExportCollectionLink() {
		clickOnExportCollectionLink.click();
	}
	
	
}
