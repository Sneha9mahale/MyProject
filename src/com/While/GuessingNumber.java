package com.While;
import java.util.Scanner;
public class GuessingNumber {

	public static void main(String[] args) {
		int magicnumber=56;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Number For Guessing:");
			int num=sc.nextInt();
			
			if(num>magicnumber)
			{
				System.out.println("Number is greater...");
				continue;
			}
			else if(num<magicnumber)
			{
				System.out.println("Number is less...");
				continue;
			}
			else
			{
				System.out.println("Number is correct.....!!!!!");
				break;
			}
		}

	}

}
