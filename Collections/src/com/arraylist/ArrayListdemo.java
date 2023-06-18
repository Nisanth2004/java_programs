package com.arraylist;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class ArrayListdemo 
{

	public static void main(String[] args)
    {
		// TODO Auto-generated method stub

		/*
		 * 1.arraylist are resizable 2.heterogeneous objects are allowed 3.data
		 * structure : growable array
		 * 
		 * Class ---> package,constructor,methods ,variables
		 * 
		 * 
		 * add return datatype----> boolean
		 */

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(90);
		al.add(45);
		al.add("Nisanth");
		al.add(true);
		al.add('h');
		al.add(4, "Gayu");
		al.add("karthi");
		System.out.println(al.contains("vishal"));
		System.out.println(al.contains("gayathri"));

		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println(al.add(80));
		System.out.println(al);

		System.out.println(al.get(0));
		System.out.println(al.get(4));
		
		al.set(4, "abcd");
		System.out.println("index:" + al.indexOf('n'));
		
		System.out.println(al.remove(1));
		System.out.println("al list is: " + al);

		/*
		 * get() and remove() 1. both will return as the element present in partivcular
		 * index 2.-->get() will not remove the particular element from the arraylist
		 * 
		 * 3. ---> remove() will remove the particular element from the araylist *
		 */

		ArrayList al2 = new ArrayList();
		al2.addAll(al);

		System.out.println("al2 list is :" + al2);

		ArrayList al3 = new ArrayList();

		al3.add("chennai");
		al3.add("New delhi");
		al3.add("kolakata");
		al3.add("bommanapadi");
		al3.add("chennai");

		System.out.println("al3 index of chennai " + al3.indexOf("chennai"));
		System.out.println("al3 last index of chennai " + al3.lastIndexOf("chennai"));
		
		System.out.println(al3);
        System.out.println(al3.addAll(al));
		
        System.out.println("al3 list after addition is : " + al3);

		al3.removeAll(al);
		System.out.println("al3 after removeall:" + al3);
		al3.addAll(4, al);
		System.out.println(al3);
		List al4 = al3.subList(0, 3);
		System.out.println(al4);
	}

}
