package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.myntra.objectrepository.LandingPageProp;
import com.myntra.utils.Driverutils;

public class Landingpage extends Driverutils implements LandingPageProp {
public WebDriver driver;

	public Landingpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public boolean getmyntralogo() {
		return getwebelement(Myntra_Logo_Display).isDisplayed();
		
	}
	
//	public LoginPage clikloginbtn() {
//		mouse_hover(Profile_logo);
//		click(Login_And_Signin);
//		return new LoginPage(driver);
//		
//	}
	public JeansPage jeanspage() {
		mouse_hover(Men_Btn);
		click(Jeans_Btn);
		return new JeansPage(driver);
		
	}

}
