package com.condition;
import java.util.Scanner;
public class Assign_leap_year {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int yr;
		yr=sc.nextInt();
		if(yr%4==0)
		{
			if(yr%100==0&&yr%400==0)
			{
				System.out.println("Leap year");
			}
			else
			{
				System.out.println("Not Divisible by 100 & 400 ");
			}
		}
		else
		{
			System.out.println("Not Leap year");
		}

	}

}
