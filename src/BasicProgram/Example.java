package BasicProgram;

// Area class
class Area {

    // Static method of Area class
    // Can be called using class name
    static void fun1() {
        System.out.println("Area 1");
    }

    // Another static method of Area class
    static void fun2() {
        System.out.println("Area 2");
    }
}

// Main class
public class Example {

    // Static method of Example class
    static void fun1() {
        System.out.println("A");
    }

    // Another static method of Example class
    static void fun2() {
        System.out.println("B");
    }

    // main() method → program execution starts here
    public static void main(String[] args) {

        // Normal execution block
        System.out.println("C");

        // Calling static methods of same class directly
        fun1();     // Calls Example.fun1()
        fun2();     // Calls Example.fun2()

        // Calling static methods of another class using class name
        Area.fun1();  // Calls Area.fun1()
        Area.fun2();  // Calls Area.fun2()
    }
}
