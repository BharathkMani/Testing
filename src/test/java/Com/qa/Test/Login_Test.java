package Com.qa.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.pack.Log_in;

import BaseClass.TestBase;

public class Login_Test extends TestBase {
    Log_in lo;
	
	public Login_Test() throws Exception {
		super();   // Super keyword is used to call the Constructor of the base class
	}
	@BeforeMethod
	public void setup()
	{
		initialization();   // Initializing method in the base class has been called
		try {
			lo=new Log_in();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void test() throws Exception {
		lo.log(prop.getProperty("username"), prop.getProperty("password"));// Fetching the values from property file
		
		
	}
	@AfterMethod()
     public void Teardown() throws Exception {
	   driver.quit();
		}
		
	
}
