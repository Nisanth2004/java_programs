package com.arrayexamples;

import java.util.Scanner;

public class ArraySample 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");

		n = sc.nextInt();

		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		
		
		for (int i = 0; i < n; i++) 
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Array elements are: ");

		for (int i = 0; i < n; i += 2) 
		{
			System.out.println(array[i]);
		}
	}
}