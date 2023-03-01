package com.basic;
import java.util.Scanner;
//Write a Java program to enter length and breadth of a rectangle and find its area
public class Areaofrectinp {

	public static void main(String[] args) {
		Scanner rec=new Scanner(System.in);
		int l,b,a;
		System.out.println("Enter Length Of rectangle ");
		l=rec.nextInt();
		System.out.println("Enter Breadth Of Rectangle ");
		b=rec.nextInt();
		a=l*b;
		System.out.println("Area Of Rectangle = " +a);

	}

}
