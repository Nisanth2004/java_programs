package com.comparemethods;

public class StringBasics4 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = new String("java");
		System.out.println(s1.contentEquals(s2));// checks the content

		String s3 = new String("tiger");
		StringBuffer s4 = new StringBuffer("tiger");
		System.out.println(s3.contentEquals(s4));
	}

}
