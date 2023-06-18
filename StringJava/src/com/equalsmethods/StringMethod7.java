package com.equalsmethods;

public class StringMethod7 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1 = new String("Java"); // Heap memory
		String s2 = s1; // SCP
						// == means compare values and address
		s1 = new String("python"); // equals compare values in obj (SCP)
		s2 = new String("python");
		String s3 = new String(s1);
		if (s1 == s2) 
		{
			System.out.println("==");
		} else
			System.out.println("!=");

		if (s1.equals(s2))
		{
			System.out.println("equals");
		} else
			System.out.println("not equals");
	}
}
