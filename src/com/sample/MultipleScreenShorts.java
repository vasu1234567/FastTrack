package com.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class MultipleScreenShorts {
	public static void main(String[] args) throws IOException {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("FastTrack");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.newtours.demoaut.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			if (!links.get(i).getText().isEmpty()) 
			{
				String linkName=links.get(i).getText();
				links.get(i).click();
				File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile,new File("C:\\Users\\loadrunner\\Desktop\\"+linkName+".png"));
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}
			
		}
		
	}

}
