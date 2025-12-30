package Constructor;

public class Box {
	    int length, width;

	    // Default constructor
	    Box() {
	        length = 10;
	        width = 5;
	    }

	    // Parameterized constructor
	    Box(int l, int w) {
	        length = l;
	        width = w;
	    }

	    void display() {
	        System.out.println("Length: " + length + ", Width: " + width);
	    }

	    public static void main(String[] args) {
	        Box b1 = new Box();        // calls default
	        Box b2 = new Box(20, 15);  // calls parameterized
	        b1.display();
	        b2.display();
	    }
	}


