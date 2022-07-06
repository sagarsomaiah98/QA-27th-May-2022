package com.janbask.browserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_URL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");	
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.navigate().to("https://www.bing.com");
		Thread.sleep(3000);
		d.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().refresh();
		
		d.quit();
		

	}

}
