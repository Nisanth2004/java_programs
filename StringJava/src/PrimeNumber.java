import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String args[])
	{
		System.out.println("enter a number:");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		if (num = 1)
		{
			System.out.println("the number neither prime nor composite:");
		} 
		else if (num == 2) 
		{
			System.out.println("2 is a prime number:");
		}
		else if (num % 2 == 0) 
		{
			System.out.println(num + "is not a prime number");
		} 
		else 
		{
			int sqrt = (int) Math.sqrt(num);
			for (int i = 3; i <= sqrt; i++)
			{
				if (num % i == 0) {
					System.out.println(num + "is not a prime number");
					// return 0;

				}
				System.out.println(num + "is not a prime number");
			}
		}
	}
}
