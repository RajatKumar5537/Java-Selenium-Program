package Selenium;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_Popup {

	@Test
	public void fileUploadPopup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("");

		File file = new File("./TestData/Jiviews Team.jpg");
		String absolutePath = file.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutePath);

		driver.close();
	}
}
