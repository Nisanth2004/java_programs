
public class StringLearning 
{
	String name;
	int id;

	public StringLearning(String name, int id) 
	{
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}

	public String toString() 
	{

		// return this.name;
		return "" + this.id;                   // method overriding

		/*
		 * When ever we print a object toString method will call internally
		 */
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringLearning stringLearning = new StringLearning("raja", 3698);
		String s = new String("Tiger");
		System.out.println(stringLearning);
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		int i = 0;
		while (i < s.length()) 
		{
			System.out.println(s.charAt(i));
			i++;
		}
	
	   stringLearning.countofVowels();
	}

	private void countofVowels() {
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
