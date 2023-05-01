package com.map;
import java.util.*;
import java.util.Scanner;
class Course
{
	int cid;
	String cname;
	public Course(int cid,String cname)
	{
		super();
		this.cid=cid;
		this.cname=cname;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
class Stud
{
	int id;
	String name;
	ArrayList<Course>al;
	public Stud(int id,String name,ArrayList<Course>al)
	{
		super();
		this.id=id;
		this.name=name;
		this.al=al;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ",al=" + al + "]";
	}
	
}

public class StuCourse {

	public static void main(String[] args) {
		
		ArrayList<Stud>list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter Student Id : ");
			int sid=sc.nextInt();
			System.out.println("Enter Student Name : ");
			String sname=sc.next();
			ArrayList<Course>c=new ArrayList();
			for(int j=1;j<=2;j++)
			{
				System.out.println("Enter Course id : ");
				int cid=sc.nextInt();
				System.out.println("Enter Course Name : ");
				String cname=sc.next();
				
				c.add(new Course(cid,cname));
			}
			list.add(new Stud(sid,sname,c));
		}
		HashMap<String,ArrayList<String>>hm=new HashMap();
		
		Iterator<Stud>itr=list.iterator();
		ArrayList<String>list1=new ArrayList();
		String CName="";
		while(itr.hasNext())
		{
			Stud s =itr.next();
			ArrayList<Course>al=s.al;
			Iterator<Course>it=al.iterator();
			while(it.hasNext())
			{
				Course c=it.next();
				if(hm.containsKey(c.cname))
				{
					list1=hm.get(c.cname);
					list1.add(s.name);
					CName=c.cname;
				}
				else
				{
					list1=new ArrayList();
					list1.add(s.name);
					CName=c.cname;
				}
			}
			hm.put(CName, list1);
			
		}
		for(Map.Entry<String,ArrayList<String>>n:hm.entrySet())
		{
			System.out.println(n.getKey()+" "+n.getValue());
		}
		
	}

}
