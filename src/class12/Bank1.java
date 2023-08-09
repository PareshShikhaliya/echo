package class12;

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;
    private String accountType;

    public BankAccount(int accountNumber, String customerName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
        }
    }

    @Override
    public String toString()
    {
        return "Account Number: " + accountNumber + ", Customer Name: " + customerName
                + ", Balance: $" + balance + ", Account Type: " + accountType;
    }
}

public class Bank1 {
    private static final int MAX_CUSTOMERS = 100;
    private BankAccount[] accounts;
    private int numCustomers;

    public Bank1() {
        accounts = new BankAccount[MAX_CUSTOMERS];
        numCustomers = 0;
    }

    public void addAccount(BankAccount account) {
        if (numCustomers < MAX_CUSTOMERS) {
            accounts[numCustomers] = account;
            numCustomers++;
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Sorry, the bank has reached the maximum limit of customers.");
        }
    }

    public void displayAccounts() {
        System.out.println("Bank Accounts:");
        for (int i = 0; i < numCustomers; i++) {
            System.out.println(accounts[i]);
        }
    }

    public BankAccount findAccountByNumber(int accountNumber) {
        for (int i = 0; i < numCustomers; i++)
        {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null; // Account not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank1 bank1 = new Bank1();

        while (true) {
            System.out.println("\nSimple Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.print("Enter Account Number: ");
                int accountNumber = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter Customer Name: ");
                String customerName = scanner.nextLine();
                System.out.print("Enter Initial Balance: ");
                double balance = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter Account Type (Savings/Checking): ");
                String accountType = scanner.nextLine().toLowerCase(); // Convert to lowercase
                BankAccount newAccount = new BankAccount(accountNumber, customerName, balance, accountType);
                bank1.addAccount(newAccount);

            } else if (choice == 2) {
                bank1.displayAccounts();
            } else if (choice == 3) {
                System.out.print("Enter Account Number: ");
                int depositAccountNumber = scanner.nextInt();
                System.out.print("Enter Deposit Amount: ");
                double depositAmount = scanner.nextDouble();
                BankAccount depositAccount = bank1.findAccountByNumber(depositAccountNumber);
                if (depositAccount != null)
                {
                    depositAccount.deposit(depositAmount);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter Account Number: ");
                int withdrawAccountNumber = scanner.nextInt();
                System.out.print("Enter Withdrawal Amount: ");
                double withdrawAmount = scanner.nextDouble();
                BankAccount withdrawAccount = bank1.findAccountByNumber(withdrawAccountNumber);
                if (withdrawAccount != null) {
                    withdrawAccount.withdraw(withdrawAmount);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting the program.");
                scanner.close(); // Close the scanner only once at the end of the program
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
