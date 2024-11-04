package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handle {

	@Test
	public static void printAllTitle() {
//		System.setProperty("webdriver.chorme.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//button[@id='login-google-button']")).click();
		Set<String> allWindow = driver.getWindowHandles();
		
		for (String window : allWindow) 
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println("The window title is : " + title);
		}

		driver.quit();
	}
}
