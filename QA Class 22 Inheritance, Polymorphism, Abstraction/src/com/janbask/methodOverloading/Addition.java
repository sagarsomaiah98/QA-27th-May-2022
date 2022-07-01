package com.janbask.methodOverloading;

public class Addition {
	
	public void add() {
		
	}
	
	
	public void add(int a, int b)
	{
		
		
		
		int c=a+b;
		
		System.out.println(a+b);
	}
	
	
	public void add(int m, int n,int k)
	{
		
		
		
	}
	
	public void add(int m, String a) {
		
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add();
		
	}

}
