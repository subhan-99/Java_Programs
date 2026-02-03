package CollectionFrameworks;

import java.util.Arrays;

public class ArraysSortDemo {

    public static void main(String args[]) {

        int[] a = {10, 5, 20, 11, 6};

        System.out.println("Primitive Array Before Sorting:");
        for (int a1 : a) {
            System.out.println(a1);
        }

        Arrays.sort(a);

        System.out.println("Primitive Array After Sorting:");
        for (int a1 : a) {
            System.out.println(a1);
        }

        String[] s = {"A", "Z", "B"};

        System.out.println("Object Array Before Sorting:");
        for (String s1 : s) {
            System.out.println(s1);
        }

        Arrays.sort(s);

        System.out.println("Object Array After Sorting:");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
