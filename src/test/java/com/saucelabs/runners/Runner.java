package com.saucelabs.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/resources/features",
		glue="com/saucelabs/steps",
		dryRun=false,
		monochrome=true,
		tags=("@login"),
		plugin= {"pretty","html:target/html/cucumber-default-reports","json:target/cucumber.json"}
		)

public class Runner {
	
			

	
}
