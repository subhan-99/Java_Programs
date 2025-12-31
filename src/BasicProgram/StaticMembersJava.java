package BasicProgram;

// Class A
class A {

    // Instance variable
    // Each object has its own copy
    int X;

    // Static variable
    // Belongs to class, NOT to object
    // Only ONE copy shared by all objects
    private static int y;

    // Instance method
    void fun1() {
        // Assign value to static variable
        y = 22;
    }

    // Instance method
    void fun2() {
        // Print static variable value
        System.out.println(y);
    }

    // Instance method
    void fun3() {
        // Change value of static variable
        y = 45;
    }
}

// Main class
public class StaticMembersJava {

    // main() method → program execution starts here
    public static void main(String[] args) {

        // Create first object of class A
        A a1 = new A();

        // Create second object of class A
        A a2 = new A();

        // a1 sets static variable y to 22
        a1.fun1();

        // a2 changes same static variable y to 45
        a2.fun3();

        // a1 prints static variable y
        // Output will be 45 (latest value)
        a1.fun2();
    }
}
