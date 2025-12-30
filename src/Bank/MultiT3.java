package Bank;

// Account class (Shared Resource)
class Account {

    // Private instance variable (data hiding)
    private int balance;

    // Constructor to initialize balance
    public Account(int balance) {
        this.balance = balance;
    }

    // Synchronized method
    // Checks if sufficient balance is available
    // synchronized → only one thread can execute this method at a time
    public synchronized boolean isSufficientBal(int amt) {
        return balance >= amt;
    }

    // Synchronized withdraw method
    // Ensures thread-safe withdrawal
    public synchronized void withdraw(int amt, String name) {

        // Check again for safety
        if (balance >= amt) {

            // Print withdrawal info
            System.out.println(name + " is withdrawing: " + amt);

            // Deduct amount
            balance -= amt;

            // Print remaining balance
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient Balance for " + name);
        }
    }

    // Getter method to return final balance
    public int getBalance() {
        return balance;
    }
}

// Customer class implementing Runnable
// Each customer is a separate thread task
class Customer implements Runnable {

    // Shared account reference
    private Account account;

    // Customer name
    private String name;

    // Constructor
    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    // run() method → executed when thread starts
    @Override
    public void run() {

        // Generate random withdrawal amount (0–999)
        int amt = (int) (Math.random() * 1000);

        // Check balance and withdraw
        if (account.isSufficientBal(amt)) {
            account.withdraw(amt, name);
        } else {
            System.out.println("Insufficient Balance for " + name);
        }
    }
}

// Main class
public class MultiT3 {

    // main() method → program execution starts here
    public static void main(String[] args) throws InterruptedException {

        // Create ONE shared Account object
        Account a1 = new Account(1000);

        // Create Customer objects (Runnable tasks)
        Customer c1 = new Customer(a1, "Payal");
        Customer c2 = new Customer(a1, "Pushpak");

        // Create Thread objects
        Thread t1 = new Thread(c1, "Thread-1");
        Thread t2 = new Thread(c2, "Thread-2");

        // Start threads
        t1.start();
        t2.start();

        // join() ensures main thread waits for t1 and t2 to finish
        t1.join();
        t2.join();

        // Print final balance after all threads complete
        System.out.println("Final Balance: " + a1.getBalance());
    }
}
