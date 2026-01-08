package ExceptionHandling;

class ExceptionH1 {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);  // This will throw ArithmeticException
        } catch (NullPointerException e1) {
            System.out.println("NullPointerException caught");
        } finally {
            System.out.println("Z");  // This will always execute
        }

        System.out.println("A");

        String s1 = null;
        try {
            System.out.println("C");
            System.out.println(s1.length());  // This will throw NullPointerException
        } catch (NullPointerException e2) {
            System.out.println("B");  // Handling NullPointerException
        }

        System.out.println("D");
    }
}



