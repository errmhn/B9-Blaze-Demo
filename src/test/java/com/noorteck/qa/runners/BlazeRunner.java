package com.noorteck.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//1
@RunWith (Cucumber.class)

//2
@CucumberOptions(
		features = "src/test/resources/ntk/Blaze.feature",
		glue = "com.noorteck.qa.steps",
		tags= "@blaze",
		plugin= {"pretty", "html:target/cucumber-report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome= true
				)

public class BlazeRunner {

}
