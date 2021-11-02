package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Reporting extends TestListenerAdapter{


	public ExtentHtmlReporter htmlReporter;
	public ExtentReports xReports;
	public ExtentTest xTest;
	// 1. Create a new HTML report in a specified format that can be stored into a specific project location
	// 2. Add the configurations on what to be represented on the report
	
	// Loc for configuring the extent report
	 // 1. Format : HTML
	// 2. New report to be generated after every new execution
	// 3. The report should be stored in the Report folder in the project structure
	
	  public void onStart(ITestContext testContext) {
	    // How should the html report style
		  String dateStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		  String repName="TestAutomation"+dateStamp+".html";
		  //Where and which style and name of the report
		  htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
		  htmlReporter.config().setAutoCreateRelativePathMedia(true);
		  htmlReporter.config().setDocumentTitle("Automation Test Reports");
		  htmlReporter.config().setReportName("Functional Test");
		  htmlReporter.config().setTheme(Theme.DARK);
		  xReports=new ExtentReports();
		  xReports.attachReporter(htmlReporter); //format of the report to be attached as extent report.
		  
		  
	  }

     // Once the test is completed, Loc to be executed
	  public void onFinish(ITestContext testContext) {
		  xReports.flush(); //Terminate the instance and capture the result
	  }
	  
	  
	// upon fetching the test results, if the test is passed
	 // method should read the test results of @Test methods executed and 
	  //when passed it makes an entry in the extent report with the testname
	  public void onTestSuccess(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.PASS, "Test is passed");
		  xTest.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	  }

	// upon fetching the test results, if the test is failed
	// method should read the test results of @Test methods executed and 
		  //when failed  it makes an entry in the extent report with the testname and takes screenshot
	  public void onTestFailure(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.FAIL, "Test is passed");
		  xTest.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		  xTest.log(Status.FAIL, tr.getThrowable());
		  
		  String ssPath=System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+".png";
		  File file=new File(ssPath);
		  if(file.exists()) {
			  try {
				xTest.fail("Screenshot of the failed test is : "+xTest.addScreenCaptureFromPath(ssPath));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		  }
	  }

	// upon fetching the test results, if the test is skipped
	// method should read the test results of @Test methods executed and 
	  //when skipped it makes an entry in the extent report and throwable msg for skip
	  public void onTestSkipped(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.SKIP, "Test is passed");
		  xTest.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.AMBER));
		  xTest.log(Status.SKIP, tr.getThrowable());
	  }
}
