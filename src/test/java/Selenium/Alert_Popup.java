package Selenium;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Popup {

	@Test
	public void handleAlertPopup() {

//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert action = driver.switchTo().alert();
		String text = action.getText();
		action.accept();
		System.out.println(text);
		driver.close();
	}
}
