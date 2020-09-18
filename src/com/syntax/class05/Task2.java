package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static String url = "https://www.ebay.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement ebayCategories = driver.findElement(By.id("gh-cat"));

		Select select = new Select(ebayCategories);

		List<WebElement> optionsDropList = select.getOptions();
		Iterator<WebElement> dropList = optionsDropList.iterator();
		while (dropList.hasNext()) {
			WebElement dropListValues = dropList.next();
			String dropListValuess = dropListValues.getText();
			select.selectByValue("58058");

			System.out.println(dropListValuess);
		}
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.id("gh-btn"));
		search.click();

		WebElement verify = driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
		boolean header = verify.isDisplayed();
		System.out.println(header);

	}
}
