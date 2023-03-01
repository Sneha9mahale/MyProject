package com.basic;
import java.util.Scanner;

// Write a Java program to enter two angles of a triangle and find the third angle.

public class Find_thrid_angle {

	public static void main(String[] args) {
		Scanner ang=new Scanner(System.in);
		int ang1,ang2,ang3,s;
		System.out.println("Enter First Angle : ");
		ang1=ang.nextInt();
		System.out.println("Enter Second Angle : ");
		ang2=ang.nextInt();
		s=ang1+ang2;
		ang3=180-s;
		System.out.println("Third Angle = "+ang3);

	}

}
