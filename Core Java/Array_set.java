package edu;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Array_set {

	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<>();
		LinkedHashSet<String> h1 =new LinkedHashSet<>();
		TreeSet<String> t= new TreeSet<>();
		
		h.add("Maths");
		h.add("English");
		h.add("History");
		h.add("Geoghraphy");
		h.add("Maths");
		h.add(null);
		System.out.println(h);
		
		h1.add("Maths");
		h1.add("English");
		h1.add("History");
		h1.add("Maths");
		h1.add(null);
		System.out.println(h1);
		
		
		t.add("Maths");
		t.add("English");
		t.add("History");
		t.add("Maths");
		t.add(null);
		System.out.println(t);

	}
}
