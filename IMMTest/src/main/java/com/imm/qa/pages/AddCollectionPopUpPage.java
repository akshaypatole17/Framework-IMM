package com.imm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.imm.qa.base.TestBase;

public class AddCollectionPopUpPage extends TestBase {
	
	@FindBy(css="body > imm-root > imm-product-collections > div > div > div.imm-pc-container__content__aside > imm-product-collection-browser > div > imm-add-collection-button > imm-add-collection-form > imm-modal > div > div > div > div.modal-header > h4 > div > div")
	WebElement AddCollectionLabel;

	@FindBy(xpath="//*[@id=\"collectionName\"]")
	WebElement AddCollectionName;
	
	public String validateAddCollectionTitle() {
		return driver.getTitle();
	}
	
	public void enterCollectionName() {
		AddCollectionName.click();
		AddCollectionName.sendKeys("Collection1");
	}
	
	
	
	
	
	
	
}
