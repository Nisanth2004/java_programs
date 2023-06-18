package com.charextraction;

public class CharExtraction1 
{

	public static void main(String[] args) 
	{
		
		String s1 = "Payilagam Chennai";
		
		System.out.println(s1.charAt(0));
		
		// System.out.println(s1.charAt(-1));// StringIndexOutofboundsException
		
		System.out.println(s1.substring(10));

		System.out.println(s1.substring(5, 15));
		
		System.out.println(s1.subSequence(10, 17));
	}

}
