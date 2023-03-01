package com.Loops;

public class While_evensum {

	public static void main(String[] args) {
		//even number sum 1 to 10
		int i=1;
		int sum=0;
		while(i<=10)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
