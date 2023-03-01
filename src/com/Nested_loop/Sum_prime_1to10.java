package com.Nested_loop;

public class Sum_prime_1to10 {

	public static void main(String[] args) {
		int sum=0;
		for(int num=1;num<=10;num++)
		{
			boolean isprime=true;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime=false;
				}
			}
			if(isprime==true)
			{
				System.out.println(num);
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}

}
