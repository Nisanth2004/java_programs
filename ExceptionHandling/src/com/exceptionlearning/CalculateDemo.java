package com.exceptionlearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
                CalculateDemo calculate=new CalculateDemo();
                calculate.div();
                
	}

	public void div() throws ArithmeticException,InputMismatchException
	{
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers: ");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			
			System.out.println(no1/no2);
			
			
	}
		
		
		
	}


