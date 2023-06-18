package com.inheritance;

// single inheritance   one parent one child

public class Surya extends Sivakumar 
{
	int doorno = 75;
	String petname = "ggg";

	public static void main(String[] args)
	{

		Surya obj1 = new Surya();
		obj1.changedoorno();

		Sivakumar obj = new Surya(); // Dynamic binding
		obj.doyoga();
	}

	protected void doyoga() 
	{
		System.out.println("produce:");

	}

	void actinadvt() 
	{
		System.out.println("acting advt");

	}

	public void act()
	{

		System.out.println("acting");

	}

	void changedoorno() 
	{
		System.out.println("1\63");
	}

}
