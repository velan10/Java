package com.array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ItractionList {
public static void main(String[] args) {

	{

//		Set<Object> s = new HashSet<Object>();
		//	Set<Object>  s = new LinkedHashSet<Object>();
			Set<String> s = new TreeSet<String>();
			
			s.add("jim");
		    s.add("jam");
			s.add("dong");
			//s.add(40);
			//s.add(null);
			//s.add(null);
			//s.add("java");
			//s.add("java"); 
			//s.add("iu");
			//s.add("N");
			//s.add("A");
			//s.add("velan");
			s.add("kim");
			s.add("ding");
			System.out.println(s);
			
			
			Iterator<String >i = s.iterator();
			while (i.hasNext()) {
				String string =(String) i.next();
				
				System.out.println(string);
			}
		}
}
}
			
			
			
			
			
			
			
			

		
		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

