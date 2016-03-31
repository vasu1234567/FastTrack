package com.testngtest;

import org.testng.annotations.Test;

public class MultipleTestNg {
	
	
	@Test(priority=2,description="GmailLogin")
	public void Gmail()
	{
		System.out.println("Gmail Program");
		
	}
	@Test(priority=1,enabled=false)
	public void Yahoo()
	{
		System.out.println("Yahoo Program");
	}

	@Test(priority=3,enabled=false)
	public void Face()
	{
		System.out.println("Face Program");
	}

	
}
