package CollectionFrameworks;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo5 {

    public static void main(String[] args) {

        TreeSet<Object> t = new TreeSet<>(new LengthComparator());

        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add("ABCE");
        t.add("A");   // duplicate

        System.out.println(t);
    }
}

// Comparator class (name changed)
class LengthComparator implements Comparator<Object> {

    @Override
    public int compare(Object obj1, Object obj2) {

        String s1 = obj1.toString();
        String s2 = obj2.toString();

        int i1 = s1.length();
        int i2 = s2.length();

        if (i1 < i2)
            return -1;
        else if (i1 > i2)
            return 1;
        else
            return s1.compareTo(s2); // alphabetical if length same
    }
}
