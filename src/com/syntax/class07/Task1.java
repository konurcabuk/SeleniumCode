package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static String url = "https://demoqa.com/browser-windows";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		String mainPageHandle = driver.getWindowHandle();

		WebElement newTab = driver.findElement(By.id("tabButton"));
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
		newTab.click();
		newWindow.click();
		newWindowMessage.click();

		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());

		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			String childHandle = it.next();
			if (!childHandle.equals(mainPageHandle)) {
				driver.switchTo().window(childHandle);
				System.out.println(driver.getTitle());
				driver.close();

	}
	// driver.switchTo().window(mainPageHandle);
	// System.out.println(driver.getTitle());

	;
}
//}
