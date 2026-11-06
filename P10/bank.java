class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful: Rs. " + amount);
        } else {
            System.out.println("Invalid Deposit! Amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal! Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful: Rs. " + amount);
        }
    }

    public void display() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahul", 123456789, 10000);
        account.display();
        System.out.println("\n--- Valid Transactions ---");
        account.deposit(5000);
        account.withdraw(2000);
        System.out.println("\n--- Invalid Transactions ---");
        account.deposit(-1000);
        account.withdraw(0);
        account.withdraw(-500);
        account.withdraw(20000);
        System.out.println("\n--- Final Account Details ---");
        account.display();
    }
}
