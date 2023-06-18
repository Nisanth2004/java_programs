
public class StringMethods 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = new String(" adaikala ruban");
		System.out.println(s);
		System.out.println(s.length());
		
		System.out.println(s.startsWith(" "));
		System.out.println(s.endsWith("i"));
		System.out.println(s.contains("t"));
		
		String s2=s.trim();
		System.out.println(s2);
		System.out.println(s2.length());
		
		System.out.println(s.indent('2'));

		int i = 0;

		while (i < s.length()) 
		{

			System.out.print(s.charAt(i));
			i++;

		}

	}

}
