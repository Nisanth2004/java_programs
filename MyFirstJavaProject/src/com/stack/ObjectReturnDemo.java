package com.stack;

import jdk.internal.misc.FileSystemOption;

public class ObjectReturnDemo 
{

	static void increment(int a)
	{
		 a++;
		// TODO Auto-generated method stub
	public static void main(String[] args)
        {
        	int a=10;
        	increment(a);
        	increment(a);
        	System.out.println(a);
        	
        	Box b1=new Box(4,5,6);
        	
        	Box b2=new Box(4,5,6);
        	Box  b3=b1.double()
        			
        			System.out.print(b1.isEqual(b2));
        	System.out.println(b2.Length);
        }
}

}
