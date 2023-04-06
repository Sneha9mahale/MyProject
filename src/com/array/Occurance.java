package com.array;
import java.util.Arrays;
public class Occurance {
	public static void Elements(int a[])
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
					if(a[i]==a[j]) 
					{
					count++;
					}	
				}
				
				System.out.println(a[i]+" "+count);
			}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {6,4,6,8,6,3,8};
		System.out.println(Arrays.toString(arr));
		Occurance.Elements(arr);

	}

}
