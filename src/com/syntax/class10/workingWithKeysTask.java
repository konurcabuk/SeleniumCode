package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithKeysTask {

	public static String url = "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		Thread.sleep(1000);

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Hello", Keys.ENTER);
	}

}
