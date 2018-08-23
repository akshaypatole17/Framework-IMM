package com.imm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath="/html/body/imm-root/imm-login/div/form/button")
	WebElement loginBtn;
	
	@FindBy(xpath="/html/body/imm-root/imm-login/div/imm-brand/div/h1")
	WebElement immLogo;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateImmImage() {
		return immLogo.isDisplayed();
	}
	
	public HomePage Login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}

}
