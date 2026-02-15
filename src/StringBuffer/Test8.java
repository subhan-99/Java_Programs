package StringBuffer;

public class Test8 {
    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "abcdefgh"
        StringBuffer sb = new StringBuffer("abcdefgh");

        // Delete characters from index 2 to index 5
        // NOTE: start index is inclusive, end index is exclusive
        // Index positions:
        // a  b  c  d  e  f  g  h
        // 0  1  2  3  4  5  6  7
        // Characters removed: c, d, e (index 2,3,4)
        sb.delete(2, 5);

        // Print the modified StringBuffer
        System.out.println(sb); // Output: abfgh
    }
}

