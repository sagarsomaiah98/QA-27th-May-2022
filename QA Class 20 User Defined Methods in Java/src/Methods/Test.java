package Methods;

public class Test {

	public static void main(String[] args) 
	
	{
	Method_1 m = new Method_1();
	m.employee_info();
	m.employee_info1();
	System.out.println("*******************************");
	Method_2 m1= new Method_2();
	System.out.println(m1.age);
	System.out.println(m1.name);
	System.out.println(m1.salary);
	m1.employee_info();
	System.out.println("******************************");
	Parameters_Ex2 p = new Parameters_Ex2();
	p.employee_info(45, "Mark", 74.25);
	
		
	}

}
