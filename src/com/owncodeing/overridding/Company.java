package com.owncodeing.overridding;

public abstract class Company
{
public void dept(String a) {
	System.out.println("Dept is :"+a);
}

	public void userid(String b) {
		System.out.println("user id is :"+b);
	}
	public abstract void password();
	public abstract void project();
}