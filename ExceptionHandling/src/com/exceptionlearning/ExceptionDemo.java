package com.exceptionlearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		ExceptionDemo exceptionDemo=new ExceptionDemo();
	    exceptionDemo.getdetails();
	    exceptionDemo.display();
	   
	}
	     public void display() {
		       int no1=12,no2=0,no3=-9;
		       try 
		       {
		    	 System.out.println(no1/no2);
		    	 int arr[]=new int[no3];
		       }
		       
		       catch(ArithmeticException | NegativeArraySizeException e) 
		       {
		    	   System.out.println(e.getMessage());
		    	   System.out.println("Check Check Check");
		       }
		
	}
		public void getdetails() 
		{
	

        Scanner sc=new Scanner(System.in);
         
          try {
         System.out.println("Enter your Account number");
         int accNo=sc.nextInt();
         System.out.println("Enter PIN number: ");
         int pin=sc.nextInt();
         System.out.println(accNo/pin);
         System.out.println("Enter array length:");
         
         try 
         {
         int len=sc.nextInt();
         
         int[] empDetails=new int[len];
         
         for(int i=0;i<=empDetails.length;i++)
         {
       	      empDetails[i]=20000;
       	
         }
        
         }
         
         catch(NegativeArraySizeException ne) 
         {
       	 System.out.println("Array length should be positive or zero!");
         }
         
         }
          
          catch(ArithmeticException ae) 
          {
        	  System.out.println(ae.getMessage());
        	  System.out.println("Please not to provide  the number zero!");
          }
          
          catch(InputMismatchException ime)
          {
        	  ime.printStackTrace();
        	  System.out.println("Please check your Account number or PIN number ");
          }
          
          catch(ArrayIndexOutOfBoundsException ae)
          {
        	  System.out.println("Kindly check your Array length");
          }
          
          catch(Exception e)
          {
        	  System.out.println("Incorrect");
          }
          
          finally  
          {
        	  System.out.println("Close the page ");
          }
	}
}
  // NESTED TRY
/*
 * try{
 *      try{
 *      
 *      }
 *      catch(Exception ae){
 *      
 *      }
 *      }
 *      catch(Exception e){
 *      
 *      }
 */


