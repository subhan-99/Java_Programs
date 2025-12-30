package BasicProgram;

<<<<<<< HEAD
// Subhan class
class Subhan {

    // Instance (object) variable
    // Default access → accessible within same package
    int x;

    // Instance (object) variable
    // private → accessible only inside this class
    private int y;

    // Instance (object) method
    void fun1() {
        System.out.println("fun1");
    }

    // Instance (object) method
    void fun2() {
=======
class Subhan {
    int x;  // instance (object) variable
  private   int y;  // instance (object) variable

    void fun1() {   // instance (object) method
        System.out.println("fun1");
    }

    void fun2() {   // instance (object) method
>>>>>>> 0ad5f29ab6008499492871849a1192dc1d6eaa09
        System.out.println("fun2");
    }
}

<<<<<<< HEAD
// Main class
public class Object1 {

    // main() method → program execution starts here
    public static void main(String[] args) {

        // Create first object of Subhan class
        Subhan s1 = new Subhan();

        // Create second object of Subhan class
        Subhan s2 = new Subhan();

        // Assign value to x of s1 object
        s1.x = 5;

        // Print a message
        System.out.println("hello");

        // Print value of x of s2 object
        // Since x is not set for s2, default value (0) is printed
        System.out.println(s2.x);
=======
 public class Object1 {
    public static void main(String[] args) {
        Subhan s1 = new Subhan(); 
        Subhan s2 = new Subhan();  

        s1.x = 5;  
        System.out.println("hello");
        System.out.println(s2.x);  
>>>>>>> 0ad5f29ab6008499492871849a1192dc1d6eaa09
    }
}
