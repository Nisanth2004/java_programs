package com.exceptionlearning;

public class PasswordException extends Exception
{
          public void verifypassword(String pwd) throws PasswordException
          {
        	  if (pwd.length()<8) 
        	  {
              PasswordException passwordException=new PasswordException();
        	  throw passwordException;
        	  }
        	  
        	  System.out.println("Strong Password");
          }
}
