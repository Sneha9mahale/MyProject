package com.map;
import java.util.*;
class CarInfo
{
	int modleNo;
	String cname;
	String colour;
	public CarInfo(int modleNo, String cname, String colour) {
		super();
		this.modleNo = modleNo;
		this.cname = cname;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "CarInfo [modleNo=" + modleNo + ", cname=" + cname + ", colour=" + colour + "]";
	}
	@Override
	public int hashCode()
	{
		return modleNo;
	}
	@Override
	public boolean equals(Object o)
	{
		CarInfo c=CarInfo
	}
	
}


public class CarTask {

	

	public static void main(String[] args) {
		HashMap<CarInfo,Integer>hm=new HashMap();
		hm.put(new CarInfo(123, "Renault", "Yellow"), 340000);
		hm.put(new CarInfo(127,"Tata","White"), 450000);
		hm.put(new CarInfo(125, "Mahindra", "Red"), 500000);
		hm.put(new CarInfo(126, "Tata", "Yellow"), 456000);
		for(Map.Entry<CarInfo,Integer>m:hm.entrySet())
		{
			System.out.println(m.getKey()+" value = "+m.getValue());
		}
	

	}

}
