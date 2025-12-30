package Constructor;

class Demo {
    // Constructor
    Demo() {
        System.out.println("Constructor executed!");
    }

    void show() {
        System.out.println("Hello from show()");
    }

    public static void main(String[] args) {
        Demo d = new Demo(); // constructor runs automatically
        d.show();
    }
}
