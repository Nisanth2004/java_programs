package com.arraylist;

import java.util.Comparator;

public class Comp implements Comparator{

	
	//@override
	
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub;
		
		
		String s1=(String)o1;
		String s2=(String)o2;
		int result=(s1.compareTo(s2));
		if(result>0) 
		return -1;
		else if(result<0)
			return +1;
		else
		return 0;
	}

}
