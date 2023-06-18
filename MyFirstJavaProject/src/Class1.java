/*import java.io.*;// printscream
public class FirstClass 
{ // case senstive
    public static void main(String args[]) 
    {
    	
    	int ticketPrice;
    	ticketPrice=900;// variable declaration
    	boolean paid=true;
    	char c='t';
    	System.out.println(paid);
    	System.out.println(c);
    	System.out.println("\n ticketPrice is " + ticketPrice);
    	
    }
}
*/
****************


/*
public class Firstclass 
{ // case senstive
    public static void main(String args[])
     {
    	System.out.println("hello \nworld");
    }
}
 */   

/*public class FirstClass 
 * { // case senstive
    public static void main(String args[]) 
    {
    	
    int n =0b0101101e-05;
    int n2=123_44_5477;
    	System.out.println(n);
    }
}
*/
****************
/*
public class FirstClass
 { // case senstive
    public static void main(String args[])
     {
    	byte b;
    	
    	int n=12;//automatic type conversion
    	b=(byte)n;
    	
    	
    	
    	System.out.println(n);
    }
    	
    	
    }
*/




/////////////////////////////////////////////////    getting input from user        //////////////////////////
import java.util.Scanner;
public Class FirstClass 
{ // case senstive
    public static void main(String args[]) 
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("what is your name");
    
    String name = scanner.nextLine();
    
    
    System.out.println("what is your rating from 1 to 5");
    int rating=scanner.nextInt();
    
    scanner.nextLine();  // after scanner any number we have to put this line because to scanner any other string below 
                          // anyway always to use this line below after scanning the number 
    
    System.out.println("enter email");
    
    String email=scanner.nextLine();
    
    System.out.println("hello"  +  name);
    System.out.println("you rated as " + rating);

    System.out.println("your email is " + email);
    }
}
