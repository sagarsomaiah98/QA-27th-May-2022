import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multilogin {
	Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\QA-27th May 2022\\Excel_Parameterization\\src\\TEST_SUITE\\SAUCE_LOGIN.xlsx");
	
	
	public void login() throws InterruptedException
	{
	int total_Rows=xls.getRowCount("SAUCE");
	
		for(int k=2;k<=total_Rows;k++) {
			
			String uname=xls.getCellData("SAUCE", "USERNAME", k);
			String pwd=xls.getCellData("SAUCE", "PASSWORD", k);
			
			//System.out.println(uname+" | "+pwd);
			
			System.setProperty("webdriver.chrome.driver",
					  "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
					  
					  
					  
					  WebDriver driver = new ChromeDriver();
					  
					  
					  driver.get("https://www.saucedemo.com/");
					  driver.manage().window().maximize();
					  
					  driver.findElement(By.id("user-name")).sendKeys(uname);
					  driver.findElement(By.id("password")).sendKeys(pwd);
					 // Thread.sleep(2000);
					  driver.findElement(By.name("login-button")).click(); 
					  driver.close();
			
		}
	  
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		Multilogin m = new Multilogin();
		m.login();
		
		
		
		  
		 

	}

}
