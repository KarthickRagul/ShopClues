package com.qa.testscripts;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_ValidateShopCluesSearchAndAddtoCart  extends TestBase {

	@Test(dataProvider="getData")
	public void Search(String item) throws InterruptedException
	{
		
		 
		shopCluesOR.getSearchTextField1().click();
		shopCluesOR.getSearchTextField1().clear();
		shopCluesOR.getSearchTextField1().click();
		
		Thread.sleep(3000);
		//Validation for trending search
		List<WebElement> trending=shopCluesOR.getTrendingSearch();
		
		int i=0;
		for(WebElement trend:trending)
		{
			
			if(trend.getText().contains("Trending Searches") )
			{
				i=1;
			}
			if(trend.getText().contains("Recent Searches") )
			{
				i=2;
			}
			
			Reporter.log(trend.getText(),true);
		}
		if(i==1)
		{

			sAssert.assertTrue(true);
			Reporter.log("Trending searches is displayed",true);
		}
		else if(i==2)
		{
			sAssert.assertTrue(true);
			Reporter.log("Trending searches along with Recent searches  is displayed",true);
		}
		else
		{
			sAssert.assertTrue(false);
			Reporter.log("Trending searches is not displayed",true);
		}
				
		shopCluesOR.getSearchTextField().sendKeys(item);
		
		//Validation for suggestions
		List<WebElement> suggestions=shopCluesOR.getSuggestions1();
		Thread.sleep(3000);
		int flag=0;
	    for(WebElement sug:suggestions)
	    {
	    	
	    	if(!(sug.getText().contains(item)))
	    	{
	    	      flag=1;
	    	}
	    	Reporter.log(sug.getText(),true);
	    }
        if(flag==0)
        {
        	sAssert.assertTrue(flag==0);
        	Reporter.log("Suggestions  matches with search item ",true);
        	
        }
        else
        {
        	sAssert.assertTrue(flag==0);
        	Reporter.log("Suggestions are not matching with search item",true);
        }
        
        //Validation for suggestion text to be automatically filled in search field after search is clicked
        
        String suggestText= shopCluesOR.getSuggestText().getText();
        Thread.sleep(1000);
        shopCluesOR.getSuggestText().click();
        Thread.sleep(2000); 
		WebElement searchTextField=shopCluesOR.getSearchTextField1();
		String searchFieldText=searchTextField.getAttribute("value");
        if(searchFieldText.equals(suggestText))
        {
        	sAssert.assertTrue(true);
        	Reporter.log("Search field is updated with the suggestion text successfully",true);
        }
        else
        {
        	sAssert.assertTrue(false);
        	Reporter.log("Search field is not updated with the suggestion text",true);
        }
        
		shopCluesOR.getSearchButton().click();
		Thread.sleep(2000);
		//Printing search Results
		List<WebElement> searchResults= shopCluesOR.getSearchResults();
		for(WebElement searchRes:searchResults)
		{
			Reporter.log(searchRes.getText(),true);
		}
		
	    //Adding the product to cart 
	     shopCluesOR.getProduct().click();
	 
	     driver.switchTo().window(shopCluesOR.getWindowHandles().get(1));
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		String productName=shopCluesOR.getProductName().getText();
		Thread.sleep(1000);
		shopCluesOR.getAddtoCart().click();	
		Thread.sleep(2000);
		//Validating the product add to cart
		shopCluesOR.getCart().click();
		Thread.sleep(2000);
		String cartProductName=shopCluesOR.getCartProductName().getText();
		if(cartProductName.equals(productName))
		{
			sAssert.assertEquals(productName,cartProductName);
		     Reporter.log("Correct Item Added to cart",true);
		}
		else
		{
		sAssert.assertEquals(productName,cartProductName);
		 Reporter.log("InCorrect Item Added to cart",true);
		}
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(shopCluesOR.getWindowHandles().get(0));
		Thread.sleep(3000);		
	}
	  @DataProvider
	  public String[] getData() throws IOException
	  {
		  String xFile="C:\\Users\\karth\\eclipse-workspace\\ShopClues\\src\\test\\java\\com\\qa\\testdata\\ShopCluesAddtoCart.xlsx";			 
			 String xSheet="Sheet1";
			 int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
			 //int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
			 String[] data=new String[rowCount];
		
			 for(int i=1;i<=rowCount;i++)
			 {
				
					 data[i-1]=ExcelUtility.getCellData(xFile, xSheet, i, 0);
				 
			 }
		
		  
		  return data;
	  }

}
