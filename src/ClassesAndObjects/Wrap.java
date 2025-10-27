package ClassesAndObjects;

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
    }
}
