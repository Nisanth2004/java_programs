
public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              StringDemo3 stringDemo=new StringDemo3();
              stringDemo.countofVowels();
              stringDemo.countofWords();
              stringDemo.countofSentences();
              
              
	}

	private void countofSentences() {
		// TODO Auto-generated method stub
		String s="I am Nisanth. I am currently pursuing B.E,. All is well. ";
		int i=0;
		int count=0;
		while(i<s.length())
		{
			if(s.charAt(i)=='.')
			{
				if(s.charAt(i+1)==' ')
				count++;
			}
			i++;
		}
		System.out.println("No of sentences in given string:"+count);
	}

	private void countofWords() {
		// TODO Auto-generated method stub
		String s=new String("All are equal");
		int i=0;
		int count=1;
		while(i<s.length())
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
			i++;
		}
		System.out.println("No of words in given string:"+count);
	}

	private void countofVowels() {
		// TODO Auto-generated method stub
		String s = new String("anantha vikatan");
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
		}
		System.out.println(count);
	}

}
