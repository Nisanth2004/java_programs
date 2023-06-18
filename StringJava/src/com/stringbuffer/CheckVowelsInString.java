package com.stringbuffer;

public class CheckVowelsInString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String word = "education";
		int count = 0;
		for (int i = 0; i < word.length(); i++) 
		{
			char ch = word.charAt(i);
			switch (ch) 
			{
			case 'a':

			case 'e':

			case 'i':

			case 'o':

			case 'u':
				count++;

			}

		}
		if (count == 0) 
		{
			System.out.println("no vowels present");
		} else 
		{
			System.out.println("count of vowels " + count);

		}
	}
}
