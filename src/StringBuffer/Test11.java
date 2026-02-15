package StringBuffer;

public class Test11 {
    public static void main(String[] args) {

        // Create a StringBuffer object with initial value "AiswaryaAbhi"
        StringBuffer sb = new StringBuffer("AiswaryaAbhi");

        // Set the length of the StringBuffer to 8
        // Original length = 12
        // Extra characters after index 7 will be removed
        // A i s w a r y a A b h i
        // 0 1 2 3 4 5 6 7 8 9 10 11
        sb.setLength(10);

        // Print the modified StringBuffer
        System.out.println(sb); // Output: Aiswarya
    }
}

