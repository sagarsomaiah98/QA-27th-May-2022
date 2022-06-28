package com.janbask.exceptionExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Ex {

	public static void main(String[] args) throws FileNotFoundException  {
		
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\TESTING DOCS\\MANUAL TESTING\\component testing.txt");
		
		System.out.println("program ended");
		

	}

}
