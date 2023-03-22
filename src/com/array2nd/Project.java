 package com.array2nd;

class Coursed{
	int course_code;
	String course_name;
	int fees;
	String course_type;
	Coursed course[];
	int count=0;
	Coursed()
	{
		
	}
	void createCourse() {
		course=new Coursed[3];
	}
	Coursed(int id,String cname,int fee,String types)
	{
		this.course_code=id;
		this.course_name=cname;
		this.fees=fee;
		this.course_type=types;
	}
	void InsertCourseDetails( int course_id,String course_name,int fees,String course_type )
	{
		course[count]=new Coursed(course_id,course_name,fees,course_type);
		count++;
	}
	
	void showAllCourse()
	{
		for(Coursed c:course)
		{
			System.out.println(c);
		}
	}


void showCourseByCode(int code)
{
	for(Coursed c:course)
	{
		if(code==c.course_code)
		{
			System.out.println(c);
		}
	}
}
public String toString()
{
	return course_name+" "+course_code;
}

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
