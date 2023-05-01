package com.collection;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item1> {

	public int compare(Item1 o1,Item1 o2)
	{
		if(o1.itemPrice<o2.itemPrice)
		{
			return -1;
		}
		else if(o1.itemPrice<o2.itemPrice)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}

}
