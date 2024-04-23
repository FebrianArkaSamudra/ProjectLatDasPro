import java.util.List;
import java.util.ArrayList;

// Class to represent a bank account
public class Account {

    // Instance variables to store account information
    public String accountNumber, name, motherName, phone, email;
    public double balance;
    
    // Constructor to initialize account with given values
    public Account (String an, String na, String mn, String ph, String em, double bal) {
        this.accountNumber = an;
        this.name = na;
        this.motherName = mn;
        this.phone = ph;
        this.email = em;
        this.balance = bal;
    }

    // Getter methods for account information
    public String getAccountNumber() {
        return accountNumber;
    }    

    public String getName() {
        return name;
    }
    
    public String getMotherName() {
        return motherName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Nested class to represent bank system operations
    public static class BankSystem {
        // List to store accounts
        public List<Account> accounts;
        
        // Constructor to initialize list
        public BankSystem() {
            accounts = new ArrayList<>();
        }
        
        // Method to add an account to the list
        public void addAccount(Account account) {
            accounts.add(account);
        }
        
        // Method to display all accounts in the list
        public void displayAllAccounts() {
            for (Account account : accounts) {
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Name: " + account.getName());
                System.out.println("Balance: " + account.getBalance());
                System.out.println();
            }
        }
        
        // Method to sort accounts by balance and display
        public void sortAccountsByBalance() {
            accounts.sort((a1, a2) -> Double.compare(a2.getBalance(), a1.getBalance()));
    
            System.out.println("Sorted Accounts by Balance:");
            displayAllAccounts();
        }
        
        // Method to display accounts with zero balance
        public void displayZeroBalanceAccounts() {
            System.out.println("Zero Balance Accounts:");
            for (Account account : accounts) {
                if (account.getBalance() == 0) {
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Name: " + account.getName());
                    System.out.println("Balance: " + account.getBalance());
                    System.out.println();
                }
            }
        }
        
        // Method to search account by name and display
        public void searchAccountByName(String keyword) {
            System.out.println("Search Results for '" + keyword + "':");
            for (Account account : accounts) {
                if (account.getName().toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Name: " + account.getName());
                    System.out.println("Balance: " + account.getBalance());
                    System.out.println();
                }
            }
        }
        
        // Method to withdraw money from an account
        public void withdraw(String accountNumber, double amount) {
            for (Account account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    if (account.getBalance() >= amount) {
                        account.setBalance(account.getBalance() - amount);
                        System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    return;
                }
            }
            System.out.println("Account not found.");
        }
        
        // Method to deposit money to an account
        public void deposit(String accountNumber, double amount) {
            for (Account account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    account.setBalance(account.getBalance() + amount);
                    System.out.println("Deposit successful. New balance: " + account.getBalance());
                    return;
                }
            }
            System.out.println("Account not found.");
        }
    }

}

