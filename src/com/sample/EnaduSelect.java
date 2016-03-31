package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EnaduSelect {

	
	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://eenadu.net/");
	driver.manage().window().maximize();
	
	WebElement dstr=driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[3]/div[1]/select"));
	
	Select distric=new Select(dstr);
	//distric.selectByVisibleText("Kadapa");
	//distric.selectByValue("district/main.aspx?dsname=Eastgodavari");
	distric.selectByIndex(5);
	
	

	}

}
