package com.sample;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating profile object
		ProfilesIni pr=new ProfilesIni();
		//creating firefox profile object and initialise with the Profile object
		FirefoxProfile fp=pr.getProfile("FastTrack");
		//Launching Browser with Customised browser(Created Profile Browser)
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("Http://Google.com");

	}

}
