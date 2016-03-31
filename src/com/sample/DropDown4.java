package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown4 {
	
public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("REGISTER")).click();
	WebElement counrty=driver.findElement(By.name("country"));
	List<WebElement> countryList=counrty.findElements(By.tagName("option"));
	System.out.println(countryList.size());
	for (int i = 0; i < countryList.size(); i++) 
	{
		System.out.println(countryList.get(i).getText());
	}
}
}
