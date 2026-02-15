package StringBuffer;

public class Test10 {
    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "durga"
        StringBuffer sb = new StringBuffer("durga");

        // Reverse the content of the StringBuffer
        // Original: d u r g a
        // Reversed: a g r u d
        sb.reverse();

        // Print the reversed StringBuffer
        System.out.println(sb); // Output: agrud
    }
}

