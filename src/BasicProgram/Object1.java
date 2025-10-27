package BasicProgram;

class Subhan {
    int x;  // instance (object) variable
  private   int y;  // instance (object) variable

    void fun1() {   // instance (object) method
        System.out.println("fun1");
    }

    void fun2() {   // instance (object) method
        System.out.println("fun2");
    }
}

 public class Object1 {
    public static void main(String[] args) {
        Subhan s1 = new Subhan(); 
        Subhan s2 = new Subhan();  

        s1.x = 5;  
        System.out.println("hello");
        System.out.println(s2.x);  
    }
}
