package com.inheritance;

public class Bank 
{
	private int minimumbalance = 2500;

public int getMinimumBalance() 
{
	return this.minimumbalance;
	
	public void setMinimumBalance(int value) 
	{
		if(value>=2500) 
		this.minimumbalance=value;
	}
}

	public void setMinimumBalance(int i) 
	{
		// TODO Auto-generated method stub

	}

}
