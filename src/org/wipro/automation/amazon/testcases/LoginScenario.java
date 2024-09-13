package org.wipro.automation.amazon.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.amazon.basePkg.InitiateBrowser;
import org.wipro.automation.amazon.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_loginfunc_validcredential() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
		
		//because "this.driver" is null
	}
	
}
