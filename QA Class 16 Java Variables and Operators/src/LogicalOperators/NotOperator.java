package LogicalOperators;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean h=true;
		boolean m=false;
		
	//	System.out.println(h&m);//false
		//System.out.println(!(h&m));// !(false) =  true
	//	System.out.println(h|m);  //true
		
		
		int a=20;
		
		
		if(!(a==20))   //  not true-> false
       System.out.println("a is equal to 20");
		else
			
			System.out.println(" condition didnt match");
	}

}
