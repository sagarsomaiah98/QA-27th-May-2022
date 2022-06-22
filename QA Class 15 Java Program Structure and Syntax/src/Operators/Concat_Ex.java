package Operators;

public class Concat_Ex {

	public static void main(String[] args) {
		
		int a= 50;
		int b=40;
		String name="Dean";
		
		//shortcut type syso and hit ctrl+space bar
		
		System.out.println(a+b+name);//90Dean      
		
		System.out.println(a+name+b);//50Dean40          
		
		System.out.println(name+a+b);//Dean5040   Dean90
		
		System.out.println(name+(a+b));//Dean90 
		

	}

}
