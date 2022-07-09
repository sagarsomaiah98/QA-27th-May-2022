import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\chromedriver.exe");
		
WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.testandquiz.com/selenium/testing.html");

Thread.sleep(3000);

driver.findElement(By.linkText("This is a link")).click();

	}

}
