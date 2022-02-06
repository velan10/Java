package interface1;

public class Floder implements Fb,Mail {
	@Override
	public void userid2() {
	System.out.println("Velan");
	}
	@Override
	public void pswd2() {
	System.out.println("Arun@1555");
	}
	@Override
	public void userid1() {
		System.out.println("velli");
	}
	@Override
	public void pswd1() {
		System.out.println("Velan@555");
	}
	public static void main(String[] args) {
		Floder f =new Floder();
		f.pswd1();
		f.pswd2();
		f.userid1();
		f.userid2();
	}
}
	



