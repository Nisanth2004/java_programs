package com.comparemethods;

public class StringBasics1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2)); // ignore the upper or lower case
	}

}
