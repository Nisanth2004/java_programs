
import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        
        
		/*
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt();
		 */
    	int row;
        
        for( row=1;row<=3;row++)
        {
            for(int space=2;space>=row;space--)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=row;c++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        
    }
}