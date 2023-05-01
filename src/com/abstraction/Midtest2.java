package com.abstraction;
import java.util.Scanner;
class Course
{
	int cid;
	String nm;
	public int getId() {
		return cid;
	}
	public void setId(int cid) {
		this.cid = cid;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
}
class Studentc{
	int id,marks;
	String name;
	Course c;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Course getC()
	{
		return c;
	}
	public void setC(Course c)
	{
		this.c=c;
	}
	
}
public class Midtest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details : ");
		System.out.println("Enter Student id");
		int sid=sc.nextInt();
		System.out.println("Enter Student Name :");
		String snm=sc.next();
		System.out.println("Enter Student Marks : ");
		int smr=sc.nextInt();
		System.out.println("Enter Course Details : ");
		System.out.println("Enter Course id : ");
		int cide=sc.nextInt();
		System.out.println("Enter Course Name : ");
		String cnm=sc.next();
		Studentc s=new Studentc();
		
		s.setId(sid);
		s.setMarks(smr);
		s.setName(snm);
		s.setC(new Course());
		s.getC().setId(cide);
		s.getC().setNm(cnm);
		System.out.println("Course Name : "+s.getC().getNm());

	}

}
