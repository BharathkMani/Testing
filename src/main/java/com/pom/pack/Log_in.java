package com.pom.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class Log_in extends TestBase
{

	@FindBy(xpath="(//a[@class='menubar-link'])[3]")
	WebElement log;  //WebElement has been stored
	
	@FindBy(xpath="//input[@id='Email']")
    WebElement email;
	
	@FindBy(xpath="//input[@class='password form-control']")
	WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submit;

	public Log_in() throws Exception
	{
		PageFactory.initElements(driver, this); 
	}
	
	public void log(String user,String pass) throws Exception
	{
		log.click();
		email.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		
	}
	
}
