package CollectionFrameworks;


import java.util.HashMap;

class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        // Creating HashMap
        HashMap m = new HashMap();

        // Creating Temp object (key)
        Temp t = new Temp();

        // Putting object as key
        m.put(t, "Durga");

        // Printing HashMap
        System.out.println(m);

        // Making key reference null
        t = null;

        // Requesting Garbage Collector
        System.gc();

        // Waiting for GC to act
        Thread.sleep(5000);

        // Printing HashMap again
        System.out.println(m);
    }
}

// Temp class
class Temp {

    // toString() for readable output
    public String toString() {
        return "temp";
    }

    // finalize() method (called before GC removes object)
    public void finalize() {
        System.out.println("finalize() Called");
    }
}
