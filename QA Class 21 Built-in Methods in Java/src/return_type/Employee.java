package return_type;

public class Employee {
	
	double height=6.2;
	
	
	public String employe_info()
	
	{
	int age=60;	
	String name="Steve";
	double salary=245.2;
	boolean a= true;
	char grade='A';
		
    
		return name;
	}
	
	

	public static void main(String[] args) {
		
		Employee nagina = new Employee();
		System.out.println(nagina.employe_info());
		
		String name1="Kevin";
		
		if(nagina.employe_info()==name1)  
			System.out.println("match");
		else 
			System.out.println("no match");
		
		
		

	}

}
