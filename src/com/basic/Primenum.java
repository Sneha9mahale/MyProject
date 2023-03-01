package com.basic;

public class Primenum {

	public static void main(String[] args) {
		
		
		for (int num=1;num<=10;num++)
		{
			boolean isprime=true;
			
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				System.out.println(num);		
			}
	
			
		}

	}

}
