package Superkeyword;

class Example
{
    int x, y;

    // Parent class method to set values
    void f1(int a, int b)
    {
        x = a;
        y = b;
    }

    // Parent class method to display values
    void f2()
    {
        System.out.println(x);
        System.out.println(y);
    }
}

// Child class
class Example1 extends Example
{
    int x, y;

    // Method to assign values to parent variables using super
    void f3(int x, int y)
    {
        super.x = x;   // parent class variable
        super.y = y;   // parent class variable
    }

    // Method to print parent & child variables
    void f4()
    {
        System.out.println(super.x); // parent x
        System.out.println(this.y);  // child y (default 0)
    }
}

// Main class
public class ThisK
{
    public static void main(String[] args)
    {
        Example1 e1 = new Example1();

        e1.f3(10, 20);   // set parent values
        e1.f4();         // display values
    }
}

