package com.comparemethods;

public class StringBasics2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = new String("java");

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}
// compareto will give possitive ,negative zero
// positive=not same->big
// negative= not smae->small
// zer0= same