package com.arraylist;

public class Arraybasics1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean same = true;
		int[] a1 = { 12, 2, 3, 4 };
		int[] a2 = { 12, 3, 4, 5 };
		int i = 0;
		while (i < a1.length) 
		{
			if (a1 != a2) 
			{
				same = false;
				System.out.println("not same");
				break;
			}
			i++;
			if (same == true) 
			{
				System.out.println("true");
			}
		}

	}

}
