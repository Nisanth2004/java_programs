package com.stringbuffer;

public class CountOfAnyChar
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String word = "Chennai";
		char search = 'n';
		int count = 0;
		for (int i = 0; i < word.length(); i++) 
		{
			if (search == word.charAt(i))

				count++;

		}
		System.out.println(count);
	}

}
