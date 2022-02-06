package com.inheritance;                        //multilevel inheritances

public class Son1 extends Father {
	public void property3() {
		System.out.println("bike property");
	}
	public void property4() {
		System.out.println("wounder land");
	}
public static void main(String [] args) {
	 Son2 a=new Son2	();
	a.property1();
	a.property2();
	a.property3();
	a.property4();
	a.property5();
	a.property6();

} 
}
