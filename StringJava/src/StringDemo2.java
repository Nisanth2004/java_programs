
public class StringDemo2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "TamilNadu";
		String s2 = "TamilNadu";
		String s3 = "TamilNadu";
		
		s1 = "kerala";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		
		String s4=new String("StringLearning");
		System.out.println(s4.length());
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
		System.out.println();
		String s5=new String(" ");
		System.out.println(s5.isBlank());
		System.out.println(s5.isEmpty());

	}

}
