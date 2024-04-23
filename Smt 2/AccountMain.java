import java.util.Scanner;

import Account.BankSystem;

public class AccountMain {

    public static void main(String[] args) {
        
        // Create an instance of BankSystem to manage accounts
        Account.BankSystem bankSystem = new Account.BankSystem();
        Scanner sc = new Scanner(System.in);

        // Add some initial accounts to the bank system
        bankSystem.addAccount(new Account("160309273084", "Wallace","Lany", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu", 10000));
        bankSystem.addAccount(new Account("161006170573", "Darius","Fey", "1-357-843-0547", "nec@lectusjusto.org", 7000));
        bankSystem.addAccount(new Account("162404012243", "Fuller","Frey", "571-7062", "convallis@Vestibulumanteipsum.org", 5000));
        bankSystem.addAccount(new Account("162705250112", "Malcolm","Nany", "623-0234", "porttitor.tellus.non@Curabitur.ca", 44000));
        bankSystem.addAccount(new Account("169712042416", "Geoffrey","Nancy", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com", 50000));
        bankSystem.addAccount(new Account("161007278862", "Rudyard","Leya", "650-5379", "Proin.eget@velitegestaslacinia.ca", 123000));
        bankSystem.addAccount(new Account("164603294259", "Troy","Ashel", "897-7608", "pede.Suspendisse.dui@a.ca", 100000));
        bankSystem.addAccount(new Account("163204213437", "Alec","Astra", "792-4447", "non@mus.com", 34000));
        bankSystem.addAccount(new Account("161807297229", "Walter","May", "863-8209", "Pellentesque.ut.ipsum@neque.ca", 334544));
        bankSystem.addAccount(new Account("169503136823", "Simon","Noya", "592-6919", "tellus.justo.sit@commodoauctor.net", 23444));
        bankSystem.addAccount(new Account("168507083528", "Kamal","Lala", "1-115-339-7678", "dictum@nec.edu", 567770));

        // Display menu and perform actions based on user input
        int choice;
        do {
            System.out.println("Banking Information System");
            System.out.println("1. Add Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Sort Accounts by Balance");
            System.out.println("4. Display Accounts with Zero Balance");
            System.out.println("5. Search Account by Name");
            System.out.println("6. Withdraw Money");
            System.out.println("7. Deposit Money");
            System.out.println("8. Exit");  
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();  
            sc.nextLine(); 
            switch (choice) {
                case 1:
                // Add a new account
                addAccount(bankSystem, sc);
                    break;
                case 2:
                // Display all accounts
                bankSystem.displayAllAccounts();
                    break;
                case 3:
                // Sort accounts by balance and display
                bankSystem.sortAccountsByBalance();
                    break;
                case 4:
                // Display accounts with zero balance
                bankSystem.displayZeroBalanceAccounts();
                    break;
                case 5:
                // Search account by name
                searchAccountByName(bankSystem, sc);
                    break;
                case 6:
                // Withdraw money from an account
                withdrawMoney(bankSystem, sc);
                    break;
                case 7:
                // Deposit money to an account
                depositMoney(bankSystem, sc);
                    break;
                case 8:
                // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                // Invalid choice
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 8);
        sc.close();
        
    }
    
     // Method to add a new account
    public static void addAccount(Account.BankSystem bankSystem, Scanner sc) {
        // Prompt user to enter account details
        System.out.print("Enter account number: ");
        String an = sc.nextLine();
        System.out.print("Enter name: ");
        String na = sc.nextLine();
        System.out.print("Enter mother's name: ");
        String mn = sc.nextLine();
        System.out.print("Enter phone number: ");
        String ph = sc.nextLine();
        System.out.print("Enter email: ");
        String em = sc.nextLine();
        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();
        sc.nextLine();

        // Create new account and add it to the bank system
        bankSystem.addAccount(new Account(an, na, mn, ph, em, bal));
    
    }

    // Method to search account by name
    public static void searchAccountByName(Account.BankSystem bankSystem, Scanner sc) {
        System.out.print("Enter name to search: ");
        String keyword = sc.nextLine();
        bankSystem.searchAccountByName(keyword);
    }

    // Method to withdraw money from an account
    public static void withdrawMoney(Account.BankSystem bankSystem, Scanner sc) {
        System.out.print("Enter account number: ");
        String accountNumber = sc.next();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 
        
        bankSystem.withdraw(accountNumber, amount);
    }

        
    // Method to deposit money to an account
    public static void depositMoney(Account.BankSystem bankSystem, Scanner sc) {
        System.out.print("Enter account number: ");
        String accountNumber = sc.next();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 
        
        bankSystem.deposit(accountNumber, amount);
    }
}
    
