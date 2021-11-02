package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_ValidateShopCluesFilters extends TestBase {
	@Test(dataProvider = "getData")
	public void Fliter(String item) throws InterruptedException {
		
		shopCluesOR.getSearchTextField1().clear();
		shopCluesOR.getSearchTextField1().sendKeys(item);
		
		Thread.sleep(3000);
		List<WebElement> suggestions = shopCluesOR.getSuggestion();

		Reporter.log("Suggestions are : ",true);
		for (WebElement items : suggestions)
		{
			Reporter.log(items.getText(), true);
		}
		
		shopCluesOR.getSearchBtn1().click();
		Thread.sleep(5000);
		shopCluesOR.getsurety().click();
		Thread.sleep(5000);	
		shopCluesOR.getCombo().click();
		Thread.sleep(5000);
		String currentURL=driver.getCurrentUrl();
		Reporter.log(currentURL,true);
		Thread.sleep(2000);
		
		if((currentURL.contains("surety"))&&(currentURL.contains("combo")))
		{
			Reporter.log("The url contains the filters",true);
			sAssert.assertTrue(true);
		}
		else
		{
			Reporter.log("The url does not contains the filters",true);
			sAssert.assertTrue(false);
		}
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