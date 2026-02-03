package CollectionFrameworks;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();

        l.add("Baala");
        l.add("Venki");
        l.add("Chiru");
        l.add("Naag");

        System.out.println(l);

        ListIterator<String> ltr = l.listIterator();

        while (ltr.hasNext()) {
            String s = ltr.next();

            if (s.equals("Venki"))
                ltr.remove();        // remove Venki

            if (s.equals("Chiru"))
                ltr.add("Charan");   // add after Chiru

            if (s.equals("Naag"))
                ltr.add("Chaitu");   // add after Naag
        }

        System.out.println(l);
    }
}
