package CollectionFrameworks;
import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo4 {

    public static void main(String[] args) {

        TreeSet<String> t = new TreeSet<>(new NameDescComparator());

        t.add("Roja");
        t.add("Sobha Rani");
        t.add("Raja Kumari");
        t.add("Ganga Bhavani");
        t.add("Ramulamma");

        System.out.println(t);
    }
}

// New comparator with changed name
class NameDescComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        // Descending alphabetical order
        return s2.compareTo(s1);
    }
}