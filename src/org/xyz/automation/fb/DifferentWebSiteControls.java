package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DifferentWebSiteControls 
{
	WebDriver driver;
	
	@Test
	public void differentbrowsercontrols() throws Exception
	{
		
		driver = new ChromeDriver();
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.name("fld_username")).sendKeys("Selenium");
		
		driver.findElement(By.id("datepicker")).sendKeys("08/21/1982");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='21']")).click();
		
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		boolean beforecheck = driver.findElement(By.name("terms")).isSelected();
		System.out.println(beforecheck);
		
		Assert.assertEquals(beforecheck, false);
		
		driver.findElement(By.name("terms")).click();
		
		boolean aftercheck = driver.findElement(By.name("terms")).isSelected();
		System.out.println(aftercheck);
		
		Assert.assertEquals(aftercheck, true);
		
		driver.findElement(By.className("displayPopup")).click();
		driver.findElement(By.className("close")).click();
		
		WebElement genelement = driver.findElement(By.name("sex"));
		
		Select gen = new Select(genelement);
	//	gen.selectByIndex(1);  //Male
		//gen.selectByValue("2"); //Female
		gen.selectByVisibleText("Male");
		
		//gen.deselectAll();
		//gen.deselectByIndex(2);
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Hawaii"));
		st.selectByVisibleText("Florida");
		
		boolean signupenabled = driver.findElement(By.cssSelector("[value='Sign up']")).isEnabled();
		System.out.println(signupenabled);
		
		
	}
		
}