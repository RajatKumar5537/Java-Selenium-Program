package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Auto_Suggestion {

	@Test
	public static void printAutoSuggestion() {
//		System.setProperty("webdriver.chorme.driver", "./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java");

		// Optional dont write, if it require then write
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'java')]"))); // //ul[@role='listbox']//li

		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]")); // //ul[@role='listbox']//li//span

		for (WebElement suggestion : allSuggestion) {
			String text = suggestion.getText();
			System.out.println("Text is : " + text);
		}

		allSuggestion.get(0).click();
		driver.close();
	}
}
