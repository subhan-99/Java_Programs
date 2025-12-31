package ClassesAndObjects;

// Main class
public class ClassesObjectDemo {

    // main() method → program execution starts from here
    public static void main(String[] args) {

        // Create first object of Car class
        // car1 is a reference variable
        Car car1 = new Car();

        // Assign values to car1 object variables
        car1.Speed = 100;          // Set speed
        car1.colour = "Red";       // Set colour
        car1.brand = "Toyota";     // Set brand

        // Call drive() method using car1 object
        car1.drive();

        // Create second object of Car class
        Car car2 = new Car();

        // Assign values to car2 object variables
        car2.Speed = 120;          // Set speed
        car2.brand = "Kia";        // Set brand
        car2.colour = "White";     // Set colour

        // Call drive() method using car2 object
        car2.drive();
    }
}
