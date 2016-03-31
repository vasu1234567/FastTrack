package com.sample;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[5]/a/span[1]"));
		WebElement click1=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[5]/ul/li[2]/ul/li[1]/ul/li[3]/a/span"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(ele).build().perform();
		Thread.sleep(5000);
		mouse.moveToElement(click1).click().build().perform();
		   
		

	}

}
