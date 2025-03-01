package com.myntra.Steps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.pages.Landingpage;

import basepage.MyntraTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BasePageStep {
	MyntraTestBase basepage;
	Steps steps;
	public BasePageStep(Steps steps) {
		this.steps=steps;
		MyntraTestBase pagebase=new MyntraTestBase();
		steps.testbase=pagebase;
	}
	@Given("user launch browser")
	public void launch_browser() throws MalformedURLException {
		steps.testbase.driverinitializer();
	}
	
	@When("user enter url")
	public void enter_url() {
		Landingpage lpage=steps.testbase.geturl();
		steps.landingpage=lpage;
	}

}
