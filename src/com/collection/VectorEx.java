package com.collection;
import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		Vector v=new Vector(5);
		System.out.println("Initial Capacity of vector "+v.capacity());
		v.add(43);
		v.add(23);
		v.add(2,"2nd element ");
		v.add(56);
		v.add(67);
		System.out.println("No of elements : "+v.size());
		v.add(88);
		System.out.println("No of elements : "+v.size());
		System.out.println("Final Capacity of vector "+v.capacity());
		System.out.println(v);
		Vector Xerox=(Vector) v.clone();
		System.out.println(Xerox);
		v.removeAllElements();
		System.out.println(v);
		System.out.println("Object is found : "+v.removeElement(56));
		v.addAll(Xerox);
		System.out.println(v);
		
		for(int i=0;i<v.size();i++)
		{
			if(i==3)
			{
				System.out.println("I am going to remove : "+v.elementAt(i));
				v.removeElementAt(i);
			}
		}
		System.out.println(v);
		
		System.out.println("Navigating vector using Enumeration ");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println("Navigating vector using Iterator ");
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
