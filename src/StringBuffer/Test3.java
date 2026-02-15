package StringBuffer;

public class Test3{
    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "Java"
        StringBuffer sb = new StringBuffer("Java");

        // Change the character at index 0
        // Index starts from 0 → J a v a
        // 'J' will be replaced by 'Y'
        sb.setCharAt(0, 'Y');

        // Print the modified StringBuffer
        System.out.println(sb); // Output: Yava
    }
}

