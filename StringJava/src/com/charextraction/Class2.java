package com.charextraction;

public class Class2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "perambalur";// PeRaMbAlUr
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{
			if (i % 2 == 0)
				if (ch[i] >= 'a')
					if (ch[i] <= 'z')
						ch[i] = (char) (ch[i] - 32);
		}
		s = new String(ch);
		System.out.println(s);
	}

}
