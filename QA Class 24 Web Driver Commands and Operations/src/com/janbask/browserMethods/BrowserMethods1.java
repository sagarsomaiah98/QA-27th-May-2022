package com.janbask.browserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");	
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.navigate().to("https://www.saucedemo.com/");
		String title= d.getTitle();
		String pagesource= d.getPageSource();
		
		System.out.println(pagesource);
		System.out.println(title);
		Thread.sleep(3000);
		d.quit();
		
		
		
		

	}

}
