package com.collection;

import java.util.*;

public class OccuranceCity {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("pune");
		al.add("Goa");
		al.add("gujrat");
		al.add("pune");
		al.add("pune");
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(al.get(i)==al.get(k))
				{
					isvisited=true;
					break;
				}
			}
		
			if(isvisited==false)
			{
				for(int j=i+1;j<al.size();j++)
				{
					if(al.get(i)==al.get(j))
					{
						count++;
					}
				}
				System.out.println(al.get(i)+" "+count);
			}
			
	}
		

	}

}
