package com.strip_repeat;

public class StringClass1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = " Crompton Fan ";
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.toUpperCase());

		System.out.println(s.length());
		String s2 = s.strip(); // leading and trailing space removed
		System.out.println(s2);
		System.out.println(s.trim());// leading and trailing space removed
		System.out.println(s.stripLeading());// leading space is remove
		System.out.println(s.stripTrailing());// trailing space is removed

		System.out.println(s.repeat(4));

		System.out.println("                                     indent");

		System.out.println(s.indent(56));
		System.out.println(s.toCharArray());

	}

}
