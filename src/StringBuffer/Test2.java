package StringBuffer;

public class Test2 {
    public static void main(String[] args) {

        // Create a StringBuffer object using String argument
        // Initial content = "Durga" (length = 5)
        StringBuffer sb = new StringBuffer("Durga");

        // Capacity formula when String is passed:
        // capacity = 16 (default) + length of String
        // capacity = 16 + 5 = 21
        System.out.println(sb.capacity()); // Output: 21
    }
}
