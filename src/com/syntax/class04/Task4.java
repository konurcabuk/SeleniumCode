package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();

		WebElement errorMessage = driver.findElement(By.id("spanMessage"));
		boolean error = errorMessage.isDisplayed();

		System.out.println(error);

	}

}


//english 112A
//admission and records - 
//Mytmcc- 1002957227
//call english department we have copy of unofficial  transcript 
//and than also officially transfer them to csn as well

//third party release set it up