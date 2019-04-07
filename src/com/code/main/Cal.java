package com.code.main;

import java.util.Scanner;

public class Cal {

	public int getIntValues(int a, int b) {
		int add = a + b;
		System.out.println("addition of a and b :" + add);
		return add;
	}

	int sub1(int a, int b) {
		int sub = a - b;
		System.out.println(" subtraction of a and b :" + sub);
		return sub;
	}

	int mul1(int a, int b) {
		int mul = a * b;
		System.out.println("Multiple of a and b :" + mul);
		return mul;
	}

	int div1(int a, int b) {
		int div = a / b;
		System.out.println("Divide of a and b :" + div);
		return div;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a = sc.nextInt();
		System.out.println("Enter value of b :");
		int b = sc.nextInt();
		System.out.println("choose : 1.addition,2.subtration,3.multiple,4.divide ");
		int choose = sc.nextInt();
		Cal cal = new Cal();
		/*if (1 == choose) {
			System.out.println("you choosed addition: (" + choose + ")");
			int intValues = cal.getIntValues(a, b);
			System.out.println("after the methods exc: " + intValues);
		} else if (2 == choose) {
			System.out.println("you choosed Subtract: (" + choose + ")");
			int sub1 = cal.sub1(a, b);
			System.out.println("after the method exe :" + sub1);
		} else if (3 == choose) {
			System.out.println("you choosed Multiplication: (" + choose + ")");
			int mul1 = cal.mul1(a, b);
			System.out.println("after method exe :" + mul1);
		} else if(4 == choose) {
			System.out.println("you choosed Division: (" + choose + ")");
			int div1 = cal.div1(a, b);
			System.out.println("after method exe :" + div1);
		} else {
			System.out.println("Choosed input invalid");
		}*/
		switch (choose) {
		case 1:
			System.out.println("you choosed addition: (" + choose + ")");
			int intValues = cal.getIntValues(a, b);
			System.out.println("after the methods exc: " + intValues);
			break;
		case 2:
			System.out.println("you choosed Subtract: (" + choose + ")");
			int sub1 = cal.sub1(a, b);
			System.out.println("after the method exe :" + sub1);
			break;
		case 3:
			System.out.println("you choosed Multiplication: (" + choose + ")");
			int mul1 = cal.mul1(a, b);
			System.out.println("after method exe :" + mul1);
			break;
		case 4:
			System.out.println("you choosed Division: (" + choose + ")");
			int div1 = cal.div1(a, b);
			System.out.println("after method exe :" + div1);
			break;
		default:
			System.out.println("Choosed input invalid");
			break;
		}
	}

}
