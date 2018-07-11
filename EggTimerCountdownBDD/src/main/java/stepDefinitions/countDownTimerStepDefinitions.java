package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class countDownTimerStepDefinitions {
	
	WebDriver driver;
	
	@Given("^user is already on Countdown Timer Page$")
	public void user_is_already_on_Countdown_Timer_Page(){
		System.setProperty("webdriver.chrome.driver","C:/Softwares/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.e.ggtimer.com/");
	    
	}

	@When("^title of login page is E\\.gg Timer$")
	public void title_of_login_page_is_E_gg_Timer(){
		String title = driver.getTitle();
		System.out.println("Tile:Login Page"+title);
		Assert.assertEquals("E.gg Timer - a simple countdown timer",title);
	    
	}

	@Then("^user enters \"([^\"]*)\"$")
	public void user_enters(String timeInSeconds) {
		driver.findElement(By.name("start_a_timer")).clear();
		driver.findElement(By.name("start_a_timer")).sendKeys(timeInSeconds);	    
	}

	@Then("^user clicks on Go button$")
	public void user_clicks_on_Go_button() throws Throwable {
		WebElement loginBtn =   driver.findElement(By.id("timergo"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginBtn);
		Integer counter=0, prevSecondsValue =0;
		
		
		do
		{
			Thread.sleep(1000);
			int currentSecondsValue= Integer.parseInt(driver.findElement(By.id("progressText")).getText().split(" ")[0]);
			 System.out.println("currentSecondsValue"+currentSecondsValue);
			 counter++;
			 if((counter>1)&&currentSecondsValue<prevSecondsValue)
		{
				 prevSecondsValue= currentSecondsValue;
				 System.out.println("Counter is decrementing");
		}
			 else if(currentSecondsValue>prevSecondsValue){
				 
				 prevSecondsValue= currentSecondsValue;
				 
			 }
		}while(prevSecondsValue>1);
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	   
	}

}
