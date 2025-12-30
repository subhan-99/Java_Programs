package AbstractClass;


//Interface i1
interface i1 {
 int x = 10;          // by default public static final
 void f1();           // public abstract
}

//Interface i2 extends i1
interface i2 extends i1 {
 void f3();           // public abstract

 // static method in interface (Java 8+)
 static void f2() {
     System.out.println(x);
 }
}

//Class implementing interface i2
class c1 implements i2 {

 public void f1() {
     System.out.println("f1 method implemented");
 }

 public void f3() {
     System.out.println("f3 method implemented");
 }
}

//Main class
public class InterF {
 public static void main(String[] args) {

     // calling static method of interface
     i2.f2();

     // creating object of implementing class
     c1 obj = new c1();
     obj.f1();
     obj.f3();
 }
}

