package com.exceptionlearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo1 cd = new Demo1();
		cd.divide();
//      cd.add();
		int no2;
		int no1;

	}

	public void add() 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter numbers:");
		int no1 = scanner.nextInt();
		int no2 = scanner.nextInt();
		int result = no1 + no2;
		System.out.println("additon:" + result);
	}

	public void divide() 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers:");
		try 
		{
			int no1 = scanner.nextInt();

			int no2 = scanner.nextInt();

			int result = no1 / no2;
			System.out.println("divided :" + result);
		} 
		
		catch (ArithmeticException ae)      // catch(ArithmeticException ae)
		{ 
			
			System.out.println("no2 value is zero so kindly check no2 value:");
			divide();
		}
		
		catch (InputMismatchException ime) 
		{
			System.out.println("enter only integer:");
			divide();
		} 
		
		catch (Exception ae) 
		{
			System.out.println("Unknown reasons:");
			divide();
		} 
		
		finally 
		{
			System.out.println("final block");
		}
		    add();
	}

}

/*
 * 
 */
