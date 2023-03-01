package com.OOPS;
import java.util.Scanner;
public class Factors {
	int num,i;
	
	public void checkFactors(int num)
	{
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Factors f=new Factors();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		f.checkFactors(num);
	}

}
