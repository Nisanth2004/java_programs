package com.equalsmethods;

public class StringMethod11 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "Java"; // SCP
		String s2 = "Jav"; // SCP
		s2 = s2 + "a"; // == means compare values and address
		// equals compare values in obj (SCP)

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
