package com.code.main;

import java.util.Scanner;

import com.code.demo.LearnCodeingJava;

public class ExMainMethods {

	public static void main(String[] args) {
		LearnCodeingJava codeingJava = new LearnCodeingJava();

		//codeingJava.intSetValue();
		//int intGetValue = codeingJava.intGetValue();
		//System.out.println("Line No 12:" + intGetValue);
	
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Please Enter pus count");
	    int a1 = scanner.nextInt();
		int poderCount = codeingJava.getPoderCount(a1);
		System.out.println("listOfProductAvaliable : " + poderCount);
		
	}

}
