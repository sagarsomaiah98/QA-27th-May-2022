package Methods;

public class Parameters_Ex 
{
	 public void Addition(int a, int b)
		
		{
			
			
			int c=a+b;
			
			System.out.println("Addition of two numbers is "+a+" and "+b+" is "+c);	
			
		}

	public static void main(String[] args) {
		
	Parameters_Ex a= new Parameters_Ex();
	a.Addition(10,20);
	a.Addition(30,50);
	a.Addition(55,10);
	a.Addition(2,8);

	}

}
