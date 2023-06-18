package com.arrayexamples;

import java.util.Scanner;

public class ArraySample1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int x;
		
		
		System.out.println("enter the  number of elements you have to store: ");
		int y = scanner.nextInt();

		int array[] = new int[y];
		System.out.println("enter the elements of array:");

		for (int i = 0; i < y; i++) 
		{

			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < y; i++) 
		{
			System.out.println(array[i] + array[i] + array[i]);
		}
	}

}
