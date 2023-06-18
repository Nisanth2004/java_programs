package com.charextraction;

public class StringMutableClass1 
{

	public void addwords(String[] names) 
	{
		StringMutableClass1 builder = new StringMutableClass1();
		String[] names1 = { "naveen", "harish", "nisanth" };

		StringBuilder builder1 = new StringBuilder();
		builder1.append("naresh");
		System.out.println(builder1);

	}

	// stringbuffer is thread safe
	// all methods are synchronized

	// stringbuilder is not thread safe
	// all methods are non synchronized

}
