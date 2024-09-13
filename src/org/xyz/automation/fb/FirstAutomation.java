package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new EdgeDriver();  //launch browser
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	

	@Test(enabled=false)
	public void login_functionality() throws Exception
	{
		
		
		driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user2@gmail.com");
		
		
		//driver.findElement(By.name("pass")).sendKeys("pass12234");
		//driver.findElement(By.name("login")).click();
		
	}
	
	@Test(enabled=true)
	public void signup_functionality() throws Exception 
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
	
		driver.findElement(By.name("reg_email__")).sendKeys("7996865");
		
		
		WebElement a = driver.findElement(By.name("websubmit"));
		a.click();
		
	
		
		
	}
	
}