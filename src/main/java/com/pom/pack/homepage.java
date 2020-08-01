package com.pom.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class homepage  extends TestBase{

	
	@FindBy(xpath="(//a[@class='nav-link dropdown-toggle'])[3]")
	WebElement electorincs;
	
	@FindBy(xpath="//a[@id='dropdown-heading-113']")
	WebElement  printer;
	
	
	public homepage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	public void homeaction() throws Exception {
		Actions action=new Actions(driver);
		action.moveToElement(electorincs).build().perform();
		printer.click();
		
	}
	
}
