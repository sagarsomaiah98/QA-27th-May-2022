package com.janbask.loops;

public class Switch_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='A';
	
				switch(grade)
				{
				case 'A':
					System.out.println("Excellent");
					System.out.println("good job");
					System.out.println("excellent work");
					break;
				case 'B':
					System.out.println("Well Done");
					break;
				case 'C':
					System.out.println("Better");
					break;
				case 'D':
					System.out.println("Worst");
					break;
				default:
					System.out.println("Invalid");
					break;
					

	}

}
}