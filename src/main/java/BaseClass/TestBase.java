
package BaseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws Exception 
	{
		prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\M. Prasanth\\Desktop\\bharath"
					+ "\\eclipse works\\New_Maven\\src\\main\\java\\Confiq\\data.properties");
			// path of property file where the login credentials are stored
			prop.load(ip);	
	}
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M. Prasanth\\Desktop\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();//Initializing the chrome driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(prop.getProperty("url"));// Fetching the url from Property file
	}
	
}
