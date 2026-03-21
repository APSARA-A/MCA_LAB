class Account {
    private int balance = 1000;

    // Deposit method
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance after deposit: " + balance);
        notify();
    }

    // Withdraw method
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance! Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance after withdrawal: " + balance);
    }
}

// Deposit Thread
class Depositor extends Thread {
    Account acc;

    Depositor(Account acc) {
        this.acc = acc;
    }

    public void run() {
        acc.deposit(500);
    }
}

// Withdraw Thread
class Withdrawer extends Thread {
    Account acc;

    Withdrawer(Account acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(1200);
    }
}

// Main Class
public class BankDemo {
    public static void main(String[] args) {
        Account acc = new Account();

        Depositor d = new Depositor(acc);
        Withdrawer w = new Withdrawer(acc);

        w.start();
        d.start();
    }
}
