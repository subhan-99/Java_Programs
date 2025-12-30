package Constructor;   // Package name

// Demo1 class
class Demo1 {

    int x, y;   // Instance variables

    // Parameterized constructor with two parameters
    // This constructor initializes x and y using passed values
    Demo1(int p, int q) {
        x = p;
        y = q;
    }

    // Parameterized constructor with one parameter
    // Currently this constructor does nothing
    // x and y will have default value 0
    Demo1(int f) {
        // No initialization
    }

    // Default constructor (no parameters)
    // Automatically assigns default values to x and y (0, 0)
    Demo1() {
        // Empty constructor body
    }
}

// Main class
class Construct {

    public static void main(String[] args) {

        // Calls constructor Demo1(int p, int q)
        // x = 5, y = 6
        Demo1 d1 = new Demo1(5, 6);

        // Calls default constructor Demo1()
        // x = 0, y = 0 (default values)
        Demo1 d2 = new Demo1();

        // Calls constructor Demo1(int f)
        // x = 0, y = 0 (no assignment done)
        Demo1 d3 = new Demo1(6);
    }
}
