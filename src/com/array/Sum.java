package com.array;

public class Sum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length/2;i++)
		{
				sum=a[i]+a[a.length-1-i];
				System.out.println(sum);
		}

	}

}
