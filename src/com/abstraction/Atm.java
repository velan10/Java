package com.abstraction;

public  class Atm extends Bank {
	@Override
	public void pin() {
System.out.println("pin num is :1234");		
	}
	public static void main(String[] args) {
		Atm a = new Atm();
		a.accNum(1234567);
		a.btanch("porur");
	a.pin();
	}
	

}
