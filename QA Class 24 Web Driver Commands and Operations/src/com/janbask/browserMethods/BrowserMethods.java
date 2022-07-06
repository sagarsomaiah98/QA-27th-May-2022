package com.janbask.browserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		//max the browser
		
		driver.manage().window().maximize();
		//Navigate to the url
		
		driver.get("https://www.selenium.dev/");
		driver.get("https://www.bing.com");
		driver.get("https://saucedemo.com");
		
		driver.close();
		
	}

}
