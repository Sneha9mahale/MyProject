package com.basic;
import java.util.Scanner;
//Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)

public class Tempftoc {

	public static void main(String[] args) {
		Scanner temp=new Scanner(System.in);
		float c,f;
		System.out.println("Enter Temperature in Fahrenheit");
		f=temp.nextFloat();
		c=(f-32)*5/9;
		System.out.println("Celcius = "+c+" C");
		

	}

}
