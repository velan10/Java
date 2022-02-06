package overloading;

public class Pencil {
public void absara() {
	System.out.println("Best Pencil");
}
public void absara(float a) {
	System.out.println("pencil inch is :"+a);
}
public void absara(String b) {
	System.out.println("pencil color is :"+b);
}
public void absara(int c,int d) {
	System.out.println("pencil count is :"+c+","+d);
}
public void absara(char e,int f) {
	System.out.println("pencil grade is :"+e);
    System.out.println("pencil length :"+f);
}
public void absara(int g,String h) {
	System.out.println("pencil grade is :"+g +"," +h);
   }
public static void main(String[] args) {
	Pencil p = new Pencil();
	p.absara();
p.absara(10.5f);
p.absara("Black");
p.absara('A', 2);
p.absara(25, 65);
p.absara(25, "Nothing");
}
}
