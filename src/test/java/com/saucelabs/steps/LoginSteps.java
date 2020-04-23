package com.saucelabs.steps;

import com.saucelabs.utils.CommonMethods;
import com.saucelabs.utils.FileReader;
import com.saucelabs.utils.VerificationPointsData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends CommonMethods{
	


	@Given("User enter valid username")
	public void user_enter_valid_username() {
	 sendText(loginPage.username,FileReader.getProperty("username"));
	}

	@When("User enter valid password")
	public void user_enter_valid_password() {
	   sendText(loginPage.password, FileReader.getProperty("password"));
	}

	@Then("User click on Login button")
	public void user_click_on_Login_button() {
	   click(loginPage.loginBtn);
	}

	@Then("Verify user logged in successfully")
	public void verify_user_logged_in_successfully() {
	   Assert.assertEquals(VerificationPointsData.homePageProductslabel, homePage.productsLabel.getText());
	   Assert.assertEquals(true, homePage.menuBtn.isEnabled());
	}


@Given("User enter username {string}")
public void user_enter_username(String username) {
   sendText(loginPage.username,username);
}

@When("User enter passwords {string}")
public void user_enter_passwords(String password) {
 sendText(loginPage.password,password) ;
}

@Then("I verify error message  {string}")
public void i_verify_error_message(String errorMsg) {
    Assert.assertEquals(errorMsg, loginPage.errorMsg.getText());
}

}
