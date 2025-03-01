package com.myntra.Steps;

import com.pages.JeansPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class JeansPageStep {
	Steps steps;
	public JeansPageStep(Steps steps) {
		this.steps=steps;
		JeansPage jeansPage = steps.landingpage.jeanspage();
        steps.jeanspage = jeansPage;
		
	}
	
	@Then("count imgages present in jeanspage")
	public void count() {
		steps.jeanspage.getjeansimgs();
	}
	@And("close the browser")
	public void quit() {
		 steps.jeanspage.closebrowser();
	}

}
