package com.enumkeyword;

public enum Actors 
{
	VIJAY()
	{
		public void act()
		{
			System.out.println("Dancing super");
		}
	}, AJITH(40), SIVAKARTHIKEYAN(15), SUSHANTHSINGH(34), ASHOKSELVAN(56);

	private int salary;

	Actors(int salary) 
	{
		this.salary = salary;
	}

	Actors() {
		// TODO Auto-generated constructor stub
		this.salary=0;
	}

	public int getSalary() 
	{

		return this.salary;
	}

	 void act() {
		// TODO Auto-generated method stub
		System.out.println("bigil");
		
	}
}
