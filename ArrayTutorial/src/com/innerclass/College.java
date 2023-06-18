package com.innerclass;

public class College 
{
	static String principalName = "shanmugam";
	int fee = 30000;
	// inner class can access all fields(all members of outer class either static or
	// non static)
	int fine = 1;

	public static void main(String[] args) 
	{
		College principal = new College();
		College.Department hod = principal.new Department();
		hod.conductFunction();

	}

	public void meetingHODs() 
	{
		Department hod = new Department();
		hod.conductFunction();
	}

	class Department
	{
		int fine = 2;

		public void conductFunction() 
		{
			int fine = 1000;
			System.out.println(fine);
			System.out.println(this.fine);
			System.out.println(College.this.fine);
			System.out.println(fee);
			System.out.println(principalName);
			System.out.println("ECE dept.function");
		}
	}

}
