package com.sample;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown2 {

	
	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http:/amazon.in");
		
		WebElement headerDrop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList=headerDrop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			System.out.println(dropList.get(i).getText());
		}
	}

}
