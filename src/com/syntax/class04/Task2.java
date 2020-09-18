package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static String url = "http://amazon.com";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		Thread.sleep(1000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(1000);

		int size = links.size();
		for (WebElement link : links) {
			String linkText = link.getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
			}

		}

		System.out.println(size);
		driver.quit();

	}
}
