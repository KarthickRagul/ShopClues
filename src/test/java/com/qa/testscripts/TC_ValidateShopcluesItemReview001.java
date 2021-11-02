package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_ValidateShopcluesItemReview001 extends TC_ValidateShopCluesSearchAndAddtoCart{

	@Test(priority=5)
	public void ShopCluesReviewItem() throws InterruptedException {	
		shopCluesOR.getCart().click();
		Thread.sleep(3000);
		Assert.assertEquals("https://secure.shopclues.com/atom/acart/getcart",driver.getCurrentUrl());
		Reporter.log("In cart ",true);
		shopCluesOR.getPlaceOrder().click();
		Thread.sleep(2000);
		Assert.assertEquals("https://secure.shopclues.com/atom/summary", driver.getCurrentUrl());
		Reporter.log(shopCluesOR.getTotalItem().getText(),true);
		Reporter.log("In PlaceOrder Page",true);
		Reporter.log("Items in card: ",true);
		List<WebElement> allItem=shopCluesOR.getItems();
		for(WebElement item:allItem) {
			Reporter.log(item.getText(),true);
		}		
		shopCluesOR.getChangeAddress().click();
		Thread.sleep(2000);
		shopCluesOR.getContinueBtn().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", shopCluesOR.getProceedToPayBtn());
		shopCluesOR.getProceedToPayBtn().click();
		driver.get("https://www.shopclues.com/");
	}
}
