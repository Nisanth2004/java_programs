package com.stringbuffer;

public class StringClass2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       String s1="educatioion";
        for(int i=0;i<s1.length();i++) 
        {
        	char ch=s1.charAt(i);
        	
        	switch(ch) 
        	{
        	case 'a':
        	case 'e':
        		
        	case 'i':
        	case 'o':
        	case 'u':
        		System.out.println(ch);
        		
        	}
        }
	}

}
