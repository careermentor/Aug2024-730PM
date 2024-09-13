package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchData 
{
	
	
	@Test
	public void tc01_loginpage()
	{
		
		WebDriver driver = new ChromeDriver();
		
		//Step1
		String expURL = "https://www.facebook.com/";
		
		driver.navigate().to(expURL);
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertEquals(actURL, expURL,"this 2 values are not same");  //hard assertion
		SoftAssert sa = new SoftAssert();
		//sa.assertEquals(actURL, expURL);
		
		System.out.println("This test case is going to be failed");
		//Step2
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		sa.assertEquals(actTitle, ExpTitle);
		
		String Exp_username_tbox = "Email address or phone number";
		String Act_username_tbox = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(Act_username_tbox);

		sa.assertEquals(Act_username_tbox, Exp_username_tbox);
		
		String Exp_login = "Log in";
		String Act_login = driver.findElement(By.name("login")).getText();
		System.out.println(Act_login);
		
		sa.assertEquals(Act_login, Exp_login);
		
		Point actloc_login = driver.findElement(By.name("login")).getLocation();
		System.out.println(actloc_login);
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		
		sa.assertAll();
		
		
		
	}
		
}