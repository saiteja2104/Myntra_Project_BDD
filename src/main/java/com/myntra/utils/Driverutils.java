package com.myntra.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driverutils {
	WebDriver driver;
	public Driverutils(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getwebelement(By prop) {
		return driver.findElement(prop);
		
	}
	public List<WebElement> getwebelements(By prop) {
		new WebDriverWait(driver,Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return  driver.findElements(prop);
		
	}
	public void mouse_hover(By prop) {
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		new Actions(driver).moveToElement(driver.findElement(prop)).build().perform();
	}
	public void click(By prop) {
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
	}

}
