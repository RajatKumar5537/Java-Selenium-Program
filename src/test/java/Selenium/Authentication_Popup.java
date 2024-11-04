package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_Popup {

	@Test
	public static void authenticatioPopup() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.close();
	}
}
