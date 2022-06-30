package Static_Keyword;

public class Multiplication {
	static String  name="Kane";
	static int age=30;
	
	public static void multiply() {

		int k=10;
		
		int j=5;
		int m=k*j;
		
		System.out.println("multiplication result is "+m);
	}
	public static void multiplyThreeNumbers() {
		
		int a= 9;
		int b=8;
		int c=10;
		int h=a*b*c;
		
		System.out.println("Multiplicaiton of three numbers is "+h);
		
	}

	public static void main(String[] args) {
		
	   multiply();
	   multiplyThreeNumbers();
	   System.out.println(name);
	   System.out.println(age);
		
		

	}

}
