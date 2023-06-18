package com.stringbuffer;

public class CountOfEachVowels 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String word = "education";
		int count = 0;
		int countofa = 0;
		int countofe = 0;

		for (int i = 0; i < word.length(); i++)
		{
			char ch = word.charAt(i);
			switch (ch) 
			{
			case 'a':
				countofa++;
				break;
			case 'e':
				countofe++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;

			case 'u':
				count++;
				break;
			}
		}
		System.out.println("count of a:" + countofa);
		System.out.println("count of e:" + countofe);
	}

}
