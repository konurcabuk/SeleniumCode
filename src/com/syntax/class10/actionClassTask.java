package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		
		WebElement prime= driver.findElement(By.id("nav-link-prime"));
		
		Actions action = new Actions(driver);
		action.moveToElement(prime).perform();
		action.doubleClick(prime).perform();
		
		
	}

}
