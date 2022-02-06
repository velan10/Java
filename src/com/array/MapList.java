package com.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapList {
	public static void main(String[] args) {
		Map<Integer, Object> m = new HashMap<Integer, Object>();
		m.put(1, "java");
		m.put(2, "jim");
		m.put(4, 40.2);
		m.put(5, 70);
		m.put(6, 10);
		m.put(9, 'H');
		m.put(null,40 );
		m.put(null, 70);
		m.put(3, null);
		m.put(1, null);
		System.out.println(m);
		int s1 = m.size();
		System.out.println(s1);
		
		Object s2 = m.get(4);
		System.out.println(s2);
		
		Set<Integer> s3 = m.keySet(); // set is not allowed a dupicate 
		System.out.println(s3);
		
		Collection<Object> s4 = m.values();
		System.out.println(s4);
		
		boolean s5 = m.containsKey(40.2);
		System.out.println(s5);
		
		boolean s6 = m.containsValue(70);
		System.out.println(s6);
		
		Set<Entry<Integer, Object>> s7 = m.entrySet();
	for (int i = 0; i < args.length; i++) {
		
	}
		System.out.println(s7);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
