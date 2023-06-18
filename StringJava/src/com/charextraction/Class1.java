package com.charextraction;

public class Class1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "perambalur";
		char[] ch = s.toCharArray();

		ch[0] = (char) (ch[0] - 32);
		s = new String(ch);
		System.out.print(s);

	}

}
