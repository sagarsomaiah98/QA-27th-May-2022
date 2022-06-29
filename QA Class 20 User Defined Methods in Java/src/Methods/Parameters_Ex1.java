package Methods;

public class Parameters_Ex1 {
	
	
	public void UpperCase(String name) 
	{
		
		System.out.println(name.toUpperCase());	
		
		
	}

	public static void main(String[] args) {
		
		Parameters_Ex1 p= new Parameters_Ex1();
		
		p.UpperCase("Nagina");
		p.UpperCase("paul");
		p.UpperCase("KEvIn");
 		
		

	}

}
