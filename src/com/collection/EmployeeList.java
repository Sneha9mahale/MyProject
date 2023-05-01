package com.collection;

import java.util.*;
class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int Salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
}
public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee>e=new ArrayList();
		e.add(new Employee(1,"Mr.x",23000));
		e.add(new Employee(2,"Mr.y", 56000));
		e.add(new Employee(3,"Mr.z",15000));
		for(Employee ed:e)
		{
			System.out.println(ed);
		}
		Iterator<Employee>itr=e.iterator();
		while(itr.hasNext())
		{
			Employee ed=itr.next();
			if(ed.Salary<30000)
			{
				ed.Salary=ed.Salary+(ed.Salary/10)*100;
			}
		}
		
	}

}
