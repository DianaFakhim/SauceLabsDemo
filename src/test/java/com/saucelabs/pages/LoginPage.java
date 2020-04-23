package com.saucelabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelabs.base.BaseClass;

public class LoginPage {
	
	@FindBy(id="user-name")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//h3[@data-test='error']")
	public WebElement errorMsg;
	
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	


}
