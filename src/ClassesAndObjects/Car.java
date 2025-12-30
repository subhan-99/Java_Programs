package ClassesAndObjects;

// Car class
// 👉 Blueprint / template for creating Car objects
public class Car {

    // Instance variables (properties of Car)
    // Each object will have its own copy of these variables
    String brand;     // Brand name of the car
    String colour;    // Colour of the car
    int Speed;        // Speed of the car

    // Method of Car class
    // 👉 Represents the behavior of the car
    public void drive() {

        // Print car brand and speed
        System.out.println(brand + " is driving at " + Speed);
    }
}
