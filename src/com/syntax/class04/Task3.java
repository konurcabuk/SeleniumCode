package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		List<WebElement> buttons = driver.findElements(By.cssSelector("[class='radio-inline']"));

		for (WebElement buttonText : buttons) {

			String male = buttonText.getAttribute("Name");
			if (male.equalsIgnoreCase("Gender")) {
				buttonText.click();
				break;

			}

		}

	}

}
