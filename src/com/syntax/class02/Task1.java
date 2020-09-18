package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();

		String title = driver.getTitle();
		String expectedTitle = "Web Orders";
		if (title.equalsIgnoreCase(expectedTitle)) {
			System.out.println("This is the right title");
		} else {
			System.out.println("This is WRONG title");
		}
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();

	}

}
