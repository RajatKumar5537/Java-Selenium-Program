package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://secure.indeed.com/");
		d.findElement(By.id("apple-signin-button")).click();
		d.findElement(By.id("login-facebook-button")).click();
		String pwh = d.getWindowHandle();
		Set<String> allwh = d.getWindowHandles();
		for (String wh : allwh) {
			d.switchTo().window(wh);
			if (wh.equals(pwh)) {

			} else {
				d.close();
			}
		}
	}

}
