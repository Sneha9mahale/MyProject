package com.collection;
import java.util.Comparator;
public class CarPriceThenColour implements Comparator<Car>{
	public int compare(Car c1,Car c2)
	{
		if(c1.price<c2.price)
		{
			return -1;
		}
		else if(c1.price>c2.price)
		{
			return 1;
		}
		else
		{
			return c1.colour.compareTo(c2.colour);
		}
	}
	
}
