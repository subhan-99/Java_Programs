package Constructor;

public class Person {
	String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void show() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Subhan", 21);
        Person p2 = new Person(p1);  // copy object
        p2.show();
    }
}


