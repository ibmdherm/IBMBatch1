package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepRegistrationJanBasking {
	
	WebDriver  driver;
	
	@Given("Jan Basking Registraion page")
	public void jan_Basking_Registraion_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Training Software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
       driver.get("https://www.janbasktraining.com/register");
	    
	}

	@When("Name bar is visible")
	public void name_bar_is_visible() {
		System.out.println(driver.findElement(By.id("registeration_form")).isDisplayed());
	    	}

	@Then("enter text Dharmesh")
	public void enter_text_Dharmesh() {
	    
		driver.findElement(By.id("req_name")).sendKeys("Dharmesh");
	}

	@Then("enter mobile number")
	public void enter_mobile_number() {
		driver.findElement(By.name("reg_mobile")).sendKeys("8874041953");
		
	}

	@Then("select dropdown java")
	public void select_dropdown_java() {
		driver.findElement(By.name("reg_course")).sendKeys("Java");
	}

	@Then("enter email")
	public void enter_email() {
		driver.findElement(By.name("req_email")).sendKeys("abc@gmail.com");
	}

	@Then("re enter email")
	public void re_enter_email() {
		driver.findElement(By.name("reg_con_email")).sendKeys("abc@gmail.com");
	}

	@Then("enter password")
	public void enter_password() {
		driver.findElement(By.name("reg_password")).sendKeys("Password@123");
	}
	
	@Then("reenter password")
	public void reenter_password() {
		driver.findElement(By.name("reg_con_password")).sendKeys("Password@123");
	}


	@Then("Agreee checkbox Yes")
	public void agreee_checkbox_Yes() {
		driver.findElement(By.name("reg_tandc")).sendKeys("Y");
	}

	@Then("click on signup button")
	public void click_on_signup_button() {
		driver.findElement(By.name("req_name")).sendKeys("Dharmesh");
	}

}
