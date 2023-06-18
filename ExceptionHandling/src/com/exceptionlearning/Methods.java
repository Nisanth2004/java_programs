package com.exceptionlearning;

public class Methods 
{
	public static void main(String[] args) 
	{
	try 
	{
		
	
     Methods t=new Methods();
     t.m1();
	}
	
	catch(Exception e )
	{
		e.printStackTrace();
	}
}

	private void m1() 
	{
		// TODO Auto-generated method stub
		System.out.println(10/0);
		m2();
	}

	private void m2() 
	{
		// TODO Auto-generated method stub
		m3();
	}


	private void m3() 
	{
		// TODO Auto-generated method stub
		m4();
	}

	private void m4() 
	{
		// TODO Auto-generated method stub
		
	}
}