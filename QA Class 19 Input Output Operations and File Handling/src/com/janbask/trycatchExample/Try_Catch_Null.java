package com.janbask.trycatchExample;
public class Try_Catch_Null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h=10;

		try {
			
			System.out.println("in the try block");
			
			System.out.println(h);
			 h=20/0;
			 System.out.println(" value of h");
			 System.out.println(h);
			
		}
		catch(Exception v)
		
		{
			v.printStackTrace();
			
			System.out.println(" cannot divide 10 by 0");
			
		}
		
		System.out.println(" end of the program");
		
		
	}

}
