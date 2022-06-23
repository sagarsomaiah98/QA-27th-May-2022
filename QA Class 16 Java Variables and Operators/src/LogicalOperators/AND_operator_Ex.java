package LogicalOperators;

public class AND_operator_Ex {

	public static void main(String[] args) {
		//& - and operator
		
		int a= 50;
		int b=30;
		int c=10;
		
		if((a>b)&(a>c))   //true & true-> true
			System.out.println(a+" is greater than "+b +" and "+c);//true
		
		else
			
			System.out.println(" condition didnt match");
		
		
	}

}
