package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo1 {
    public static void main(String args[]) {

        ArrayList al = new ArrayList();
        al.add(15);
        al.add(0);
        al.add(20);
        al.add(10);
        al.add(5);

        System.out.println(al); // [15, 0, 20, 10, 5]

        Collections.sort(al, new MyComparator());
        System.out.println(al); // [20, 15, 10, 5, 0]

        System.out.println(Collections.binarySearch(al, 10, new MyComparator3())); // 2
        System.out.println(Collections.binarySearch(al, 13, new MyComparator3())); // -3
        System.out.println(Collections.binarySearch(al, 17)); // -6
    }
}

class MyComparator3 implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        return I2.compareTo(I1); // descending order
    }
}
