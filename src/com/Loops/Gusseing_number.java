package com.Loops;
import java.util.Scanner;
public class Gusseing_number {

	public static void main(String[] args) {
		int magicnumber = 56;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Number for gusseing");
			int num=sc.nextInt();
			if(num>magicnumber)
			{
				System.out.println("Number is greater pls try again...");
				continue;
			}
			else if(num<magicnumber)
			{
				System.out.println("Number is less pls try again...");
				continue;
			}
			else
			{
				System.out.println("Gusseing number is correct....!!!!!");
				break;
			}
		}

	}

}
