package Methods;

public class Method_1 {
	
	public void employee_info() 
	{
	int age=30;
	String name="John";
	double salary= 234.56;
	
	System.out.println(name+" whose age is "+age+ " has salary "+salary);
		
		
	}
	public void employee_info1() 
	{
		int age=35;
		String name="Steve";
		double salary= 412.66;
		
		System.out.println(name+" whose age is "+age+ " has salary "+salary);	
		
	}

	public static void main(String[] args)
	{
	Method_1 P= new Method_1();
	P.employee_info1();
	P.employee_info();
	P.employee_info();
	P.employee_info1();
	
		
		
	}

}
