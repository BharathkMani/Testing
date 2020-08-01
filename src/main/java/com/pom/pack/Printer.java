package com.pom.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;
import Utilities.Utility;

public class Printer extends TestBase {
	
	
	@FindBy(xpath="//a[@class='nav-link active']")
	WebElement Feature;
	
   
	
	public Printer() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	public void products() throws Exception {
		
		Utility.looping();
		
		
	}
	
}
