package CollectionFrameworks;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

    public static void main(String args[]) {

        int[] a = {10, 5, 20, 11, 6};
        Arrays.sort(a); // Sort by natural order

        System.out.println(Arrays.binarySearch(a, 6));   // 1
        System.out.println(Arrays.binarySearch(a, 14));  // -5

        String[] s = {"A", "Z", "B"};
        Arrays.sort(s);

        System.out.println(Arrays.binarySearch(s, "Z")); // 2
        System.out.println(Arrays.binarySearch(s, "S")); // -3

        Arrays.sort(s, new MyComparator());

        System.out.println(Arrays.binarySearch(s, "Z", new MyComparator4())); // 0
        System.out.println(Arrays.binarySearch(s, "S", new MyComparator4())); // -2
        System.out.println(Arrays.binarySearch(s, "N")); // -4
    }
}

class MyComparator4 implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1); // descending order
    }
}
