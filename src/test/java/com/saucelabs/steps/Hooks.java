package com.saucelabs.steps;



import com.saucelabs.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonMethods{



	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario " + scenario.getName());
		setUp();
		initializeAllPages();

	}

	@After
	public void end(Scenario scenario) {
		//this will generate  screenshots in json reports after each time
		//when test failed 
		if (scenario.isFailed()) {
			byte[] picture = CommonMethods.takeScreenShot("/failed/" + scenario.getName());
			scenario.embed(picture, "image/png");
		}else {
			byte[] picture = CommonMethods.takeScreenShot("/passed/" + scenario.getName());
			scenario.embed(picture, "image/png");
			
		}
		tearDown();
	}
}
