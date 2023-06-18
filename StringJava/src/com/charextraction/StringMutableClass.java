package com.charextraction;

public class StringMutableClass 
{

	public static void main(String[] args) 
	{
		StringMutableClass stringBuilder = new StringMutableClass();
		String[] names = { "Nisanth", "Ramu", "Raja" };
		stringBuilder.joinwords(names);
	}

	private void joinwords(String[] names) 
	{

		// for each loop
		/// unidirectional

		String sentence = "";

		StringBuffer stringBuffer = new StringBuffer("");
        
		StringBuffer stringBuffer2 = new StringBuffer("raja");
		
		stringBuffer2.insert(1, 'a');
		System.out.println(stringBuffer2);
		
		StringBuffer stringBuffer3=new StringBuffer("raja");
		stringBuffer3.replace(0, 2, "ka");// inclusive 0,exclusive 2== 0-->1
		System.out.println(stringBuffer3);
		
		StringBuffer stringBuffer4=new StringBuffer("KARTHIGA");
		stringBuffer4.reverse();
		System.out.println(stringBuffer4);
		
		for (String name : names) 
		{
			stringBuffer.append(names);
			System.out.println("StringBuffer hashcode:" + stringBuffer.hashCode());
			
			sentence = sentence + name;
			System.out.println("StringHashcode:" + sentence.hashCode());
		}
		System.out.println(sentence);
	}

}
