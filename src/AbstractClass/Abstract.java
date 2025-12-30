package AbstractClass;

// Abstract parent class
abstract class Demo1 {

    // Instance variables
    int x, y;

    // Concrete (non-abstract) method
    void f1() {
        x = 5;
        y = 2;
    }

    // Abstract method
    // Must be implemented by child class
    abstract void f2();

    // Constructor of abstract class
    // Abstract class can have constructor
    Demo1() {
        System.out.println("parent's constructor");
    }
}

// Child class extending abstract class
class Demo2 extends Demo1 {

    // Instance variable of child class
    int z;

    // Child class method
    void f3() {
        z = 8;
    }

    // Implementation of abstract method
    // Mandatory to override
    void f2() {
        // method body (can be empty)
    }

    // Constructor of child class
    Demo2() {
        // Parent constructor is called automatically first
        System.out.println("Child's Constructor");
    }
}

// Main class
public class Abstract {

    // main() method → program execution starts here
    public static void main(String[] args) {

        // Create object of child class
        // We cannot create object of abstract class
        Demo2 d1 = new Demo2();

        // Call child class method
        d1.f3();
    }
}
