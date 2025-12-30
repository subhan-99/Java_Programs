package Inheritance;

// Example class
class Example {

    // Instance variables (object variables)
    // private → direct access outside class not allowed
    private int x, y;

    // Method to assign values to instance variables
    void f1(int x, int y) {

        // this.x refers to current object's variable
        // x refers to method parameter
        this.x = x;

        // this.y refers to current object's variable
        // y refers to method parameter
        this.y = y;
    }

    // Method to display values
    void display() {

        // Print instance variable x
        System.out.println(x);

        // Print instance variable y
        System.out.println(y);
    }
}

// Main class
public class ThisKey {

    public static void main(String[] args) {

        // Create object of Example class
        Example e1 = new Example();

        // Call f1() method and pass values
        e1.f1(55, 66);

        // Call display() method
        e1.display();
    }
}
