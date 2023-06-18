package com.stringbuffer;

public class StringClass3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String word = "Perambalur 621104";
		for (int i = 0; i < word.length(); i++) 
		{
			if (word.charAt(i) >= '0')
				if (word.charAt(i) <= '9')
					System.out.print(word.charAt(i));

		}
	}

}
