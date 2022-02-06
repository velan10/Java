package string;

public class String_Types {
public static void main(String[] args) {  
	            // immutable 
	//String s ="welcome to java";    //Heap Memory Methods 
	//System.out.println(s);
	//System.out.println(System.identityHashCode(s));

//String s1 ="welcome to java";
//System.out.println(s1);
//System.out.println(System.identityHashCode(s1));
//s=s+s1;
//System.out.println(s);
//System.out.println(System.identityHashCode(s));
   
	
	                //Muteable 

StringBuffer s1 =new StringBuffer("Testing");
System.out.println(s1);
System.out.println(System.identityHashCode(s1));

StringBuffer s2 = new StringBuffer("Testing");
System.out.println(s2);
System.out.println(System.identityHashCode(s2));

s1=s1.append(s2);
System.out.println(s1);
System.out.println(System.identityHashCode(s2));


}
}
