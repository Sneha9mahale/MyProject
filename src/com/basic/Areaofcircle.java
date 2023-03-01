package com.basic;
import java.util.Scanner;

//Write a Java program to enter radius of a circle and find its diameter, circumference and area
public class Areaofcircle {

	public static void main(String[] args) {
		Scanner circle=new Scanner(System.in);
		float r,d;
		double a,c;
		//double c;
		System.out.println("Enter radius : ");
		r=circle.nextFloat();
		d=r*2;
		a = 3.142*r*r;
		c= 2*3.14*r;
		System.out.println("Diameter "+d);
		System.out.println("Area "+a);
		System.out.println("Circumference "+c);

	}

}
