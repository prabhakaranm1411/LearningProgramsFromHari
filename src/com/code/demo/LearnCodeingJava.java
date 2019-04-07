package com.code.demo;

public class LearnCodeingJava {
	
	int a = 10;
	String str = "Prabha";
	float flat = 9;
	double dou = 100.30;
	
	int rocketPoderQu = 20;
	
	public void intSetValue() {
		LearnCodeingJava refer = new LearnCodeingJava();
		int b = refer.a = 20;
	    System.out.println("B Values: "+ b);
	}

	public int intGetValue() {
		LearnCodeingJava codeingJava =  new LearnCodeingJava();
		int b = codeingJava.a = 10 +20;
		return b;
	}
	
	
	public static int getPoderCount(int a) {
		LearnCodeingJava codeingJava = new LearnCodeingJava();
		int c = codeingJava.rocketPoderQu - a;
		return c;
		
	}

}
