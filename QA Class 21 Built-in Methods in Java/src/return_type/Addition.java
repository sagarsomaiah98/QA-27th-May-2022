package return_type;

public class Addition {
	
	
	
	public int add() 
	{
		int a=10;
		int b=25;
		int c=a+b;
		
		System.out.println("Addition of two number is "+c);
		
		return c;
	}
	

	public static void main(String[] args) {
		
		Addition a = new Addition();
		
	    int value=a.add();	
	
		
		if(value%2==0)
			System.out.println("its even number");
		else
			System.out.println("its odd number");
		

	}

}
