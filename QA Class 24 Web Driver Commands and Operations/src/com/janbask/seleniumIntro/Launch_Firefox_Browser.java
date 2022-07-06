package com.janbask.seleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();

	}

}
