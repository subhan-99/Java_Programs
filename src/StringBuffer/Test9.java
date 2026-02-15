package StringBuffer;

public class Test9 {
    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "abcdefgh"
        StringBuffer sb = new StringBuffer("abcdefgh");

        // Delete the character at index 3
        // Index starts from 0
        // a  b  c  d  e  f  g  h
        // 0  1  2  3  4  5  6  7
        // Character 'd' at index 3 will be removed
        sb.deleteCharAt(3);

        // Print the modified StringBuffer
        System.out.println(sb); // Output: abcefgh
    }
}

