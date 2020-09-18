package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCalendarsTask {

	public static String url = "https://www.southwest.com/air/booking/index.html?clk=GNAV-FLIGHT";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement departDate = driver.findElement(By.id("departureDate"));
		departDate.click();

		WebElement departMonth = driver.findElement(By.xpath("//div[text()='September 2020']"));
		String dMonth = departMonth.getText();
		//WebElement next = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));

		while (dMonth.equals("September")) {
			//next.click();

			dMonth = departMonth.getText();
		}

		List<WebElement> departDates = driver
				.findElements(By.xpath("//div[@class='calendar-month--days']/button "));
		for (WebElement departDatee : departDates) {
			String data = departDatee.getText();
			if (departDatee.equals("12"))
				departDatee.click();
			break;

		}

	}
}
