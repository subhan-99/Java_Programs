package StringBuffer;

public class Test4 {
    public static void main(String[] args) {

        // Create a StringBuffer object with initial value
        StringBuffer sb = new StringBuffer("Durga");

        // charAt(index) returns the character present at given index
        // Index starts from 0
        // D  u  r  g  a
        // 0  1  2  3  4
        char ch = sb.charAt(4);

        // Print the character at index 3
        System.out.println(ch); // Output: g
    }
}
