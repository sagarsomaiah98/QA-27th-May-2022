import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Select sel = new Select(driver.findElement(By.xpath("//select[@id='first']")));

		
		  Thread.sleep(3000); 
		  sel.selectByValue("Google"); 
		  Thread.sleep(3000);
		  sel.selectByVisibleText("Yahoo");
		  Thread.sleep(3000);
		  sel.selectByIndex(0);
		  
		 //driver.quit();

	}

}
