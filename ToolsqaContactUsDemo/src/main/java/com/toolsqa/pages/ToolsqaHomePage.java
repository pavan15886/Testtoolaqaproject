package com.toolsqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toolsqa.util.SeleniumTestBase;

public class ToolsqaHomePage extends SeleniumTestBase {
	
	
	//Page Factory
	@FindBy(xpath="(//span[contains(text(),'ABOUT')])[1]")
	WebElement aboutLink;
	
	@FindBy(xpath="(//li/ul/li[2]//span[text()='Contact Us'])[1]")
	WebElement contactUsLink;
	
	//Initializing page objects
	public ToolsqaHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions: 
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	public ContactUsPage navigateToContactUsPage() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(aboutLink).build().perform();
		//Wait has been used for the element to be visible
		Thread.sleep(5000);
		contactUsLink.click();
		return new ContactUsPage();
	}

}
