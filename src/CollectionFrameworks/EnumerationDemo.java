package CollectionFrameworks;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }

        System.out.println(v);

        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {
            Integer I = e.nextElement();
            if (I % 2 == 0) {
                System.out.println(I);
            }
        }

        System.out.println(v);
    }
}
