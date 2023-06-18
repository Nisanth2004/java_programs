/****************************************************operators***************************************************************/
/*public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a=6.967,b=98,c;
 c=a+b;
System.out.println("the ANSWER IS  " + c);
	}

}
*/
/*
public class operators {

	public static void main(String[] args) {
		
		int a=11,b=98;
		a=a+6;
		c=a++;
		++a;
		 a--;
		 --a;
		 System.out.println(c);
	}
}
*/
  //////////////////////////////////                     relational operators//////////////////////////////
/*
public class operators {

	public static void main(String[] args) {
		
		int a=12,b=12;
		System.out.println(a>=b);
	}
}
	*/
///////////////////////////////////////  bitwise operators ////////////////////////
/*
import java.util.*;
public class operators {

	public static void main(String[] args) {
		
		int a=-5;
		System.out.println("right shift" + (a>>1));
		System.out.println((a>>>1));
		
 		
	}
}
/////////////////////////////////////////////////////////////////////////////
/*

boolean oiperators

~NOT   << left shift 
&AND    >> right shift
| OR     >>> right shift zero  fill

^EXOR    */

//////////////////////////////////////////////// SHORT CIRCUT LOGICAL OPERATORS////////////////////////////////////////
/*
public class operators {

	public static void main(String[] args) {
		
		int a=3;
		
		System.out.println((a>20) && (a<30));//////////////////  two && means short cicuit logical operators    //check first condition if false means all wrong 
		// does not go to second &
		// one & means both check 
	}
}

*/
/*
public class operators {

	public static void main(String[] args) {
		int a= 15;
		a= a++ + ++a;
		System.out.println(a);
	}
}
*/
/*
public class operators {

	public static void main(String[] args) {
		int a= 10,b=20;
		a= a++ + b++;
		System.out.println(a);
	}
}
*/
/*
public class operators {

	public static void main(String[] args) {
		int a= 0,b=0;
		a= --a* --b*--a*b--;
		System.out.println(a);
	}
}
*/
/*
public class operators {

	public static void main(String[] args) {
		int a=1,b;
		b= a++ + ++a *--a -  a--;
		System.out.println(b);
	}
}
*/
/*
public class operators {

	public static void main(String[] args) {
		a=11++;
		
		System.out.println(a);                                  ////////////////////  output:
		
		/////error because no const increment
	}
}

*/


////////////////////////////// switch statement 
                 // case
                 // brea
/*
                                                                              /// switch summmmmmmmmm
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		
		int a;
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("enter a  number 1 to 7:");
		
		
		 a=scanner.next().charAt(0);
		
		switch(a) {
		
		case '1':
		    System.out.println("sunday");
		   break;
		case '2':
			System.out.println("monday");
			break;
		case '3':
			System.out.println("tuesday");
			break;
		case '4':
		System.out.println("wednesday");
		break;
		case '5':
		
		  System.out.println("thursday");
		  break;
		case '6':
			
			System.out.println("friday");
			break;
		case '7':
			
			System.out.println("saturday");
		break;
			default:
			
			System.out.println("error");
			
		
		
	}
}
}




*/
/*
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		
		char vowels;
		
		Scanner scanner=new Scanner(System.in);
          System.out.println("enter a vowel:");
          vowels=scanner.nextVowel().charAt(0);
          
//          switch(vowel) {
          
          
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
        	  
        	  System.out.println("this is a vowel");
        	  
        	  default:
        		  System.out.println("error da \n  manoose madiayaaaa   poda ");
          }
	}
}
*/
/*
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class operators {

	public static void main(String[] args) {
		
		
		
		int a;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number from 1 to n:");
		a=scanner.nextInt();
		
		for(int i=1;i<=a;i++) {
			
		
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
	System.out.println();
	}
		
}


}

*/
/*
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
int a,i=0,sum=0;
		System.out.println("enter a  number:");
		a=scanner.nextInt();
		//int a,i=0,sum=0;
		while(true) {
			
		sum++;
			sum=sum+i;
		}
			System.out.println(sum);
	}
}

*/
/*
import java.util.Scanner;
//import java.util.scanner;

public class operators {

	public static void main(String[] args) {
		int i,a;
		Scanner scanner =new Scanner(System.in);
		//a=scanner.nextInt();
		
//		System.out.println("enter a array:");
//		a=scanner.nextInt();
//	//int a[]= {1,2,3,4,5,6};
//	for(i=0;i<=6;i++){
//		
//		System.out.print(i);
//	}
//	}
//}
//*/
///*
//public class operators {
//
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6,6};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//	}
//	
//}
//	*/
//	class Box{
//		int length;
//		int breadth;
//		int height;
//		
//	}
//
//	public class class {
//
//		public static void main(String[] args) {
//		
//			Box blackBox;
//			blackBox=new Box();
//			
//			blackBox.length=10;
//			blackBox.breadth=8;
//			
//			System.out.println(blackBox.height);
//		}
//
//
//
//	}
class Solution {
 public:
  int threeSumClosest(vector<int>& nums, int target) {
    int ans = nums[0] + nums[1] + nums[2];

    sort(begin(nums), end(nums));

    for (int i = 0; i + 2 < nums.size(); ++i) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      // Choose nums[i] as the first num in the triplet,
      // and search the remaining nums in [i + 1, n - 1]
      int l = i + 1;
      int r = nums.size() - 1;
      while (l < r) {
        const int sum = nums[i] + nums[l] + nums[r];
        if (sum == target)
          return sum;
        if (abs(sum - target) < abs(ans - target))
          ans = sum;
        if (sum < target)
          ++l;
        else
          --r;
      }
    }

    return ans;
  }
}













