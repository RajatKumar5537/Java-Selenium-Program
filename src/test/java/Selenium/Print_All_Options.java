package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_All_Options {

	@Test
	public void printAllOption() {

//		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ebay.com/");

		WebElement allCategories = driver.findElement(By.xpath("//select[@id='gh-cat']"));

		Select select = new Select(allCategories);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println("Available category : "+text);
		}

		driver.close();

	}

}
