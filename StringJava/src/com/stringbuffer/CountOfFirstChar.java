package com.stringbuffer;

public class CountOfFirstChar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String string = "ailesajhhuhaaa";
		char first = string.charAt(0);
		System.out.println(first);
		int count = 1;

		for (int i = 1; i <= string.length() - 1; i++) 
		{
			if (first == string.charAt(i))
				;
			count++;
		}

		System.out.println("The count of first char :" + count);
	}

}
