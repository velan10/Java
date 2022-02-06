package com.array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {

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


// To insert a element
li.add(3, 60);
System.out.println(li);

//To find  size
int s = li.size();
System.out.println(s);

//To find the value 
Object b = li.get(3);
System.out.println(b);

// To Replace the Value
    li.set(6,"green" );
	System.out.println(li);
	
	// To remove the Particular value
	li.remove(6);
	System.out.println(li);

	//To find the index
	int io = li.indexOf(40);
	System.out.println(io);
	
	//To find its true or false
	boolean ie = li.contains(90);
	System.out.println(ie);
	//To clear list
	//li.clear();
	//System.out.println(li);
	// To
	//li.addAll(li);
	//System.out.println(li);
List<Object> li2 = new LinkedList<Object>();
li2.add("Blue");
li2.add('s');
li2.add(70);
li2.add(20);
li2.add(50);
System.out.println(li2);
	
li.addAll(li2);
System.out.println(li);	

li.retainAll(li2);
System.out.println(li);

li.removeAll(li);
System.out.println(li);	
	}
}
