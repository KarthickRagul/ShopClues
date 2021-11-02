package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_ValidateShopCluesHyperLinks extends TestBase{
    
	
	@Test(priority=1)
	public void getLinks() throws IOException, InterruptedException {
		Thread.sleep(5000);
		List<WebElement> Links=shopCluesOR.getLinks();
		Reporter.log("Total No.of Links Present : "+Links.size(),true);
		Reporter.log("Links are:");
		for(WebElement link:Links) {
			if(!link.getText().isEmpty()) {
				Reporter.log(link.getText(),true);
			}
		}
	}
	
}
