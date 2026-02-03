package CollectionFrameworks;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable h = new Hashtable();

        h.put(new MyKey(5), "A");
        h.put(new MyKey(2), "B");
        h.put(new MyKey(6), "C");
        h.put(new MyKey(15), "D");
        h.put(new MyKey(23), "E");
        h.put(new MyKey(16), "F");

        // h.put("Durga", null); // NullPointerException (Hashtable null allow nahi karta)

        System.out.println(h);
    }
}

class MyKey {
    int i;

    MyKey(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i + "";
    }
}
