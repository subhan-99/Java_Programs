package CollectionFrameworks;

import java.util.Comparator;

public class PriorityQueue {
    public static void main(String[] args) {

        java.util.PriorityQueue q =
                new java.util.PriorityQueue(15, new MyComparator());

        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");

        System.out.println(q); // [Z, B, L, A]
    }
}

class MyComparator1 implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        return s2.compareTo(s1); // descending order
    }
}
