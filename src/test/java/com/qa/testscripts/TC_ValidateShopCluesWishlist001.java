package com.qa.testscripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_ValidateShopCluesWishlist001 extends TC_ValidateShopCluesViewEditProfile_001{

	@Test(dataProvider = "getData", priority=3)
	public void wishlist(String item) throws InterruptedException {
		
		shopCluesOR.getSearchTextField().clear();
		shopCluesOR.getSearchTextField().sendKeys(item);

		Thread.sleep(3000);
		List<WebElement> suggested = shopCluesOR.getSugesstions();

		Reporter.log("Total no.of items suggested:" + suggested.size(), true);
		for (WebElement items : suggested)

		{
			Reporter.log(items.getText(), true);
		}
		Thread.sleep(3000);
		shopCluesOR.getSearchButton().click();
		Thread.sleep(2000);

		shopCluesOR.getFirstProduct().click();
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(4000);	
		shopCluesOR.getWishlist().click();	
		Thread.sleep(1000);
		Reporter.log(item+" is added to the wishlist", true);
		driver.close();
		driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(2000);
		
	}


	@DataProvider
	public String[][] getData() throws IOException {
		String xFile = "C:\\Users\\karth\\eclipse-workspace\\ShopClues\\src\\test\\java\\com\\qa\\testdata\\TestDatashopClues.xlsx";
		String xSheet = "Sheet1";
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);

		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++)

			{
				data[i - 1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);

			}
		}

		return data;
	}
}
