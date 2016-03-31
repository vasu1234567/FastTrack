package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinks {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		WebElement hearder=driver.findElement(By.id("sc_hdu"));
		List<WebElement> links=hearder.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
		}

	}

}
