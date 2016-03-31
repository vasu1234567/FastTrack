package com.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ScreenShot {

	
	public static void main(String[] args) throws IOException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("FastTrack");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("Http://Google.com");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\loadrunner\\Desktop\\vasu.png"));


	}

}
