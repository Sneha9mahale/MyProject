package com.Loops;

public class Even_num_sum {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
			System.out.println(sum);


	}

}
