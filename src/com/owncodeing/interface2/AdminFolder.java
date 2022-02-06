package com.owncodeing.interface2;

public class AdminFolder implements Server1,Server2,Server3 {

	@Override
	public void userid3() {
		System.out.println(" userid 3 is : velan");
	}

	@Override
	public void password3() {
		System.out.println("password 3 is : Velan@123");
	}

	@Override
	public void userid2() {
System.out.println("userid 2 is : Naresh ");		
	}

	@Override
	public void password2() {
		System.out.println("password 2 is : Naresh@1234 ");
	}

	@Override
	public void userid1() {
		System.out.println("userid 1 is : Panner");
	}

	@Override
	public void password1() {
		System.out.println("password 1 is : panner@1234");
	}

	public static void main(String[] args) {
	AdminFolder a =new AdminFolder();
	System.out.println("STAFF ACCESS ");
a.userid1();
a.password1();
a.userid2();
a.password2();
a.userid3();
a.password3();
	}
}

