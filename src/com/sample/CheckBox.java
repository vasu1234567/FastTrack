package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement check=driver.findElement(By.id("persist_box"));
		
		check.click();
		Thread.sleep(8000);
		System.out.println(check.getAttribute("checked"));
		if (check.isSelected()) 
		{
		check.click();	
		System.out.println(check.getAttribute("checked"));
		}

	}

}
