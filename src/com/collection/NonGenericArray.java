package com.collection;

import java.util.*;
class Item{
	int itemId;
	float itemPrice;
	String itemName;
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemPrice=" + itemPrice + ", itemName=" + itemName + "]";
	}
	public Item() {}
	public Item(int itemId,float itemPrice,String itemName)
	{
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
	}
	
}

public class NonGenericArray {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(12);
		al.add("Sneha");//dublicate elements allow
		al.add("Sneha");
		al.add(new Integer(56));
		al.add(5.67f);
		al.add(new Item(123,67.8f,"Mangala"));
		System.out.println(al);
		//maintain order of insertion
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		for(int i=0;i<al.size();i++)
		{
			int data=(int)al.get(i);
			al.set(i,data+5);
		}
		
	}

}
