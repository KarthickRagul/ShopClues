package com.qa.testscripts;

import java.io.IOException;


import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_ValidateShopCluesLocationField extends TestBase{
    
	@Test(dataProvider="getData")
	public void getLocationPinCode(String pincode) throws InterruptedException {
		Thread.sleep(2000);
		shopCluesOR.getLocationBtn().click();	
		Thread.sleep(3000);
		shopCluesOR.getPincodeTextBox().clear();
		if(pincode.length()==6) 
		{
		Reporter.log("Valid pincode",true);
		shopCluesOR.getPincodeTextBox().sendKeys(pincode);
		Thread.sleep(3000);
		shopCluesOR.getLocationSubmit().click();
		Thread.sleep(2000);
		if(shopCluesOR.getcPin().getText().equals(pincode)){
			sAssert.assertTrue(true);
			Reporter.log("Pincode added Succesfully",true);
		}
		else {
			sAssert.assertTrue(false);
			Reporter.log("Default pincode",true);
		}
		}
		else {
			sAssert.assertTrue(false);
			Reporter.log("Invalid pincode Entered",true);
			shopCluesOR.getCancel().click();
		}
	}
	@DataProvider
	public String[][] getData() throws IOException{
		String xFile="C:\\Users\\karth\\eclipse-workspace\\ShopClues\\src\\test\\java\\com\\qa\\testdata\\Pincodes.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data=new String[rowCount][cellCount];
		
		for(int row=1; row<=rowCount;row++) {
			for(int col=0; col<cellCount; col++) {
			data[row-1][col]=ExcelUtility.getCellData(xFile, xSheet, row, col);
			}
		}
		return data;
	}
}
