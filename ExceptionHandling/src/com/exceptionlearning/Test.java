package com.exceptionlearning;

public class Test 
{

	public static void main(String[] args) 
	{
		
		PasswordException passwordException = new PasswordException();

		try 
		{
			passwordException.verifypassword("Nisan");
		}
		
		catch (Exception e) 
		{
			
			System.out.println("Too short password");
		}

	}
}
