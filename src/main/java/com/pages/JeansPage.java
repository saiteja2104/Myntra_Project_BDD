package com.pages;

import org.openqa.selenium.WebDriver;

import com.myntra.objectrepository.JeansPageProp;
import com.myntra.objectrepository.LandingPageProp;
import com.myntra.utils.Driverutils;

public class JeansPage extends Driverutils implements LandingPageProp {
	WebDriver driver;
	public JeansPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	public void getjeansimgs() {
		int jeans= getwebelements(Jeans_imgs).size();
		 System.out.println(jeans);

}
	public void closebrowser() {
		driver.quit();
		
	}

}
