package Constructor;

public class Student {
	String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Subhan", 21);
        Student s2 = new Student("Ali", 22);

        s1.display();
        s2.display();
    }
}


