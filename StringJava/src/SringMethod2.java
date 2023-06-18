
public class SringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("adaikala ruban");
		System.out.println(s);
		System.out.println(s.length());

		int i = 0;
        int count=0;
        
		while (i < s.length()) 
		{
             char ch=s.charAt(i);
             
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') { 
			    count++;
			}
			i++;
			System.out.println(s.charAt(i));
		}
		System.out.println(count);
		

	}

}
