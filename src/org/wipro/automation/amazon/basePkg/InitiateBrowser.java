package org.wipro.automation.amazon.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.amazon.utilitiesPkg.ReadPropFile;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropFile.readconfig("Browsername").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(ReadPropFile.readconfig("Browsername").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFile.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@AfterMethod
	public void closeBrowswr()
	{
		//driver.quit();
	}
	
}
