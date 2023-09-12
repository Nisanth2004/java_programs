package com.toString;

public class StringLearnings 
{
	int price;

	public static void main(String[] args) 
	{
		StringLearnings sl = new StringLearnings();
		sl.price = 900;
		
		System.out.println(sl);// internally call toString method
		System.out.println(sl.hashCode());

		StringLearnings sl2 = new StringLearnings();
		sl2.price = 900;
		
		System.out.println(sl2);
		System.out.println(sl2.hashCode());

		if (sl.equals(sl2)) 
		{
			
			System.out.println("Both objects are equal");
		} 
		else 
		{
			System.out.println("Not equal");
		}

		// Every child class has a parent class its name Object
		// Object is the base class for every class in java
		// An Object of one class acting Another class object
	}

	public String toString() // can be Overrided
	{
		return "toString is overrided";
	}

	public int hashCode() 
	{
		return 94333;
	}

	public boolean equals(Object o) // it is non static method
	{

		/*
		 * -->sl2 will be convert into parent class object i.e,Object o -->Next Parent
		 * class object will be convert into Child class object -->so we do Casting to
		 * convert (Object o) to s -->sl will be accessed by this keyword sl2 willl be
		 * converted inro 's' as object name
		 */
		StringLearnings s = (StringLearnings) o;
		if (this.price == s.price)
			return true;
		else
			return false;
	}
}
