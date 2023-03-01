package com.basic;
import java.util.Scanner;
//Write a Java program to enter length and breadth of a rectangle and find its perimeter.
public class Perimeterofrec {

	public static void main(String[] args) {
		Scanner rec=new Scanner(System.in);
		int l,b,p;
		System.out.println("Enter Length Of rectangle ");
		l=rec.nextInt();
		System.out.println("Enter Breadth Of Rectangle ");
		b=rec.nextInt();
		p=2*(l+b);
		System.out.println("Perimeter Of Rectangle = "+p);

	}

}
