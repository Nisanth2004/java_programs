package com.linkedList;

import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(10);
		ll.add("Nisa");
		ll.add('j');
		ll.add(true);
		
		System.out.println(ll);
		ll.addFirst(100);
		
		System.out.println(ll);
		
		System.out.println("before poll " + ll.poll());
		
		System.out.println("after poll " + ll); // poll is same as remove method
		
		ll.offer(5000); // offer is same as add method
		System.out.println(ll);

		ll.clone();

		LinkedList ll2 = (LinkedList) ll.clone();
		System.out.println("after clone : " + ll2);

		ll.clear();
		System.out.println(ll);

	}

}
