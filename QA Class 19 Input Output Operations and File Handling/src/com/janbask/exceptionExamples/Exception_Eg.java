package com.janbask.exceptionExamples;

public class Exception_Eg {

	public static void main(String[] args) {
		
		
		
		int a= 20;
		
		try
		{
		
		int d= a/0;
		}
		catch(Exception v) {
			v.printStackTrace();
			
			System.out.println("cannot divide a/0");
		}
		
		
		
		
		System.out.println(a);
		System.out.println("program ended");
	}

}
