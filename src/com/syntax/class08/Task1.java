package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement checkBox = driver.findElement(By.id("checkbox"));
		checkBox.click();

		WebElement remove = driver.findElement(By.linkText("Remove"));
		remove.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("It's gone!")));

		WebElement text = driver.findElement(By.linkText("It's gone!"));
		String textMessage = text.getText();
		System.out.println(textMessage);

	}
}
