package com.stringbuffer;

public class StringClass1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "Hi";
		s = s + 5;
		System.out.println(s);

		
		for (int i = 0; i < 1000; i++) 
		{
			s = s + i;
			// System.out.println(s);
		}

		StringBuffer stringBuffer = new StringBuffer("JavaTutorials");
		stringBuffer.append(false); // StringBuffer-mutable

		System.out.println(stringBuffer);

		stringBuffer.deleteCharAt(6);
		System.out.println(stringBuffer);

		stringBuffer.reverse();
		System.out.println(stringBuffer);

		stringBuffer.reverse();
		System.out.println(stringBuffer);

		stringBuffer.replace(0, 10, "Chennai Madurai");
		System.out.println(stringBuffer);
	}

}
