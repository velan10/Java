package com.owncodeing.overridding;

public  class Client extends Company {
	@Override
	public void password() {
System.out.println("password is Velan@1995");		
	}
	@Override
	public void project() {
System.out.println("IT depat ");		
	}
	public static void main(String[] args) {
		Client a = new Client();
		a.dept("Codeing dept ");
	a.userid("Arunmkumar");
	a.password();
	a.project();
	}
	
}
