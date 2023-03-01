package com.condition;
import java.util.Scanner;
public class Switch_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the City Name");
		String st=sc.next();
		switch(st)
		{
		case "pune":
			System.out.println("Employee is working in pune location");
			break;
		case "mumbai":
			System.out.println("Employee is working in mumbai location");
			break;
		default:
			System.out.println("Employee is working all over india");
		
		}

	}

}
