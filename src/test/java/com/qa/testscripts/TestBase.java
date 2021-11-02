package com.qa.testscripts;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
//import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import com.qa.pages.ShopCluesPages;

public class TestBase{
	  // These are test fixtures. These may run before/after test
	
	  //setup is a pre-condition
	
	  //tearDown is a post-condition
	
	  WebDriver driver;
	  ShopCluesPages shopCluesOR;
	  SoftAssert sAssert=new SoftAssert();
	  FileInputStream fileLoc;
	  Properties prop;
	  Alert JSAlert;
	  
	  @Parameters({"browser","url"})
	  @BeforeClass
      public void setup(String browser, String url) throws IOException {
		  
		  fileLoc=new FileInputStream("C:\\Users\\karth\\eclipse-workspace\\ShopClues\\src\\test\\java\\com\\qa\\testdata\\Credentials.properties");
		  prop=new Properties();
		  prop.load(fileLoc);	  
    	  if(browser.equalsIgnoreCase("chrome")) {
  			System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\ShopClues\\Drivers\\chromedriver.exe");
  			driver=new ChromeDriver();
  		}
  		else if(browser.equalsIgnoreCase("edge")) {
  			System.setProperty("webdriver.edge.driver","C:\\Users\\karth\\Selenium Drivers\\msedgedriver.exe");
  			driver=new EdgeDriver();
  		}
  		else if(browser.equalsIgnoreCase("firefox")) {
  			System.setProperty("webdriver.gecko.driver","C:\\Users\\karth\\Selenium Drivers\\geckodriver.exe");
  			driver=new FirefoxDriver();
  		}
  		else if(browser.equalsIgnoreCase("ie")) {
  			System.setProperty("webdriver.ie.driver","C:\\Users\\karth\\Selenium Drivers\\IEDriverServer.exe");
  			driver=new InternetExplorerDriver();
  		}
  		driver.manage().window().maximize();
  		driver.get(url);
  		
  		
  		shopCluesOR=new ShopCluesPages(driver);
      }
      @AfterClass
      public void tearDown() {
    	  driver.quit();
      }
      
      public void captureScreenShot(WebDriver driver, String tName) throws IOException { //tName= test name
    	  TakesScreenshot ts=(TakesScreenshot)driver;
    	  File Source=ts.getScreenshotAs(OutputType.FILE);
    	  File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
    	  FileUtils.copyFile(Source, target);
    	  Reporter.log("Screenshot captured successfully");
      }
      
}
