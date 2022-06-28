package com.janbask.exceptionExamples;

public class Arr_Exception_Eg {

	public static void main(String[] args) {
		
		String[] stud= new String[3];
		
		
		try {
		
		stud[1]="James";
		
		
		stud[20]="Joe";
	     	}
		
		   catch(Exception e)
		{
			System.out.println(" try block failed");
			System.out.println(" failed to store array values");
			e.printStackTrace();
					
	      	}
		
		System.out.println(stud[1]);
		System.out.println("program ended");
		
		System.out.println(" array creation started");
		
		int[] marks = new int[5];
		
		marks[0]=75;
		marks[1]=25;
		marks[4]=50;
		
		System.out.println(marks[1]);
		System.out.println(marks[4]);
		

	}

}
