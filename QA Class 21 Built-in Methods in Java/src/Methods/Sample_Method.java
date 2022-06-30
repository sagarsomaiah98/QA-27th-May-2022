package Methods;

public class Sample_Method {
	
	public void method()
	{
		System.out.println("running method");
		
	}
	
	public void add(int a, int b) {
		
		int c=a+b;
		
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		
		 Sample_Method s = new Sample_Method();
		 s.method();
		 s.add(25, 30);
		 
		 
		

	}

}
