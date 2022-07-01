package com.janbask.methodOverloading;
public class Method_Overloading {
	
	//Method OVerloading- Same Method name but different arguments /parameters
	public void add(int a, int b) {
		int res=a+b;
		System.out.println("Addition of two numbers is "+res);
		
	}
	
	public void add(int a, int b,int c) {
		int res=a+b+c;
		System.out.println("Addition of three numbers is "+res);
		
	}
	
	public void add(int a, int b,int c, int d) {
		int res=a+b+c+d;
		System.out.println("Addition of three numbers is "+res);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading m= new Method_Overloading();
		m.add(20, 30);
		m.add(5, 9, 8);
		m.add(10,30,14,51);
		

	}

}
