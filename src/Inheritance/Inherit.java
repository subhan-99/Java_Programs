package Inheritance;   // Package name

// Parent (Super) class
class Nokia1 {

    int x, y;   // Instance variables of parent class

    // Parent class method 1
    void fun1() {
        System.out.println("parent function 1 executed.");
    }

    // Parent class method 2
    void fun2() {
        System.out.println("parent function2 executed.");
    }
}

// Child (Sub) class that inherits Nokia1
class Nokia2 extends Nokia1 {

    int z;   // Child class variable

    // Child class method
    void fun3() {
        System.out.println("child function 1 executed.");
    }
}

// Main class
public class Inherit {

    public static void main(String[] args) {

        // Creating object of child class Nokia2
        Nokia2 n1 = new Nokia2();

        // Calling parent class methods using child object
        // This is possible because of inheritance
        n1.fun1();   // Calls Nokia1's fun1()
        n1.fun2();   // Calls Nokia1's fun2()

        // Calling child class method
        n1.fun3();   // Calls Nokia2's fun3()
    }
}
