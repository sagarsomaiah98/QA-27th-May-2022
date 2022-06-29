package Methods;

public class Method_Creation {
	
	// AccessModifier returnType methodname
	
 public void Addition()
	
	{
		int a=10;
		int b=20;
		
		System.out.println("Addition of two numbers is "+(a+b));	
		
	}
	
public void	Subtraction()
	{
		int j=40;
		int k=30;
		
		System.out.println("Subtraction of two numbers is "+(j-k));	
	}
	
public void	Multiplication()
	{
		int m=80;
		int n=10;
		
		System.out.println("Multiplication of two numbers is "+(m*n));
	}
	

	public static void main(String[] args) {
	//classname object= new classname();	
	Method_Creation m = new Method_Creation();
	m.Addition();
	m.Addition();
	m.Addition();
	m.Addition();
		
	}

}
