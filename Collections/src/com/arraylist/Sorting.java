package com.arraylist;

import java.util.Arrays;

public class Sorting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a1 = { 12, 2, 3, 4 };
		int[] a2 = { 12, 3, 4, 5 };

		Arrays.sort(a2);

		for (int i = 0; i < a2.length; i++) 
		{
			System.out.println(a2[i]);
		}
	}

}
