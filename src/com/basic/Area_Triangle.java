package com.basic;
import java.util.Scanner;
// Write a Java program to enter base and height of a triangle and find its area.
public class Area_Triangle {

	public static void main(String[] args) {
		Scanner area=new Scanner(System.in);
		int base,height,a;
		System.out.println("Enter Base And Height :");
		base=area.nextInt();
		height=area.nextInt();
		a=base*height/2;
		System.out.println("Area Of Triangle = "+a);
		
		

	}

}
