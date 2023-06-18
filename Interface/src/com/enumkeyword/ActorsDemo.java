package com.enumkeyword;

public class ActorsDemo 
{
	Actors a;

	public ActorsDemo(Actors a) 
	{
		
		this.a = a;
	}

	public static void main(String[] args) 
	{
		
		Actors[] ac=Actors.values();
		Actors.VIJAY.act();
		for(int i=0;i<ac.length;i++)
		{
			System.out.println(ac[i]+"->"+ac[i].ordinal());
			System.out.println(ac[i]+"->"+ac[i].getSalary());
		}
			
		ActorsDemo actorsdemo = new ActorsDemo(Actors.ASHOKSELVAN);
		//a.act();
		

	}

	
	 private void act() 
	 {
	  
	  System.out.println("Leo");
	  }
	 

}
