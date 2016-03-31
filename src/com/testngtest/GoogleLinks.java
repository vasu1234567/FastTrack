package com.testngtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleLinks {
	@Test
	public void link()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
	}

}
