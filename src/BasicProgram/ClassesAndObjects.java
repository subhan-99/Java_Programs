package BasicProgram;

// Nokia class
class Nokia {

    // Instance variables (data members)
    // private → data hiding
    private int mic;
    private int cam;

    // Method to assign values
    void setValue() {
        mic = 2;      // mic quality
        cam = 40;     // camera megapixel
    }

    // Method to display values
    void display() {
        System.out.println(mic);
        System.out.println(cam);
    }
}

// Main class
public class ClassesAndObjects {

    // main method → program execution starts here
    public static void main(String[] args) {

        // Create object of Nokia class
        Nokia n1 = new Nokia();

        // Before setting values
        // default value of int = 0
        n1.display();

        // Set values
        n1.setValue();

        // After setting values
        n1.display();
    }
}
