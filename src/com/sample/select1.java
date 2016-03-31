package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select1 {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		WebElement selectAmzon=driver.findElement(By.id("searchDropdownBox"));
		
		Select amazon=new Select(selectAmzon);
		amazon.selectByVisibleText("Jewellery");
		amazon.selectByValue("search-alias=gift-cards");
		amazon.selectByIndex(3);
	}

}
