package org.wipro.automation.amazon.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.amazon.basePkg.InitiateBrowser;
import org.wipro.automation.amazon.datagenerators.TestDataGenerator;
import org.wipro.automation.amazon.pages.LoginPage;

public class LoginScenario_ddf extends InitiateBrowser
{

	@Test(dataProvider="ddfdata",dataProviderClass=TestDataGenerator.class)
	public void tc01_loginfunc_validcredential(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		
	}
	
	
	
}
