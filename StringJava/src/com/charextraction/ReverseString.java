package com.charextraction;

public class ReverseString 
{

	public static void main(String[] args)
{
		// printing reversely,reverse a string,palindrome

		String string = "malayalam";
		String string2 = "";
		for (int i = string.length() - 1; i >= 0; i--) 
		{
			// System.out.println(string.charAt(i));
			string2 = string2 + string.charAt(i);

		}
		System.out.println(string2);
		if (string.equals(string2)) 
		{
			System.out.println("the given string is palindrome");
		} else
			System.out.println("not palindrome");
	}

}
