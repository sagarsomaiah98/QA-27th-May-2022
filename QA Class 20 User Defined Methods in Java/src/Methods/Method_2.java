package Methods;

public class Method_2 {
	//class variables  or global variables
	int age=35;
	String name="Lee";
	double salary=45.61;
	
	
	public void employee_info() 
	{
	//local variables
	int n=90;
	int j=30;
	
	int g=n+j;
		
	}

	public static void main(String[] args) {
		
    Method_2 a=new Method_2();
    
    a.employee_info();
    
    System.out.println(a.age);
    System.out.println(a.name);
    System.out.println(a.salary);
		
	}

}
