package com.array;
import java.util.Arrays;
public class ShiftZero {
	static void shiftele(int[] a) {
	int k=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			a[k]=a[i];
			k++;
		}
	}
	while(k<a.length)
	{
		a[k]=0;
		k++;
	}
	System.out.println(Arrays.toString(a));
		
		
	}

	public static void main(String[] args) {
		int a[]= {2,0,3,0,5,0};
		ShiftZero.shiftele(a);

	}

}
