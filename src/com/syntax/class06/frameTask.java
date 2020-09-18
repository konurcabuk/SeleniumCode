package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameTask {
	static String url = "http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.switchTo().frame("FrameOne");
		WebElement logo = driver.findElement(By.id("hide"));
		boolean logoDisplay = logo.isDisplayed();
		System.out.println(logoDisplay);

		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		driver.switchTo().frame("FrameTwo");
		WebElement enroll = driver.findElement(By.className("enroll-btn"));
		boolean enrollButton = enroll.isEnabled();
		System.out.println(enrollButton);

	}
}
