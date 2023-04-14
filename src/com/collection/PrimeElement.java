package com.collection;

import java.util.*;

public class PrimeElement {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(7);
		a.add(67);
		a.add(4);
		a.add(56);
		a.add(13);
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			boolean isprime=true;
			
			for(int j=2;j<a.get(i);j++)
			{
				if(a.get(i)%j==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				System.out.println(a.get(i));		
			}
		}
	}

}
