package com.zerosones.seleniumflight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String citiSearch;
		String cityFullName;
		String cityCountry;

		// set Driver
		System.setProperty("webdriver.chrome.driver", "//Users//zerosones//Desktop//selenium//chromedriver");
		WebDriver driver = new ChromeDriver();

		// connect to expedia
		driver.get("https://www.expedia.ca/");

		// automation

		driver.findElement(By.xpath("//span[contains(text(),'Stays')]")).click();
		driver.findElement(By.cssSelector("button[class='uitk-faux-input']")).click();

		citiSearch = "Toro";
		driver.findElement(By.id("location-field-destination")).sendKeys(citiSearch);

		// wait to get pop-up options cities
		Thread.sleep(1000);

		// Selecting Toronto and form the auto complete
		cityFullName = "Toronto";
		cityCountry = "Ontario, Canada";

		List<WebElement> cities = driver.findElements(By.cssSelector("div[class='truncate'] span strong"));
		for (WebElement city : cities) {

			if (city.getText().equalsIgnoreCase(cityFullName)) {

				// Verifying City Country

				// 100% uniques element
				driver.findElement(By.xpath("(//div[contains(@class,'is-subText truncate')])[1]")).getText()
						.equalsIgnoreCase(cityCountry);
				city.click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.close();

	}
}
