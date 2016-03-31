package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	
	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://amazon.in");
	driver.manage().window().maximize();
	driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
	driver.findElement(By.className("nav-input")).click();

	}

}
