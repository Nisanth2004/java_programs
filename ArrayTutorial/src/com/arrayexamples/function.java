package com.arrayexamples;

import java.util.Scanner;

public class function 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a number:");
		int x = scanner.nextInt();

		System.out.println("enter a number:");
		int y = scanner.nextInt();

		int sum = x + y;
		System.out.println("the result is:");
		System.out.printf("sum:" + sum);
	}

}
