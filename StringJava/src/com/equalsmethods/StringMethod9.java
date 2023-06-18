package com.equalsmethods;

public class StringMethod9 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = new String("Java"); // Heap memory
		String s2 = "Java"; // SCP
		s1 = null; // == means compare values and address
					// equals compare values in obj (SCP)

		if (s2 == s1) 
		{
			System.out.println("==");
		} else
			System.out.println("!=");

		if (s2.equals(s1)) 
		{
			System.out.println("equals");
		} else
			System.out.println("not equals");
	}

}
