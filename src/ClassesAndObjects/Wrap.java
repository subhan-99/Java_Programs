package ClassesAndObjects;

<<<<<<< HEAD
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
=======
public class Wrap {
    public static void main(String[] args) {
        int x = Integer.parseInt("123");
        System.out.println(x);

        Integer x1 = Integer.valueOf("1000011", 2);
        int z = x1.intValue();
        System.out.println(z);

        Double d = Double.valueOf("56");
        double y = d.doubleValue();
        System.out.println(y);
>>>>>>> 0ad5f29ab6008499492871849a1192dc1d6eaa09
    }
}
