package com.arraylist;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayBasics 
{

	public ArrayBasics(String name) 
	{
		this.name = name;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a1[] = { 12, 235, 34 };
		int[] a2 = { 12, 23, 34 };

		Arrays.sort(a2);

		for (int i = 0; i < a2.length; i++) 
		{
			System.out.println(a2[i]);
		}
		String[] names = { "nisanth", "karthi", "krishna", "sujith" };
         //Arrays.sort(names);

		Comparator cd = new Comp();
		Arrays.sort(names, cd);
		
		System.out.println("using comnpartor interface:");
		for (int i = 0; i < names.length; i++) 
		{
			System.out.println(names[i]);
		}

		ArrayBasics obj1 = new ArrayBasics("Nisath");
		ArrayBasics obj2 = new ArrayBasics("sujith");
		ArrayBasics obj3 = new ArrayBasics("karthiga");

		ArrayBasics[] ab = { obj1, obj2, obj3 };
		Arrays.sort(ab);
		for (int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]);
		}
		boolean same = Arrays.equals(a1, a2);
		System.out.println(same);
	}

}
