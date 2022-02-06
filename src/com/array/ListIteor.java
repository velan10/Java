package com.array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteor {


		public static void main(String[] args) {
			
			
			List<Object> li=new ArrayList<Object>();
	li.add(45);
	li.add("java");
	li.add('a');
	li.add(78);
	li.add(90);
	li.add(40);
	li.add(40);

	System.out.println(li);

	ListIterator<Object> l =  li.listIterator();
	while (l.hasNext()) {
		Object o  = (Object) l.next();
		System.out.println(o);
		
	}
while (l.hasPrevious()) {
	Object o1 = (Object) l.previous();
	System.out.println(o1);
	
	
} 
	

	
}}
