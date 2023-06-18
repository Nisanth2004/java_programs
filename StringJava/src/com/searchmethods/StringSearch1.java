package com.searchmethods;

//import jdk.internal.misc.FileSystemOption;

public class StringSearch1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String string1 = "SearchingMethods";
		System.out.println("First occurance of a is : " + string1.indexOf('a'));
		System.out.println(string1.indexOf("Methods"));
		System.out.println(string1.indexOf('o', 7)); // after pos 7 where the 'o' come
		System.out.println(string1.indexOf("ds", 7)); // after pos 7 where the "ds " come
		System.out.println();

		System.out.println("last index of methods ");
		System.out.println();
		System.out.println("First occurance of a is : " + string1.lastIndexOf('a'));
		System.out.println(string1.lastIndexOf("Methods"));
		System.out.println(string1.lastIndexOf('o', 16));
		System.out.println(string1.lastIndexOf("ds", 16));

	}

}
