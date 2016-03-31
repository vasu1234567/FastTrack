package com.testngtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {
    FirefoxDriver driver;
	@BeforeTest
	public void LaunchBrowser()
	{
	 driver=new FirefoxDriver();
		driver.get("Http://Google.com");
	}
	
	@Test
	public void link()
	{
		
		driver.manage().window().maximize();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}

}
