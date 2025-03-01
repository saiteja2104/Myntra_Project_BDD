package com.myntra.Steps;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.And;

public class LandingpageStep {
	Steps steps;
	public LandingpageStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("verify myntra logo")
	public void verify_url() {
		boolean flag=steps.landingpage.getmyntralogo();
		assertTrue(flag,"logo not displayed");
		
	}
}
