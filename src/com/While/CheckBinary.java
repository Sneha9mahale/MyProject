package com.While;
import java.util.Scanner;
public class CheckBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		boolean checkbinary=true;
		while(num>0)
		{
			int r=num%10;
			if(r!=0||r!=1)
			{
				checkbinary=false;
				break;
			}
			num=num/10;
		}
		if(checkbinary==true)
		{
			System.out.println("Number is binary");
		}
		else
		{
			System.out.println("Number is not binary");
		}
	}

}
