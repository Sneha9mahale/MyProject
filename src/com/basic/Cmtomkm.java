package com.basic;
import java.util.Scanner;
// Write a Java program to enter length in centimeter and convert it into meter and kilometer.
public class Cmtomkm {

	public static void main(String[] args) {
		Scanner name=new Scanner(System.in);
		float cm,m,km;
		System.out.println("Enter any Number : ");
		cm=name.nextFloat();
		m=cm/100;
		km=m/1000;
		System.out.println(m);
		System.out.println(km);

	}

}
