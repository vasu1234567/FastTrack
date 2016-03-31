package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	
	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	//driver.findElement(By.className("gb_P")).click();
	driver.findElement(By.linkText("Gmail")).click();
	
	

	}

}
