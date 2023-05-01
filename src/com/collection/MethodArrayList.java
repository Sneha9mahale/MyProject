package com.collection;
import java.util.*;
public class MethodArrayList {

	public static void main(String[] args) {
		ArrayList<String>name=new ArrayList<>();
		name.add("Sneha");
		name.add("Akansha");
		name.add("Gauri");
		name.add("Samiksha");
		System.out.println(name);
		
		ArrayList<String>namelist=new ArrayList<>();
		namelist.add("Vicky");
		namelist.add("Rachit");
		//After adding namelist modified name;
		name.addAll(namelist);
		System.out.println(name);
		name.addAll(1, namelist);
		System.out.println(name);
		//After adding object at specified index
		name.add(2,"Minal");
		name.set(1, "Puja");
		System.out.println(name);
		
		//Sublist(startindx,endindex)
		System.out.println("Subjist from name");
		List<String>l=name.subList(2, 6);
		System.out.println(l);
		
		//It Remove first Occurance of Object
		if(name.contains("Sneha"))
		{
			boolean reuslt=name.remove("Sneha");
		}
		System.out.println(name);
		
		//ToRemove all Occurance Of Object
		//all Occurance Of Rachit object
		/*String str=null;
		for(String s:name)
		{
			if(s.equals("Rachit"))
				str=name.remove(name.indexOf(s));  
		}*/
		
//		for(int i=0;i<name.size();i++)
//		{
//			
//			if(name.equals("Rachit"))
//			{
//			name.remove(name.indexOf(i));
//			}
//		}
//		System.out.println(name);
		
		ArrayList<String>l1=new ArrayList<>();
		l1.add("Rachit");
		l1.add("Akansha");
		name.retainAll(l1);
		System.out.println("After Retaining only l1,elements in name : ");
		System.out.println(name);
	}

}
