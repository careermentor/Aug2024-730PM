package org.wipro.automation.amazon.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.amazon.basePkg.InitiateBrowser;
import org.wipro.automation.amazon.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc05_signupfunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		sign.enter_lastname("Java");
		sign.select_dob_day("1");
		Thread.sleep(2000);
		sign.click_male();
		//driver.findElement(By.xpath("//label[text()='Custom']")).click();
		sign.click_signbttn();
	}
	
	@Test(enabled=false)
	public void tc06_signupfunc_existingemail() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Selenium");
		sign.enter_lastname("Java");
		sign.select_dob_day("1");
		sign.click_male();
		sign.click_signbttn();
	}
	
}
