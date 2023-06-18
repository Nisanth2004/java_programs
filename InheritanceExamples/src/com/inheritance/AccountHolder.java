package com.inheritance;

public class AccountHolder 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Bank bb = new Bank();
		int min = bb.getMinimumBalance();

		System.out.println(min);
		bb.setMinimumBalance(3000);
		
		min = bb.setMinimumBalance();
		System.out.println(min);

	}

}
