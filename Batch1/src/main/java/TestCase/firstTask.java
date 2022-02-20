package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Training Software\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://www.google.com");
	}

}
