package com.myntra.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface LandingPageProp {
	By Myntra_Logo_Display=By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']");
	By Profile_logo= By.xpath("//div[@data-reactid='821']");
	By Login_And_Signin=By.xpath("//*[text()='login / Signup']");
	By Men_Btn=By.xpath("//a[text()='Men'][@data-group=\"men\"]");
	By Jeans_Btn=By.xpath("//*[text()='Jeans'][@data-reactid='64']");
	By Jeans_imgs=By.xpath("//img[@draggable='false'][@class='img-responsive']");
}
