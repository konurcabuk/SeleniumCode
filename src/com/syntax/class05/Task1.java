package com.syntax.class05;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static class handlingDropDowns {

		public static String url = "https://www.facebook.com/r.php";

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			WebElement amazonDropList = driver.findElement(By.id("month"));

			Select select = new Select(amazonDropList);
			
			List<WebElement> options = select.getOptions();
			
			System.out.println(options.size()-1);
			

		}
	}
}
