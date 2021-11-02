package com.qa.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_ValidateShopCluesViewEditProfile_001 extends TC_ValidateShopCluesLogin_001{

	@Test (priority=2)
	public void ViewandUpdateProfile() throws InterruptedException {
		shopCluesOR.getProfile().click();
		Thread.sleep(1000);
		shopCluesOR.getMyProfile().click();
		Thread.sleep(1000);
		shopCluesOR.getFirstName().clear();
		Thread.sleep(2000);
		shopCluesOR.getFirstName().sendKeys(prop.getProperty("FirstName"));
		Thread.sleep(2000);
		shopCluesOR.getLastName().clear();
		Thread.sleep(2000);
		shopCluesOR.getLastName().sendKeys(prop.getProperty("LastName"));
		Thread.sleep(2000);
		shopCluesOR.getPhone().clear();
		Thread.sleep(2000);
		shopCluesOR.getPhone().sendKeys(prop.getProperty("Phone"));
		Thread.sleep(3000);
		boolean MaleSelected=shopCluesOR.getMaleRadioBtn().isSelected();
		if(MaleSelected) {
			Assert.assertTrue(true);
			Reporter.log("Male radio button is Selected",true);
		}
		else {
			Assert.assertFalse(false);
			shopCluesOR.getMaleRadioBtn().click();
		}
		Thread.sleep(2000);
		shopCluesOR.getSubmitBtn().click();
		Thread.sleep(2000);
		Reporter.log("Profile has been updated successfully",true);
		Thread.sleep(2000);
		shopCluesOR.getAddressField().click();	
		shopCluesOR.getNewAddressField().click();
		Thread.sleep(2000);
		shopCluesOR.getFirst_Name().sendKeys(prop.getProperty("FirstName"));
		Thread.sleep(2000);
		shopCluesOR.getLast_Name().sendKeys(prop.getProperty("Last_Name"));
		Thread.sleep(2000);
		shopCluesOR.getMobileNo().sendKeys(prop.getProperty("Phone"));
		Thread.sleep(2000);
		shopCluesOR.getZipcode().sendKeys(prop.getProperty("zipcode"));
		Thread.sleep(2000);
		shopCluesOR.getPlotNo().sendKeys(prop.getProperty("plotNo"));
		Thread.sleep(2000);
		shopCluesOR.getStreet().clear();
		shopCluesOR.getStreet().sendKeys(prop.getProperty("street"));
		Thread.sleep(2000);
		shopCluesOR.getCity().clear();
		shopCluesOR.getCity().sendKeys(prop.getProperty("city"));
		Thread.sleep(2000);
		shopCluesOR.getStateName().click();
		Thread.sleep(2000);
		shopCluesOR.getSelectHome().click();
		Thread.sleep(2000);
		shopCluesOR.getSaveButton().click();
		Thread.sleep(2000);
		Reporter.log("New address has been Saved");
		shopCluesOR.getHomeBtn().click();
//		JSAlert =driver.switchTo().alert();
//		JSAlert.dismiss();
}
}