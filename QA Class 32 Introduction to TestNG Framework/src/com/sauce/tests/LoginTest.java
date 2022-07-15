package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void logintest() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.quit();
		
	}

}
