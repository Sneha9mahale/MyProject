package com.collection;
import java.util.*;
 class Item1 implements Comparable<Item1>
{
	int itemId;
	float itemPrice;
	String itemName;
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemPrice=" + itemPrice + ", itemName=" + itemName + "]";
	}
	public 	Item1() {}
	public Item1(int itemId, float itemPrice, String itemName) {
		super();
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
	}
	@Override
	public int compareTo(Item1 o)
	{
		if(this.itemId<o.itemId)
		return -1;
		else if(this.itemId>o.itemId)
			return 1;
		else
			return 0;
	}
	
}
public class ItemSorting {

	public static void main(String[] args) {
		List<Item1>itemlist=new ArrayList<>();
		itemlist.add(new Item1(3455 , 56.45f, "Pendrive"));
		itemlist.add(new Item1(5463 , 78.90f, "Bluetooth Device"));
		itemlist.add(new Item1(4567 , 45.00f, "Smart Band"));
		itemlist.add(new Item1(6512 , 45.00f, "Head Phone"));
		itemlist.add(new Item1(3467 , 89.005f, "Charger"));
		
		System.out.println("Before Sorting Item List is : ");
		for(Item1 i:itemlist)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------");
		//1.Sorting by itemid in assending order
		Collections.sort(itemlist);
		System.out.println("After Sorting Item List by itemid is : ");
		for(Item1 i:itemlist)
		{
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------------");
		//1.Sorting by itemprice in assending order
		Collections.sort(itemlist, new ItemPriceComparator());
		System.out.println("After Sorting Item List by itemprice is : ");
		for(Item1 i:itemlist)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------");
		//1.Sorting by itemprice in assending order then by itemName
		Collections.sort(itemlist, new FirstByPriceThenName());
		System.out.println("After Sorting Item List by itemprice then by itemName : ");
		for(Item1 i:itemlist)
		{
			System.out.println(i);
		}
		
	}

}
