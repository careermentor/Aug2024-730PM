package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserControl 
{
	WebDriver driver;
	
	@Test
	public void differentbrowsercontrols() throws Exception
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//driver.close();  //close the current window
		driver.quit(); //close all the window
	}
		
}