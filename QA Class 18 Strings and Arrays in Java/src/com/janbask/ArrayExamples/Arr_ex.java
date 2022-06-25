package com.janbask.ArrayExamples;

public class Arr_ex {

	public static void main(String[] args) {
		
		//syntax to declare array
		
		//last index of array is equal to length of array-1
		
		//explore two dimensional array
		
		String[][] s= new String [2][2];
		
		String[]  Student= new String[10]; 
		
		Student[3]="Mark";
		Student[0]="Joe";
		//Student[3]="Steve";
	//	Student[0]="Rob";
		//Student[0]="bob";
	//	Student[0]=Student[3];
		Student[1]="Henry";
		Student[2]="Dean";
		Student[4]="Peter";
	//	Student[5]="Sam";
		
		int len= Student.length;
		
		System.out.println(len);
		
		
		for(int a=0;a<len;a++) 
		{
		System.out.println(Student[a]);	
		
			
		}
		
		
		/*
		 * System.out.println(Student[0]); System.out.println(Student[1]);
		 * System.out.println(Student[2]); System.out.println(Student[3]);
		 * System.out.println(Student[4]);
		 */
		 // System.out.println(Student[15]);
		 
		
		
	}

}
