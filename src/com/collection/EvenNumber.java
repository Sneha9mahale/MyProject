package com.collection;

import java.util.ArrayList;

public class EvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(45);
		a.add(67);
		a.add(12);
		a.add(64);
		a.add(23);
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			if((a.get(i)%2)==0)
			{
				System.out.println(a.get(i));
			}
		}

	}

}
