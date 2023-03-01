package com.basic;
import java.util.Scanner;
//. Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.
public class Temperature {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		float c,f;
		System.out.println("Enter Temp in Celcius :");
		c=name.nextFloat();
		f=(c*9/5)+32;
		System.out.println("Farenhit temp = "+f);
	}

}
