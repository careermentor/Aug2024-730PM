package org.wipro.automation.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.amazon.utilitiesPkg.ReadPropFile;

public class SignupPage
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("login_createnewaccount_xpath"))).click();
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_firstname_textbox_name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_lastname_textbox_name"))).sendKeys(lname);
	}
	
	public void select_dob_day(String dob_d) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFile.readelement("signup_birthday_day_name"))));
		dob_day.selectByVisibleText(dob_d);
	}
	public void click_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("signup_male_xpath"))).click();
	}
	
	
	public void click_signbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_signupbuttn_name"))).click();
	}
}

