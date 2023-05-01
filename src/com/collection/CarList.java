package com.collection;
import java.util.*;

class Car implements Comparable<Car>
{
	int cid;
	String cnm;
	String colour;
	int price;
	@Override
	public String toString()
	{
		return "Car[carId = "+ cid+ " carName = "+cnm+ " CarColour = "+colour+ " CarPrice = "+price+"]";
	}
	Car(){}
	Car(int cid,String cnm,String colour,int price)
	{
		super();
		this.cid=cid;
		this.cnm=cnm;
		this.colour=colour;
		this.price=price;
	}
	@Override
	public int compareTo(Car c)
	{
		if(this.price<c.price)
		{
			return 1;
		}
		else if(this.price>c.price)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class CarList {

	public static void main(String[] args) {
		List<Car>l=new ArrayList<>();
		l.add(new Car(123,"Renault","Yellow",56000));
		l.add(new Car(232,"Maruti","White",45000));
		l.add(new Car(125,"Tata","Black",45000));
		l.add(new Car(128,"Mahindra","Blue",64000));
		
		System.out.println("Before Sorting " );
		System.out.println(l);
		System.out.println("After  Sorting in descending order by car price ");
		Collections.sort(l);
		for(Car ca:l)
		{
			System.out.println(ca);
		}
		
		System.out.println("---------------------------------------------------------");
		System.out.println("After  Sorting in Asending order by car price then by Car Colour");
		Collections.sort(l,new CarPriceThenColour());
		for(Car ca:l)
		{
			System.out.println(ca);
		}
		
	}

}
