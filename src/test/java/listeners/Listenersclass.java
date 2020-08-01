package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClass.TestBase;

public class Listenersclass extends TestBase implements ITestListener {

	

	public Listenersclass() throws Exception {
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test success");
	}

	public void onTestFailure(ITestResult result) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\M. Prasanth\\Desktop\\bharath\\eclipse works\\New_Maven\\Screenshots\\"+result.getClass().getName()+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	   
	System.out.println("Test case failed");
	
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
	System.out.println("Program Started");
		
	}

	public void onFinish(ITestContext context) {
	System.out.println("Program Ended");
		
	}

}
