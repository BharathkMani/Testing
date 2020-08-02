package Com.qa.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.pack.Cart;
import com.pom.pack.Log_in;
import com.pom.pack.Printer;
import com.pom.pack.homepage;

import BaseClass.TestBase;

public class CartTest extends TestBase{
	Log_in lo;
	homepage home;
	Printer print;
	Cart ca;
	public CartTest() throws Exception {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		lo=new Log_in();
		lo.log(prop.getProperty("username"), prop.getProperty("password"));
		home=new homepage();
		home.homeaction();
		print=new Printer();
		ca=new Cart();
	}
	
	@Test
	public void cartTest() {
		ca.main();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
