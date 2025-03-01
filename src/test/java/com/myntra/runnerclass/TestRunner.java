package com.myntra.runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature_files", 
				glue = {"com.myntra.Steps" }, 
				tags = "@Verifytitle", 
				plugin = { "json:target/cucumber-reports/CucumberTestReport.json",
						"pretty", "html:target/cucumber-reports/cucumber-pretty.html",
						"rerun:target/cucumber-reports/rerun.txt",

						"usage:target/cucumber-reports/usage.json",
						// "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunner extends AbstractTestNGCucumberTests{

}
