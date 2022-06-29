package Methods;

public class Parameters_Ex2 {
	
	public void employee_info(int age, String name, double salary) 
	{
	
	
	System.out.println(name+" whose age is "+age+ " has salary "+salary);
		
		
	}
	

	public static void main(String[] args) {
		Parameters_Ex2 l= new Parameters_Ex2();
		
		l.employee_info(50, "Bob", 756.32);
        l.employee_info(25, "Jane", 458.2);
        l.employee_info(41, "Sam", 78.25);
        		
	}

}
