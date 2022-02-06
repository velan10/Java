package string;

public class String_class {
public static void main(String[] args) {
	String a = "welcome to java";
	System.out.println(a);
	//String b = new String("welcome to java");
//System.out.println(b );
int z = a.length();           // total length in String
System.out.println(z);

String a1 = "Welcome to java";
boolean a2 = a1.equals(a);       // its checking the 2 statement is correct
System.out.println(a2);
boolean a3 = a1.equalsIgnoreCase(a); ///its ignore any false stment with uppercase 
System.out.println(a3);
String a4 = a.toUpperCase();   // all letters are uppercase
System.out.println(a4);       
String a5 = a.toLowerCase();    // all letters are lowercase
System.out.println(a5);
boolean a6 = a.startsWith("we");    //we check the statement is start with this letter
System.out.println(a6);
boolean a7 = a.endsWith("a");      //we check the statement is end  with this letter
System.out.println(a7);
boolean a8 = a.endsWith("v");        //
System.out.println(a8);
boolean a9 = a.contains("java");  
System.out.println(a9);
int a10 = a.indexOf("o");
System.out.println(a10);
int a11 = a.indexOf("v");
System.out.println(a11);
int a12 = a.lastIndexOf("n");
System.out.println(a12);
char a13 = a.charAt(11);
System.out.println(a13);
String a14 = a.replace("java ", "JAVA");  //isempty split trim  compare
System.out.println(a14);
CharSequence a15 = a.subSequence(2, 13);
System.out.println(a15);
boolean a16 = a.isEmpty();
System.out.println(a16);
String[] a17 = a.split("e");
for (String t : a17) {
	System.out.println(a17);
}}
}
