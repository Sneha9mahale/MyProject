package com.condition;
import java.util.Scanner;
public class Ifstatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number : ");
		num1=sc.nextInt();
		System.out.println("Enter second number : ");
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is greater");
		}
		else
		{
			System.out.println(num2+" is greater");
		}
	}

}
