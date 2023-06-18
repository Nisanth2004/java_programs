package com.innerclass;

public class CollegeDemo {
	String principalName = "shanmugam";
	int fee = 30000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CollegeDemo principal=new CollegeDemo();
         principal.creatingDepts();
		
	}
	public void creatingDepts()
	{
		System.out.println("Setting team for departments");
		class Dept{
			public void inagurate(int amount)
			{
				System.out.println("Team Started");
			}
		}
		
		Dept hod=new Dept();
		hod.inagurate(10000);
	}

}
