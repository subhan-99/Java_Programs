package StringBuffer;

public class Test {
    public static void main(String[] args) {

        // Create a StringBuffer object
        // Default capacity = 16
        StringBuffer sb = new StringBuffer();

        // Append 16 characters
        sb.append("abcdefghijklmnop"); // length = 16

        // Append 1 more character
        sb.append("q"); // length = 17 → capacity will grow

        // Append another 16 characters
        sb.append("abcdefghijklmnop"); // length increases further

        // Append 1 character
        sb.append("q");

        // Append last character
        sb.append("r");

        // Print current capacity of StringBuffer
        System.out.println(sb.capacity());
    }
}

