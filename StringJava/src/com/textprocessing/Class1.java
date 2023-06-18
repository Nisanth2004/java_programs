package com.textprocessing;

public class Class1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "Payilagam Chennai Tamil Nadu";
		System.out.println(s.matches("\\w{8} \\w{7}"));
		
		System.out.println(s.replace('a', 'e'));
		System.out.println(s.replace("Pa", "pe"));
		
		System.out.println(s.replaceAll("\\s", "-"));
	    System.out.println(s.replaceFirst("\\s", "-"));
	    
	    
	    
	    String[] s2=s.split(" ");
	    for(String ss:s2) 
	    {
	    System.out.println(ss);
	    }
	    
	    String[] s3=s.split(" ", 2);
	    for(String in:s3) {
	    	System.out.println(in);
	    }
	    
	    // static methods
	    
	    System.out.println("My date of birth is :"+String.join("-", "23","10","2004"));
        int no1=5;
	    String a=s.valueOf(no1);  // value of important static method
		System.out.println(a); // it converts primitive data type int non primitive
	    System.out.println(no1+5);
	    System.out.println(a+5);
	    
	    
	    System.out.println();
	    
	    System.out.println(s.contains("Tamil"));
	    
	    System.out.println(s.contains("English"));
	}

}
