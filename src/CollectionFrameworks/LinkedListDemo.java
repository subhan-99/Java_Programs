package CollectionFrameworks;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();          // creates empty LinkedList

        l.add("durga");                           // add "durga" to the list
        l.add(30);                                // add integer 30
        l.add(null);                              // add null value
        l.add("durga");                           // add duplicate "durga"

        l.set(0, "Software");                     // replace index 0 element "durga" with "Software"

        l.add(0, "venky");                        // insert "venky" at index 0 (shift others right)

        l.removeLast();                           // delete last element ("durga")

        l.addFirst("ccc");                        // add "ccc" at the beginning
        System.out.println(l);                    // print final LinkedList
    }
}