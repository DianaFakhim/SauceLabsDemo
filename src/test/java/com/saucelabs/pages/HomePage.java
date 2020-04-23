package com.saucelabs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucelabs.base.BaseClass;

public class HomePage {

	@FindBy(xpath="//div[@class='product_label']")
	public WebElement productsLabel;
	
	@FindBy(xpath="//div[@class='bm-burger-button']")
	public WebElement menuBtn;
	
	
	
	public HomePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
