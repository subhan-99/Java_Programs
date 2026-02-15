package StringBuffer;

public class Test6 {
    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "abcdefgh"
        StringBuffer sb = new StringBuffer("abcdefgh");

        // Insert the String "xyz" at index 2
        // Index starts from 0
        // a  b  c  d  e  f  g  h
        // 0  1  2  3  4  5  6  7
        // "xyz" will be inserted before index 2 (before 'c')
        sb.insert(2, "xyz");

        // Print the modified StringBuffer
        System.out.println(sb); // Output: abxyzcdefgh
    }
}

