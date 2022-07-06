package com.janbask.seleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "S:\\\\JANBASK\\\\QA-27th May 2022\\\\DRIVERS\\\\geckodriver.exe");	
		WebDriver driver= new EdgeDriver();
	}

}
