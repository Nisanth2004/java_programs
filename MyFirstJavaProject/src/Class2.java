
/*public class MainMethod 
{
	
	public static void     
	{
		System.out.println("hello");
	}
}
*/
//import java.util.Scanner;
//public class main {
//	public static void main(String[] args) {
//		
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("enter a number:");
//		int i;
//		int num=scanner.nextInt();
//		boeelean prime=true;
//		for(i=1;i*i<num;i++) {
//			if(num%2==0) {
//				prime=false;
//			}
//		}
//		if(prime) {
//			
//		
//	
//			System.out.println("hello world");
//		}
//			else if
//		{
//			
//		
//		System.out.println("file");
//	}
//		else if  {
//			System.out.println("ji");
//		}
//}
//	}
//           }
//	}
//}
//
//	
//
//
//
//

public class MainMethod {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 3, 2, 1, 2, 2, 11, 12, };
		// System.out.println("Duplicates eklements are:");

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicates elements are :" + arr[i]);

				}

			}
		}
	}

}