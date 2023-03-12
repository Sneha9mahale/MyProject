package com.basic;
import java.util.Scanner;
public class Square_root {

	public static void main(String[] args) {
		Scanner sqr=new Scanner(System.in);
		int num;
		System.out.println("Enter any number");
		num=sqr.nextInt();
		double s=Math.pow(num,0.5);
		System.out.println("Square Root = "+s);

	}

}
