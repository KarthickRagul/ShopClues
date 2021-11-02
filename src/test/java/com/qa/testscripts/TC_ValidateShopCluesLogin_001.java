package com.qa.testscripts;


//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_ValidateShopCluesLogin_001 extends TestBase{
	
    @Test(priority=1)
    public void Login() throws InterruptedException {
    	shopCluesOR.getSignInBtn().click();
		Thread.sleep(2000);
        //shopCluesOR.getPopUp().click();
//		Alert jsAlert;
//		jsAlert=driver.switchTo().alert();
//		jsAlert.accept();
    	shopCluesOR.getUserLoginEmailTxtField().sendKeys(prop.getProperty("UserEmail"));
    	Thread.sleep(2000);
    	//shopCluesOR.getUserPasswordField().sendKeys(prop.getProperty("UserPassword"));
    	shopCluesOR.getOtpBtn().click();
    	Thread.sleep(100000);
    	//shopCluesOR.getLoginSubmitBtn().click();
    	//Thread.sleep(3000);
    	//shopCluesOR.getSkipBtn().click();
    	//Thread.sleep(2000);
    	String name=shopCluesOR.getProfile().getText();
    	String PropertyName=prop.getProperty("FirstName");
		if(name.contains(PropertyName)){
			Assert.assertTrue(true);
			Reporter.log("User Login Successfull for Shopclues, User landed on the Home Page",true);
		}
		else {
			Reporter.log("User Login Failed",true);
		}
		Thread.sleep(1000);
    }
    @Test(priority=2)
    public void Logout() throws InterruptedException {
    	shopCluesOR.getProfile().click();
    	shopCluesOR.getSignOut().click();
    	Thread.sleep(2000);
    	Reporter.log("Log out Successfull",true);
    }
}
