import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public TestBase() {
	
	
	System.setProperty("webdriver.chrome.driver","S:\\JANBASK\\QA-27th May 2022\\chromedriver.exe");
	
	 driver= new ChromeDriver();
	
	}

}
