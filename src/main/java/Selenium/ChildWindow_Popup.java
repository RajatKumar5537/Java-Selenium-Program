package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow_Popup {

	@Test
	public void childWindowPopup() {
//		System.setProperty("webdriver.chorme.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://secure.indeed.com/");
		String window = driver.getWindowHandle();
		System.out.println(window);
		driver.close();
	}
}
