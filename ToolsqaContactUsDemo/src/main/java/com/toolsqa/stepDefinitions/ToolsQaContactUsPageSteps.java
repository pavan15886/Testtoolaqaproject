package com.toolsqa.stepDefinitions;

import com.toolsqa.pages.ContactUsPage;
import com.toolsqa.pages.ToolsqaHomePage;
import com.toolsqa.util.SeleniumTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ToolsQaContactUsPageSteps extends SeleniumTestBase  {
		ToolsqaHomePage homePage;
		ContactUsPage contactusPage;
	
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		SeleniumTestBase.initialization();
	   
	}

	@Then("^validate Toolsqa home page title$")
	public void validate_Toolsqa_home_page_title() throws Throwable {
		homePage = new ToolsqaHomePage();
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals("QA Automation Tools Tutorial", title);
	   
	}

	@Then("^user clicks on About link$")
	public void user_clicks_on_About_link() throws Throwable {
		homePage.navigateToContactUsPage();
		
	    
	}

	@Then("^validate Contact Us page title$")
	public void validate_Contact_Us_page_title() throws Throwable {
		
		//Wait has been used in order to change the title
		Thread.sleep(5000);
		String title =  driver.getTitle();
		Assert.assertEquals("Contact US ToolsQA | Lakshay Sharma", title);
	   
	}

	@Then("^user enters the details in Contact Us Page$")
	public void user_enters_the_details_in_Contact_Us_Page() throws Throwable {
		contactusPage = new ContactUsPage();
		contactusPage.ContactInfo(prop.getProperty("name"), prop.getProperty("email"), prop.getProperty("message"), prop.getProperty("feedback"));
	 }

	@Then("^Close the browser$")
	public void close_the_browser(){
		driver.quit();
	}
}
