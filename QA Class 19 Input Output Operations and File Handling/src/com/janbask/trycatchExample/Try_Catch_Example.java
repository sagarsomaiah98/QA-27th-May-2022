package com.janbask.trycatchExample;
public class Try_Catch_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    String[] stud = new String[3];
		
		stud[0]="mark";
		stud[1]="steve";
		stud[2]="john";
		
		try {
		System.out.println(stud[2]);
		System.out.println(stud[0]);
		System.out.println(stud[9]);
		                  
		
		}
		catch(Exception e1) {
			
			e1.printStackTrace();
			System.out.println(stud[1]);
			
			System.out.println(" in the catch block");
		}
		
		System.out.println(stud[1]);
	}

}
