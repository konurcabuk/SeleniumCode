package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingElementByXpath {

	public static String url = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='btn_inter_example']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Input Form with Validations']")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Konuralp");

		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Cabuk");

	}
}
