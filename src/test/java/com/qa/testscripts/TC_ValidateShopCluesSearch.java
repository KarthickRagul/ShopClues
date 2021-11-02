package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_ValidateShopCluesSearch extends TestBase {
	
	@Test(dataProvider="getData")
	
	public void ValidateSearchItem(String SearchTxt) throws InterruptedException {
		shopCluesOR.getSearchTextField().click();
		Thread.sleep(2000);
		shopCluesOR.getSearchTextField().clear();
		shopCluesOR.getSearchTextField().sendKeys(SearchTxt);
		shopCluesOR.getSearchBtn().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		boolean contains=url.contains(SearchTxt);
		sAssert.assertTrue(contains);
		Reporter.log("Title loaded is correct",true);
		List<WebElement> allItem=shopCluesOR.getAllItem();
		for(WebElement item:allItem) {
			Reporter.log(item.getText(),true);
		}
		
		if(allItem.size()==1) {
			Reporter.log("No item found",true);
			return;
		}
		else
			Reporter.log("Total item:"+ allItem.size());
	}
	@DataProvider
	public String[][] getData() throws IOException{
		String xFile="C:\\Users\\karth\\eclipse-workspace\\ShopClues\\src\\test\\java\\com\\qa\\testdata\\TestDataSearch.xlsx";
		String xSheet="Sheet1";
		int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String data[][]=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
			data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;

}
}