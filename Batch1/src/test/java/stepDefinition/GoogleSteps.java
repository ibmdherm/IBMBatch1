package stepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {
	WebDriver  driver;
		@Given("^Google homepage$")
		public void google_homepage() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Training Software\\chromedriver_win32\\chromedriver.exe");
	            driver = new ChromeDriver();
	           driver.get("https://www.google.com");	 
		}

		@When("^search bar is visible$")
		public void search_bar_is_visible() throws Throwable {
			System.out.println(driver.findElement(By.name("q")).isDisplayed());
		    
		}

		@Then("^enter text dhermesh$")
		public void enter_text_dhermesh() throws Throwable {
			driver.findElement(By.name("q")).sendKeys("dhermesh");
		}
		
		@Then("enter text {string}")
		public void enter_text(String string) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.name("q")).sendKeys(string);
		}

	

}
