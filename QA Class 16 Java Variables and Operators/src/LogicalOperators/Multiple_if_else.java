package LogicalOperators;

public class Multiple_if_else {

	public static void main(String[] args) {
		
		int k=30;
		int m=10;
		int h=45;
		
		if( k>m)//true
		{
			if(k>h)// false
				System.out.println("k is greatest among all");
			else
				System.out.println("h is greatest among all ");
		     
		}
		else
			
			System.out.println("m is greatest ");
		
		

	}

}
