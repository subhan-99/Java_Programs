package StringBuffer;

public class Test13 {
    public static void main(String[] args) {

        // Create StringBuffer with initial capacity 1000
        StringBuffer sb = new StringBuffer(1000);

        // Append a string
        sb.append("ABC");

        // Print capacity before trim
        System.out.println(sb.capacity()); // Output: 1000

        // Reduce capacity to current length
        sb.trimToSize();

        // Print capacity after trim
        System.out.println(sb.capacity()); // Output: 3
    }
}

