package com.arrayexamples;
import java.util.Scanner;
class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput =new Scanner(System.in);
		
		System.out.println("Welcpme to the calculator");
		System.out.println("Please enter your first value:");
		double x=userInput.nextDouble();
		System.out.println("Please enter your second value:");
		double y=userInput.nextDouble();
		
		userInput.close();
		
		double sum=x+y;
		double substract =x-y;
		double quotient =x/y;
		double remainder=x%y;
		double product =x*y;
		
		System.out.println("The result are as follows:");
		System.out.printf("sum: %f",sum);
		System.out.printf("substract:%f",substract);
		System.out.printf("quotient:%f",quotient);
		System.out.printf("Remainder:%f",remainder);
		System.out.printf("Product:%f",product);
	}

}
