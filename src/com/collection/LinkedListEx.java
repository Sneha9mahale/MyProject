package com.collection;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String>al=new LinkedList<>();
		System.out.println(al);
		al.add("srx");
		al.add("fgzsa");
		al.add("wew");
		System.out.println(al);
		al.addFirst("First element");
		al.addLast("Last Element");
		al.add(2,"Second Element");
		System.out.println(al);
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
		//to get first element from list
		String first=al.element();
		System.out.println(first);
		System.out.println(al.getFirst());

		String ss=al.get(0);
		System.out.println("Element in get(0) : "+ss);
		System.out.println("Element in get(2) : "+al.get(2));
		
		System.out.println("Iteration using decending iterator : ");
		Iterator<String>itr=al.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Iteration using Iterator : ");
		itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Iteration using ListIterator : ");
		ListIterator<String>litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
