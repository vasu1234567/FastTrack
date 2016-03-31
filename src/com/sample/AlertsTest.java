package com.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='matchStartPlace']")).sendKeys("BANGALORE");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[8]/a/font")).click();
	
		Alert all=driver.switchTo().alert();
		
		System.out.println(all.getText());
		all.accept();
		
		//all.dismiss();
		
	}

}
