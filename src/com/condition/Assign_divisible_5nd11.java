package com.condition;
import java.util.Scanner;
//sWrite a Java program to check whether a number is divisible by 5 and 11 or not 
public class Assign_divisible_5nd11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		System.out.println("Enter any number :");
		num1=sc.nextInt();
		/*if(num1%5==0&&num1%11==0)
		{
			System.out.println("Number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("Number is not divisible by 5 and 11");
		}*/
		//or
		if(num1%5==0)
		{
			if(num1%11==0)
			{
				System.out.println("Number is divisible by 5 and 11");
			}
			else
			{
				System.out.println("Number is not dividible by 11");
			}
		}
		else
		{
			System.out.println("Number is not divisible by 5 ");
		}
	}

}
