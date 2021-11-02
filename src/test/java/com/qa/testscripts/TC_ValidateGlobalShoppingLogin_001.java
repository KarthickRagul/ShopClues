package com.qa.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_ValidateGlobalShoppingLogin_001 extends TestBase{

	@Test(priority=1)
	public void goToGlobalShopping() throws InterruptedException
	{
		Thread.sleep(5000);
		shopCluesOR.getGlobalShoppingLink().click();
		Reporter.log("Navigating to Global Shopping",true);
	}
	
	@Test(priority=2)
	public void goToLoginPage()
	{
		driver.switchTo().window(shopCluesOR.getWindowHandles().get(1));
		shopCluesOR.getCreateAccountLink().click();
	}
	
	@Test(priority=3)
	public void login() throws InterruptedException
	{
		Reporter.log("Navigating to Login",true);
		shopCluesOR.getLoginPopUpBtn().click();
		
		driver.switchTo().window(shopCluesOR.getWindowHandles().get(2));
		
		shopCluesOR.getUsernameField().sendKeys(prop.getProperty("UserEmail"));
		shopCluesOR.getPasswordField().sendKeys(prop.getProperty("UserPassword"));
		shopCluesOR.getLoginBtn().click();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(shopCluesOR.getWindowHandles().size(), 2);
		Reporter.log("Login Successful",true);
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4)
	public void logOut()
	{
		driver.switchTo().window(shopCluesOR.getWindowHandles().get(1));
		shopCluesOR.getSignOutLink().click();
		Reporter.log("Logging out",true);
	}
	
}
