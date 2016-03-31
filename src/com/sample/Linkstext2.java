package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkstext2 {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i <links.size(); i++) 
		{
		if (!links.get(i).getText().isEmpty()) 
		{
			System.out.println(links.get(i).getText());
		}	
		}
	}
	
}
