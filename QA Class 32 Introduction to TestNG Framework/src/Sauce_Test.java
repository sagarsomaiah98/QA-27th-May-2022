import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sauce_Test {
	
	
	WebDriver driver ;
	@Test
	public void logintest() throws InterruptedException {
     
		
		driver.get("https://www.saucedemo.com/");
		
		
	
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.quit();
	
		
	} 
	
	@Test
	
	public void AddToCart() throws InterruptedException {
		
		
		
    
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		driver.quit();
	}
	@AfterMethod
	public void close() {
	//close the browser	
		driver.quit();
		
	}
	
	@BeforeMethod
	public void launch() {
		//launch the browser
		  System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
			
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
		
	}

}
