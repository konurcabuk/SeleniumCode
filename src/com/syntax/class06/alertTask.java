package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTask {

	static String url = "http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement clickMe = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		clickMe.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		

	}

}
