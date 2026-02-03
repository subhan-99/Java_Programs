package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo1 {
    public static void main(String args[]) {

        ArrayList al = new ArrayList();
        al.add("Z");
        al.add("A");
        al.add("K");
        al.add("N");

        System.out.println("Before Sorting:" + al); // [Z, A, K, N]

        Collections.sort(al, new MyComparator2());

        System.out.println("After Sorting:" + al); // [Z, N, K, A]
    }
}

class MyComparator2 implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        return s2.compareTo(s1); // descending order
    }
}
