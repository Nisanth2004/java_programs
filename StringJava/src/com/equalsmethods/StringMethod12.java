package com.equalsmethods;

public class StringMethod12 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = s1 + s1;
		String s3 = "JavaJava"; // == means compare values and address
		// equals compare values in object (SCP)

		if (s2 == s3) {
			System.out.println("==");
		} else
			System.out.println("!=");

		if (s2.equals(s3)) {
			System.out.println("equals");
		} else
			System.out.println("not equals");
	}
}
