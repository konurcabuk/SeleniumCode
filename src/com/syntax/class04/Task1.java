package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Hum@nhrm123");

		WebElement loginButton = driver.findElement(By.name("Submit"));
		loginButton.click();

		Thread.sleep(1000);

		WebElement logo = driver.findElement(By.xpath(
				"//img[@src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));
		boolean logoDisplay = logo.isDisplayed();

		System.out.println(logoDisplay);

	}
}