package com.array;

import java.util.Arrays;

public class ShiftNeg {
	static void shiftele(int[] a) {
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>0)
			{
				a[k]=a[i];
				k++;
			}
		}
		
		while(k<a.length)
		{
			int i=k;
			if(a[i]<0)
			{
			a[k]=a[i];
			}
			
		}
		
		}
		
	

	public static void main(String[] args) {
		int a[]= {-3,-5,4,7,1};
		ShiftNeg.shiftele(a);
		System.out.println(Arrays.toString(a));

	}

}
