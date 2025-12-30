package Inheritance;

// Parent class
class Nokia3
{
    private int x, y;

    // Parent class constructor
    Nokia3(int p, int q)
    {
        x = p;
        y = q;
        System.out.println("Parent's constructor executed.");
    }

    void f1()
    {
        System.out.println("Parent function 1 executed.");
    }

    void f2()
    {
        System.out.println("Parent function 2 executed.");
    }
}

// Child class
class Nokia4 extends Nokia3
{
    int z;

    // Child class constructor
    Nokia4(int p, int q, int r)
    {
        // Call to parent constructor
        super(p, q);

        z = r;
        System.out.println("Child's constructor executed.");
    }

    void f3()
    {
        System.out.println("Child function executed.");
    }
}

// Main class
public class InheritDemo
{
    public static void main(String[] args)
    {
        // Creating child class object
        Nokia4 obj = new Nokia4(10, 20, 30);

        // Calling parent class methods
        obj.f1();
        obj.f2();

        // Calling child class method
        obj.f3();
    }
}
