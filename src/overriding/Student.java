package overriding;

public class Student extends Teacher {
@Override
public void mark1(int a) {
super.mark1(a);

}
@Override
public void subject1(String b) {
	System.out.println("another name is mathematics");
super.subject1(b);
System.out.println("another name is mathematics");
}
public static void main(String[] args) {
	Student s = new Student();
	s.subject1("maths");
	s.mark1(90);
}
}