package Com.qa.Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.pack.Address;
import com.pom.pack.Log_in;
import com.pom.pack.Printer;
import com.pom.pack.homepage;


import BaseClass.TestBase;
import Utilities.Utility;

public class Addresstest extends TestBase{
	Log_in lo;
	homepage home;
	Printer print;
	Address addres;
	
	public Addresstest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		lo=new Log_in();
		lo.log(prop.getProperty("username"), prop.getProperty("password"));
		home=new homepage();
		home.homeaction();
		addres=new Address();
	
	}
	@DataProvider
	public Object[][] getData() throws Exception
	{
		Object[][] data=Utility.Drivendata();
		return data;
	}
	
	@Test(dataProvider="getData")
	public void addtest(String comname,String finame,String lasname,String addr1,String addr2,String cit,String pincod,String cont1,String mail,String pnum) throws Exception {
		addres.address(comname, finame, lasname, addr1, addr2, cit, pincod,cont1, mail, pnum);
	}
	@AfterMethod
	public void teardown() throws Exception {
	   driver.quit();
	}
	
}
