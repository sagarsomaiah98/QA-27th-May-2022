import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiUserLogin {
	
	public void login(String uname, String pwd) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			driver.quit();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		MultiUserLogin m= new MultiUserLogin();
		m.login("standard_user","secret_sauce");
		m.login("locked_out_user","secret_sauce");
		m.login("problem_user","secret_sauce");
		m.login("performance_glitch_user","secret_sauce");
   
	}

}
