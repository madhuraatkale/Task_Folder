package edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class Array_Linkedlist1 {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<>();
		a.add(null);
		a.add("Tej");
		a.add("Praj");
		
		//basic iterator way
		
		Iterator<String> i= a.iterator ();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
