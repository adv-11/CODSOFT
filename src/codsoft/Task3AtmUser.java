package codsoft;

import java.util.Scanner;

class Task3AtmUser {
    private double balance;

    public Task3AtmUser(double Balance) {
        this.balance = Balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    	Task3AtmUser userAccount = new Task3AtmUser(1000.0); // Initial balance of $1000
        Task3ATM atm = new Task3ATM(userAccount);
    	
    	Scanner scanner = new Scanner (System.in);
    	while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print(" ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter withdrawal amount: RS: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: RS: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
    }
    }

}