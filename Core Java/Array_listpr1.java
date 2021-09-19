package edu;

import java.util.LinkedList;
public class Array_listpr1 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Tejas");
		ll.add("Nilesh");
		ll.add("Ajinkya");
		ll.add("Shahu");
		ll.add("Manas");
		ll.add("Mandar");
		
		System.out.println("Initial list of elements:"+ll);
		ll.remove("Shahu");
		

	}

}
