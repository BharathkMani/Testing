package com.pom.pack;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.TestBase;

public class Address extends TestBase {
	
	 @FindBy(xpath="(//div[@class='art-picture-block'])[1]")
	    WebElement prod1;
		
		@FindBy(xpath="//a[@class='btn btn-primary btn-lg btn-block btn-add-to-cart ajax-cart-link']")
		WebElement addtocart;
		
		@FindBy(xpath="//a[@class='btn btn-clear btn-block btn-action']")
		WebElement checkout;
	
	@FindBy(xpath="//input[@id='NewAddress_Company']")
	WebElement company;
	@FindBy(xpath="//input[@id='NewAddress_FirstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='NewAddress_LastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='NewAddress_Address1']")
	WebElement address1;
	@FindBy(xpath="//input[@id='NewAddress_Address2']")
	WebElement address2;
	@FindBy(xpath="//input[@id='NewAddress_City']")
	WebElement city;
	@FindBy(xpath="//input[@id='NewAddress_ZipPostalCode']")
	WebElement pincode;
	@FindBy(xpath="//select[@id='NewAddress_CountryId']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='NewAddress_Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='NewAddress_PhoneNumber']")
	WebElement phonenumber;
	
	
	public Address() throws Exception 
	{
	PageFactory.initElements(driver, this);
	}
	
	
	public void address(String cname,String fname,String lname,String add1,String add2,String city1,String pinc,String country1,String email1,String pnumber) throws InterruptedException
	{
		prod1.click();
		addtocart.click();
		checkout.click();
		company.sendKeys(cname);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		address1.sendKeys(add1);
		address2.sendKeys(add2);
		city.sendKeys(city1);
		pincode.sendKeys(pinc);
		Select s=new Select(country);
		s.selectByVisibleText(country1);
		email.sendKeys(email1);
		phonenumber.sendKeys(pnumber);
	}
	
	
	
}
