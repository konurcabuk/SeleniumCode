package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Again {

	public static String url = "https://demoqa.com/browser-windows";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String mainPageHandle = driver.getWindowHandle();
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		String newTabText = newTab.getText();
		System.out.println(newTabText);

	}
}
