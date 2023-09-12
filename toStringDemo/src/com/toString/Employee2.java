package com.toString;

import java.util.ArrayList;

public class Employee2 
{
	int id;
	String name;

	public Employee2(String string, int i) 
	{
		this.name=string;
		this.id=i;
		
	}

	public static void main(String[] args) 
	{
		String s=new String("Nisanth");
		System.out.println(s);
		
		ArrayList al=new ArrayList();
		al.add("Mango");
		
		System.out.println(al);
		
		Integer i=9;
		System.out.println(i);
		
		Employee2 emp=new Employee2("Nisanth",99432935);
		System.out.println(emp);
		
		
          
	}
	public String toString()
	{
		return name+"  "+id;
	}

}
