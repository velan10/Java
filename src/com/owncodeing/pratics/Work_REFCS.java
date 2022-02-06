package com.owncodeing.pratics;

import java.util.Scanner;

public class Work_REFCS {

	public static void main(String[] args) {
		/**
		DAY 1
	int age;
	double deci=35.6;
			char l='A';
			String o = "Styhj";
			boolean jh = false;
		
			age=25;
			age=55;
			
	System.out.println(age);
	System.out.println(deci);
	System.out.println(l);
	System.out.println(o);
	System.out.println("jh");
	*/
//Scanner scanner = new Scanner(System.in);	
//int a = scanner.nextInt();
//System.out.println("the age of u r is :" +a);//concadination
/**
 52
the age of u r is :52
 */
//		Scanner scanner = new Scanner(System.in);	
//		System.out.println(" Enter the first number ");
//		double firstnumber = scanner.nextDouble();
//		System.out.println(" Enter the second number ");
//	    double secondnumber = scanner.nextDouble();
//	    
//	    double answer = firstnumber+secondnumber;
//	System.out.println("the answer is :"+answer);
	
	/**Enter the first number 
	20.5
	 Enter the second number 
	20.5
	the answer is :41.0
	*/
		
//Scanner s = new Scanner(System.in);
////int num1 =s.nextInt();
//
//int num1 =10;                                  
//int num2 = 5;
//System.out.println(num1+num2);
//System.out.println(num1-num2);
//System.out.println(num1*num2);
//System.out.println(num1/num2);
//System.out.println(num1%num2);
/**
20
25
15
100
4
0
*****************
15
5
50
2
0
	*/	
		
	//int a =1;
//	a=a+1;
//	int b =3;
//	a=a+1+b+1;
//a++;// post increment operator
 //++a;  //pre increment operator
	//a--;
//	--a;
	
//	System.out.println(a++);        post Increment
//	System.out.println(a++);
//	System.out.println(a);
 
	/** 1
	 * 2
	 * 3
	 */
	
//	System.out.println(a--);       
//	System.out.println(a--);
//	System.out.println(a); 
	
	/**
	1
	0
	-1
*/

//	System.out.println(++a);       Pre Incremet 
//	System.out.println(a);
	/**
	 * 2
	 * 2
	  */
	 
	
	Scanner s = new Scanner(System.in);
	int num =s.nextInt();
	if (num==10) {
		System.out.println("your number is 10");
	}
	else if (num <10) {
		System.out.println(" your number is less then 10");
	}
	else if (num>10) {
		System.out.println("Your number is grater then 10");
		
	}else {
		System.out.println("Your number is not greater then 10");
	}
	
		
	}
}
