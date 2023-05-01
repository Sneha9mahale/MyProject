package com.map;
import java.util.*;
class StudentC
{
	int id;
	String name;
	String cname;
	public StudentC(int id,String name,String cname) 
	{
		super();
		this.id=id;
		this.name=name;
		this.cname=cname;
	}
	@Override
	public String toString() {
		return "StudentC [id=" + id + ", name=" + name + ", cname=" + cname + "]";
	}
	
}
public class SameCourse {

	public static void main(String[] args) {
		ArrayList<StudentC>al=new ArrayList();
		al.add(new StudentC(1,"Neha","Java"));
		al.add(new StudentC(2, "Sneha", "C++"));
		al.add(new StudentC(3,"Snehal","Sql"));
		al.add(new StudentC(4,"Purva", "Java"));
		al.add(new StudentC(5, "Puja", "Sql"));
		System.out.println(al);
		HashMap<String,ArrayList<StudentC>> hm=new HashMap();
		Iterator<StudentC>itr=al.iterator();
//		while(itr.hasNext())
//		{
//			StudentC s1=itr.next();
//			Iterator<StudentC>itr2=al.iterator();
//			ArrayList<StudentC>all=new ArrayList();
//			while(itr2.hasNext())
//			{
//				StudentC s2=itr2.next();
//			if(s1.cname.equals(s2.cname))
//			{
//				all.add(s2);
//			}
//		}
//			hm.put(s1.cname,all);
//	}
		for(int i=0;i<al.size();i++)
		{
			ArrayList<StudentC>l=new ArrayList();
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i).cname==al.get(j).cname)
				{
					l.add(al.get(j));
				}
			}
			hm.put(al.get(i).cname,l);
		}
	for(Map.Entry<String,ArrayList<StudentC>> m: hm.entrySet())
	{
		System.out.println(m.getKey() + " " + m.getValue());
	}
	
	//HashMap<String,ArrayList<String>>hm=new HashMap();
	//Iterator<StudentC>itr=al.iterator();
//	ArrayList<String>list=new ArrayList();
//	while(itr.hasNext())
//	{
//		StudentC s=itr.next();
//		if(hm.containsKey(s.cname))
//		{
//			list=hm.get(s.cname);
//			list.add(s.name);
//		}
//		else
//		{
//			list=new ArrayList();
//			list.add(s.name);
//		}
//		hm.put(s.cname, list);
//	}
//
//	for(Map.Entry<String,ArrayList<String>> m: hm.entrySet())
//		{
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
}
}
