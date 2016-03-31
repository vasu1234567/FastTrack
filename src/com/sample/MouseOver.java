package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[1]/a/span[1]"));
		
		Actions mouse=new Actions(driver);
		
		mouse.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		
		
	}

}
