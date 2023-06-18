package com.charextraction;

public class Class3 
{

	public static void main(String[] args) 
	{
		// First letter repeated or not
		String word = "aglesd";
		char ch = word.charAt(0);
		boolean repeat = false;
		for (int i = 1; i < word.length(); i++) 
		{
			if (ch == word.charAt(i)) {
				System.out.println(ch + " repeated");
				repeat = true;
				break;
			}
		}
		if (repeat == false) 
		{
			System.out.println(ch + " not repeated");
		}
	}

}
