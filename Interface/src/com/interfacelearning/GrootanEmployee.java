package com.interfacelearning;

import com.learning.EmployeeRules;
import com.learning.FamilyRules;

public class GrootanEmployee implements EmployeeRules, FamilyRules
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		GrootanEmployee obj = new GrootanEmployee();
		obj.maintainhours();
		obj.dress();
		// obj.salary=80999;
		obj.enjoy();
		// obj.leaves=19;
		
		System.out.println(obj.teaamount); // using object we call the method
		System.out.println(GrootanEmployee.leaves); // using class name we call the method
													// because variables is static
		System.out.println(EmployeeRules.salary);
		
		EmployeeRules mother = new GrootanEmployee();
		mother.dress();
		
		FamilyRules father = new GrootanEmployee(); // dynamic binding
		father.eattogether();
//   father.report();       
	}

	@Override
	public void maintainhours() 
	{
		// TODO Auto-generated method stub
		System.out.println("40 hours");
	}

	@Override
	public void relocation() 
	{
		// TODO Auto-generated method stub
		System.out.println("madurai");
	}

	@Override
	public void salary() 
	{
		// TODO Auto-generated method stub
		System.out.println(salary);
	}

	@Override
	public void report() 
	{
		// TODO Auto-generated method stub
		System.out.println("manager");
	}

	@Override
	public void dress() 
	{
		// TODO Auto-generated method stub
		System.out.println("proper");
	}

	@Override // multiple inheritance
				// achieved by inheritance
	public void takecareofParents() 
	{
		// TODO Auto-generated method stub
		System.out.println("Parents");
	}

	@Override
	public void enjoy() 
	{
		// TODO Auto-generated method stub
		System.out.println("hare hare");
	}

	@Override
	public void eattogether() 
	{
		// TODO Auto-generatS
		System.out.println("vaa nga saapudalam");
	}

	@Override
	public void helpmembers() 
	{
		// TODO Auto-generated method stub

	}

}
