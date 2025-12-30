package MultiBank;

import java.util.Scanner;

// Account class
// 👉 Shared resource (same account used by multiple threads)
class Account {

    // Account balance (private = direct access not allowed)
    private int balance = 10000;

    // Method to check whether balance is sufficient or not
    public boolean isSufficientBal(int amt) {
        // If balance is greater than or equal to withdraw amount
        if (balance >= amt) {
            return true;
        }
        return false;
    }

    // Method to withdraw money
    public void withdraw(int amt) {
        // Deduct amount from balance
        balance = balance - amt;

        // Print success message
        System.out.println("Withdraw Successful");

        // Print remaining balance
        System.out.println("Remaining Balance : " + balance);
    }
}

// Customer class extends Thread
// 👉 Each customer is a separate thread
class Customer extends Thread {

    // Reference of Account class (shared object)
    Account h1;

    // Customer name
    String name;

    // Constructor to initialize account and name
    Customer(Account h1, String name) {
        this.h1 = h1;
        this.name = name;
    }

    // run() method → executed when thread starts
    public void run() {

        // synchronized block
        // 👉 Only ONE thread can access account at a time
        synchronized (h1) {

            // Scanner to take input from user
            Scanner s1 = new Scanner(System.in);

            // Ask customer to enter withdraw amount
            System.out.println(name + " Enter amount:");
            int amt = s1.nextInt();

            // Check if sufficient balance is available
            if (h1.isSufficientBal(amt)) {

                // Print withdrawing message
                System.out.println(name + " is withdrawing...");

                // Call withdraw method
                h1.withdraw(amt);

            } else {
                // If balance is insufficient
                System.out.println(name + " Insufficient Balance.");
            }
        }
        // synchronized block ends here
    }
}

// Main class
public class MultiT3 {

    public static void main(String[] args) {

        // Create ONE Account object (shared by threads)
        Account a1 = new Account();

        // Create two Customer threads
        Customer c1 = new Customer(a1, "Subhan");
        Customer c2 = new Customer(a1, "Habib");

        // Start threads
        c1.start();   // Thread 1 starts
        c2.start();   // Thread 2 starts
    }
}
