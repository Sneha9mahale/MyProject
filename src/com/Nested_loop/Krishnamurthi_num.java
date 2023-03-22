package com.Nested_loop;
import java.util.Scanner;
public class Krishnamurthi_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num;
		num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			
		}
		System.out.println(sum);
		num=temp;
		if(num==sum)
		{
			System.out.println("Number is Krishnamurti");
		}
		else
		{
			System.out.println("Number is not Krishnamurti");
		}
	}

}
