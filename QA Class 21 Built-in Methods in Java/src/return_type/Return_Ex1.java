package return_type;

public class Return_Ex1 {
	
	
	public double balance(double monthly_balance) //monthly_balance- argument or parameter
	{
		
	double actual_balance= monthly_balance*4;
	
		return actual_balance;
		
	}

	public static void main(String[] args) 
	{
		
     Return_Ex1 u= new Return_Ex1();
     
     double a= u.balance(410.25);
     
     System.out.println(a);
    
		
		
	}

}
