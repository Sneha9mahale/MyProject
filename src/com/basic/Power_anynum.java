package com.basic;

import java.util.Scanner;

public class Power_anynum {

	public static void main(String[] args) {
		Scanner sqr=new Scanner(System.in);
		int b,e;
		System.out.println("Enter first number");
		b=sqr.nextInt();
		System.out.println("Enter second number");
		e=sqr.nextInt();
		
		double s=Math.pow(b,e);
		System.out.println("power of "+b+"to"+e+" ="+s);

	}

}
