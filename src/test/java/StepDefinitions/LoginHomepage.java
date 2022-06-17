package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHomepage {
	
	WebDriver driver = null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws Throwable {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);
		
		
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("smTanmay");
		
	    driver.findElement(By.id("password")).sendKeys("12345");
	    Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws Throwable {
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws Throwable {
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	   
	}
	
	
}
	

		
	