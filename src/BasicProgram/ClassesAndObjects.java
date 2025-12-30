package BasicProgram;

// Nokia class
class Nokia {

    // Instance variables (data members)
    // private → data hiding (cannot access directly outside class)
    private int mic;
    private int cam;

    // Method to assign values to instance variables
    void setValue() {

        // Initialize mic and camera values
        mic = 2;      // mic quality
        cam = 40;     // camera megapixel
    }

    // Method to display values
    void display() {

        // Print mic value
        System.out.println(mic);

        // Print camera value
        System.out.println(cam);
    }
}

// Main class
public class ClassesAndObjects {

    // main() method → program execution starts here
    public static void main(String[] args) {

        // Create object of Nokia class
        Nokia n1 = new Nokia();

        // Call display() before setting values
        // Default values of int → 0
        n1.display();

        // Call setValue() method to assign values
        n1.setValue();

        // Call display() again after setting values
        n1.display();
    }
}
