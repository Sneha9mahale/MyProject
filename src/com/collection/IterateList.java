package com.collection;
import java.util.*;
public class IterateList {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Raman");
		al.add("Akash");
		al.add("Dipak");
		al.add("Vaibhav");
		al.add("Krishna");
		//Iterator list using iterator
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			String name= itr.next();
			System.out.println(name);
		}
		
		Iterator<String>itr1=al.iterator();
		while(itr1.hasNext())
		{
			String name= itr1.next();
			if(name.equals("Dipak"))
			{
				itr1.remove();
				System.out.println("Object remove");
			}
		}
		System.out.println(al);
		
		//Iterating list using listiterator 
		ListIterator<String>litr=al.listIterator();
		while(litr.hasNext())
		{
			String name=litr.next();
			if(name.equals("Akash"))
			{
				litr.add("Sneha");
				//System.out.println(name);
			}
		}
		System.out.println(al);
		
		ListIterator<String>litr1=al.listIterator(al.size());
		while(litr1.hasPrevious())
		{
			String name=litr1.previous();
			System.out.println(name);
		}
		
	}

}
