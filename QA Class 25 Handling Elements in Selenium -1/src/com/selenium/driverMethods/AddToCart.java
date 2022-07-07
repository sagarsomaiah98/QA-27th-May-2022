package com.selenium.driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	
	
	public static void main(String args[]) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		
		driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		
	   driver.findElement(By.xpath("//button[@id='checkout']")).click();
	   driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("HENRY");
	   driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("LEN");
	   driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2148");
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   driver.findElement(By.xpath("(//button[normalize-space()='Finish'])[1]")).click();
	  String expectedResult= driver.findElement(By.xpath("(//div[@class='complete-text'])[1]")).getText();
	  
		System.out.println(expectedResult);	
			
	
		
		driver.quit();
	}

}
