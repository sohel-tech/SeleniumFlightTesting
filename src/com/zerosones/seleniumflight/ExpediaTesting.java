package com.zerosones.seleniumflight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set Driver 
		System.setProperty("webdriver.chrome.driver", "//Users//zerosones//Desktop//selenium//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// connect to expedia
		driver.get("https://www.spicejet.com/");

	}
}
