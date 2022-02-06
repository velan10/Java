package com.owncodeing.inheritance;

public class Son1 extends Father {
	public void property3() {
		System.out.println("bike property");
	}public static void main(String[] args) {
		Son2 s=new Son2();
		s.property1();
		s.property2();
		s.property3();
		s.property4();
		
	}
}
