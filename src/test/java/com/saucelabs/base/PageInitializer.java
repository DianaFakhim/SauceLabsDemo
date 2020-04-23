package com.saucelabs.base;

import com.saucelabs.pages.HomePage;
import com.saucelabs.pages.LoginPage;

public class PageInitializer extends BaseClass{
	
public static LoginPage loginPage ;
public static HomePage homePage;


public static void initializeAllPages() {
	loginPage =new LoginPage();
	homePage = new HomePage();
}

}
