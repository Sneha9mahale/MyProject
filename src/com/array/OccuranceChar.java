package com.array;

import java.util.Arrays;

public class OccuranceChar {
	public static void charact(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvisit=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					 isvisit=true;
					 break;
				}
			}
			if(isvisit==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j]) {
					count++;
					}
					
				}
				System.out.println(a[i]+" "+count);
			}
		}
	}

	public static void main(String[] args) {
		char arr[]= {'g','h','g','e','a','e'};
		System.out.println(Arrays.toString(arr));
		OccuranceChar.charact(arr);

	}

}
