import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Ex {
	
	@Test
	public void t1() {
		
		
		System.out.println("calling t1");
	}
	
	@Test
	public void t2() {
		
		System.out.println("calling t2");
	}
	
	@Test
	public void t3() {
		
		System.out.println("calling t3");
	}
	
	@BeforeMethod
	public void before() {
		
		System.out.println("calling before");
	}
	@AfterMethod
	public void after() {
		
		System.out.println("calling after");
	}
	@BeforeTest
	public void B() {
		
		System.out.println("calling B");
	}
	
	@AfterTest
	public void A() {
		
		System.out.println("calling A");
	}

}
