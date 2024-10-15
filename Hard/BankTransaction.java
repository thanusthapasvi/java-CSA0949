package Hard;

class Customer {
    private int accountNo;
    private String accName;
    private double balance;

    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance, waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdraw operation success, balance amount: " + balance);
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit operation success, balance amount: " + balance);
        notify();
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Customer customer = new Customer(1001, "John", 10000);

        Thread withdrawThread = new Thread(() -> customer.withdraw(12000));
        Thread depositThread = new Thread(() -> customer.deposit(3000));

        withdrawThread.start();
        depositThread.start();
    }
}

