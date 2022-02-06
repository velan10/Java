package com.array;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

	public static void main(String[] args) {
//	Set<Object> s = new HashSet<Object>();
	//	Set<Object>  s = new LinkedHashSet<Object>();
		Set<Object> s = new TreeSet<Object>();
		
		s.add(90);
	    s.add(30);
		s.add(20);
		s.add(40);
		//s.add(null);
		//s.add(null);
		//s.add("java");
		//s.add("java"); 
		//s.add("iu");
		//s.add("N");
		//s.add("A");
		//s.add("velan");
		s.add(20);
		s.add(80);
		System.out.println(s);
		int s1 = s.size();       // To find Size
		System.out.println(s1);
		
		s.remove(40);       // remove element
		System.out.println(s);
		// s.remove(30);
		//System.out.println(s);
boolean s2 = s.contains(20);		   //contains true Statement 
		System.out.println(s2);
		boolean s3 = s.contains(42);    // Contains false Statement
		System.out.println(s3);
		//s.clear();
		//System.out.println(s);
	//	Set<String> z = new HashSet<String>();		
		//Set<String>  z = new LinkedHashSet<String>();
		Set<Object> z = new TreeSet<Object>();

		z.add(100);
	    z.add(600);
		z.add(200);
		//z.add("java");
		//z.add("e");
		//z.add(null);
		System.out.println(z);
	s.addAll(z);          // Add all 
	System.out.println(s);
	s.retainAll(z);        //RetainAll
	System.out.println(s);
	s.removeAll(s);        //  Remove all 
	System.out.println(s);

	}
}
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	

