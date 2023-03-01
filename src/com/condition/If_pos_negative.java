package com.condition;
import java.util.Scanner;
public class If_pos_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number :");
		num=sc.nextInt();
		if(num>1)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negitive");
		}

	}

}
