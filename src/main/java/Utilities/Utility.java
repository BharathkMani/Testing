package Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import BaseClass.TestBase;

public class Utility extends TestBase {

	public Utility() throws Exception
	{
	}

	public static void looping() throws Exception {
		File f=new File("C:\\Users\\M. Prasanth\\Desktop\\bharath\\eclipse works\\New_Maven\\src\\main\\java\\data\\Sathyaproj.xlsx");
		FileInputStream ip=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(ip);
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("(//div[@class='art-picture-block'])["+i+"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//li[@class='nav-item'])[3]")).click();
		    String title=driver.getTitle();
			XSSFSheet sheet=book.createSheet(title);
			WebElement element=driver.findElement(By.xpath("//table[@class='table pd-specs-table']"));
			List<WebElement> row=element.findElements(By.tagName("tr"));
			for(int j=0;j<row.size();j++) {
				
				List<WebElement> col=row.get(j).findElements(By.tagName("td"));
				sheet.createRow(j);
				for(int k=0;k<col.size();k++) {
					String value=col.get(k).getText();
					sheet.getRow(j).createCell(k).setCellValue(value);
				}	
			}
			driver.navigate().back();
			
		}
		FileOutputStream op=new FileOutputStream(f);
		book.write(op);
		op.close();
	
		
		
	}
	
	
	public static Object[][] Drivendata() throws Exception
	{
		
		FileInputStream ip=new FileInputStream("C:\\\\Users\\\\M. Prasanth\\\\Desktop\\\\bharath\\\\eclipse works\\\\New_Maven\\\\src\\\\main\\\\java\\\\data\\\\Sathyaproj.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(ip);
XSSFSheet sheet=wb.getSheetAt(0);
int rcount =sheet.getLastRowNum();
int ccount=sheet.getRow(0).getLastCellNum();
Object[][] data= new Object[rcount][ccount];
String value="";
DataFormatter df=new DataFormatter();
	for(int i=0;i<rcount;i++)
	{
		XSSFRow r=sheet.getRow(i+1);  
		for(int j=0;j<ccount;j++)
		{
			XSSFCell c=r.getCell(j);
			value=df.formatCellValue(c);
			data[i][j]=value;
		}
	}
	return data;     
}
	
	
}
