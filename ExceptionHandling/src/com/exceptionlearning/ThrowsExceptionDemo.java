package com.exceptionlearning;

import java.util.InputMismatchException;

public class ThrowsExceptionDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
		CalculateDemo calculateDemo=new CalculateDemo();
		
		              calculateDemo.div();
		}
		
		catch(InputMismatchException ie)
		{
		   	System.out.println("Give only numbers!");
		}
		
		catch(ArithmeticException ae) 
		{
			System.out.println("not give zero");
		}
	}

}
