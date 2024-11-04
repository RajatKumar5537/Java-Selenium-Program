package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivision_Popup {

	@Test
	public void handleHiddenDivision() {

//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.close();
	}
}
