package com.comparemethods;

public class StringBasics3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = new String("java");

		System.out.println(s1.startsWith("J"));
		System.out.println(s1.endsWith("h"));

		String s3 = new String("phpjava");
		System.out.println(s3.startsWith("java", 3));
	}

}
