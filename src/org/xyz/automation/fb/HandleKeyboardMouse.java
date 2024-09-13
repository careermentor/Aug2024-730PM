package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKeyboardMouse 
{
	WebDriver driver;
	
	@Test
	public void handleAlerts() throws Exception
	{
		driver = new ChromeDriver();  //launch browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		
		CaptureScreenshot.printscreen(driver,"handleAlerts_1");
			
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.printscreen(driver,"handleAlerts_2");
	}
	
	
	@Test
	public void handleFrames() throws Exception
	{
		driver = new ChromeDriver();  //launch browser
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.printscreen(driver,"handleFrames");
	}
}