package com.map;
import java.util.*;
class Train implements Comparable<Train>{
	int trainid;
	String tname;
	int tseat;
	String depsname;
	public Train(int trainid, String tname, int tseat, String depsname) {
		super();
		this.trainid = trainid;
		this.tname = tname;
		this.tseat = tseat;
		this.depsname = depsname;
	}
	@Override
	public String toString() {
		return "Train [trainid=" + trainid + ", tname=" + tname + ", tseat=" + tseat + ", depsname=" + depsname + "]";
	}
	@Override
	public int compareTo(Train t)
	{
		//return t.tseat-this.tseat;
		if(this.tseat>t.tseat)
		{
			return 1;
		}
		else if(this.tseat<t.tseat)
		{
			return -1;
		}
		else
		{
			if(this.depsname.compareTo(t.depsname)==0)
			{
				return this.trainid-t.trainid;
			}
			else
			{
				return this.depsname.compareTo(t.depsname);
			}
		}
	}
	
}
public class TrainInfo {

	public static void main(String[] args) {
		TreeMap<Train,Integer>tm=new TreeMap<Train,Integer>();
		tm.put(new Train(102,"Rajdhani",200," Pune "), 400);
		tm.put(new Train(101,"Bhagirati",250," Gujrat "), 500);
		tm.put(new Train(102,"Amrapali",280," Bhopal "), 560);
		tm.put(new Train(104,"bcg",250," Rajsthaan "), 600);
		
		for(Map.Entry<Train,Integer>m:tm.entrySet())
		{
			System.out.println(m);
		}

	}

}
