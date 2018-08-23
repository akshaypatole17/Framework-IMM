package com.imm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imm.qa.base.TestBase;

public class CategoryDashboardPage extends TestBase{
	
	@FindBy(xpath="/html/body/imm-root/imm-categories/div/section/imm-collection-category-search-bar/div/div/div/span[2]/a/button")
	WebElement categoryDashboardLabel;
	
	@FindBy(xpath="/html/body/imm-root/imm-categories/div/div/imm-backlog-refresh-bucket/imm-bucket/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[3]/datatable-body-row/div[2]/datatable-body-cell[2]/div/imm-unspsc/a")
	WebElement clickOnCategory;
	
	public CategoryDashboardPage () {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCategoryDashboardLabel() {
		categoryDashboardLabel.click();
		return categoryDashboardLabel.isDisplayed();
	}
	
	/*public void selectContacts(String name) {
		driver.findElement(By.xpath(""));
	}*/
	
	public CategoryViewPage clickOnCategory() {
		categoryDashboardLabel.click();
		clickOnCategory.click();
		return new CategoryViewPage();
	}

}
