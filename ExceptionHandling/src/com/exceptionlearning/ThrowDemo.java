package com.exceptionlearning;

public class ThrowDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThrowDemo throwDemo = new ThrowDemo();
		ThrowDemo throwDemo2;

		try 
		{
			throwDemo.test();

		} 
		
		catch (NullPointerException npe) 
		{
			System.out.println("Caught Second Time");
		}

	}

	private void test() 
	{
		// TODO Auto-generated method stub
		try 
		{
		  throw new NullPointerException();
		} 
		
		catch (NullPointerException npe) 
		{
			System.out.println("NPE");
			throw npe;
		}
	}

}
