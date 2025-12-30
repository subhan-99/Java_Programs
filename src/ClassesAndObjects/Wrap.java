package ClassesAndObjects;

// Wrapper class demonstration
public class Wrap {

    // main() method → program execution starts here
    public static void main(String[] args) {

        // Convert String "123" into primitive int
        // Integer.parseInt() returns int
        int x = Integer.parseInt("123");
        System.out.println(x);   // Output: 123

        // Convert binary String "1000011" into Integer object
        // 2 indicates base (radix = binary)
        Integer x1 = Integer.valueOf("1000011", 2);

        // Convert Integer object into primitive int
        // This is called unboxing
        int z = x1.intValue();
        System.out.println(z);   // Output: 67

        // Convert String "56" into Double object
        Double d = Double.valueOf("56");

        // Convert Double object into primitive double
        // Unboxing
        double y = d.doubleValue();
        System.out.println(y);   // Output: 56.0
    }
}
