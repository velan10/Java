package com.basic;                  //package

public class Sample {               //class{
final void biriyani() {
	System.out.println("chicken biriyani");  //print statement
}
private void gravy()
{
	System.out.println("egg gravy");

}                                                    
public static void main(String [] args) {   
	 //Classname referance name = new classname();           //}method    new is a " KEYWORD "
	Sample a =new Sample();                                //object
a.gravy();
a.biriyani();
	
}
}
