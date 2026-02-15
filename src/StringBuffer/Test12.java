package StringBuffer;
public class Test12 {
    public static void main(String[] args) {

        // Create an empty StringBuffer
        // Default capacity = 16
        StringBuffer sb = new StringBuffer();

        // Print initial capacity
        System.out.println(sb.capacity()); // Output: 16

        // Ensure the minimum capacity is 1000
        // If current capacity < 1000, it will increase automatically
        sb.ensureCapacity(1000);

        // Print updated capacity
        // New capacity is calculated using:
        // (oldCapacity * 2) + 2 or minimumCapacity (whichever is greater)
        System.out.println(sb.capacity()); // Output: 1000
    }
}

