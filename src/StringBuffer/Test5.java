package StringBuffer;

public class Test5 {
    public static void main(String[] args) {

        // Create an empty StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append a String value
        sb.append("PI Value is ");

        // Append a double value
        // append() automatically converts double to String
        sb.append(3.14);

        // Append another String
        sb.append(" It is exactly ");

        // Append a boolean value
        // append() converts boolean to String
        sb.append(true);

        // Print the final content of StringBuffer
        System.out.println(sb);
        // Output: PI Value is 3.14 It is exactly true
    }
}
