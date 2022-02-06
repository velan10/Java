package com.owncodeing.inheritance;

public class English_Channels extends Tamil_Channels {
	public void channels4() {
		System.out.println("Movies Now");
	}
	public void channels5() {
		System.out.println("HBO");
	}
public static void main(String[] args) {
	Hindi_Channels b=new Hindi_Channels();
	Hindi_Channels c=new Hindi_Channels();
	b.channel1();
	b.channels6();
	b.Channels7();
	c.channel2();
	c.channels4();
	c.channels5();
}

}
