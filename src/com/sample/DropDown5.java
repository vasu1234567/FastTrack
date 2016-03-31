package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown5 {

	
	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
	
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement counrty=driver.findElement(By.name("country"));
		List<WebElement> countryList=counrty.findElements(By.tagName("option"));
		System.out.println(countryList.size());
		for (int i = 0; i < countryList.size(); i++) 
		{
			countryList.get(i).click();
			if (countryList.get(i).isSelected()) 
			{
				System.out.println(countryList.get(i).getText()+"Is Active");
			}else
			{
				System.out.println(countryList.get(i).getText()+"Is InActive");
			}
		}
	}

}
